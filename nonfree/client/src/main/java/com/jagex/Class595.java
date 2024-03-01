package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!yb")
public class Class595 implements Interface56 {

	@OriginalMember(owner = "client!yb", name = "p", descriptor = "Lclient!yb;")
	static final Class595 aClass595_15 = new Class595(1, 100);

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "Lclient!yb;")
	static final Class595 aClass595_11 = new Class595(5, 101);

	@OriginalMember(owner = "client!yb", name = "g", descriptor = "Lclient!yb;")
	static final Class595 aClass595_3 = new Class595(2, 102);

	@OriginalMember(owner = "client!yb", name = "l", descriptor = "Lclient!yb;")
	static final Class595 aClass595_4 = new Class595(10, 103);

	@OriginalMember(owner = "client!yb", name = "h", descriptor = "Lclient!yb;")
	static final Class595 aClass595_5 = new Class595(0, 104);

	@OriginalMember(owner = "client!yb", name = "x", descriptor = "Lclient!yb;")
	static final Class595 aClass595_6 = new Class595(13, 105);

	@OriginalMember(owner = "client!yb", name = "s", descriptor = "Lclient!yb;")
	static final Class595 aClass595_7 = new Class595(8, 106);

	@OriginalMember(owner = "client!yb", name = "u", descriptor = "Lclient!yb;")
	static final Class595 aClass595_2 = new Class595(11, 107);

	@OriginalMember(owner = "client!yb", name = "y", descriptor = "Lclient!yb;")
	static final Class595 aClass595_13 = new Class595(6, 108);

	@OriginalMember(owner = "client!yb", name = "b", descriptor = "Lclient!yb;")
	static final Class595 aClass595_10 = new Class595(3, 109);

	@OriginalMember(owner = "client!yb", name = "c", descriptor = "Lclient!yb;")
	static final Class595 aClass595_9 = new Class595(14, 110);

	@OriginalMember(owner = "client!yb", name = "z", descriptor = "Lclient!yb;")
	static final Class595 aClass595_1 = new Class595(7, 111);

	@OriginalMember(owner = "client!yb", name = "j", descriptor = "Lclient!yb;")
	static final Class595 aClass595_12 = new Class595(4, 112);

	@OriginalMember(owner = "client!yb", name = "n", descriptor = "Lclient!yb;")
	static final Class595 aClass595_14 = new Class595(9, 113);

	@OriginalMember(owner = "client!yb", name = "e", descriptor = "Lclient!yb;")
	static final Class595 aClass595_8 = new Class595(12, 114);

	@OriginalMember(owner = "client!yb", name = "r", descriptor = "I")
	final int anInt5515;

	@OriginalMember(owner = "client!yb", name = "d", descriptor = "I")
	final int anInt5516;

	@OriginalMember(owner = "client!yb", name = "p", descriptor = "(Lclient!ahb;I)Lclient!er;", line = 14)
	static Class13 method33433(@OriginalArg(0) Class3_Sub41 arg0) {
		@Pc(3) int local3 = arg0.method20269();
		@Pc(7) Class619 local7 = Class52.method9920(local3);
		@Pc(9) Class13 local9 = null;
		switch(local7.anInt5566 * 2088538131) {
			case 0:
				local9 = new Class13_Sub16(arg0);
				break;
			case 1:
				local9 = new Class13_Sub7(arg0);
				break;
			case 2:
				local9 = new Class13_Sub15(arg0);
				break;
			case 3:
				local9 = new Class13_Sub10(arg0);
				break;
			case 4:
				local9 = new Class13_Sub14(arg0, 0, 0);
			case 5:
			default:
				break;
			case 6:
				local9 = new Class13_Sub5(arg0, true);
				break;
			case 7:
				local9 = new Class13_Sub20(arg0);
				break;
			case 8:
				local9 = new Class13_Sub3(arg0);
				break;
			case 9:
				local9 = new Class13_Sub14(arg0, 0, 1);
				break;
			case 10:
				local9 = new Class13_Sub12_Sub1(arg0);
				break;
			case 11:
				local9 = new Class13_Sub14(arg0, 1, 1);
				break;
			case 12:
				local9 = new Class13_Sub1(arg0);
				break;
			case 13:
				local9 = new Class13_Sub9(arg0);
				break;
			case 14:
				local9 = new Class13_Sub18(arg0);
				break;
			case 15:
				local9 = new Class13_Sub2(arg0);
				break;
			case 16:
				local9 = new Class13_Sub12_Sub2(arg0);
				break;
			case 17:
				local9 = new Class13_Sub11(arg0);
				break;
			case 18:
				local9 = new Class13_Sub8(arg0);
				break;
			case 19:
				local9 = new Class13_Sub23(arg0);
				break;
			case 20:
				local9 = new Class13_Sub14(arg0, 1, 0);
				break;
			case 21:
				local9 = new Class13_Sub17(arg0);
				break;
			case 22:
				local9 = new Class13_Sub5(arg0, false);
				break;
			case 23:
				local9 = new Class13_Sub21(arg0);
				break;
			case 24:
				local9 = new Class13_Sub22(arg0);
				break;
			case 25:
				local9 = new Class13_Sub6(arg0);
				break;
			case 26:
				local9 = new Class13_Sub4(arg0);
				break;
			case 27:
				local9 = new Class13_Sub13(arg0);
				break;
			case 28:
				local9 = new Class13_Sub19(arg0);
		}
		return local9;
	}

	@OriginalMember(owner = "client!yb", name = "s", descriptor = "()[Lclient!yb;", line = 27)
	static Class595[] method33431() {
		return new Class595[] { aClass595_9, aClass595_14, aClass595_2, aClass595_3, aClass595_10, aClass595_8, aClass595_13, aClass595_7, aClass595_5, aClass595_6, aClass595_15, aClass595_12, aClass595_4, aClass595_11, aClass595_1 };
	}

	@OriginalMember(owner = "client!yb", name = "g", descriptor = "()[Lclient!yb;", line = 27)
	static Class595[] method33432() {
		return new Class595[] { aClass595_9, aClass595_14, aClass595_2, aClass595_3, aClass595_10, aClass595_8, aClass595_13, aClass595_7, aClass595_5, aClass595_6, aClass595_15, aClass595_12, aClass595_4, aClass595_11, aClass595_1 };
	}

	@OriginalMember(owner = "client!yb", name = "<init>", descriptor = "(II)V", line = 30)
	Class595(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5515 = arg0 * -689398303;
		this.anInt5516 = arg1 * 1616332415;
	}

	@OriginalMember(owner = "client!yb", name = "x", descriptor = "()I", line = 36)
	@Override
	public int method33764() {
		return this.anInt5516 * -1902216833;
	}

	@OriginalMember(owner = "client!yb", name = "l", descriptor = "()I", line = 36)
	@Override
	public int method33767() {
		return this.anInt5516 * -1902216833;
	}

	@OriginalMember(owner = "client!yb", name = "h", descriptor = "()I", line = 36)
	@Override
	public int method33766() {
		return this.anInt5516 * -1902216833;
	}

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(I)I", line = 36)
	@Override
	public int method33765() {
		return this.anInt5516 * -1902216833;
	}
}
