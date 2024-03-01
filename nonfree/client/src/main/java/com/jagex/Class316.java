package com.jagex;

import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!md")
public class Class316 {

	@OriginalMember(owner = "client!md", name = "p", descriptor = "I")
	static final int anInt4547 = 7;

	@OriginalMember(owner = "client!md", name = "tw", descriptor = "I")
	static int anInt4548;

	@OriginalMember(owner = "client!md", name = "as", descriptor = "Lclient!pl;")
	protected static Class393 aClass393_1;

	@OriginalMember(owner = "client!md", name = "y", descriptor = "I")
	int anInt4543;

	@OriginalMember(owner = "client!md", name = "m", descriptor = "Z")
	boolean aBoolean715;

	@OriginalMember(owner = "client!md", name = "l", descriptor = "I")
	int anInt4544;

	@OriginalMember(owner = "client!md", name = "h", descriptor = "I")
	int anInt4545;

	@OriginalMember(owner = "client!md", name = "s", descriptor = "[I")
	int[] anIntArray413;

	@OriginalMember(owner = "client!md", name = "u", descriptor = "Lclient!gt;")
	Class209 aClass209_1;

	@OriginalMember(owner = "client!md", name = "c", descriptor = "[[B")
	byte[][] aByteArrayArray14;

	@OriginalMember(owner = "client!md", name = "b", descriptor = "[I")
	int[] anIntArray414;

	@OriginalMember(owner = "client!md", name = "x", descriptor = "[I")
	int[] anIntArray415;

	@OriginalMember(owner = "client!md", name = "q", descriptor = "Z")
	boolean aBoolean716;

	@OriginalMember(owner = "client!md", name = "j", descriptor = "[I")
	int[] anIntArray416;

	@OriginalMember(owner = "client!md", name = "n", descriptor = "[[I")
	int[][] anIntArrayArray48;

	@OriginalMember(owner = "client!md", name = "e", descriptor = "[[I")
	int[][] anIntArrayArray49;

	@OriginalMember(owner = "client!md", name = "r", descriptor = "[Lclient!gt;")
	Class209[] aClass209Array1;

	@OriginalMember(owner = "client!md", name = "d", descriptor = "[I")
	int[] anIntArray417;

	@OriginalMember(owner = "client!md", name = "z", descriptor = "[I")
	int[] anIntArray418;

	@OriginalMember(owner = "client!md", name = "a", descriptor = "I")
	int anInt4546;

	@OriginalMember(owner = "client!md", name = "g", descriptor = "[B")
	byte[] aByteArray79;

