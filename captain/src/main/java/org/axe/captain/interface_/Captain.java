package org.axe.captain.interface_;

/**
 * Captain 角色的行为抽象
 * Created by CaiDongYu on 2016年6月17日 上午9:47:18.
 */
public interface Captain {

	/**
	 * 接受什么样的问题类型
	 */
	public String accpetQuestionType();
	
	/**
	 * 回答问题
	 */
	public Object answerQuestion(String question);
}
