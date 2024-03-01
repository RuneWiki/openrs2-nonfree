package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aau")
public class Class23 {

	@OriginalMember(owner = "client!aau", name = "kf", descriptor = "I")
	public static int anInt74;

	@OriginalMember(owner = "client!aau", name = "e", descriptor = "I")
	int anInt71;

	@OriginalMember(owner = "client!aau", name = "n", descriptor = "I")
	int anInt72;

	@OriginalMember(owner = "client!aau", name = "m", descriptor = "I")
	int anInt73;

	@OriginalMember(owner = "client!aau", name = "f", descriptor = "Lclient!arr;")
	Class93_Sub1_Sub10 aClass93_Sub1_Sub10_1;

	@OriginalMember(owner = "client!aau", name = "k", descriptor = "Lclient!arr;")
	Class93_Sub1_Sub10 aClass93_Sub1_Sub10_2;

	@OriginalMember(owner = "client!aau", name = "w", descriptor = "Z")
	boolean aBoolean11 = false;

	@OriginalMember(owner = "client!aau", name = "<init>", descriptor = "()V", line = 16)
	Class23() {
	}

	@OriginalMember(owner = "client!aau", name = "e", descriptor = "(Lclient!aos;Lclient!fg;II[II)Z", line = 19)
	final boolean method495(@OriginalArg(0) Class32_Sub17 arg0, @OriginalArg(1) Class263 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		if (this.aBoolean11) {
			return true;
		} else if (arg2 >= arg4.length) {
			return false;
		} else {
			this.anInt72 = arg4[arg2] * 1338501659;
			this.aClass93_Sub1_Sub10_2 = arg0.method17244(this.anInt72 * -1424564205 >> 16);
			this.anInt72 = (this.anInt72 * -1424564205 & 0xFFFF) * 1338501659;
			if (this.aClass93_Sub1_Sub10_2 == null) {
				return false;
			}
			if (arg1.aBoolean669 && arg3 != -1 && arg3 < arg4.length) {
				this.anInt73 = arg4[arg3] * -1462611387;
				this.aClass93_Sub1_Sub10_1 = arg0.method17244(this.anInt73 * -278335347 >> 16);
				this.anInt73 = (this.anInt73 * -278335347 & 0xFFFF) * -1462611387;
			}
			if (arg1.aBoolean671) {
				this.anInt71 = (this.anInt71 * 2023242135 | 0x200) * -1408379353;
			}
			if (this.aClass93_Sub1_Sub10_2.method21778(this.anInt72 * -1424564205)) {
				this.anInt71 = (this.anInt71 * 2023242135 | 0x80) * -1408379353;
			}
			if (this.aClass93_Sub1_Sub10_2.method21777(this.anInt72 * -1424564205)) {
				this.anInt71 = (this.anInt71 * 2023242135 | 0x100) * -1408379353;
			}
			if (this.aClass93_Sub1_Sub10_2.method21775(this.anInt72 * -1424564205)) {
				this.anInt71 = (this.anInt71 * 2023242135 | 0x400) * -1408379353;
			}
			if (this.aClass93_Sub1_Sub10_1 != null) {
				if (this.aClass93_Sub1_Sub10_1.method21778(this.anInt73 * -278335347)) {
					this.anInt71 = (this.anInt71 * 2023242135 | 0x80) * -1408379353;
				}
				if (this.aClass93_Sub1_Sub10_1.method21777(this.anInt73 * -278335347)) {
					this.anInt71 = (this.anInt71 * 2023242135 | 0x100) * -1408379353;
				}
				if (this.aClass93_Sub1_Sub10_1.method21775(this.anInt73 * -278335347)) {
					this.anInt71 = (this.anInt71 * 2023242135 | 0x400) * -1408379353;
				}
			}
			this.anInt71 = (this.anInt71 * 2023242135 | 0x20) * -1408379353;
			this.aBoolean11 = true;
			return true;
		}
	}

	@OriginalMember(owner = "client!aau", name = "k", descriptor = "(Lclient!aos;Lclient!fg;II[I)Z", line = 19)
	final boolean method497(@OriginalArg(0) Class32_Sub17 arg0, @OriginalArg(1) Class263 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		if (this.aBoolean11) {
			return true;
		} else if (arg2 >= arg4.length) {
			return false;
		} else {
			this.anInt72 = arg4[arg2] * 1338501659;
			this.aClass93_Sub1_Sub10_2 = arg0.method17244(this.anInt72 * -1424564205 >> 16);
			this.anInt72 = (this.anInt72 * -1424564205 & 0xFFFF) * 1338501659;
			if (this.aClass93_Sub1_Sub10_2 == null) {
				return false;
			}
			if (arg1.aBoolean669 && arg3 != -1 && arg3 < arg4.length) {
				this.anInt73 = arg4[arg3] * -1462611387;
				this.aClass93_Sub1_Sub10_1 = arg0.method17244(this.anInt73 * -278335347 >> 16);
				this.anInt73 = (this.anInt73 * -278335347 & 0xFFFF) * -1462611387;
			}
			if (arg1.aBoolean671) {
				this.anInt71 = (this.anInt71 * 2023242135 | 0x200) * -1408379353;
			}
			if (this.aClass93_Sub1_Sub10_2.method21778(this.anInt72 * -1424564205)) {
				this.anInt71 = (this.anInt71 * 2023242135 | 0x80) * -1408379353;
			}
			if (this.aClass93_Sub1_Sub10_2.method21777(this.anInt72 * -1424564205)) {
				this.anInt71 = (this.anInt71 * 2023242135 | 0x100) * -1408379353;
			}
			if (this.aClass93_Sub1_Sub10_2.method21775(this.anInt72 * -1424564205)) {
				this.anInt71 = (this.anInt71 * 2023242135 | 0x400) * -1408379353;
			}
			if (this.aClass93_Sub1_Sub10_1 != null) {
				if (this.aClass93_Sub1_Sub10_1.method21778(this.anInt73 * -278335347)) {
					this.anInt71 = (this.anInt71 * 2023242135 | 0x80) * -1408379353;
				}
				if (this.aClass93_Sub1_Sub10_1.method21777(this.anInt73 * -278335347)) {
					this.anInt71 = (this.anInt71 * 2023242135 | 0x100) * -1408379353;
				}
				if (this.aClass93_Sub1_Sub10_1.method21775(this.anInt73 * -278335347)) {
					this.anInt71 = (this.anInt71 * 2023242135 | 0x400) * -1408379353;
				}
			}
			this.anInt71 = (this.anInt71 * 2023242135 | 0x20) * -1408379353;
			this.aBoolean11 = true;
			return true;
		}
	}

