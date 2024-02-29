package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!zf")
public class Class688 {

	@OriginalMember(owner = "client!zf", name = "gk", descriptor = "Lclient!pw;")
	public static Class478 aClass478_137;

	@OriginalMember(owner = "client!zf", name = "y", descriptor = "Lclient!arr;")
	Class77_Sub1_Sub17 aClass77_Sub1_Sub17_1;

	@OriginalMember(owner = "client!zf", name = "p", descriptor = "I")
	int anInt5872;

	@OriginalMember(owner = "client!zf", name = "v", descriptor = "I")
	int anInt5873;

	@OriginalMember(owner = "client!zf", name = "l", descriptor = "Lclient!arr;")
	Class77_Sub1_Sub17 aClass77_Sub1_Sub17_2;

	@OriginalMember(owner = "client!zf", name = "c", descriptor = "I")
	int anInt5874;

	@OriginalMember(owner = "client!zf", name = "w", descriptor = "Z")
	boolean aBoolean864 = false;

	@OriginalMember(owner = "client!zf", name = "<init>", descriptor = "()V", line = 16)
	Class688() {
	}

	@OriginalMember(owner = "client!zf", name = "p", descriptor = "(Lclient!anb;Lclient!et;II[II)Z", line = 19)
	final boolean method36291(@OriginalArg(0) Class35_Sub2 arg0, @OriginalArg(1) Class234 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		if (this.aBoolean864) {
			return true;
		} else if (arg2 >= arg4.length) {
			return false;
		} else {
			this.anInt5874 = arg4[arg2] * -571486521;
			this.aClass77_Sub1_Sub17_2 = arg0.method16344(this.anInt5874 * 1321112311 >> 16);
			this.anInt5874 = (this.anInt5874 * 1321112311 & 0xFFFF) * -571486521;
			if (this.aClass77_Sub1_Sub17_2 == null) {
				return false;
			}
			if (arg1.aBoolean648 && arg3 != -1 && arg3 < arg4.length) {
				this.anInt5873 = arg4[arg3] * 754364263;
				this.aClass77_Sub1_Sub17_1 = arg0.method16344(this.anInt5873 * 1289223255 >> 16);
				this.anInt5873 = (this.anInt5873 * 1289223255 & 0xFFFF) * 754364263;
			}
			if (arg1.aBoolean646) {
				this.anInt5872 = (this.anInt5872 * 1996767869 | 0x200) * -56047915;
			}
			if (this.aClass77_Sub1_Sub17_2.method22758(this.anInt5874 * 1321112311)) {
				this.anInt5872 = (this.anInt5872 * 1996767869 | 0x80) * -56047915;
			}
			if (this.aClass77_Sub1_Sub17_2.method22752(this.anInt5874 * 1321112311)) {
				this.anInt5872 = (this.anInt5872 * 1996767869 | 0x100) * -56047915;
			}
			if (this.aClass77_Sub1_Sub17_2.method22762(this.anInt5874 * 1321112311)) {
				this.anInt5872 = (this.anInt5872 * 1996767869 | 0x400) * -56047915;
			}
			if (this.aClass77_Sub1_Sub17_1 != null) {
				if (this.aClass77_Sub1_Sub17_1.method22758(this.anInt5873 * 1289223255)) {
					this.anInt5872 = (this.anInt5872 * 1996767869 | 0x80) * -56047915;
				}
				if (this.aClass77_Sub1_Sub17_1.method22752(this.anInt5873 * 1289223255)) {
					this.anInt5872 = (this.anInt5872 * 1996767869 | 0x100) * -56047915;
				}
				if (this.aClass77_Sub1_Sub17_1.method22762(this.anInt5873 * 1289223255)) {
					this.anInt5872 = (this.anInt5872 * 1996767869 | 0x400) * -56047915;
				}
			}
			this.anInt5872 = (this.anInt5872 * 1996767869 | 0x20) * -56047915;
			this.aBoolean864 = true;
			return true;
		}
	}

