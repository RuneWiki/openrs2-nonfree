package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!er")
public abstract class Class13 {

	@OriginalMember(owner = "client!er", name = "qe", descriptor = "I")
	static int anInt2438;

	@OriginalMember(owner = "client!er", name = "p", descriptor = "I")
	public final int anInt2437;

	@OriginalMember(owner = "client!er", name = "<init>", descriptor = "(Lclient!ahb;)V", line = 9)
	Class13(@OriginalArg(0) Class3_Sub41 arg0) {
		this.anInt2437 = arg0.method20271() * -422506247;
	}

	@OriginalMember(owner = "client!er", name = "c", descriptor = "(Lclient!ahb;)Lclient!er;", line = 14)
	static Class13 method16897(@OriginalArg(0) Class3_Sub41 arg0) {
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

	@OriginalMember(owner = "client!er", name = "z", descriptor = "(Lclient!ahb;)Lclient!er;", line = 14)
	static Class13 method16898(@OriginalArg(0) Class3_Sub41 arg0) {
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

	@OriginalMember(owner = "client!er", name = "b", descriptor = "()V", line = 109)
	void method16889() {
	}

	@OriginalMember(owner = "client!er", name = "g", descriptor = "(I)V", line = 109)
	void method16892() {
	}

	@OriginalMember(owner = "client!er", name = "u", descriptor = "()V", line = 109)
	void method16894() {
	}

	@OriginalMember(owner = "client!er", name = "y", descriptor = "()V", line = 109)
	void method16895() {
	}

	@OriginalMember(owner = "client!er", name = "l", descriptor = "(I)Z", line = 112)
	boolean method16890() {
		return true;
	}

	@OriginalMember(owner = "client!er", name = "x", descriptor = "()Z", line = 112)
	boolean method16891() {
		return true;
	}

	@OriginalMember(owner = "client!er", name = "s", descriptor = "()Z", line = 112)
	boolean method16893() {
		return true;
	}

	@OriginalMember(owner = "client!er", name = "avg", descriptor = "(Lclient!vs;I)V", line = 12771)
	static final void method16899(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 312124549;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(I)V")
	public abstract void method16888();

	@OriginalMember(owner = "client!er", name = "h", descriptor = "()V")
	public abstract void method16896();
}
