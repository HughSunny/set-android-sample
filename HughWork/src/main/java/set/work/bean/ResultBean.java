package set.work.bean;

import java.io.Serializable;

import set.work.thread.BaseRequestRunnable;

public class ResultBean implements Serializable {
	public static final int TYPE_STR = 1;
	public static final int TYPE_INT = 2;
	public static int type = TYPE_STR;//类型
	private RequestListBean requestBean;
	private String resultString;
	private BaseRequestRunnable runnable;
	/** 通过头判断是否属于成功的请求结果 */
	private boolean success = true;
	public ResultBean(RequestListBean bean, String resultString, BaseRequestRunnable runnable) {
		this.requestBean = bean;
		this.resultString = resultString;
		this.setRunnable(runnable);
	}

	public String getResultString() {
		return resultString;
	}

	public void setResultString(String resultString) {
		this.resultString = resultString;
	}
	public Object getRequestId() {
		return requestBean.getRequestId();
	}
	public int getRequestType() {
		return requestBean.getRequestType();
	}
	public BaseRequestRunnable getRunnable() {
		return runnable;
	}
	public void setRunnable(BaseRequestRunnable runnable) {
		this.runnable = runnable;
	}
	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}
	public RequestListBean getRequestBean() {
		return requestBean;
	}

	public void setRequestBean(RequestListBean requestBean) {
		this.requestBean = requestBean;
	}

	public void clear()  {
		runnable = null;
		resultString = null;
	}
}
