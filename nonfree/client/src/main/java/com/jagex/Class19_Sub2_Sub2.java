package com.jagex;

import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aka")
public abstract class Class19_Sub2_Sub2 extends Class19_Sub2 {

	@OriginalMember(owner = "client!aka", name = "h", descriptor = "[I")
	int[] anIntArray271;

	@OriginalMember(owner = "client!aka", name = "x", descriptor = "[F")
	float[] aFloatArray90;

	@OriginalMember(owner = "client!aka", name = "s", descriptor = "Z")
	boolean aBoolean498;

	@OriginalMember(owner = "client!aka", name = "a", descriptor = "Ljava/awt/Canvas;")
	final Canvas aCanvas4;

	@OriginalMember(owner = "client!aka", name = "p", descriptor = "Lclient!abl;")
	final Class21_Sub1 aClass21_Sub1_13;

	@OriginalMember(owner = "client!aka", name = "g", descriptor = "I")
	int anInt2835;

	@OriginalMember(owner = "client!aka", name = "l", descriptor = "I")
	int anInt2836;

	@OriginalMember(owner = "client!aka", name = "as", descriptor = "(Lclient!abl;Ljava/awt/Canvas;II)Lclient!aka;", line = 18)
	static Class19_Sub2_Sub2 method20758(@OriginalArg(0) Class21_Sub1 arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return new Class19_Sub2_Sub2_Sub1(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!aka", name = "an", descriptor = "(Lclient!abl;Ljava/awt/Canvas;II)Lclient!aka;", line = 18)
	static Class19_Sub2_Sub2 method20759(@OriginalArg(0) Class21_Sub1 arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return new Class19_Sub2_Sub2_Sub1(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!aka", name = "t", descriptor = "(Lclient!abl;Ljava/awt/Canvas;II)Lclient!aka;", line = 18)
	static Class19_Sub2_Sub2 method20760(@OriginalArg(0) Class21_Sub1 arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return new Class19_Sub2_Sub2_Sub1(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!aka", name = "aj", descriptor = "(Lclient!abl;Ljava/awt/Canvas;II)Lclient!aka;", line = 18)
	static Class19_Sub2_Sub2 method20761(@OriginalArg(0) Class21_Sub1 arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return new Class19_Sub2_Sub2_Sub1(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!aka", name = "<init>", descriptor = "(Lclient!abl;Ljava/awt/Canvas;II)V", line = 23)
	Class19_Sub2_Sub2(@OriginalArg(0) Class21_Sub1 arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aCanvas4 = arg1;
		this.aClass21_Sub1_13 = arg0;
		this.anInt2835 = arg2 * 1759290677;
		this.anInt2836 = arg3 * 304204037;
	}

	@OriginalMember(owner = "client!aka", name = "v", descriptor = "(I)V", line = 31)
	void method20757() {
		this.anIntArray271 = new int[this.anInt2835 * -1110293219 * 1376558029 * this.anInt2836];
		this.aFloatArray90 = new float[this.anInt2836 * 1376558029 * -1110293219 * this.anInt2835];
		if (this.aBoolean498) {
			this.aClass21_Sub1_13.method3212(this.anInt2835 * -1110293219, this.anInt2836 * 1376558029, this.anIntArray271, this.aFloatArray90);
		}
	}

	@OriginalMember(owner = "client!aka", name = "ai", descriptor = "()V", line = 31)
	void method20762() {
		this.anIntArray271 = new int[this.anInt2835 * -1110293219 * 1376558029 * this.anInt2836];
		this.aFloatArray90 = new float[this.anInt2836 * 1376558029 * -1110293219 * this.anInt2835];
		if (this.aBoolean498) {
			this.aClass21_Sub1_13.method3212(this.anInt2835 * -1110293219, this.anInt2836 * 1376558029, this.anIntArray271, this.aFloatArray90);
		}
	}

	@OriginalMember(owner = "client!aka", name = "k", descriptor = "(II)V", line = 37)
	@Override
	final void method21417(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != this.anInt2835 * -1110293219 || this.anInt2836 * 1376558029 != arg1) {
			this.anInt2835 = arg0 * 1759290677;
			this.anInt2836 = arg1 * 304204037;
			this.method20757();
		}
	}

	@OriginalMember(owner = "client!aka", name = "i", descriptor = "(II)V", line = 37)
	@Override
	final void method21414(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != this.anInt2835 * -1110293219 || this.anInt2836 * 1376558029 != arg1) {
			this.anInt2835 = arg0 * 1759290677;
			this.anInt2836 = arg1 * 304204037;
			this.method20757();
		}
	}

	@OriginalMember(owner = "client!aka", name = "f", descriptor = "(II)V", line = 37)
	@Override
	final void method21415(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != this.anInt2835 * -1110293219 || this.anInt2836 * 1376558029 != arg1) {
			this.anInt2835 = arg0 * 1759290677;
			this.anInt2836 = arg1 * 304204037;
			this.method20757();
		}
	}

	@OriginalMember(owner = "client!aka", name = "at", descriptor = "(II)V", line = 37)
	@Override
	final void method21411(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != this.anInt2835 * -1110293219 || this.anInt2836 * 1376558029 != arg1) {
			this.anInt2835 = arg0 * 1759290677;
			this.anInt2836 = arg1 * 304204037;
			this.method20757();
		}
	}

	@OriginalMember(owner = "client!aka", name = "p", descriptor = "()I", line = 45)
	@Override
	public int method21390() {
		return this.anInt2835 * -1110293219;
	}

	@OriginalMember(owner = "client!aka", name = "d", descriptor = "()I", line = 45)
	@Override
	public int method21405() {
		return this.anInt2835 * -1110293219;
	}

	@OriginalMember(owner = "client!aka", name = "q", descriptor = "()I", line = 45)
	@Override
	public int method21389() {
		return this.anInt2835 * -1110293219;
	}

	@OriginalMember(owner = "client!aka", name = "a", descriptor = "()I", line = 49)
	@Override
	public int method21391() {
		return this.anInt2836 * 1376558029;
	}

	@OriginalMember(owner = "client!aka", name = "s", descriptor = "()I", line = 49)
	@Override
	public int method21404() {
		return this.anInt2836 * 1376558029;
	}

	@OriginalMember(owner = "client!aka", name = "x", descriptor = "()I", line = 49)
	@Override
	public int method21394() {
		return this.anInt2836 * 1376558029;
	}

	@OriginalMember(owner = "client!aka", name = "u", descriptor = "()Z", line = 53)
	@Override
	final boolean method21396() {
		this.aClass21_Sub1_13.method3212(this.anInt2835 * -1110293219, this.anInt2836 * 1376558029, this.anIntArray271, this.aFloatArray90);
		this.aBoolean498 = true;
		return true;
	}

	@OriginalMember(owner = "client!aka", name = "l", descriptor = "()Z", line = 53)
	@Override
	final boolean method21393() {
		this.aClass21_Sub1_13.method3212(this.anInt2835 * -1110293219, this.anInt2836 * 1376558029, this.anIntArray271, this.aFloatArray90);
		this.aBoolean498 = true;
		return true;
	}

	@OriginalMember(owner = "client!aka", name = "y", descriptor = "()Z", line = 53)
	@Override
	final boolean method21397() {
		this.aClass21_Sub1_13.method3212(this.anInt2835 * -1110293219, this.anInt2836 * 1376558029, this.anIntArray271, this.aFloatArray90);
		this.aBoolean498 = true;
		return true;
	}

	@OriginalMember(owner = "client!aka", name = "h", descriptor = "()Z", line = 59)
	@Override
	final boolean method21400() {
		this.aBoolean498 = false;
		return true;
	}

	@OriginalMember(owner = "client!aka", name = "c", descriptor = "()Z", line = 59)
	@Override
	final boolean method21399() {
		this.aBoolean498 = false;
		return true;
	}

	@OriginalMember(owner = "client!aka", name = "b", descriptor = "()Z", line = 59)
	@Override
	final boolean method21403() {
		this.aBoolean498 = false;
		return true;
	}

	@OriginalMember(owner = "client!aka", name = "j", descriptor = "()Z", line = 59)
	@Override
	final boolean method21401() {
		this.aBoolean498 = false;
		return true;
	}

	@OriginalMember(owner = "client!aka", name = "z", descriptor = "()Z", line = 59)
	@Override
	final boolean method21398() {
		this.aBoolean498 = false;
		return true;
	}

	@OriginalMember(owner = "client!aka", name = "ae", descriptor = "(III)V", line = 245)
	static void method20763(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(7, (long) arg0);
		local4.method19155();
		local4.anInt2693 = arg1 * 1666161167;
	}
}