	@OriginalMember(owner = "client!md", name = "p", descriptor = "(Ljava/awt/Component;ZB)Lclient!qu;", line = 12)
	public static Class61 method25838(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1) {
		return new Class61_Sub1(arg0, arg1);
	}

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "([BI[B)V", line = 28)
	Class316(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		this.anInt4546 = Class142.method23047(arg0, arg0.length) * -2123170915;
		if (this.anInt4546 * -2109054283 != arg1) {
			throw new RuntimeException();
		}
		if (arg2 != null) {
			if (arg2.length != 64) {
				throw new RuntimeException();
			}
			this.aByteArray79 = Class71_Sub3.method20105(arg0, 0, arg0.length);
			for (@Pc(40) int local40 = 0; local40 < 64; local40++) {
				if (arg2[local40] != this.aByteArray79[local40]) {
					throw new RuntimeException();
				}
			}
		}
		this.method25837(arg0);
	}

	@OriginalMember(owner = "client!md", name = "g", descriptor = "([B)V", line = 48)
	void method25835(@OriginalArg(0) byte[] arg0) {
		@Pc(6) Class3_Sub41 local6 = new Class3_Sub41(Class494.method29319(arg0));
		@Pc(10) int local10 = local6.method20269();
		if (local10 < 5 || local10 > 7) {
			throw new RuntimeException();
		}
		if (local10 >= 6) {
			this.anInt4544 = local6.method20275() * -1281988073;
		} else {
			this.anInt4544 = 0;
		}
		@Pc(38) int local38 = local6.method20269();
		this.aBoolean716 = (local38 & 0x1) != 0;
		this.aBoolean715 = (local38 & 0x2) != 0;
		if (local10 >= 7) {
			this.anInt4545 = local6.method20291() * 543774353;
		} else {
			this.anInt4545 = local6.method20271() * 543774353;
		}
		@Pc(76) int local76 = 0;
		@Pc(78) int local78 = -1;
		this.anIntArray415 = new int[this.anInt4545 * 486353521];
		@Pc(90) int local90;
		if (local10 >= 7) {
			for (local90 = 0; local90 < this.anInt4545 * 486353521; local90++) {
				this.anIntArray415[local90] = local76 += local6.method20291();
				if (this.anIntArray415[local90] > local78) {
					local78 = this.anIntArray415[local90];
				}
			}
		} else {
			for (local90 = 0; local90 < this.anInt4545 * 486353521; local90++) {
				this.anIntArray415[local90] = local76 += local6.method20271();
				if (this.anIntArray415[local90] > local78) {
					local78 = this.anIntArray415[local90];
				}
			}
		}
		this.anInt4543 = (local78 + 1) * -768649173;
		this.anIntArray414 = new int[this.anInt4543 * 1691264643];
		if (this.aBoolean715) {
			this.aByteArrayArray14 = new byte[this.anInt4543 * 1691264643][];
		}
		this.anIntArray418 = new int[this.anInt4543 * 1691264643];
		this.anIntArray416 = new int[this.anInt4543 * 1691264643];
		this.anIntArrayArray48 = new int[this.anInt4543 * 1691264643][];
		this.anIntArray417 = new int[this.anInt4543 * 1691264643];
		if (this.aBoolean716) {
			this.anIntArray413 = new int[this.anInt4543 * 1691264643];
			for (local90 = 0; local90 < this.anInt4543 * 1691264643; local90++) {
				this.anIntArray413[local90] = -1;
			}
			for (local90 = 0; local90 < this.anInt4545 * 486353521; local90++) {
				this.anIntArray413[this.anIntArray415[local90]] = local6.method20275();
			}
			this.aClass209_1 = new Class209(this.anIntArray413);
		}
		for (local90 = 0; local90 < this.anInt4545 * 486353521; local90++) {
			this.anIntArray414[this.anIntArray415[local90]] = local6.method20275();
		}
		if (this.aBoolean715) {
			for (local90 = 0; local90 < this.anInt4545 * 486353521; local90++) {
				@Pc(291) byte[] local291 = new byte[64];
				local6.method20286(local291, 0, 64);
				this.aByteArrayArray14[this.anIntArray415[local90]] = local291;
			}
		}
		for (local90 = 0; local90 < this.anInt4545 * 486353521; local90++) {
			this.anIntArray418[this.anIntArray415[local90]] = local6.method20275();
		}
		@Pc(368) int local368;
		@Pc(372) int local372;
		@Pc(380) int local380;
		@Pc(398) int local398;
		@Pc(363) int local363;
		if (local10 >= 7) {
			for (local90 = 0; local90 < this.anInt4545 * 486353521; local90++) {
				this.anIntArray416[this.anIntArray415[local90]] = local6.method20291();
			}
			for (local90 = 0; local90 < this.anInt4545 * 486353521; local90++) {
				local363 = this.anIntArray415[local90];
				local368 = this.anIntArray416[local363];
				local76 = 0;
				local372 = -1;
				this.anIntArrayArray48[local363] = new int[local368];
				for (local380 = 0; local380 < local368; local380++) {
					local398 = this.anIntArrayArray48[local363][local380] = local76 += local6.method20291();
					if (local398 > local372) {
						local372 = local398;
					}
				}
				this.anIntArray417[local363] = local372 + 1;
				if (local368 == local372 + 1) {
					this.anIntArrayArray48[local363] = null;
				}
			}
		} else {
			for (local90 = 0; local90 < this.anInt4545 * 486353521; local90++) {
				this.anIntArray416[this.anIntArray415[local90]] = local6.method20271();
			}
			for (local90 = 0; local90 < this.anInt4545 * 486353521; local90++) {
				local363 = this.anIntArray415[local90];
				local368 = this.anIntArray416[local363];
				local76 = 0;
				local372 = -1;
				this.anIntArrayArray48[local363] = new int[local368];
				for (local380 = 0; local380 < local368; local380++) {
					local398 = this.anIntArrayArray48[local363][local380] = local76 += local6.method20271();
					if (local398 > local372) {
						local372 = local398;
					}
				}
				this.anIntArray417[local363] = local372 + 1;
				if (local368 == local372 + 1) {
					this.anIntArrayArray48[local363] = null;
				}
			}
		}
		if (!this.aBoolean716) {
			return;
		}
		this.anIntArrayArray49 = new int[local78 + 1][];
		this.aClass209Array1 = new Class209[local78 + 1];
		for (local90 = 0; local90 < this.anInt4545 * 486353521; local90++) {
			local363 = this.anIntArray415[local90];
			local368 = this.anIntArray416[local363];
			this.anIntArrayArray49[local363] = new int[this.anIntArray417[local363]];
			for (local372 = 0; local372 < this.anIntArray417[local363]; local372++) {
				this.anIntArrayArray49[local363][local372] = -1;
			}
			for (local372 = 0; local372 < local368; local372++) {
				if (this.anIntArrayArray48[local363] == null) {
					local380 = local372;
				} else {
					local380 = this.anIntArrayArray48[local363][local372];
				}
				this.anIntArrayArray49[local363][local380] = local6.method20275();
			}
			this.aClass209Array1[local363] = new Class209(this.anIntArrayArray49[local363]);
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "([B)V", line = 48)
	void method25836(@OriginalArg(0) byte[] arg0) {
		@Pc(6) Class3_Sub41 local6 = new Class3_Sub41(Class494.method29319(arg0));
		@Pc(10) int local10 = local6.method20269();
		if (local10 < 5 || local10 > 7) {
			throw new RuntimeException();
		}
		if (local10 >= 6) {
			this.anInt4544 = local6.method20275() * -1281988073;
		} else {
			this.anInt4544 = 0;
		}
		@Pc(38) int local38 = local6.method20269();
		this.aBoolean716 = (local38 & 0x1) != 0;
		this.aBoolean715 = (local38 & 0x2) != 0;
		if (local10 >= 7) {
			this.anInt4545 = local6.method20291() * 543774353;
		} else {
			this.anInt4545 = local6.method20271() * 543774353;
		}
		@Pc(76) int local76 = 0;
		@Pc(78) int local78 = -1;
		this.anIntArray415 = new int[this.anInt4545 * 486353521];
		@Pc(90) int local90;
		if (local10 >= 7) {
			for (local90 = 0; local90 < this.anInt4545 * 486353521; local90++) {
				this.anIntArray415[local90] = local76 += local6.method20291();
				if (this.anIntArray415[local90] > local78) {
					local78 = this.anIntArray415[local90];
				}
			}
		} else {
			for (local90 = 0; local90 < this.anInt4545 * 486353521; local90++) {
				this.anIntArray415[local90] = local76 += local6.method20271();
				if (this.anIntArray415[local90] > local78) {
					local78 = this.anIntArray415[local90];
				}
			}
		}
		this.anInt4543 = (local78 + 1) * -768649173;
		this.anIntArray414 = new int[this.anInt4543 * 1691264643];
		if (this.aBoolean715) {
			this.aByteArrayArray14 = new byte[this.anInt4543 * 1691264643][];
		}
		this.anIntArray418 = new int[this.anInt4543 * 1691264643];
		this.anIntArray416 = new int[this.anInt4543 * 1691264643];
		this.anIntArrayArray48 = new int[this.anInt4543 * 1691264643][];
		this.anIntArray417 = new int[this.anInt4543 * 1691264643];
		if (this.aBoolean716) {
			this.anIntArray413 = new int[this.anInt4543 * 1691264643];
			for (local90 = 0; local90 < this.anInt4543 * 1691264643; local90++) {
				this.anIntArray413[local90] = -1;
			}
			for (local90 = 0; local90 < this.anInt4545 * 486353521; local90++) {
				this.anIntArray413[this.anIntArray415[local90]] = local6.method20275();
			}
			this.aClass209_1 = new Class209(this.anIntArray413);
		}
		for (local90 = 0; local90 < this.anInt4545 * 486353521; local90++) {
			this.anIntArray414[this.anIntArray415[local90]] = local6.method20275();
		}
		if (this.aBoolean715) {
			for (local90 = 0; local90 < this.anInt4545 * 486353521; local90++) {
				@Pc(291) byte[] local291 = new byte[64];
				local6.method20286(local291, 0, 64);
				this.aByteArrayArray14[this.anIntArray415[local90]] = local291;
			}
		}
		for (local90 = 0; local90 < this.anInt4545 * 486353521; local90++) {
			this.anIntArray418[this.anIntArray415[local90]] = local6.method20275();
		}
		@Pc(368) int local368;
		@Pc(372) int local372;
		@Pc(380) int local380;
		@Pc(398) int local398;
		@Pc(363) int local363;
		if (local10 >= 7) {
			for (local90 = 0; local90 < this.anInt4545 * 486353521; local90++) {
				this.anIntArray416[this.anIntArray415[local90]] = local6.method20291();
			}
			for (local90 = 0; local90 < this.anInt4545 * 486353521; local90++) {
				local363 = this.anIntArray415[local90];
				local368 = this.anIntArray416[local363];
				local76 = 0;
				local372 = -1;
				this.anIntArrayArray48[local363] = new int[local368];
				for (local380 = 0; local380 < local368; local380++) {
					local398 = this.anIntArrayArray48[local363][local380] = local76 += local6.method20291();
					if (local398 > local372) {
						local372 = local398;
					}
				}
				this.anIntArray417[local363] = local372 + 1;
				if (local368 == local372 + 1) {
					this.anIntArrayArray48[local363] = null;
				}
			}
		} else {
			for (local90 = 0; local90 < this.anInt4545 * 486353521; local90++) {
				this.anIntArray416[this.anIntArray415[local90]] = local6.method20271();
			}
			for (local90 = 0; local90 < this.anInt4545 * 486353521; local90++) {
				local363 = this.anIntArray415[local90];
				local368 = this.anIntArray416[local363];
				local76 = 0;
				local372 = -1;
				this.anIntArrayArray48[local363] = new int[local368];
				for (local380 = 0; local380 < local368; local380++) {
					local398 = this.anIntArrayArray48[local363][local380] = local76 += local6.method20271();
					if (local398 > local372) {
						local372 = local398;
					}
				}
				this.anIntArray417[local363] = local372 + 1;
				if (local368 == local372 + 1) {
					this.anIntArrayArray48[local363] = null;
				}
			}
		}
		if (!this.aBoolean716) {
			return;
		}
		this.anIntArrayArray49 = new int[local78 + 1][];
		this.aClass209Array1 = new Class209[local78 + 1];
		for (local90 = 0; local90 < this.anInt4545 * 486353521; local90++) {
			local363 = this.anIntArray415[local90];
			local368 = this.anIntArray416[local363];
			this.anIntArrayArray49[local363] = new int[this.anIntArray417[local363]];
			for (local372 = 0; local372 < this.anIntArray417[local363]; local372++) {
				this.anIntArrayArray49[local363][local372] = -1;
			}
			for (local372 = 0; local372 < local368; local372++) {
				if (this.anIntArrayArray48[local363] == null) {
					local380 = local372;
				} else {
					local380 = this.anIntArrayArray48[local363][local372];
				}
				this.anIntArrayArray49[local363][local380] = local6.method20275();
			}
			this.aClass209Array1[local363] = new Class209(this.anIntArrayArray49[local363]);
		}
	}

	@OriginalMember(owner = "client!md", name = "p", descriptor = "([BI)V", line = 48)
	void method25837(@OriginalArg(0) byte[] arg0) {
		@Pc(6) Class3_Sub41 local6 = new Class3_Sub41(Class494.method29319(arg0));
		@Pc(10) int local10 = local6.method20269();
		if (local10 < 5 || local10 > 7) {
			throw new RuntimeException();
		}
		if (local10 >= 6) {
			this.anInt4544 = local6.method20275() * -1281988073;
		} else {
			this.anInt4544 = 0;
		}
		@Pc(38) int local38 = local6.method20269();
		this.aBoolean716 = (local38 & 0x1) != 0;
		this.aBoolean715 = (local38 & 0x2) != 0;
		if (local10 >= 7) {
			this.anInt4545 = local6.method20291() * 543774353;
		} else {
			this.anInt4545 = local6.method20271() * 543774353;
		}
		@Pc(76) int local76 = 0;
		@Pc(78) int local78 = -1;
		this.anIntArray415 = new int[this.anInt4545 * 486353521];
		@Pc(90) int local90;
		if (local10 >= 7) {
			for (local90 = 0; local90 < this.anInt4545 * 486353521; local90++) {
				this.anIntArray415[local90] = local76 += local6.method20291();
				if (this.anIntArray415[local90] > local78) {
					local78 = this.anIntArray415[local90];
				}
			}
		} else {
			for (local90 = 0; local90 < this.anInt4545 * 486353521; local90++) {
				this.anIntArray415[local90] = local76 += local6.method20271();
				if (this.anIntArray415[local90] > local78) {
					local78 = this.anIntArray415[local90];
				}
			}
		}
		this.anInt4543 = (local78 + 1) * -768649173;
		this.anIntArray414 = new int[this.anInt4543 * 1691264643];
		if (this.aBoolean715) {
			this.aByteArrayArray14 = new byte[this.anInt4543 * 1691264643][];
		}
		this.anIntArray418 = new int[this.anInt4543 * 1691264643];
		this.anIntArray416 = new int[this.anInt4543 * 1691264643];
		this.anIntArrayArray48 = new int[this.anInt4543 * 1691264643][];
		this.anIntArray417 = new int[this.anInt4543 * 1691264643];
		if (this.aBoolean716) {
			this.anIntArray413 = new int[this.anInt4543 * 1691264643];
			for (local90 = 0; local90 < this.anInt4543 * 1691264643; local90++) {
				this.anIntArray413[local90] = -1;
			}
			for (local90 = 0; local90 < this.anInt4545 * 486353521; local90++) {
				this.anIntArray413[this.anIntArray415[local90]] = local6.method20275();
			}
			this.aClass209_1 = new Class209(this.anIntArray413);
		}
		for (local90 = 0; local90 < this.anInt4545 * 486353521; local90++) {
			this.anIntArray414[this.anIntArray415[local90]] = local6.method20275();
		}
		if (this.aBoolean715) {
			for (local90 = 0; local90 < this.anInt4545 * 486353521; local90++) {
				@Pc(291) byte[] local291 = new byte[64];
				local6.method20286(local291, 0, 64);
				this.aByteArrayArray14[this.anIntArray415[local90]] = local291;
			}
		}
		for (local90 = 0; local90 < this.anInt4545 * 486353521; local90++) {
			this.anIntArray418[this.anIntArray415[local90]] = local6.method20275();
		}
		@Pc(368) int local368;
		@Pc(372) int local372;
		@Pc(380) int local380;
		@Pc(398) int local398;
		@Pc(363) int local363;
		if (local10 >= 7) {
			for (local90 = 0; local90 < this.anInt4545 * 486353521; local90++) {
				this.anIntArray416[this.anIntArray415[local90]] = local6.method20291();
			}
			for (local90 = 0; local90 < this.anInt4545 * 486353521; local90++) {
				local363 = this.anIntArray415[local90];
				local368 = this.anIntArray416[local363];
				local76 = 0;
				local372 = -1;
				this.anIntArrayArray48[local363] = new int[local368];
				for (local380 = 0; local380 < local368; local380++) {
					local398 = this.anIntArrayArray48[local363][local380] = local76 += local6.method20291();
					if (local398 > local372) {
						local372 = local398;
					}
				}
				this.anIntArray417[local363] = local372 + 1;
				if (local368 == local372 + 1) {
					this.anIntArrayArray48[local363] = null;
				}
			}
		} else {
			for (local90 = 0; local90 < this.anInt4545 * 486353521; local90++) {
				this.anIntArray416[this.anIntArray415[local90]] = local6.method20271();
			}
			for (local90 = 0; local90 < this.anInt4545 * 486353521; local90++) {
				local363 = this.anIntArray415[local90];
				local368 = this.anIntArray416[local363];
				local76 = 0;
				local372 = -1;
				this.anIntArrayArray48[local363] = new int[local368];
				for (local380 = 0; local380 < local368; local380++) {
					local398 = this.anIntArrayArray48[local363][local380] = local76 += local6.method20271();
					if (local398 > local372) {
						local372 = local398;
					}
				}
				this.anIntArray417[local363] = local372 + 1;
				if (local368 == local372 + 1) {
					this.anIntArrayArray48[local363] = null;
				}
			}
		}
		if (!this.aBoolean716) {
			return;
		}
		this.anIntArrayArray49 = new int[local78 + 1][];
		this.aClass209Array1 = new Class209[local78 + 1];
		for (local90 = 0; local90 < this.anInt4545 * 486353521; local90++) {
			local363 = this.anIntArray415[local90];
			local368 = this.anIntArray416[local363];
			this.anIntArrayArray49[local363] = new int[this.anIntArray417[local363]];
			for (local372 = 0; local372 < this.anIntArray417[local363]; local372++) {
				this.anIntArrayArray49[local363][local372] = -1;
			}
			for (local372 = 0; local372 < local368; local372++) {
				if (this.anIntArrayArray48[local363] == null) {
					local380 = local372;
				} else {
					local380 = this.anIntArrayArray48[local363][local372];
				}
				this.anIntArrayArray49[local363][local380] = local6.method20275();
			}
			this.aClass209Array1[local363] = new Class209(this.anIntArrayArray49[local363]);
		}
	}

	@OriginalMember(owner = "client!md", name = "x", descriptor = "(Lclient!akj;I)V", line = 254)
	public static void method25840(@OriginalArg(0) Class26_Sub1_Sub1_Sub1_Sub1 arg0) {
		for (@Pc(4) Class3_Sub20 local4 = (Class3_Sub20) Class3_Sub20.aClass553_18.method32768(); local4 != null; local4 = (Class3_Sub20) Class3_Sub20.aClass553_18.method32709()) {
			if (arg0 == local4.aClass26_Sub1_Sub1_Sub1_Sub1_1) {
				if (local4.aClass366_3 != null) {
					local4.aClass366_3.method26819(100);
					Class510.aClass183_1.method23684(local4.aClass366_3);
					local4.aClass366_3 = null;
				}
				local4.method33656();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!md", name = "c", descriptor = "(Lclient!zz;IILclient!vs;I)V", line = 289)
	static void method25839(@OriginalArg(0) Class634 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class536 arg3) {
		@Pc(5) Class3_Sub1_Sub6 local5 = Class534.method32525(arg0, arg1, arg2);
		if (local5 == null) {
			Class3_Sub32.method11730();
			return;
		}
		arg3.anIntArray494 = new int[local5.anInt2657 * -1110480365];
		arg3.anObjectArray41 = new Object[local5.anInt2656 * 1386116957];
		if (Class634.aClass634_8 == local5.aClass634_1 || local5.aClass634_1 == Class634.aClass634_9 || Class634.aClass634_10 == local5.aClass634_1) {
			@Pc(38) int local38 = 0;
			@Pc(40) int local40 = 0;
			if (Class19_Sub1.aClass178_8 != null) {
				local38 = Class19_Sub1.aClass178_8.anInt3497 * -1988957173;
				local40 = Class19_Sub1.aClass178_8.anInt3510 * -1926174821;
			}
			arg3.anIntArray494[0] = Class3_Sub10.aClass61_1.method12740() - local38;
			arg3.anIntArray494[1] = Class3_Sub10.aClass61_1.method12741() - local40;
		} else if (local5.aClass634_1 == Class634.aClass634_15) {
			arg3.anIntArray494[0] = arg3.anInt5314 * 474624383;
		}
		Class60_Sub6.method12969(local5, 200000, arg3);
	}

	@OriginalMember(owner = "client!md", name = "afx", descriptor = "(Lclient!vs;I)V", line = 9904)
	static final void method25841(@OriginalArg(0) Class536 arg0) {
		Class3_Sub13.method11250(arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381]);
	}
}
