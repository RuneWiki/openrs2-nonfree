package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!age")
public class Class101_Sub1 extends Class101 {

	@OriginalMember(owner = "client!age", name = "r", descriptor = "Lclient!cy;")
	Class83 aClass83_18;

	@OriginalMember(owner = "client!age", name = "q", descriptor = "Lclient!cy;")
	Class83 aClass83_19;

	@OriginalMember(owner = "client!age", name = "x", descriptor = "Lclient!cy;")
	Class83 aClass83_20;

	@OriginalMember(owner = "client!age", name = "d", descriptor = "Lclient!cy;")
	Class83 aClass83_21;

	@OriginalMember(owner = "client!age", name = "s", descriptor = "Lclient!cy;")
	Class83 aClass83_22;

	@OriginalMember(owner = "client!age", name = "t", descriptor = "Lclient!cy;")
	Class83 aClass83_23;

	@OriginalMember(owner = "client!age", name = "<init>", descriptor = "(Lclient!pw;Lclient!pw;Lclient!ahf;)V", line = 18)
	Class101_Sub1(@OriginalArg(0) Class478 arg0, @OriginalArg(1) Class478 arg1, @OriginalArg(2) Class118_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!age", name = "p", descriptor = "(S)V", line = 22)
	@Override
	public void method27917() {
		super.method27917();
		@Pc(6) Class118_Sub1 local6 = (Class118_Sub1) this.aClass118_5;
		this.aClass83_23 = Class273.method26540(this.aClass478_81, local6.anInt2928 * 1333388775);
		this.aClass83_19 = Class273.method26540(this.aClass478_81, local6.anInt2927 * -2081665769);
		this.aClass83_20 = Class273.method26540(this.aClass478_81, local6.anInt2932 * 845449995);
		this.aClass83_21 = Class273.method26540(this.aClass478_81, local6.anInt2930 * -773478983);
		this.aClass83_22 = Class273.method26540(this.aClass478_81, local6.anInt2931 * -1674677163);
		this.aClass83_18 = Class273.method26540(this.aClass478_81, local6.anInt2929 * 2123496001);
	}

	@OriginalMember(owner = "client!age", name = "y", descriptor = "()V", line = 22)
	@Override
	public void method27919() {
		super.method27917();
		@Pc(6) Class118_Sub1 local6 = (Class118_Sub1) this.aClass118_5;
		this.aClass83_23 = Class273.method26540(this.aClass478_81, local6.anInt2928 * 1333388775);
		this.aClass83_19 = Class273.method26540(this.aClass478_81, local6.anInt2927 * -2081665769);
		this.aClass83_20 = Class273.method26540(this.aClass478_81, local6.anInt2932 * 845449995);
		this.aClass83_21 = Class273.method26540(this.aClass478_81, local6.anInt2930 * -773478983);
		this.aClass83_22 = Class273.method26540(this.aClass478_81, local6.anInt2931 * -1674677163);
		this.aClass83_18 = Class273.method26540(this.aClass478_81, local6.anInt2929 * 2123496001);
	}

	@OriginalMember(owner = "client!age", name = "s", descriptor = "(ZIIS)V", line = 33)
	@Override
	void method20890(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!arg0) {
			return;
		}
		@Pc(4) int[] local4 = new int[4];
		Class284.aClass86_9.method20142(local4);
		Class284.aClass86_9.method20151(arg1, arg2, this.aClass118_5.anInt2922 * -1607607997 + arg1, this.aClass118_5.anInt2923 * -228886179 + arg2);
		@Pc(29) int local29 = this.aClass83_20.method18121();
		@Pc(33) int local33 = this.aClass83_20.method18198();
		@Pc(37) int local37 = this.aClass83_21.method18121();
		@Pc(41) int local41 = this.aClass83_21.method18198();
		this.aClass83_20.method18123(arg1, arg2 + (this.aClass118_5.anInt2923 * -228886179 - local33) / 2);
		this.aClass83_21.method18123(this.aClass118_5.anInt2922 * -1607607997 + arg1 - local37, (this.aClass118_5.anInt2923 * -228886179 - local41) / 2 + arg2);
		Class284.aClass86_9.method20151(arg1, arg2, arg1 + this.aClass118_5.anInt2922 * -1607607997, arg2 + this.aClass83_22.method18198());
		this.aClass83_22.method18133(local29 + arg1, arg2, this.aClass118_5.anInt2922 * -1607607997 - local29 - local37, this.aClass118_5.anInt2923 * -228886179);
		@Pc(120) int local120 = this.aClass83_18.method18198();
		Class284.aClass86_9.method20151(arg1, this.aClass118_5.anInt2923 * -228886179 + arg2 - local120, this.aClass118_5.anInt2922 * -1607607997 + arg1, this.aClass118_5.anInt2923 * -228886179 + arg2);
		this.aClass83_18.method18133(local29 + arg1, this.aClass118_5.anInt2923 * -228886179 + arg2 - local120, this.aClass118_5.anInt2922 * -1607607997 - local29 - local37, this.aClass118_5.anInt2923 * -228886179);
		Class284.aClass86_9.method20151(local4[0], local4[1], local4[2], local4[3]);
	}