	@OriginalMember(owner = "client!zf", name = "v", descriptor = "(Lclient!anb;Lclient!et;II[I)Z", line = 19)
	final boolean method36292(@OriginalArg(0) Class35_Sub2 arg0, @OriginalArg(1) Class234 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		if (this.aBoolean864) {
			return true;
		} else if (arg2 >= arg4.length) {
			return false;
		} else {
			this.anInt5874 = arg4[arg2] * -571486521;
			this.aClass77_Sub1_Sub17_2 = arg0.method16344(this.anInt5874 * 1321112311 >> 16);
			this.anInt5874 = (this.anInt5874 * 1321112311 & 0xFFFF) * -571486521;
			if (this.aClass77_Sub1_Sub17_2 == null) {
				return false;
			}
			if (arg1.aBoolean648 && arg3 != -1 && arg3 < arg4.length) {
				this.anInt5873 = arg4[arg3] * 754364263;
				this.aClass77_Sub1_Sub17_1 = arg0.method16344(this.anInt5873 * 1289223255 >> 16);
				this.anInt5873 = (this.anInt5873 * 1289223255 & 0xFFFF) * 754364263;
			}
			if (arg1.aBoolean646) {
				this.anInt5872 = (this.anInt5872 * 1996767869 | 0x200) * -56047915;
			}
			if (this.aClass77_Sub1_Sub17_2.method22758(this.anInt5874 * 1321112311)) {
				this.anInt5872 = (this.anInt5872 * 1996767869 | 0x80) * -56047915;
			}
			if (this.aClass77_Sub1_Sub17_2.method22752(this.anInt5874 * 1321112311)) {
				this.anInt5872 = (this.anInt5872 * 1996767869 | 0x100) * -56047915;
			}
			if (this.aClass77_Sub1_Sub17_2.method22762(this.anInt5874 * 1321112311)) {
				this.anInt5872 = (this.anInt5872 * 1996767869 | 0x400) * -56047915;
			}
			if (this.aClass77_Sub1_Sub17_1 != null) {
				if (this.aClass77_Sub1_Sub17_1.method22758(this.anInt5873 * 1289223255)) {
					this.anInt5872 = (this.anInt5872 * 1996767869 | 0x80) * -56047915;
				}
				if (this.aClass77_Sub1_Sub17_1.method22752(this.anInt5873 * 1289223255)) {
					this.anInt5872 = (this.anInt5872 * 1996767869 | 0x100) * -56047915;
				}
				if (this.aClass77_Sub1_Sub17_1.method22762(this.anInt5873 * 1289223255)) {
					this.anInt5872 = (this.anInt5872 * 1996767869 | 0x400) * -56047915;
				}
			}
			this.anInt5872 = (this.anInt5872 * 1996767869 | 0x20) * -56047915;
			this.aBoolean864 = true;
			return true;
		}
	}

	@OriginalMember(owner = "client!zf", name = "y", descriptor = "()V", line = 49)
	final void method36293() {
		this.aBoolean864 = false;
		this.anInt5872 = 0;
		this.aClass77_Sub1_Sub17_1 = null;
		this.aClass77_Sub1_Sub17_2 = null;
	}

	@OriginalMember(owner = "client!zf", name = "c", descriptor = "(B)V", line = 49)
	final void method36294() {
		this.aBoolean864 = false;
		this.anInt5872 = 0;
		this.aClass77_Sub1_Sub17_1 = null;
		this.aClass77_Sub1_Sub17_2 = null;
	}

	@OriginalMember(owner = "client!zf", name = "t", descriptor = "()V", line = 49)
	final void method36295() {
		this.aBoolean864 = false;
		this.anInt5872 = 0;
		this.aClass77_Sub1_Sub17_1 = null;
		this.aClass77_Sub1_Sub17_2 = null;
	}

	@OriginalMember(owner = "client!zf", name = "l", descriptor = "()V", line = 49)
	final void method36296() {
		this.aBoolean864 = false;
		this.anInt5872 = 0;
		this.aClass77_Sub1_Sub17_1 = null;
		this.aClass77_Sub1_Sub17_2 = null;
	}

	@OriginalMember(owner = "client!zf", name = "w", descriptor = "()V", line = 49)
	final void method36297() {
		this.aBoolean864 = false;
		this.anInt5872 = 0;
		this.aClass77_Sub1_Sub17_1 = null;
		this.aClass77_Sub1_Sub17_2 = null;
	}

	@OriginalMember(owner = "client!zf", name = "afa", descriptor = "(Lclient!yf;I)V", line = 10185)
	static final void method36298(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class109_Sub1.method9090();
	}
}
