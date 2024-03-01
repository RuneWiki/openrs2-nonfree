package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wr")
public class Class560 {

	@OriginalMember(owner = "client!wr", name = "l", descriptor = "Lclient!amx;")
	Class3_Sub1_Sub17 aClass3_Sub1_Sub17_1;

	@OriginalMember(owner = "client!wr", name = "p", descriptor = "I")
	int anInt5357;

	@OriginalMember(owner = "client!wr", name = "g", descriptor = "I")
	int anInt5358;

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "I")
	int anInt5359;

	@OriginalMember(owner = "client!wr", name = "h", descriptor = "Lclient!amx;")
	Class3_Sub1_Sub17 aClass3_Sub1_Sub17_2;

	@OriginalMember(owner = "client!wr", name = "x", descriptor = "Z")
	boolean aBoolean824 = false;

	@OriginalMember(owner = "client!wr", name = "<init>", descriptor = "()V", line = 16)
	Class560() {
	}

	@OriginalMember(owner = "client!wr", name = "p", descriptor = "(Lclient!rn;Lclient!rs;II[II)Z", line = 19)
	final boolean method32843(@OriginalArg(0) Class436 arg0, @OriginalArg(1) Class440 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		if (this.aBoolean824) {
			return true;
		} else if (arg2 >= arg4.length) {
			return false;
		} else {
			this.anInt5359 = arg4[arg2] * -2086115691;
			this.aClass3_Sub1_Sub17_1 = arg0.method28014(this.anInt5359 * -1862388547 >> 16);
			this.anInt5359 = (-1862388547 * this.anInt5359 & 0xFFFF) * -2086115691;
			if (this.aClass3_Sub1_Sub17_1 == null) {
				return false;
			}
			if (arg1.aBoolean766 && arg3 != -1 && arg3 < arg4.length) {
				this.anInt5358 = arg4[arg3] * -1196594945;
				this.aClass3_Sub1_Sub17_2 = arg0.method28014(this.anInt5358 * 960599807 >> 16);
				this.anInt5358 = (this.anInt5358 * 960599807 & 0xFFFF) * -1196594945;
			}
			if (arg1.aBoolean764) {
				this.anInt5357 = (-1558537725 * this.anInt5357 | 0x200) * -1031905109;
			}
			if (this.aClass3_Sub1_Sub17_1.method19456(this.anInt5359 * -1862388547)) {
				this.anInt5357 = (this.anInt5357 * -1558537725 | 0x80) * -1031905109;
			}
			if (this.aClass3_Sub1_Sub17_1.method19447(this.anInt5359 * -1862388547)) {
				this.anInt5357 = (-1558537725 * this.anInt5357 | 0x100) * -1031905109;
			}
			if (this.aClass3_Sub1_Sub17_1.method19449(this.anInt5359 * -1862388547)) {
				this.anInt5357 = (this.anInt5357 * -1558537725 | 0x400) * -1031905109;
			}
			if (this.aClass3_Sub1_Sub17_2 != null) {
				if (this.aClass3_Sub1_Sub17_2.method19456(this.anInt5358 * 960599807)) {
					this.anInt5357 = (-1558537725 * this.anInt5357 | 0x80) * -1031905109;
				}
				if (this.aClass3_Sub1_Sub17_2.method19447(this.anInt5358 * 960599807)) {
					this.anInt5357 = (-1558537725 * this.anInt5357 | 0x100) * -1031905109;
				}
				if (this.aClass3_Sub1_Sub17_2.method19449(this.anInt5358 * 960599807)) {
					this.anInt5357 = (this.anInt5357 * -1558537725 | 0x400) * -1031905109;
				}
			}
			this.anInt5357 = (this.anInt5357 * -1558537725 | 0x20) * -1031905109;
			this.aBoolean824 = true;
			return true;
		}
	}

	@OriginalMember(owner = "client!wr", name = "g", descriptor = "(Lclient!rn;Lclient!rs;II[I)Z", line = 19)
	final boolean method32845(@OriginalArg(0) Class436 arg0, @OriginalArg(1) Class440 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		if (this.aBoolean824) {
			return true;
		} else if (arg2 >= arg4.length) {
			return false;
		} else {
			this.anInt5359 = arg4[arg2] * -2086115691;
			this.aClass3_Sub1_Sub17_1 = arg0.method28014(this.anInt5359 * -1862388547 >> 16);
			this.anInt5359 = (-1862388547 * this.anInt5359 & 0xFFFF) * -2086115691;
			if (this.aClass3_Sub1_Sub17_1 == null) {
				return false;
			}
			if (arg1.aBoolean766 && arg3 != -1 && arg3 < arg4.length) {
				this.anInt5358 = arg4[arg3] * -1196594945;
				this.aClass3_Sub1_Sub17_2 = arg0.method28014(this.anInt5358 * 960599807 >> 16);
				this.anInt5358 = (this.anInt5358 * 960599807 & 0xFFFF) * -1196594945;
			}
			if (arg1.aBoolean764) {
				this.anInt5357 = (-1558537725 * this.anInt5357 | 0x200) * -1031905109;
			}
			if (this.aClass3_Sub1_Sub17_1.method19456(this.anInt5359 * -1862388547)) {
				this.anInt5357 = (this.anInt5357 * -1558537725 | 0x80) * -1031905109;
			}
			if (this.aClass3_Sub1_Sub17_1.method19447(this.anInt5359 * -1862388547)) {
				this.anInt5357 = (-1558537725 * this.anInt5357 | 0x100) * -1031905109;
			}
			if (this.aClass3_Sub1_Sub17_1.method19449(this.anInt5359 * -1862388547)) {
				this.anInt5357 = (this.anInt5357 * -1558537725 | 0x400) * -1031905109;
			}
			if (this.aClass3_Sub1_Sub17_2 != null) {
				if (this.aClass3_Sub1_Sub17_2.method19456(this.anInt5358 * 960599807)) {
					this.anInt5357 = (-1558537725 * this.anInt5357 | 0x80) * -1031905109;
				}
				if (this.aClass3_Sub1_Sub17_2.method19447(this.anInt5358 * 960599807)) {
					this.anInt5357 = (-1558537725 * this.anInt5357 | 0x100) * -1031905109;
				}
				if (this.aClass3_Sub1_Sub17_2.method19449(this.anInt5358 * 960599807)) {
					this.anInt5357 = (this.anInt5357 * -1558537725 | 0x400) * -1031905109;
				}
			}
			this.anInt5357 = (this.anInt5357 * -1558537725 | 0x20) * -1031905109;
			this.aBoolean824 = true;
			return true;
		}
	}

	@OriginalMember(owner = "client!wr", name = "l", descriptor = "(Lclient!rn;Lclient!rs;II[I)Z", line = 19)
	final boolean method32846(@OriginalArg(0) Class436 arg0, @OriginalArg(1) Class440 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		if (this.aBoolean824) {
			return true;
		} else if (arg2 >= arg4.length) {
			return false;
		} else {
			this.anInt5359 = arg4[arg2] * -2086115691;
			this.aClass3_Sub1_Sub17_1 = arg0.method28014(this.anInt5359 * -1862388547 >> 16);
			this.anInt5359 = (-1862388547 * this.anInt5359 & 0xFFFF) * -2086115691;
			if (this.aClass3_Sub1_Sub17_1 == null) {
				return false;
			}
			if (arg1.aBoolean766 && arg3 != -1 && arg3 < arg4.length) {
				this.anInt5358 = arg4[arg3] * -1196594945;
				this.aClass3_Sub1_Sub17_2 = arg0.method28014(this.anInt5358 * 960599807 >> 16);
				this.anInt5358 = (this.anInt5358 * 960599807 & 0xFFFF) * -1196594945;
			}
			if (arg1.aBoolean764) {
				this.anInt5357 = (-1558537725 * this.anInt5357 | 0x200) * -1031905109;
			}
			if (this.aClass3_Sub1_Sub17_1.method19456(this.anInt5359 * -1862388547)) {
				this.anInt5357 = (this.anInt5357 * -1558537725 | 0x80) * -1031905109;
			}
			if (this.aClass3_Sub1_Sub17_1.method19447(this.anInt5359 * -1862388547)) {
				this.anInt5357 = (-1558537725 * this.anInt5357 | 0x100) * -1031905109;
			}
			if (this.aClass3_Sub1_Sub17_1.method19449(this.anInt5359 * -1862388547)) {
				this.anInt5357 = (this.anInt5357 * -1558537725 | 0x400) * -1031905109;
			}
			if (this.aClass3_Sub1_Sub17_2 != null) {
				if (this.aClass3_Sub1_Sub17_2.method19456(this.anInt5358 * 960599807)) {
					this.anInt5357 = (-1558537725 * this.anInt5357 | 0x80) * -1031905109;
				}
				if (this.aClass3_Sub1_Sub17_2.method19447(this.anInt5358 * 960599807)) {
					this.anInt5357 = (-1558537725 * this.anInt5357 | 0x100) * -1031905109;
				}
				if (this.aClass3_Sub1_Sub17_2.method19449(this.anInt5358 * 960599807)) {
					this.anInt5357 = (this.anInt5357 * -1558537725 | 0x400) * -1031905109;
				}
			}
			this.anInt5357 = (this.anInt5357 * -1558537725 | 0x20) * -1031905109;
			this.aBoolean824 = true;
			return true;
		}
	}

	@OriginalMember(owner = "client!wr", name = "h", descriptor = "(Lclient!rn;Lclient!rs;II[I)Z", line = 19)
	final boolean method32847(@OriginalArg(0) Class436 arg0, @OriginalArg(1) Class440 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		if (this.aBoolean824) {
			return true;
		} else if (arg2 >= arg4.length) {
			return false;
		} else {
			this.anInt5359 = arg4[arg2] * -2086115691;
			this.aClass3_Sub1_Sub17_1 = arg0.method28014(this.anInt5359 * -1862388547 >> 16);
			this.anInt5359 = (-1862388547 * this.anInt5359 & 0xFFFF) * -2086115691;
			if (this.aClass3_Sub1_Sub17_1 == null) {
				return false;
			}
			if (arg1.aBoolean766 && arg3 != -1 && arg3 < arg4.length) {
				this.anInt5358 = arg4[arg3] * -1196594945;
				this.aClass3_Sub1_Sub17_2 = arg0.method28014(this.anInt5358 * 960599807 >> 16);
				this.anInt5358 = (this.anInt5358 * 960599807 & 0xFFFF) * -1196594945;
			}
			if (arg1.aBoolean764) {
				this.anInt5357 = (-1558537725 * this.anInt5357 | 0x200) * -1031905109;
			}
			if (this.aClass3_Sub1_Sub17_1.method19456(this.anInt5359 * -1862388547)) {
				this.anInt5357 = (this.anInt5357 * -1558537725 | 0x80) * -1031905109;
			}
			if (this.aClass3_Sub1_Sub17_1.method19447(this.anInt5359 * -1862388547)) {
				this.anInt5357 = (-1558537725 * this.anInt5357 | 0x100) * -1031905109;
			}
			if (this.aClass3_Sub1_Sub17_1.method19449(this.anInt5359 * -1862388547)) {
				this.anInt5357 = (this.anInt5357 * -1558537725 | 0x400) * -1031905109;
			}
			if (this.aClass3_Sub1_Sub17_2 != null) {
				if (this.aClass3_Sub1_Sub17_2.method19456(this.anInt5358 * 960599807)) {
					this.anInt5357 = (-1558537725 * this.anInt5357 | 0x80) * -1031905109;
				}
				if (this.aClass3_Sub1_Sub17_2.method19447(this.anInt5358 * 960599807)) {
					this.anInt5357 = (-1558537725 * this.anInt5357 | 0x100) * -1031905109;
				}
				if (this.aClass3_Sub1_Sub17_2.method19449(this.anInt5358 * 960599807)) {
					this.anInt5357 = (this.anInt5357 * -1558537725 | 0x400) * -1031905109;
				}
			}
			this.anInt5357 = (this.anInt5357 * -1558537725 | 0x20) * -1031905109;
			this.aBoolean824 = true;
			return true;
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(B)V", line = 49)
	final void method32844() {
		this.aBoolean824 = false;
		this.anInt5357 = 0;
		this.aClass3_Sub1_Sub17_2 = null;
		this.aClass3_Sub1_Sub17_1 = null;
	}

	@OriginalMember(owner = "client!wr", name = "x", descriptor = "()V", line = 49)
	final void method32848() {
		this.aBoolean824 = false;
		this.anInt5357 = 0;
		this.aClass3_Sub1_Sub17_2 = null;
		this.aClass3_Sub1_Sub17_1 = null;
	}

	@OriginalMember(owner = "client!wr", name = "s", descriptor = "()V", line = 49)
	final void method32849() {
		this.aBoolean824 = false;
		this.anInt5357 = 0;
		this.aClass3_Sub1_Sub17_2 = null;
		this.aClass3_Sub1_Sub17_1 = null;
	}

	@OriginalMember(owner = "client!wr", name = "avb", descriptor = "(Lclient!vs;I)V", line = 12796)
	static final void method32850(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		Class144.method23068(local12);
	}
}