	@OriginalMember(owner = "client!age", name = "z", descriptor = "(ZII)V", line = 33)
	@Override
	void method20893(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!arg0) {
			return;
		}
		@Pc(4) int[] local4 = new int[4];
		Class284.aClass86_9.method20142(local4);
		Class284.aClass86_9.method20151(arg1, arg2, this.aClass118_5.anInt2922 * -1607607997 + arg1, this.aClass118_5.anInt2923 * -228886179 + arg2);
		@Pc(29) int local29 = this.aClass83_20.method18121();
		@Pc(33) int local33 = this.aClass83_20.method18198();
		@Pc(37) int local37 = this.aClass83_21.method18121();
		@Pc(41) int local41 = this.aClass83_21.method18198();
		this.aClass83_20.method18123(arg1, arg2 + (this.aClass118_5.anInt2923 * -228886179 - local33) / 2);
		this.aClass83_21.method18123(this.aClass118_5.anInt2922 * -1607607997 + arg1 - local37, (this.aClass118_5.anInt2923 * -228886179 - local41) / 2 + arg2);
		Class284.aClass86_9.method20151(arg1, arg2, arg1 + this.aClass118_5.anInt2922 * -1607607997, arg2 + this.aClass83_22.method18198());
		this.aClass83_22.method18133(local29 + arg1, arg2, this.aClass118_5.anInt2922 * -1607607997 - local29 - local37, this.aClass118_5.anInt2923 * -228886179);
		@Pc(120) int local120 = this.aClass83_18.method18198();
		Class284.aClass86_9.method20151(arg1, this.aClass118_5.anInt2923 * -228886179 + arg2 - local120, this.aClass118_5.anInt2922 * -1607607997 + arg1, this.aClass118_5.anInt2923 * -228886179 + arg2);
		this.aClass83_18.method18133(local29 + arg1, this.aClass118_5.anInt2923 * -228886179 + arg2 - local120, this.aClass118_5.anInt2922 * -1607607997 - local29 - local37, this.aClass118_5.anInt2923 * -228886179);
		Class284.aClass86_9.method20151(local4[0], local4[1], local4[2], local4[3]);
	}

	@OriginalMember(owner = "client!age", name = "j", descriptor = "(ZII)V", line = 33)
	@Override
	void method20889(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!arg0) {
			return;
		}
		@Pc(4) int[] local4 = new int[4];
		Class284.aClass86_9.method20142(local4);
		Class284.aClass86_9.method20151(arg1, arg2, this.aClass118_5.anInt2922 * -1607607997 + arg1, this.aClass118_5.anInt2923 * -228886179 + arg2);
		@Pc(29) int local29 = this.aClass83_20.method18121();
		@Pc(33) int local33 = this.aClass83_20.method18198();
		@Pc(37) int local37 = this.aClass83_21.method18121();
		@Pc(41) int local41 = this.aClass83_21.method18198();
		this.aClass83_20.method18123(arg1, arg2 + (this.aClass118_5.anInt2923 * -228886179 - local33) / 2);
		this.aClass83_21.method18123(this.aClass118_5.anInt2922 * -1607607997 + arg1 - local37, (this.aClass118_5.anInt2923 * -228886179 - local41) / 2 + arg2);
		Class284.aClass86_9.method20151(arg1, arg2, arg1 + this.aClass118_5.anInt2922 * -1607607997, arg2 + this.aClass83_22.method18198());
		this.aClass83_22.method18133(local29 + arg1, arg2, this.aClass118_5.anInt2922 * -1607607997 - local29 - local37, this.aClass118_5.anInt2923 * -228886179);
		@Pc(120) int local120 = this.aClass83_18.method18198();
		Class284.aClass86_9.method20151(arg1, this.aClass118_5.anInt2923 * -228886179 + arg2 - local120, this.aClass118_5.anInt2922 * -1607607997 + arg1, this.aClass118_5.anInt2923 * -228886179 + arg2);
		this.aClass83_18.method18133(local29 + arg1, this.aClass118_5.anInt2923 * -228886179 + arg2 - local120, this.aClass118_5.anInt2922 * -1607607997 - local29 - local37, this.aClass118_5.anInt2923 * -228886179);
		Class284.aClass86_9.method20151(local4[0], local4[1], local4[2], local4[3]);
	}

	@OriginalMember(owner = "client!age", name = "u", descriptor = "(ZII)V", line = 53)
	@Override
	void method20892(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = arg0 + this.aClass83_20.method18121();
		@Pc(17) int local17 = arg0 + this.aClass118_5.anInt2922 * -1607607997 - this.aClass83_21.method18121();
		@Pc(23) int local23 = arg1 + this.aClass83_22.method18198();
		@Pc(35) int local35 = this.aClass118_5.anInt2923 * -228886179 + arg1 - this.aClass83_18.method18198();
		@Pc(39) int local39 = local17 - local5;
		@Pc(43) int local43 = local35 - local23;
		@Pc(51) int local51 = this.method20884() * local39 / 10000;
		@Pc(54) int[] local54 = new int[4];
		Class284.aClass86_9.method20142(local54);
		Class284.aClass86_9.method20151(local5, local23, local51 + local5, local35);
		this.method20896(local5, local23, local39, local43);
		Class284.aClass86_9.method20151(local51 + local5, local23, local17, local35);
		this.aClass83_19.method18133(local5, local23, local39, local43);
		Class284.aClass86_9.method20151(local54[0], local54[1], local54[2], local54[3]);
	}

	@OriginalMember(owner = "client!age", name = "k", descriptor = "(ZII)V", line = 53)
	@Override
	void method20895(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = arg0 + this.aClass83_20.method18121();
		@Pc(17) int local17 = arg0 + this.aClass118_5.anInt2922 * -1607607997 - this.aClass83_21.method18121();
		@Pc(23) int local23 = arg1 + this.aClass83_22.method18198();
		@Pc(35) int local35 = this.aClass118_5.anInt2923 * -228886179 + arg1 - this.aClass83_18.method18198();
		@Pc(39) int local39 = local17 - local5;
		@Pc(43) int local43 = local35 - local23;
		@Pc(51) int local51 = this.method20884() * local39 / 10000;
		@Pc(54) int[] local54 = new int[4];
		Class284.aClass86_9.method20142(local54);
		Class284.aClass86_9.method20151(local5, local23, local51 + local5, local35);
		this.method20896(local5, local23, local39, local43);
		Class284.aClass86_9.method20151(local51 + local5, local23, local17, local35);
		this.aClass83_19.method18133(local5, local23, local39, local43);
		Class284.aClass86_9.method20151(local54[0], local54[1], local54[2], local54[3]);
	}

	@OriginalMember(owner = "client!age", name = "i", descriptor = "(ZII)V", line = 53)
	@Override
	void method20894(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = arg0 + this.aClass83_20.method18121();
		@Pc(17) int local17 = arg0 + this.aClass118_5.anInt2922 * -1607607997 - this.aClass83_21.method18121();
		@Pc(23) int local23 = arg1 + this.aClass83_22.method18198();
		@Pc(35) int local35 = this.aClass118_5.anInt2923 * -228886179 + arg1 - this.aClass83_18.method18198();
		@Pc(39) int local39 = local17 - local5;
		@Pc(43) int local43 = local35 - local23;
		@Pc(51) int local51 = this.method20884() * local39 / 10000;
		@Pc(54) int[] local54 = new int[4];
		Class284.aClass86_9.method20142(local54);
		Class284.aClass86_9.method20151(local5, local23, local51 + local5, local35);
		this.method20896(local5, local23, local39, local43);
		Class284.aClass86_9.method20151(local51 + local5, local23, local17, local35);
		this.aClass83_19.method18133(local5, local23, local39, local43);
		Class284.aClass86_9.method20151(local54[0], local54[1], local54[2], local54[3]);
	}

	@OriginalMember(owner = "client!age", name = "r", descriptor = "(ZIIB)V", line = 53)
	@Override
	void method20891(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) int local5 = arg1 + this.aClass83_20.method18121();
		@Pc(17) int local17 = arg1 + this.aClass118_5.anInt2922 * -1607607997 - this.aClass83_21.method18121();
		@Pc(23) int local23 = arg2 + this.aClass83_22.method18198();
		@Pc(35) int local35 = this.aClass118_5.anInt2923 * -228886179 + arg2 - this.aClass83_18.method18198();
		@Pc(39) int local39 = local17 - local5;
		@Pc(43) int local43 = local35 - local23;
		@Pc(51) int local51 = this.method20884() * local39 / 10000;
		@Pc(54) int[] local54 = new int[4];
		Class284.aClass86_9.method20142(local54);
		Class284.aClass86_9.method20151(local5, local23, local51 + local5, local35);
		this.method20896(local5, local23, local39, local43);
		Class284.aClass86_9.method20151(local51 + local5, local23, local17, local35);
		this.aClass83_19.method18133(local5, local23, local39, local43);
		Class284.aClass86_9.method20151(local54[0], local54[1], local54[2], local54[3]);
	}

	@OriginalMember(owner = "client!age", name = "o", descriptor = "(IIIII)V", line = 70)
	void method20896(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass83_23.method18133(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!age", name = "b", descriptor = "(IIII)V", line = 70)
	void method20897(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass83_23.method18133(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!age", name = "t", descriptor = "()Z", line = 74)
	@Override
	public boolean method27924() {
		if (!super.method27915()) {
			return false;
		}
		@Pc(9) Class118_Sub1 local9 = (Class118_Sub1) this.aClass118_5;
		if (!this.aClass478_81.method29730(local9.anInt2928 * 1333388775)) {
			return false;
		} else if (!this.aClass478_81.method29730(local9.anInt2927 * -2081665769)) {
			return false;
		} else if (!this.aClass478_81.method29730(local9.anInt2932 * 845449995)) {
			return false;
		} else if (!this.aClass478_81.method29730(local9.anInt2930 * -773478983)) {
			return false;
		} else if (this.aClass478_81.method29730(local9.anInt2931 * -1674677163)) {
			return this.aClass478_81.method29730(local9.anInt2929 * 2123496001);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!age", name = "v", descriptor = "(I)Z", line = 74)
	@Override
	public boolean method27915() {
		if (!super.method27915()) {
			return false;
		}
		@Pc(9) Class118_Sub1 local9 = (Class118_Sub1) this.aClass118_5;
		if (!this.aClass478_81.method29730(local9.anInt2928 * 1333388775)) {
			return false;
		} else if (!this.aClass478_81.method29730(local9.anInt2927 * -2081665769)) {
			return false;
		} else if (!this.aClass478_81.method29730(local9.anInt2932 * 845449995)) {
			return false;
		} else if (!this.aClass478_81.method29730(local9.anInt2930 * -773478983)) {
			return false;
		} else if (this.aClass478_81.method29730(local9.anInt2931 * -1674677163)) {
			return this.aClass478_81.method29730(local9.anInt2929 * 2123496001);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!age", name = "w", descriptor = "()Z", line = 74)
	@Override
	public boolean method27920() {
		if (!super.method27915()) {
			return false;
		}
		@Pc(9) Class118_Sub1 local9 = (Class118_Sub1) this.aClass118_5;
		if (!this.aClass478_81.method29730(local9.anInt2928 * 1333388775)) {
			return false;
		} else if (!this.aClass478_81.method29730(local9.anInt2927 * -2081665769)) {
			return false;
		} else if (!this.aClass478_81.method29730(local9.anInt2932 * 845449995)) {
			return false;
		} else if (!this.aClass478_81.method29730(local9.anInt2930 * -773478983)) {
			return false;
		} else if (this.aClass478_81.method29730(local9.anInt2931 * -1674677163)) {
			return this.aClass478_81.method29730(local9.anInt2929 * 2123496001);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!age", name = "q", descriptor = "()Z", line = 74)
	@Override
	public boolean method27916() {
		if (!super.method27915()) {
			return false;
		}
		@Pc(9) Class118_Sub1 local9 = (Class118_Sub1) this.aClass118_5;
		if (!this.aClass478_81.method29730(local9.anInt2928 * 1333388775)) {
			return false;
		} else if (!this.aClass478_81.method29730(local9.anInt2927 * -2081665769)) {
			return false;
		} else if (!this.aClass478_81.method29730(local9.anInt2932 * 845449995)) {
			return false;
		} else if (!this.aClass478_81.method29730(local9.anInt2930 * -773478983)) {
			return false;
		} else if (this.aClass478_81.method29730(local9.anInt2931 * -1674677163)) {
			return this.aClass478_81.method29730(local9.anInt2929 * 2123496001);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!age", name = "x", descriptor = "()Z", line = 74)
	@Override
	public boolean method27923() {
		if (!super.method27915()) {
			return false;
		}
		@Pc(9) Class118_Sub1 local9 = (Class118_Sub1) this.aClass118_5;
		if (!this.aClass478_81.method29730(local9.anInt2928 * 1333388775)) {
			return false;
		} else if (!this.aClass478_81.method29730(local9.anInt2927 * -2081665769)) {
			return false;
		} else if (!this.aClass478_81.method29730(local9.anInt2932 * 845449995)) {
			return false;
		} else if (!this.aClass478_81.method29730(local9.anInt2930 * -773478983)) {
			return false;
		} else if (this.aClass478_81.method29730(local9.anInt2931 * -1674677163)) {
			return this.aClass478_81.method29730(local9.anInt2929 * 2123496001);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!age", name = "d", descriptor = "()Z", line = 74)
	@Override
	public boolean method27922() {
		if (!super.method27915()) {
			return false;
		}
		@Pc(9) Class118_Sub1 local9 = (Class118_Sub1) this.aClass118_5;
		if (!this.aClass478_81.method29730(local9.anInt2928 * 1333388775)) {
			return false;
		} else if (!this.aClass478_81.method29730(local9.anInt2927 * -2081665769)) {
			return false;
		} else if (!this.aClass478_81.method29730(local9.anInt2932 * 845449995)) {
			return false;
		} else if (!this.aClass478_81.method29730(local9.anInt2930 * -773478983)) {
			return false;
		} else if (this.aClass478_81.method29730(local9.anInt2931 * -1674677163)) {
			return this.aClass478_81.method29730(local9.anInt2929 * 2123496001);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!age", name = "w", descriptor = "(Lclient!pw;II)Lclient!ara;", line = 88)
	static Class77_Sub1_Sub8 method20898(@OriginalArg(0) Class478 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class77_Sub39 local8 = new Class77_Sub39(arg0.method29725(0, arg1));
		return Class424.method28739(local8, arg1);
	}
}