	@OriginalMember(owner = "client!aau", name = "m", descriptor = "(Lclient!aos;Lclient!fg;II[I)Z", line = 19)
	final boolean method498(@OriginalArg(0) Class32_Sub17 arg0, @OriginalArg(1) Class263 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		if (this.aBoolean11) {
			return true;
		} else if (arg2 >= arg4.length) {
			return false;
		} else {
			this.anInt72 = arg4[arg2] * 1338501659;
			this.aClass93_Sub1_Sub10_2 = arg0.method17244(this.anInt72 * -1424564205 >> 16);
			this.anInt72 = (this.anInt72 * -1424564205 & 0xFFFF) * 1338501659;
			if (this.aClass93_Sub1_Sub10_2 == null) {
				return false;
			}
			if (arg1.aBoolean669 && arg3 != -1 && arg3 < arg4.length) {
				this.anInt73 = arg4[arg3] * -1462611387;
				this.aClass93_Sub1_Sub10_1 = arg0.method17244(this.anInt73 * -278335347 >> 16);
				this.anInt73 = (this.anInt73 * -278335347 & 0xFFFF) * -1462611387;
			}
			if (arg1.aBoolean671) {
				this.anInt71 = (this.anInt71 * 2023242135 | 0x200) * -1408379353;
			}
			if (this.aClass93_Sub1_Sub10_2.method21778(this.anInt72 * -1424564205)) {
				this.anInt71 = (this.anInt71 * 2023242135 | 0x80) * -1408379353;
			}
			if (this.aClass93_Sub1_Sub10_2.method21777(this.anInt72 * -1424564205)) {
				this.anInt71 = (this.anInt71 * 2023242135 | 0x100) * -1408379353;
			}
			if (this.aClass93_Sub1_Sub10_2.method21775(this.anInt72 * -1424564205)) {
				this.anInt71 = (this.anInt71 * 2023242135 | 0x400) * -1408379353;
			}
			if (this.aClass93_Sub1_Sub10_1 != null) {
				if (this.aClass93_Sub1_Sub10_1.method21778(this.anInt73 * -278335347)) {
					this.anInt71 = (this.anInt71 * 2023242135 | 0x80) * -1408379353;
				}
				if (this.aClass93_Sub1_Sub10_1.method21777(this.anInt73 * -278335347)) {
					this.anInt71 = (this.anInt71 * 2023242135 | 0x100) * -1408379353;
				}
				if (this.aClass93_Sub1_Sub10_1.method21775(this.anInt73 * -278335347)) {
					this.anInt71 = (this.anInt71 * 2023242135 | 0x400) * -1408379353;
				}
			}
			this.anInt71 = (this.anInt71 * 2023242135 | 0x20) * -1408379353;
			this.aBoolean11 = true;
			return true;
		}
	}

	@OriginalMember(owner = "client!aau", name = "e", descriptor = "(IIZI)I", line = 30)
	public static int method503(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(4) Class93_Sub6 local4 = Class557.method31065(arg0, arg2);
		if (local4 == null) {
			return -1;
		} else if (arg1 >= 0 && arg1 < local4.anIntArray173.length) {
			return local4.anIntArray173[arg1];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!aau", name = "n", descriptor = "(I)V", line = 49)
	final void method496() {
		this.aBoolean11 = false;
		this.anInt71 = 0;
		this.aClass93_Sub1_Sub10_1 = null;
		this.aClass93_Sub1_Sub10_2 = null;
	}

	@OriginalMember(owner = "client!aau", name = "f", descriptor = "()V", line = 49)
	final void method499() {
		this.aBoolean11 = false;
		this.anInt71 = 0;
		this.aClass93_Sub1_Sub10_1 = null;
		this.aClass93_Sub1_Sub10_2 = null;
	}

	@OriginalMember(owner = "client!aau", name = "w", descriptor = "()V", line = 49)
	final void method500() {
		this.aBoolean11 = false;
		this.anInt71 = 0;
		this.aClass93_Sub1_Sub10_1 = null;
		this.aClass93_Sub1_Sub10_2 = null;
	}

	@OriginalMember(owner = "client!aau", name = "ee", descriptor = "(IB)Z", line = 1756)
	static boolean method501(@OriginalArg(0) int arg0) {
		return arg0 == 15 || arg0 == 16;
	}

	@OriginalMember(owner = "client!aau", name = "vt", descriptor = "(Lclient!yf;I)V", line = 8783)
	static final void method502(@OriginalArg(0) Class681 arg0) {
		Class558.method31110(true);
	}
}
