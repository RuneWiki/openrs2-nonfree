package com.jagex;

import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mw")
public class Class334 {

	@OriginalMember(owner = "client!mw", name = "u", descriptor = "Lclient!nx;")
	Class358 aClass358_1;

	@OriginalMember(owner = "client!mw", name = "c", descriptor = "[Lclient!aee;")
	Class46_Sub1[] aClass46_Sub1Array2;

	@OriginalMember(owner = "client!mw", name = "y", descriptor = "Lclient!nx;")
	Class358 aClass358_2;

	@OriginalMember(owner = "client!mw", name = "b", descriptor = "Z")
	boolean aBoolean718 = false;

	@OriginalMember(owner = "client!mw", name = "p", descriptor = "Lclient!nk;")
	Class51 aClass51_3;

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "Lclient!nl;")
	Class348 aClass348_2;

	@OriginalMember(owner = "client!mw", name = "g", descriptor = "Lclient!nj;")
	Class347 aClass347_2;

	@OriginalMember(owner = "client!mw", name = "l", descriptor = "Ljava/math/BigInteger;")
	BigInteger aBigInteger3;

	@OriginalMember(owner = "client!mw", name = "h", descriptor = "Ljava/math/BigInteger;")
	BigInteger aBigInteger4;

	@OriginalMember(owner = "client!mw", name = "x", descriptor = "Lclient!aor;")
	Class3_Sub1_Sub12_Sub3 aClass3_Sub1_Sub12_Sub3_3;

	@OriginalMember(owner = "client!mw", name = "s", descriptor = "Lclient!aok;")
	Class3_Sub1_Sub12_Sub1 aClass3_Sub1_Sub12_Sub1_1;

	@OriginalMember(owner = "client!mw", name = "p", descriptor = "(B)V", line = 16)
	public static void method26291() {
		if (Class55.aBoolean303) {
			return;
		}
		Class222.method24430(client.aClass370_1.method26950().aClass432ArrayArrayArray1);
		if (client.aClass370_1.method26950().aClass432ArrayArrayArray2 != null) {
			Class222.method24430(client.aClass370_1.method26950().aClass432ArrayArrayArray2);
		}
		Class55.aBoolean303 = true;
	}

	@OriginalMember(owner = "client!mw", name = "<init>", descriptor = "(Lclient!nk;Lclient!nl;Lclient!nj;Ljava/math/BigInteger;Ljava/math/BigInteger;)V", line = 21)
	public Class334(@OriginalArg(0) Class51 arg0, @OriginalArg(1) Class348 arg1, @OriginalArg(2) Class347 arg2, @OriginalArg(3) BigInteger arg3, @OriginalArg(4) BigInteger arg4) {
		this.aClass51_3 = arg0;
		this.aClass348_2 = arg1;
		this.aClass347_2 = arg2;
		this.aBigInteger3 = arg3;
		this.aBigInteger4 = arg4;
		if (!this.aClass51_3.method9820()) {
			this.aClass3_Sub1_Sub12_Sub3_3 = this.aClass51_3.method9818(255, 255, (byte) 0, true);
		}
		if (this.aClass348_2 != null) {
			this.aClass3_Sub1_Sub12_Sub1_1 = this.aClass348_2.method26542();
		}
	}

	@OriginalMember(owner = "client!mw", name = "p", descriptor = "(I)Z", line = 32)
	public boolean method26276() {
		if (this.aClass358_1 != null) {
			return true;
		}
		if (this.aClass3_Sub1_Sub12_Sub3_3 == null) {
			if (this.aClass51_3.method9820()) {
				return false;
			}
			this.aClass3_Sub1_Sub12_Sub3_3 = this.aClass51_3.method9818(255, 255, (byte) 0, true);
		}
		if (this.aClass3_Sub1_Sub12_Sub3_3.aBoolean516) {
			return false;
		}
		@Pc(39) Class3_Sub41 local39 = new Class3_Sub41(this.aClass3_Sub1_Sub12_Sub3_3.method21157());
		this.aClass358_1 = new Class358(local39, this.aBigInteger3, this.aBigInteger4);
		if (this.aClass46_Sub1Array2 == null) {
			this.aClass46_Sub1Array2 = new Class46_Sub1[this.aClass358_1.aClass314Array1.length];
		} else {
			for (@Pc(62) int local62 = 0; local62 < this.aClass46_Sub1Array2.length; local62++) {
				if (this.aClass46_Sub1Array2[local62] != null) {
					@Pc(80) Class314 local80 = this.aClass358_1.aClass314Array1[local62];
					this.aClass46_Sub1Array2[local62].method8546(local80.anInt4535 * 1441748585, local80.aByteArray78, local80.anInt4536 * -448725715, local80.anInt4534 * 405302631);
					if (this.aClass46_Sub1Array2[local62].method8527()) {
						this.aClass46_Sub1Array2[local62].method8536(false);
					}
				}
			}
		}
		this.aBoolean718 = false;
		return true;
	}

	@OriginalMember(owner = "client!mw", name = "s", descriptor = "()Z", line = 32)
	public boolean method26281() {
		if (this.aClass358_1 != null) {
			return true;
		}
		if (this.aClass3_Sub1_Sub12_Sub3_3 == null) {
			if (this.aClass51_3.method9820()) {
				return false;
			}
			this.aClass3_Sub1_Sub12_Sub3_3 = this.aClass51_3.method9818(255, 255, (byte) 0, true);
		}
		if (this.aClass3_Sub1_Sub12_Sub3_3.aBoolean516) {
			return false;
		}
		@Pc(39) Class3_Sub41 local39 = new Class3_Sub41(this.aClass3_Sub1_Sub12_Sub3_3.method21157());
		this.aClass358_1 = new Class358(local39, this.aBigInteger3, this.aBigInteger4);
		if (this.aClass46_Sub1Array2 == null) {
			this.aClass46_Sub1Array2 = new Class46_Sub1[this.aClass358_1.aClass314Array1.length];
		} else {
			for (@Pc(62) int local62 = 0; local62 < this.aClass46_Sub1Array2.length; local62++) {
				if (this.aClass46_Sub1Array2[local62] != null) {
					@Pc(80) Class314 local80 = this.aClass358_1.aClass314Array1[local62];
					this.aClass46_Sub1Array2[local62].method8546(local80.anInt4535 * 1441748585, local80.aByteArray78, local80.anInt4536 * -448725715, local80.anInt4534 * 405302631);
					if (this.aClass46_Sub1Array2[local62].method8527()) {
						this.aClass46_Sub1Array2[local62].method8536(false);
					}
				}
			}
		}
		this.aBoolean718 = false;
		return true;
	}

	@OriginalMember(owner = "client!mw", name = "u", descriptor = "()Z", line = 32)
	public boolean method26282() {
		if (this.aClass358_1 != null) {
			return true;
		}
		if (this.aClass3_Sub1_Sub12_Sub3_3 == null) {
			if (this.aClass51_3.method9820()) {
				return false;
			}
			this.aClass3_Sub1_Sub12_Sub3_3 = this.aClass51_3.method9818(255, 255, (byte) 0, true);
		}
		if (this.aClass3_Sub1_Sub12_Sub3_3.aBoolean516) {
			return false;
		}
		@Pc(39) Class3_Sub41 local39 = new Class3_Sub41(this.aClass3_Sub1_Sub12_Sub3_3.method21157());
		this.aClass358_1 = new Class358(local39, this.aBigInteger3, this.aBigInteger4);
		if (this.aClass46_Sub1Array2 == null) {
			this.aClass46_Sub1Array2 = new Class46_Sub1[this.aClass358_1.aClass314Array1.length];
		} else {
			for (@Pc(62) int local62 = 0; local62 < this.aClass46_Sub1Array2.length; local62++) {
				if (this.aClass46_Sub1Array2[local62] != null) {
					@Pc(80) Class314 local80 = this.aClass358_1.aClass314Array1[local62];
					this.aClass46_Sub1Array2[local62].method8546(local80.anInt4535 * 1441748585, local80.aByteArray78, local80.anInt4536 * -448725715, local80.anInt4534 * 405302631);
					if (this.aClass46_Sub1Array2[local62].method8527()) {
						this.aClass46_Sub1Array2[local62].method8536(false);
					}
				}
			}
		}
		this.aBoolean718 = false;
		return true;
	}

	@OriginalMember(owner = "client!mw", name = "y", descriptor = "()Z", line = 32)
	public boolean method26283() {
		if (this.aClass358_1 != null) {
			return true;
		}
		if (this.aClass3_Sub1_Sub12_Sub3_3 == null) {
			if (this.aClass51_3.method9820()) {
				return false;
			}
			this.aClass3_Sub1_Sub12_Sub3_3 = this.aClass51_3.method9818(255, 255, (byte) 0, true);
		}
		if (this.aClass3_Sub1_Sub12_Sub3_3.aBoolean516) {
			return false;
		}
		@Pc(39) Class3_Sub41 local39 = new Class3_Sub41(this.aClass3_Sub1_Sub12_Sub3_3.method21157());
		this.aClass358_1 = new Class358(local39, this.aBigInteger3, this.aBigInteger4);
		if (this.aClass46_Sub1Array2 == null) {
			this.aClass46_Sub1Array2 = new Class46_Sub1[this.aClass358_1.aClass314Array1.length];
		} else {
			for (@Pc(62) int local62 = 0; local62 < this.aClass46_Sub1Array2.length; local62++) {
				if (this.aClass46_Sub1Array2[local62] != null) {
					@Pc(80) Class314 local80 = this.aClass358_1.aClass314Array1[local62];
					this.aClass46_Sub1Array2[local62].method8546(local80.anInt4535 * 1441748585, local80.aByteArray78, local80.anInt4536 * -448725715, local80.anInt4534 * 405302631);
					if (this.aClass46_Sub1Array2[local62].method8527()) {
						this.aClass46_Sub1Array2[local62].method8536(false);
					}
				}
			}
		}
		this.aBoolean718 = false;
		return true;
	}

	@OriginalMember(owner = "client!mw", name = "x", descriptor = "()Z", line = 32)
	public boolean method26284() {
		if (this.aClass358_1 != null) {
			return true;
		}
		if (this.aClass3_Sub1_Sub12_Sub3_3 == null) {
			if (this.aClass51_3.method9820()) {
				return false;
			}
			this.aClass3_Sub1_Sub12_Sub3_3 = this.aClass51_3.method9818(255, 255, (byte) 0, true);
		}
		if (this.aClass3_Sub1_Sub12_Sub3_3.aBoolean516) {
			return false;
		}
		@Pc(39) Class3_Sub41 local39 = new Class3_Sub41(this.aClass3_Sub1_Sub12_Sub3_3.method21157());
		this.aClass358_1 = new Class358(local39, this.aBigInteger3, this.aBigInteger4);
		if (this.aClass46_Sub1Array2 == null) {
			this.aClass46_Sub1Array2 = new Class46_Sub1[this.aClass358_1.aClass314Array1.length];
		} else {
			for (@Pc(62) int local62 = 0; local62 < this.aClass46_Sub1Array2.length; local62++) {
				if (this.aClass46_Sub1Array2[local62] != null) {
					@Pc(80) Class314 local80 = this.aClass358_1.aClass314Array1[local62];
					this.aClass46_Sub1Array2[local62].method8546(local80.anInt4535 * 1441748585, local80.aByteArray78, local80.anInt4536 * -448725715, local80.anInt4534 * 405302631);
					if (this.aClass46_Sub1Array2[local62].method8527()) {
						this.aClass46_Sub1Array2[local62].method8536(false);
					}
				}
			}
		}
		this.aBoolean718 = false;
		return true;
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(I)V", line = 56)
	public void method26277() {
		this.aClass358_1 = null;
		this.aClass3_Sub1_Sub12_Sub3_3 = null;
		this.aClass3_Sub1_Sub12_Sub1_1 = null;
		this.aBoolean718 = false;
		if (!this.aClass51_3.method9820()) {
			this.aClass3_Sub1_Sub12_Sub3_3 = this.aClass51_3.method9818(255, 255, (byte) 0, true);
		}
	}

	@OriginalMember(owner = "client!mw", name = "b", descriptor = "()V", line = 56)
	public void method26289() {
		this.aClass358_1 = null;
		this.aClass3_Sub1_Sub12_Sub3_3 = null;
		this.aClass3_Sub1_Sub12_Sub1_1 = null;
		this.aBoolean718 = false;
		if (!this.aClass51_3.method9820()) {
			this.aClass3_Sub1_Sub12_Sub3_3 = this.aClass51_3.method9818(255, 255, (byte) 0, true);
		}
	}

	@OriginalMember(owner = "client!mw", name = "g", descriptor = "(ILclient!qa;Lclient!qa;ZI)Lclient!aee;", line = 64)
	public Class46_Sub1 method26278(@OriginalArg(0) int arg0, @OriginalArg(1) Class403 arg1, @OriginalArg(2) Class403 arg2, @OriginalArg(3) boolean arg3) {
		return this.method26285(arg0, arg1, arg2, true, arg3);
	}

	@OriginalMember(owner = "client!mw", name = "z", descriptor = "(ILclient!qa;Lclient!qa;ZZ)Lclient!aee;", line = 68)
	Class46_Sub1 method26275(@OriginalArg(0) int arg0, @OriginalArg(1) Class403 arg1, @OriginalArg(2) Class403 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass358_1 == null) {
			throw new RuntimeException();
		} else if (arg0 < 0 || arg0 >= this.aClass46_Sub1Array2.length) {
			throw new RuntimeException();
		} else if (this.aClass46_Sub1Array2[arg0] == null) {
			@Pc(33) Class314 local33 = this.aClass358_1.aClass314Array1[arg0];
			@Pc(65) Class46_Sub1 local65 = new Class46_Sub1(arg0, arg1, arg2, this.aClass51_3, arg4 ? this.aClass348_2 : null, this.aClass347_2, local33.anInt4535 * 1441748585, local33.aByteArray78, local33.anInt4536 * -448725715, arg3, local33.anInt4534 * 405302631);
			this.aClass46_Sub1Array2[arg0] = local65;
			if (this.aClass358_2 != null && arg4) {
				@Pc(81) Class314 local81 = this.aClass358_2.aClass314Array1[arg0];
				this.aClass46_Sub1Array2[arg0].method8536(this.aClass46_Sub1Array2[arg0].method8539(local81.anInt4535 * 1441748585, local81.aByteArray78, local81.anInt4536 * -448725715, local81.anInt4534 * 405302631));
			}
			return local65;
		} else {
			return this.aClass46_Sub1Array2[arg0];
		}
	}

	@OriginalMember(owner = "client!mw", name = "l", descriptor = "(ILclient!qa;Lclient!qa;ZZB)Lclient!aee;", line = 68)
	Class46_Sub1 method26285(@OriginalArg(0) int arg0, @OriginalArg(1) Class403 arg1, @OriginalArg(2) Class403 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass358_1 == null) {
			throw new RuntimeException();
		} else if (arg0 < 0 || arg0 >= this.aClass46_Sub1Array2.length) {
			throw new RuntimeException();
		} else if (this.aClass46_Sub1Array2[arg0] == null) {
			@Pc(33) Class314 local33 = this.aClass358_1.aClass314Array1[arg0];
			@Pc(65) Class46_Sub1 local65 = new Class46_Sub1(arg0, arg1, arg2, this.aClass51_3, arg4 ? this.aClass348_2 : null, this.aClass347_2, local33.anInt4535 * 1441748585, local33.aByteArray78, local33.anInt4536 * -448725715, arg3, local33.anInt4534 * 405302631);
			this.aClass46_Sub1Array2[arg0] = local65;
			if (this.aClass358_2 != null && arg4) {
				@Pc(81) Class314 local81 = this.aClass358_2.aClass314Array1[arg0];
				this.aClass46_Sub1Array2[arg0].method8536(this.aClass46_Sub1Array2[arg0].method8539(local81.anInt4535 * 1441748585, local81.aByteArray78, local81.anInt4536 * -448725715, local81.anInt4534 * 405302631));
			}
			return local65;
		} else {
			return this.aClass46_Sub1Array2[arg0];
		}
	}

	@OriginalMember(owner = "client!mw", name = "c", descriptor = "(ILclient!qa;Lclient!qa;ZZ)Lclient!aee;", line = 68)
	Class46_Sub1 method26286(@OriginalArg(0) int arg0, @OriginalArg(1) Class403 arg1, @OriginalArg(2) Class403 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass358_1 == null) {
			throw new RuntimeException();
		} else if (arg0 < 0 || arg0 >= this.aClass46_Sub1Array2.length) {
			throw new RuntimeException();
		} else if (this.aClass46_Sub1Array2[arg0] == null) {
			@Pc(33) Class314 local33 = this.aClass358_1.aClass314Array1[arg0];
			@Pc(65) Class46_Sub1 local65 = new Class46_Sub1(arg0, arg1, arg2, this.aClass51_3, arg4 ? this.aClass348_2 : null, this.aClass347_2, local33.anInt4535 * 1441748585, local33.aByteArray78, local33.anInt4536 * -448725715, arg3, local33.anInt4534 * 405302631);
			this.aClass46_Sub1Array2[arg0] = local65;
			if (this.aClass358_2 != null && arg4) {
				@Pc(81) Class314 local81 = this.aClass358_2.aClass314Array1[arg0];
				this.aClass46_Sub1Array2[arg0].method8536(this.aClass46_Sub1Array2[arg0].method8539(local81.anInt4535 * 1441748585, local81.aByteArray78, local81.anInt4536 * -448725715, local81.anInt4534 * 405302631));
			}
			return local65;
		} else {
			return this.aClass46_Sub1Array2[arg0];
		}
	}

	@OriginalMember(owner = "client!mw", name = "j", descriptor = "(ILclient!qa;Lclient!qa;ZZ)Lclient!aee;", line = 68)
	Class46_Sub1 method26287(@OriginalArg(0) int arg0, @OriginalArg(1) Class403 arg1, @OriginalArg(2) Class403 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass358_1 == null) {
			throw new RuntimeException();
		} else if (arg0 < 0 || arg0 >= this.aClass46_Sub1Array2.length) {
			throw new RuntimeException();
		} else if (this.aClass46_Sub1Array2[arg0] == null) {
			@Pc(33) Class314 local33 = this.aClass358_1.aClass314Array1[arg0];
			@Pc(65) Class46_Sub1 local65 = new Class46_Sub1(arg0, arg1, arg2, this.aClass51_3, arg4 ? this.aClass348_2 : null, this.aClass347_2, local33.anInt4535 * 1441748585, local33.aByteArray78, local33.anInt4536 * -448725715, arg3, local33.anInt4534 * 405302631);
			this.aClass46_Sub1Array2[arg0] = local65;
			if (this.aClass358_2 != null && arg4) {
				@Pc(81) Class314 local81 = this.aClass358_2.aClass314Array1[arg0];
				this.aClass46_Sub1Array2[arg0].method8536(this.aClass46_Sub1Array2[arg0].method8539(local81.anInt4535 * 1441748585, local81.aByteArray78, local81.anInt4536 * -448725715, local81.anInt4534 * 405302631));
			}
			return local65;
		} else {
			return this.aClass46_Sub1Array2[arg0];
		}
	}

	@OriginalMember(owner = "client!mw", name = "e", descriptor = "()V", line = 86)
	public void method26279() {
		if (this.aClass46_Sub1Array2 == null) {
			return;
		}
		@Pc(5) int local5;
		for (local5 = 0; local5 < this.aClass46_Sub1Array2.length; local5++) {
			if (this.aClass46_Sub1Array2[local5] != null) {
				this.aClass46_Sub1Array2[local5].method8529();
			}
		}
		for (local5 = 0; local5 < this.aClass46_Sub1Array2.length; local5++) {
			if (this.aClass46_Sub1Array2[local5] != null) {
				this.aClass46_Sub1Array2[local5].method8543();
			}
		}
		if (this.aClass358_1 == null) {
			this.method26276();
		} else if (this.aClass348_2 != null && !this.aBoolean718) {
			if (this.aClass3_Sub1_Sub12_Sub1_1 == null) {
				this.aClass3_Sub1_Sub12_Sub1_1 = this.aClass348_2.method26542();
			} else if (!this.aClass3_Sub1_Sub12_Sub1_1.aBoolean516) {
				@Pc(77) byte[] local77 = this.aClass3_Sub1_Sub12_Sub1_1.method21157();
				try {
					this.aClass358_2 = new Class358(new Class3_Sub41(local77), this.aBigInteger3, this.aBigInteger4);
					for (@Pc(92) int local92 = 0; local92 < this.aClass46_Sub1Array2.length; local92++) {
						if (this.aClass46_Sub1Array2[local92] != null && this.aClass46_Sub1Array2[local92].method8527()) {
							@Pc(116) Class314 local116 = this.aClass358_2.aClass314Array1[local92];
							this.aClass46_Sub1Array2[local92].method8536(this.aClass46_Sub1Array2[local92].method8539(local116.anInt4535 * 1441748585, local116.aByteArray78, local116.anInt4536 * -448725715, local116.anInt4534 * 405302631));
						}
					}
				} catch (@Pc(146) Exception local146) {
					for (@Pc(148) int local148 = 0; local148 < this.aClass46_Sub1Array2.length; local148++) {
						if (this.aClass46_Sub1Array2[local148] != null && this.aClass46_Sub1Array2[local148].method8527()) {
							this.aClass46_Sub1Array2[local148].method8536(false);
						}
					}
				}
				this.aClass3_Sub1_Sub12_Sub1_1 = null;
				this.aBoolean718 = true;
			}
		}
	}

	@OriginalMember(owner = "client!mw", name = "h", descriptor = "(I)V", line = 86)
	public void method26280() {
		if (this.aClass46_Sub1Array2 == null) {
			return;
		}
		@Pc(5) int local5;
		for (local5 = 0; local5 < this.aClass46_Sub1Array2.length; local5++) {
			if (this.aClass46_Sub1Array2[local5] != null) {
				this.aClass46_Sub1Array2[local5].method8529();
			}
		}
		for (local5 = 0; local5 < this.aClass46_Sub1Array2.length; local5++) {
			if (this.aClass46_Sub1Array2[local5] != null) {
				this.aClass46_Sub1Array2[local5].method8543();
			}
		}
		if (this.aClass358_1 == null) {
			this.method26276();
		} else if (this.aClass348_2 != null && !this.aBoolean718) {
			if (this.aClass3_Sub1_Sub12_Sub1_1 == null) {
				this.aClass3_Sub1_Sub12_Sub1_1 = this.aClass348_2.method26542();
			} else if (!this.aClass3_Sub1_Sub12_Sub1_1.aBoolean516) {
				@Pc(77) byte[] local77 = this.aClass3_Sub1_Sub12_Sub1_1.method21157();
				try {
					this.aClass358_2 = new Class358(new Class3_Sub41(local77), this.aBigInteger3, this.aBigInteger4);
					for (@Pc(92) int local92 = 0; local92 < this.aClass46_Sub1Array2.length; local92++) {
						if (this.aClass46_Sub1Array2[local92] != null && this.aClass46_Sub1Array2[local92].method8527()) {
							@Pc(116) Class314 local116 = this.aClass358_2.aClass314Array1[local92];
							this.aClass46_Sub1Array2[local92].method8536(this.aClass46_Sub1Array2[local92].method8539(local116.anInt4535 * 1441748585, local116.aByteArray78, local116.anInt4536 * -448725715, local116.anInt4534 * 405302631));
						}
					}
				} catch (@Pc(146) Exception local146) {
					for (@Pc(148) int local148 = 0; local148 < this.aClass46_Sub1Array2.length; local148++) {
						if (this.aClass46_Sub1Array2[local148] != null && this.aClass46_Sub1Array2[local148].method8527()) {
							this.aClass46_Sub1Array2[local148].method8536(false);
						}
					}
				}
				this.aClass3_Sub1_Sub12_Sub1_1 = null;
				this.aBoolean718 = true;
			}
		}
	}

	@OriginalMember(owner = "client!mw", name = "n", descriptor = "()V", line = 86)
	public void method26288() {
		if (this.aClass46_Sub1Array2 == null) {
			return;
		}
		@Pc(5) int local5;
		for (local5 = 0; local5 < this.aClass46_Sub1Array2.length; local5++) {
			if (this.aClass46_Sub1Array2[local5] != null) {
				this.aClass46_Sub1Array2[local5].method8529();
			}
		}
		for (local5 = 0; local5 < this.aClass46_Sub1Array2.length; local5++) {
			if (this.aClass46_Sub1Array2[local5] != null) {
				this.aClass46_Sub1Array2[local5].method8543();
			}
		}
		if (this.aClass358_1 == null) {
			this.method26276();
		} else if (this.aClass348_2 != null && !this.aBoolean718) {
			if (this.aClass3_Sub1_Sub12_Sub1_1 == null) {
				this.aClass3_Sub1_Sub12_Sub1_1 = this.aClass348_2.method26542();
			} else if (!this.aClass3_Sub1_Sub12_Sub1_1.aBoolean516) {
				@Pc(77) byte[] local77 = this.aClass3_Sub1_Sub12_Sub1_1.method21157();
				try {
					this.aClass358_2 = new Class358(new Class3_Sub41(local77), this.aBigInteger3, this.aBigInteger4);
					for (@Pc(92) int local92 = 0; local92 < this.aClass46_Sub1Array2.length; local92++) {
						if (this.aClass46_Sub1Array2[local92] != null && this.aClass46_Sub1Array2[local92].method8527()) {
							@Pc(116) Class314 local116 = this.aClass358_2.aClass314Array1[local92];
							this.aClass46_Sub1Array2[local92].method8536(this.aClass46_Sub1Array2[local92].method8539(local116.anInt4535 * 1441748585, local116.aByteArray78, local116.anInt4536 * -448725715, local116.anInt4534 * 405302631));
						}
					}
				} catch (@Pc(146) Exception local146) {
					for (@Pc(148) int local148 = 0; local148 < this.aClass46_Sub1Array2.length; local148++) {
						if (this.aClass46_Sub1Array2[local148] != null && this.aClass46_Sub1Array2[local148].method8527()) {
							this.aClass46_Sub1Array2[local148].method8536(false);
						}
					}
				}
				this.aClass3_Sub1_Sub12_Sub1_1 = null;
				this.aBoolean718 = true;
			}
		}
	}

	@OriginalMember(owner = "client!mw", name = "zx", descriptor = "(Lclient!vs;B)V", line = 8678)
	static final void method26290(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = arg0.aClass3_Sub30_3.aClass238Array1[local12].aByte129;
	}
}
