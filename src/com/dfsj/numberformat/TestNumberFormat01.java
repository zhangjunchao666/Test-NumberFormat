package com.dfsj.numberformat;

import java.text.NumberFormat;

//数值格式示例
public class TestNumberFormat01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 说明： 1、NumberFormat.getInstance 返回当前缺省语言环境的缺省数值格式；
		 * 2、NumberFormat.getCurrencyInstance(此处填写语言环境，如：Locale.US；可为空，为当前系统语言环境)
		 * 返回语言环境的金融格式
		 * 3、NumberFormat.getPercentInstance(此处填写语言环境，如：Locale.US；可为空，为当前系统语言环境)
		 * 返回语言环境的百分比格式
		 * 4、NumberFormat.getNumberInstance(此处填写语言环境，如：Locale.US；可为空，为当前系统语言环境)
		 * 返回语言环境的数值格式 5、setNinimumFractionDigits() 设置数值的小数部分允许的最小位数
		 * 6、setMaximumFractionDigits() 设置数值的小数部分允许的最大位数 7、setMaximumIntegerDigits()
		 * 设置数值的整数部分允许的最大位数 8、setMinimumIntegerDigits() 设置数值的整数部分允许的最大位数
		 */

		Double myNumber = 23323.3323232323;
		Double test = 0.3434;
		// getInstance()
		// 返回当前缺省语言环境的缺省数值格式。
		String myString = NumberFormat.getInstance().format(myNumber);
		System.out.println(myString);
		// getCurrencyInstance()返回当前缺省语言环境的通用格式
		// myString = NumberFormat.getCurrencyInstance(Locale.US).format(myNumber);
		myString = NumberFormat.getCurrencyInstance().format(myNumber);
		System.out.println("NumberFormat.getCurrencyInstance:" + myString);
		// getNumberInstance() 返回当前缺省语言环境的通用数值格式。
		myString = NumberFormat.getNumberInstance().format(myNumber);
		System.out.println("NumberFormat.getNumberInstance():" + myString);
		// getPercentInstance() 返回当前缺省语言环境的百分比格式。
		myString = NumberFormat.getPercentInstance().format(test);
		System.out.println("NumberFormat.getPercentInstance():" + myString);
		NumberFormat format = NumberFormat.getInstance();
		// setMinimumFractionDigits(int) 设置数值的小数部分允许的最小位数。
		format.setMinimumFractionDigits(3);
		// setMaximumFractionDigits(int) 设置数值的小数部分允许的最大位数。
		format.setMaximumFractionDigits(5);
		// setMaximumIntegerDigits(int) 设置数值的整数部分允许的最大位数。
		format.setMaximumIntegerDigits(10);
		// setMinimumIntegerDigits(int) 设置数值的整数部分允许的最小位数.
		format.setMinimumIntegerDigits(0);
		System.out.println(format.format(2132323213.23266666666));
	}

}
