package com.jagex;

import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aoh")
public abstract class Class92_Sub2_Sub2 extends Class92_Sub2 {

	@OriginalMember(owner = "client!aoh", name = "w", descriptor = "[F")
	float[] aFloatArray90;

	@OriginalMember(owner = "client!aoh", name = "y", descriptor = "[I")
	int[] anIntArray292;

	@OriginalMember(owner = "client!aoh", name = "t", descriptor = "Z")
	boolean aBoolean508;

	@OriginalMember(owner = "client!aoh", name = "v", descriptor = "Ljava/awt/Canvas;")
	final Canvas aCanvas4;

	@OriginalMember(owner = "client!aoh", name = "p", descriptor = "Lclient!aeh;")
	final Class86_Sub2 aClass86_Sub2_14;

	@OriginalMember(owner = "client!aoh", name = "c", descriptor = "I")
	int anInt3147;

	@OriginalMember(owner = "client!aoh", name = "l", descriptor = "I")
	int anInt3148;

	@OriginalMember(owner = "client!aoh", name = "<init>", descriptor = "(Lclient!aeh;Ljava/awt/Canvas;II)V", line = 23)
	Class92_Sub2_Sub2(@OriginalArg(0) Class86_Sub2 arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aCanvas4 = arg1;
		this.aClass86_Sub2_14 = arg0;
		this.anInt3147 = arg2 * 1313170667;
		this.anInt3148 = arg3 * 1111370931;
	}

	@OriginalMember(owner = "client!aoh", name = "ak", descriptor = "()V", line = 31)
	void method23284() {
		this.anIntArray292 = new int[this.anInt3147 * -150461501 * 787243643 * this.anInt3148];
		this.aFloatArray90 = new float[this.anInt3147 * -150461501 * 787243643 * this.anInt3148];
		if (this.aBoolean508) {
			this.aClass86_Sub2_14.method4865(this.anInt3147 * -150461501, this.anInt3148 * 787243643, this.anIntArray292, this.aFloatArray90);
		}
	}

	@OriginalMember(owner = "client!aoh", name = "o", descriptor = "()V", line = 31)
	void method23285() {
		this.anIntArray292 = new int[this.anInt3147 * -150461501 * 787243643 * this.anInt3148];
		this.aFloatArray90 = new float[this.anInt3147 * -150461501 * 787243643 * this.anInt3148];
		if (this.aBoolean508) {
			this.aClass86_Sub2_14.method4865(this.anInt3147 * -150461501, this.anInt3148 * 787243643, this.anIntArray292, this.aFloatArray90);
		}
	}

	@OriginalMember(owner = "client!aoh", name = "b", descriptor = "()V", line = 31)
	void method23286() {
		this.anIntArray292 = new int[this.anInt3147 * -150461501 * 787243643 * this.anInt3148];
		this.aFloatArray90 = new float[this.anInt3147 * -150461501 * 787243643 * this.anInt3148];
		if (this.aBoolean508) {
			this.aClass86_Sub2_14.method4865(this.anInt3147 * -150461501, this.anInt3148 * 787243643, this.anIntArray292, this.aFloatArray90);
		}
	}

	@OriginalMember(owner = "client!aoh", name = "f", descriptor = "(I)V", line = 31)
	void method23287() {
		this.anIntArray292 = new int[this.anInt3147 * -150461501 * 787243643 * this.anInt3148];
		this.aFloatArray90 = new float[this.anInt3147 * -150461501 * 787243643 * this.anInt3148];
		if (this.aBoolean508) {
			this.aClass86_Sub2_14.method4865(this.anInt3147 * -150461501, this.anInt3148 * 787243643, this.anIntArray292, this.aFloatArray90);
		}
	}

	@OriginalMember(owner = "client!aoh", name = "au", descriptor = "()V", line = 31)
	void method23288() {
		this.anIntArray292 = new int[this.anInt3147 * -150461501 * 787243643 * this.anInt3148];
		this.aFloatArray90 = new float[this.anInt3147 * -150461501 * 787243643 * this.anInt3148];
		if (this.aBoolean508) {
			this.aClass86_Sub2_14.method4865(this.anInt3147 * -150461501, this.anInt3148 * 787243643, this.anIntArray292, this.aFloatArray90);
		}
	}

