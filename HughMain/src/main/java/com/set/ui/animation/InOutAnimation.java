package com.set.ui.animation;

import android.view.View;
import android.view.animation.AnimationSet;
/**
 * 作用&目的：动画类
 * 作者：第三方开源动画
 */
public abstract class InOutAnimation extends AnimationSet {

	public Direction	direction;

	public enum Direction {
		IN, OUT;
	}

	public InOutAnimation(Direction direction, long l, View[] aview) {
		super(true);
		this.direction = direction;
		switch (this.direction) {
		case IN:
			addInAnimation(aview);
			break;
		case OUT:
			addOutAnimation(aview);

			break;
		}
		setDuration(l);
	}

	protected abstract void addInAnimation(View aview[]);

	protected abstract void addOutAnimation(View aview[]);

}