	@OriginalMember(owner = "client!aoh", name = "m", descriptor = "(II)V", line = 37)
	@Override
	final void method23350(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != this.anInt3147 * -150461501 || this.anInt3148 * 787243643 != arg1) {
			this.anInt3147 = arg0 * 1313170667;
			this.anInt3148 = arg1 * 1111370931;
			this.method23287();
		}
	}

	@OriginalMember(owner = "client!aoh", name = "h", descriptor = "(II)V", line = 37)
	@Override
	final void method23351(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != this.anInt3147 * -150461501 || this.anInt3148 * 787243643 != arg1) {
			this.anInt3147 = arg0 * 1313170667;
			this.anInt3148 = arg1 * 1111370931;
			this.method23287();
		}
	}

	@OriginalMember(owner = "client!aoh", name = "w", descriptor = "()I", line = 45)
	@Override
	public int method23497() {
		return this.anInt3147 * -150461501;
	}

	@OriginalMember(owner = "client!aoh", name = "p", descriptor = "()I", line = 45)
	@Override
	public int method23491() {
		return this.anInt3147 * -150461501;
	}

	@OriginalMember(owner = "client!aoh", name = "c", descriptor = "()I", line = 49)
	@Override
	public int method23493() {
		return this.anInt3148 * 787243643;
	}

	@OriginalMember(owner = "client!aoh", name = "t", descriptor = "()I", line = 49)
	@Override
	public int method23498() {
		return this.anInt3148 * 787243643;
	}

	@OriginalMember(owner = "client!aoh", name = "q", descriptor = "()I", line = 49)
	@Override
	public int method23499() {
		return this.anInt3148 * 787243643;
	}

	@OriginalMember(owner = "client!aoh", name = "s", descriptor = "()Z", line = 53)
	@Override
	final boolean method23494() {
		this.aClass86_Sub2_14.method4865(this.anInt3147 * -150461501, this.anInt3148 * 787243643, this.anIntArray292, this.aFloatArray90);
		this.aBoolean508 = true;
		return true;
	}

	@OriginalMember(owner = "client!aoh", name = "x", descriptor = "()Z", line = 53)
	@Override
	final boolean method23500() {
		this.aClass86_Sub2_14.method4865(this.anInt3147 * -150461501, this.anInt3148 * 787243643, this.anIntArray292, this.aFloatArray90);
		this.aBoolean508 = true;
		return true;
	}

	@OriginalMember(owner = "client!aoh", name = "d", descriptor = "()Z", line = 53)
	@Override
	final boolean method23492() {
		this.aClass86_Sub2_14.method4865(this.anInt3147 * -150461501, this.anInt3148 * 787243643, this.anIntArray292, this.aFloatArray90);
		this.aBoolean508 = true;
		return true;
	}

	@OriginalMember(owner = "client!aoh", name = "l", descriptor = "()Z", line = 53)
	@Override
	final boolean method23508() {
		this.aClass86_Sub2_14.method4865(this.anInt3147 * -150461501, this.anInt3148 * 787243643, this.anIntArray292, this.aFloatArray90);
		this.aBoolean508 = true;
		return true;
	}

	@OriginalMember(owner = "client!aoh", name = "r", descriptor = "()Z", line = 53)
	@Override
	final boolean method23495() {
		this.aClass86_Sub2_14.method4865(this.anInt3147 * -150461501, this.anInt3148 * 787243643, this.anIntArray292, this.aFloatArray90);
		this.aBoolean508 = true;
		return true;
	}

	@OriginalMember(owner = "client!aoh", name = "g", descriptor = "()Z", line = 59)
	@Override
	final boolean method23503() {
		this.aBoolean508 = false;
		return true;
	}

	@OriginalMember(owner = "client!aoh", name = "y", descriptor = "()Z", line = 59)
	@Override
	final boolean method23496() {
		this.aBoolean508 = false;
		return true;
	}

	@OriginalMember(owner = "client!aoh", name = "z", descriptor = "()Z", line = 59)
	@Override
	final boolean method23504() {
		this.aBoolean508 = false;
		return true;
	}

	@OriginalMember(owner = "client!aoh", name = "j", descriptor = "()Z", line = 59)
	@Override
	final boolean method23505() {
		this.aBoolean508 = false;
		return true;
	}

	@OriginalMember(owner = "client!aoh", name = "o", descriptor = "(Lclient!ajt;I)[I", line = 250)
	static int[] method23289(@OriginalArg(0) Class77_Sub20 arg0) {
		@Pc(4) Class77_Sub39 local4 = new Class77_Sub39(518);
		@Pc(7) int[] local7 = new int[4];
		@Pc(9) int local9;
		for (local9 = 0; local9 < 4; local9++) {
			local7[local9] = (int) (Math.random() * 9.9999999E7D);
		}
		local4.method22403(10);
		local4.method22417(local7[0]);
		local4.method22417(local7[1]);
		local4.method22417(local7[2]);
		local4.method22417(local7[3]);
		for (local9 = 0; local9 < 10; local9++) {
			local4.method22417((int) (Math.random() * 9.9999999E7D));
		}
		local4.method22408((int) (Math.random() * 9.9999999E7D));
		local4.method22572(Class291.aBigInteger2, Class291.aBigInteger3);
		arg0.aClass77_Sub39_Sub1_2.method22452(local4.aByteArray53, 0, local4.anInt3089 * 31645619);
		return local7;
	}

	@OriginalMember(owner = "client!aoh", name = "ac", descriptor = "(I)Lclient!aqm;", line = 1070)
	public static Class77_Sub1_Sub7 method23290() {
		return Class301.aClass77_Sub1_Sub7_4;
	}

	@OriginalMember(owner = "client!aoh", name = "tg", descriptor = "(Lclient!yf;S)V", line = 8077)
	static final void method23291(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(26) String local26 = (String) arg0.anObjectArray45[(arg0.anInt5781 -= 1460193483) * 1485266147];
		Class333.method27661(local12, local26);
	}
}
