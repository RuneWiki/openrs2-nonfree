package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!akp")
public class Class26_Sub1_Sub1_Sub1_Sub2 extends Class26_Sub1_Sub1_Sub1 {

	@OriginalMember(owner = "client!akp", name = "cu", descriptor = "Ljava/lang/String;")
	public String aString75;

	@OriginalMember(owner = "client!akp", name = "cv", descriptor = "Ljava/lang/String;")
	String aString76;

	@OriginalMember(owner = "client!akp", name = "cj", descriptor = "Ljava/lang/String;")
	public String aString77;

	@OriginalMember(owner = "client!akp", name = "cl", descriptor = "Ljava/lang/String;")
	String aString78;

	@OriginalMember(owner = "client!akp", name = "ce", descriptor = "I")
	int anInt2402;

	@OriginalMember(owner = "client!akp", name = "cg", descriptor = "Lclient!tq;")
	public Class488 aClass488_1;

	@OriginalMember(owner = "client!akp", name = "cq", descriptor = "B")
	public byte aByte77 = 0;

	@OriginalMember(owner = "client!akp", name = "cp", descriptor = "[I")
	public int[] anIntArray243 = new int[8];

	@OriginalMember(owner = "client!akp", name = "cc", descriptor = "[I")
	public int[] anIntArray244 = new int[8];

	@OriginalMember(owner = "client!akp", name = "cs", descriptor = "I")
	public int anInt2391 = 0;

	@OriginalMember(owner = "client!akp", name = "ct", descriptor = "I")
	public int anInt2390 = 0;

	@OriginalMember(owner = "client!akp", name = "cx", descriptor = "I")
	public int anInt2393 = 1429010855;

	@OriginalMember(owner = "client!akp", name = "cy", descriptor = "I")
	public int anInt2394 = 0;

	@OriginalMember(owner = "client!akp", name = "cb", descriptor = "I")
	public int anInt2395 = 1905570099;

	@OriginalMember(owner = "client!akp", name = "cz", descriptor = "Z")
	public boolean aBoolean418 = false;

	@OriginalMember(owner = "client!akp", name = "cn", descriptor = "I")
	public int anInt2392 = 0;

	@OriginalMember(owner = "client!akp", name = "co", descriptor = "I")
	public int anInt2396 = -2030878631;

	@OriginalMember(owner = "client!akp", name = "cd", descriptor = "I")
	public int anInt2397 = -1793504747;

	@OriginalMember(owner = "client!akp", name = "ch", descriptor = "I")
	public int anInt2398 = -413726035;

	@OriginalMember(owner = "client!akp", name = "ci", descriptor = "I")
	public int anInt2399 = -1082798763;

	@OriginalMember(owner = "client!akp", name = "ca", descriptor = "I")
	public int anInt2400 = 0;

	@OriginalMember(owner = "client!akp", name = "cr", descriptor = "I")
	public int anInt2401 = -1483625181;

	@OriginalMember(owner = "client!akp", name = "cw", descriptor = "Z")
	public boolean aBoolean420 = false;

	@OriginalMember(owner = "client!akp", name = "cf", descriptor = "Z")
	public boolean aBoolean421 = false;

	@OriginalMember(owner = "client!akp", name = "dv", descriptor = "Z")
	public boolean aBoolean419 = false;

	@OriginalMember(owner = "client!akp", name = "<init>", descriptor = "(Lclient!rp;)V", line = 70)
	public Class26_Sub1_Sub1_Sub1_Sub2(@OriginalArg(0) Class438 arg0) {
		super(arg0, Class429.aClass70_Sub1_Sub1_2);
		this.method16760();
	}

	@OriginalMember(owner = "client!akp", name = "<init>", descriptor = "(Lclient!rp;I)V", line = 75)
	public Class26_Sub1_Sub1_Sub1_Sub2(@OriginalArg(0) Class438 arg0, @OriginalArg(1) int arg1) {
		super(arg0, arg1, Class429.aClass70_Sub1_Sub1_2);
		this.method16760();
	}

	@OriginalMember(owner = "client!akp", name = "hb", descriptor = "(Lclient!ahb;BI)V", line = 80)
	public void method16730(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) byte arg1) {
		this.aByte77 = arg1;
		@Pc(4) int local4 = -1;
		this.anInt2392 = 0;
		@Pc(12) int[] local12 = new int[Class589.aClass489_2.anIntArray475.length];
		@Pc(17) Class605[] local17 = new Class605[Class589.aClass489_2.anIntArray475.length];
		@Pc(22) Class594[] local22 = new Class594[Class589.aClass489_2.anIntArray475.length];
		@Pc(24) int local24;
		@Pc(39) int local39;
		@Pc(50) int local50;
		@Pc(56) int local56;
		for (local24 = 0; local24 < Class589.aClass489_2.anIntArray475.length; local24++) {
			if (Class589.aClass489_2.anIntArray475[local24] != 1) {
				local39 = arg0.method20269();
				if (local39 == 0) {
					local12[local24] = 0;
				} else {
					local50 = arg0.method20269();
					local56 = (local39 << 8) + local50;
					if (local24 == 0 && local56 == 65535) {
						local4 = arg0.method20375();
						this.anInt2392 = arg0.method20269() * -1609358985;
						break;
					}
					if (local56 >= 16384) {
						local56 -= 16384;
						local12[local24] = local56 | 0x40000000;
						local22[local24] = Class44_Sub3.aClass596_1.method33435(local56);
						@Pc(101) int local101 = local22[local24].anInt5510 * -1814950999;
						if (local101 != 0) {
							this.anInt2392 = local101 * -1609358985;
						}
					} else {
						local12[local24] = local56 - 256 | Integer.MIN_VALUE;
					}
				}
			}
		}
		if (local4 == -1) {
			local24 = arg0.method20271();
			local39 = 0;
			for (local50 = 0; local50 < Class589.aClass489_2.anIntArray475.length; local50++) {
				if (Class589.aClass489_2.anIntArray475[local50] == 0) {
					if ((local24 & 0x1 << local39) != 0) {
						local17[local50] = Class292.method25555(local22[local50], arg0);
					}
					local39++;
				}
			}
		}
		@Pc(164) int[] local164 = new int[10];
		for (local39 = 0; local39 < 10; local39++) {
			local50 = arg0.method20269();
			if (Class488.aShortArrayArrayArray5.length < 1 || local50 < 0 || local50 >= Class488.aShortArrayArrayArray5[local39][0].length) {
				local50 = 0;
			}
			local164[local39] = local50;
		}
		this.anInt2402 = arg0.method20271() * -1467107705;
		if (this.aClass488_1 == null) {
			this.aClass488_1 = new Class488();
		}
		local39 = this.aClass488_1.anInt5185 * -945292479;
		@Pc(220) int[] local220 = this.aClass488_1.anIntArray473;
		this.aClass488_1.method29194(this.method16650(), local12, local17, local164, this.aByte77 == 1, local4);
		if (local4 != local39) {
			@Pc(246) Class320 local246 = Class320.method25906(this.method21431().aClass320_61);
			local246.aFloat259 = (this.anIntArray241[0] << 9) + (this.method16630() << 8);
			local246.aFloat261 = (this.anIntArray239[0] << 9) + (this.method16630() << 8);
			this.method21436(local246);
			local246.method25874();
		}
		if (client.anInt3115 * 2077649275 == this.anInt2355 * 144783765 && local220 != null) {
			for (local56 = 0; local56 < local164.length; local56++) {
				if (local164[local56] != local220[local56]) {
					Class44_Sub3.aClass596_1.method33441();
					break;
				}
			}
		}
		if (this.aClass478_3 != null) {
			this.aClass478_3.method28855();
		}
		if (!this.aClass71_Sub1_3.method20021() || !this.aClass71_Sub1_3.aBoolean351) {
			return;
		}
		@Pc(331) Class445 local331 = this.method16690();
		if (!local331.method28320(this.aClass71_Sub1_3.method20103())) {
			this.aClass71_Sub1_3.method20038(-1);
			this.aClass71_Sub1_3.aBoolean351 = false;
		}
	}

	@OriginalMember(owner = "client!akp", name = "he", descriptor = "(Lclient!ahb;B)V", line = 80)
	public void method16748(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) byte arg1) {
		this.aByte77 = arg1;
		@Pc(4) int local4 = -1;
		this.anInt2392 = 0;
		@Pc(12) int[] local12 = new int[Class589.aClass489_2.anIntArray475.length];
		@Pc(17) Class605[] local17 = new Class605[Class589.aClass489_2.anIntArray475.length];
		@Pc(22) Class594[] local22 = new Class594[Class589.aClass489_2.anIntArray475.length];
		@Pc(24) int local24;
		@Pc(39) int local39;
		@Pc(50) int local50;
		@Pc(56) int local56;
		for (local24 = 0; local24 < Class589.aClass489_2.anIntArray475.length; local24++) {
			if (Class589.aClass489_2.anIntArray475[local24] != 1) {
				local39 = arg0.method20269();
				if (local39 == 0) {
					local12[local24] = 0;
				} else {
					local50 = arg0.method20269();
					local56 = (local39 << 8) + local50;
					if (local24 == 0 && local56 == 65535) {
						local4 = arg0.method20375();
						this.anInt2392 = arg0.method20269() * -1609358985;
						break;
					}
					if (local56 >= 16384) {
						local56 -= 16384;
						local12[local24] = local56 | 0x40000000;
						local22[local24] = Class44_Sub3.aClass596_1.method33435(local56);
						@Pc(101) int local101 = local22[local24].anInt5510 * -1814950999;
						if (local101 != 0) {
							this.anInt2392 = local101 * -1609358985;
						}
					} else {
						local12[local24] = local56 - 256 | Integer.MIN_VALUE;
					}
				}
			}
		}
		if (local4 == -1) {
			local24 = arg0.method20271();
			local39 = 0;
			for (local50 = 0; local50 < Class589.aClass489_2.anIntArray475.length; local50++) {
				if (Class589.aClass489_2.anIntArray475[local50] == 0) {
					if ((local24 & 0x1 << local39) != 0) {
						local17[local50] = Class292.method25555(local22[local50], arg0);
					}
					local39++;
				}
			}
		}
		@Pc(164) int[] local164 = new int[10];
		for (local39 = 0; local39 < 10; local39++) {
			local50 = arg0.method20269();
			if (Class488.aShortArrayArrayArray5.length < 1 || local50 < 0 || local50 >= Class488.aShortArrayArrayArray5[local39][0].length) {
				local50 = 0;
			}
			local164[local39] = local50;
		}
		this.anInt2402 = arg0.method20271() * -1467107705;
		if (this.aClass488_1 == null) {
			this.aClass488_1 = new Class488();
		}
		local39 = this.aClass488_1.anInt5185 * -945292479;
		@Pc(220) int[] local220 = this.aClass488_1.anIntArray473;
		this.aClass488_1.method29194(this.method16650(), local12, local17, local164, this.aByte77 == 1, local4);
		if (local4 != local39) {
			@Pc(246) Class320 local246 = Class320.method25906(this.method21431().aClass320_61);
			local246.aFloat259 = (this.anIntArray241[0] << 9) + (this.method16630() << 8);
			local246.aFloat261 = (this.anIntArray239[0] << 9) + (this.method16630() << 8);
			this.method21436(local246);
			local246.method25874();
		}
		if (client.anInt3115 * 2077649275 == this.anInt2355 * 144783765 && local220 != null) {
			for (local56 = 0; local56 < local164.length; local56++) {
				if (local164[local56] != local220[local56]) {
					Class44_Sub3.aClass596_1.method33441();
					break;
				}
			}
		}
		if (this.aClass478_3 != null) {
			this.aClass478_3.method28855();
		}
		if (!this.aClass71_Sub1_3.method20021() || !this.aClass71_Sub1_3.aBoolean351) {
			return;
		}
		@Pc(331) Class445 local331 = this.method16690();
		if (!local331.method28320(this.aClass71_Sub1_3.method20103())) {
			this.aClass71_Sub1_3.method20038(-1);
			this.aClass71_Sub1_3.aBoolean351 = false;
		}
	}

	@OriginalMember(owner = "client!akp", name = "x", descriptor = "(Ljava/lang/CharSequence;II)I", line = 80)
	public static int method16770(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) int arg1) {
		return Class165.method23339(arg0, arg1, true);
	}

	@OriginalMember(owner = "client!akp", name = "hj", descriptor = "(Lclient!ahb;)V", line = 159)
	public final void method16743(@OriginalArg(0) Class3_Sub41 arg0) {
		arg0.anInt2803 = 0;
		@Pc(6) int local6 = arg0.method20269();
		@Pc(11) byte local11 = (byte) (local6 & 0x1);
		@Pc(20) boolean local20 = (local6 & 0x4) != 0;
		@Pc(24) int local24 = super.method16630();
		this.method16644((local6 >> 3 & 0x7) + 1);
		@Pc(43) boolean local43 = (local6 & 0x40) != 0;
		@Pc(51) boolean local51 = (local6 & 0x80) != 0;
		@Pc(56) Class320 local56 = Class320.method25906(this.method21431().aClass320_61);
		local56.aFloat259 += this.method16630() - local24 << 8;
		local56.aFloat261 += this.method16630() - local24 << 8;
		this.method21436(local56);
		local56.method25874();
		if (local43) {
			this.aString76 = arg0.method20284();
		} else {
			this.aString76 = null;
		}
		if (local51) {
			this.aString78 = arg0.method20284();
		} else {
			this.aString78 = null;
		}
		this.aBoolean421 = arg0.method20390() == 1;
		if (Class1.aClass527_1 == Class527.aClass527_10 && client.anInt3116 * -1336253523 >= 2) {
			this.aBoolean421 = false;
		}
		this.method16730(arg0, local11);
		this.aString77 = arg0.method20283();
		this.aString75 = this.aString77;
		if (Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3 == this) {
			RuntimeException_Sub3.aString121 = this.aString77;
		}
		this.anInt2391 = arg0.method20269() * -1110685119;
		if (local20) {
			this.anInt2394 = arg0.method20271() * 1778027623;
			if (this.anInt2394 * 892718935 == 65535) {
				this.anInt2394 = -1778027623;
			}
			this.anInt2390 = this.anInt2391 * 742317457;
			this.anInt2393 = 1429010855;
		} else {
			this.anInt2394 = 0;
			this.anInt2390 = arg0.method20269() * 76426193;
			this.anInt2393 = arg0.method20269() * -1429010855;
			if (this.anInt2393 * 584311273 == 255) {
				this.anInt2393 = 1429010855;
			}
		}
		@Pc(216) int local216 = this.anInt2400 * -1667184633;
		this.anInt2400 = arg0.method20269() * -1197988425;
		if (this.anInt2400 * -1667184633 == 0) {
			Class631.method33858(this);
			return;
		}
		@Pc(234) int local234 = this.anInt2396 * 1181218839;
		@Pc(239) int local239 = this.anInt2397 * -836187453;
		@Pc(244) int local244 = this.anInt2398 * 2130384603;
		@Pc(249) int local249 = this.anInt2399 * -1444661245;
		@Pc(254) int local254 = this.anInt2401 * -2091736971;
		this.anInt2396 = arg0.method20271() * 2030878631;
		this.anInt2397 = arg0.method20271() * 1793504747;
		this.anInt2398 = arg0.method20271() * 413726035;
		this.anInt2399 = arg0.method20271() * 1082798763;
		this.anInt2401 = arg0.method20269() * -157405219;
		if (local216 != this.anInt2400 * -1667184633 || local234 != this.anInt2396 * 1181218839 || this.anInt2397 * -836187453 != local239 || this.anInt2398 * 2130384603 != local244 || local249 != this.anInt2399 * -1444661245 || this.anInt2401 * -2091736971 != local254) {
			Class192.method24066(this);
		}
	}

	@OriginalMember(owner = "client!akp", name = "hz", descriptor = "(Lclient!ahb;B)V", line = 159)
	public final void method16763(@OriginalArg(0) Class3_Sub41 arg0) {
		arg0.anInt2803 = 0;
		@Pc(6) int local6 = arg0.method20269();
		@Pc(11) byte local11 = (byte) (local6 & 0x1);
		@Pc(20) boolean local20 = (local6 & 0x4) != 0;
		@Pc(24) int local24 = super.method16630();
		this.method16644((local6 >> 3 & 0x7) + 1);
		@Pc(43) boolean local43 = (local6 & 0x40) != 0;
		@Pc(51) boolean local51 = (local6 & 0x80) != 0;
		@Pc(56) Class320 local56 = Class320.method25906(this.method21431().aClass320_61);
		local56.aFloat259 += this.method16630() - local24 << 8;
		local56.aFloat261 += this.method16630() - local24 << 8;
		this.method21436(local56);
		local56.method25874();
		if (local43) {
			this.aString76 = arg0.method20284();
		} else {
			this.aString76 = null;
		}
		if (local51) {
			this.aString78 = arg0.method20284();
		} else {
			this.aString78 = null;
		}
		this.aBoolean421 = arg0.method20390() == 1;
		if (Class1.aClass527_1 == Class527.aClass527_10 && client.anInt3116 * -1336253523 >= 2) {
			this.aBoolean421 = false;
		}
		this.method16730(arg0, local11);
		this.aString77 = arg0.method20283();
		this.aString75 = this.aString77;
		if (Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3 == this) {
			RuntimeException_Sub3.aString121 = this.aString77;
		}
		this.anInt2391 = arg0.method20269() * -1110685119;
		if (local20) {
			this.anInt2394 = arg0.method20271() * 1778027623;
			if (this.anInt2394 * 892718935 == 65535) {
				this.anInt2394 = -1778027623;
			}
			this.anInt2390 = this.anInt2391 * 742317457;
			this.anInt2393 = 1429010855;
		} else {
			this.anInt2394 = 0;
			this.anInt2390 = arg0.method20269() * 76426193;
			this.anInt2393 = arg0.method20269() * -1429010855;
			if (this.anInt2393 * 584311273 == 255) {
				this.anInt2393 = 1429010855;
			}
		}
		@Pc(216) int local216 = this.anInt2400 * -1667184633;
		this.anInt2400 = arg0.method20269() * -1197988425;
		if (this.anInt2400 * -1667184633 == 0) {
			Class631.method33858(this);
			return;
		}
		@Pc(234) int local234 = this.anInt2396 * 1181218839;
		@Pc(239) int local239 = this.anInt2397 * -836187453;
		@Pc(244) int local244 = this.anInt2398 * 2130384603;
		@Pc(249) int local249 = this.anInt2399 * -1444661245;
		@Pc(254) int local254 = this.anInt2401 * -2091736971;
		this.anInt2396 = arg0.method20271() * 2030878631;
		this.anInt2397 = arg0.method20271() * 1793504747;
		this.anInt2398 = arg0.method20271() * 413726035;
		this.anInt2399 = arg0.method20271() * 1082798763;
		this.anInt2401 = arg0.method20269() * -157405219;
		if (local216 != this.anInt2400 * -1667184633 || local234 != this.anInt2396 * 1181218839 || this.anInt2397 * -836187453 != local239 || this.anInt2398 * 2130384603 != local244 || local249 != this.anInt2399 * -1444661245 || this.anInt2401 * -2091736971 != local254) {
			Class192.method24066(this);
		}
	}

	@OriginalMember(owner = "client!akp", name = "hx", descriptor = "(Lclient!ahb;I)V", line = 216)
	public void method16731(@OriginalArg(0) Class3_Sub41 arg0) {
		arg0.anInt2803 = 0;
		@Pc(6) int local6 = arg0.method20269();
		for (@Pc(8) int local8 = 0; local8 < this.anIntArray243.length; local8++) {
			if ((local6 & 0x1 << local8) == 0) {
				this.anIntArray243[local8] = -1;
				this.anIntArray244[local8] = -1;
			} else {
				@Pc(23) int local23 = arg0.method20269();
				@Pc(27) int local27 = arg0.method20271();
				this.anIntArray243[local8] = local23;
				this.anIntArray244[local8] = local27;
			}
		}
	}

	@OriginalMember(owner = "client!akp", name = "hu", descriptor = "(Lclient!ahb;)V", line = 216)
	public void method16742(@OriginalArg(0) Class3_Sub41 arg0) {
		arg0.anInt2803 = 0;
		@Pc(6) int local6 = arg0.method20269();
		for (@Pc(8) int local8 = 0; local8 < this.anIntArray243.length; local8++) {
			if ((local6 & 0x1 << local8) == 0) {
				this.anIntArray243[local8] = -1;
				this.anIntArray244[local8] = -1;
			} else {
				@Pc(23) int local23 = arg0.method20269();
				@Pc(27) int local27 = arg0.method20271();
				this.anIntArray243[local8] = local23;
				this.anIntArray244[local8] = local27;
			}
		}
	}

	@OriginalMember(owner = "client!akp", name = "hl", descriptor = "(Lclient!ahb;)V", line = 216)
	public void method16751(@OriginalArg(0) Class3_Sub41 arg0) {
		arg0.anInt2803 = 0;
		@Pc(6) int local6 = arg0.method20269();
		for (@Pc(8) int local8 = 0; local8 < this.anIntArray243.length; local8++) {
			if ((local6 & 0x1 << local8) == 0) {
				this.anIntArray243[local8] = -1;
				this.anIntArray244[local8] = -1;
			} else {
				@Pc(23) int local23 = arg0.method20269();
				@Pc(27) int local27 = arg0.method20271();
				this.anIntArray243[local8] = local23;
				this.anIntArray244[local8] = local27;
			}
		}
	}

	@OriginalMember(owner = "client!akp", name = "hs", descriptor = "(B)V", line = 233)
	void method16760() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anIntArray243.length; local1++) {
			this.anIntArray243[local1] = -1;
		}
		for (local1 = 0; local1 < this.anIntArray244.length; local1++) {
			this.anIntArray244[local1] = -1;
		}
	}

	@OriginalMember(owner = "client!akp", name = "fn", descriptor = "(Lclient!de;I)Lclient!rc;", line = 238)
	@Override
	public Class426 method21474(@OriginalArg(0) Class21 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!akp", name = "fd", descriptor = "(Lclient!de;)Lclient!rc;", line = 238)
	@Override
	public Class426 method21471(@OriginalArg(0) Class21 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!akp", name = "fz", descriptor = "(Lclient!de;)Lclient!rc;", line = 238)
	@Override
	public Class426 method21489(@OriginalArg(0) Class21 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!akp", name = "fs", descriptor = "(Lclient!de;B)Lclient!ry;", line = 242)
	@Override
	Class446 method21470(@OriginalArg(0) Class21 arg0) {
		if (this.aClass488_1 == null || !this.method16734(arg0, 2048)) {
			return null;
		}
		@Pc(13) Class332 local13 = arg0.method17098();
		@Pc(16) Class332 local16 = this.method21433();
		@Pc(19) Class322 local19 = this.method21431();
		@Pc(24) int local24 = this.aClass106_7.method21910();
		@Pc(45) Class432 local45 = this.aClass438_23.aClass432ArrayArrayArray3[this.aByte101][(int) local19.aClass320_61.aFloat259 >> 9][(int) local19.aClass320_61.aFloat261 >> 9];
		if (local45 == null || local45.aClass26_Sub1_Sub2_1 == null) {
			this.anInt2361 = (int) ((float) (this.anInt2361 * 246492159) - (float) (this.anInt2361 * 246492159) / 10.0F) * 1371460607;
		} else {
			@Pc(61) int local61 = this.anInt2361 * 246492159 - local45.aClass26_Sub1_Sub2_1.aShort60;
			this.anInt2361 = (int) ((float) (this.anInt2361 * 246492159) - (float) local61 / 10.0F) * 1371460607;
		}
		local13.method26235(local16);
		local13.method26203(0.0F, (float) (-20 - this.anInt2361 * 246492159), 0.0F);
		@Pc(111) Class446 local111 = null;
		this.aBoolean417 = false;
		if (Class510.aClass3_Sub45_37.aClass60_Sub3_1.method12813() == 1) {
			@Pc(124) Class445 local124 = this.method16690();
			if (local124.aBoolean772 && (this.aClass488_1.anInt5185 * -945292479 == -1 || Class498.aClass579_1.method33185(this.aClass488_1.anInt5185 * -945292479).aBoolean834)) {
				@Pc(159) Class71 local159 = this.aClass71_3.method20021() && this.aClass71_3.method20032() ? this.aClass71_3 : null;
				@Pc(175) Class71_Sub1 local175 = this.aClass71_Sub1_3.method20021() && (!this.aClass71_Sub1_3.aBoolean351 || local159 == null) ? this.aClass71_Sub1_3 : null;
				@Pc(178) short local178 = Class630.aClass493_1.aShort177;
				@Pc(181) byte local181 = Class630.aClass493_1.aByte168;
				if (this.aClass488_1.anInt5185 * -945292479 != -1) {
					local178 = Class498.aClass579_1.method33185(this.aClass488_1.anInt5185 * -945292479).aShort178;
					local181 = Class498.aClass579_1.method33185(this.aClass488_1.anInt5185 * -945292479).aByte178;
				}
				@Pc(248) Class20 local248;
				if (local178 > -1 && Class510.aClass3_Sub45_37.aClass60_Sub6_1.method12966() == 1) {
					local248 = Class108.method21935(arg0, local24, this.anInt2363 * -1473816677, this.anInt2371 * -1889629045, this.anInt2383 * 1437316903, this.aClass20Array3[0], local178, local181, local175 == null ? local159 : local175);
				} else {
					local248 = Class135.method22919(arg0, local24, this.anInt2363 * -1473816677, this.anInt2371 * -1889629045, this.anInt2383 * 1437316903, 1, this.aClass20Array3[0], 0, 0, 160, 240, local175 == null ? local159 : local175);
				}
				if (local248 != null) {
					if (this.aClass136Array21 == null || this.aClass136Array21.length < this.aClass20Array3.length + 1) {
						this.method21480(this.aClass20Array3.length + 1);
					}
					local111 = Class508.method29569(true);
					this.aBoolean417 = true;
					arg0.method17108(false);
					local248.method5352(local13, this.aClass136Array21[this.aClass20Array3.length], 0);
					arg0.method17108(true);
				}
			}
		}
		@Pc(335) int local335;
		if (Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3 == this) {
			for (local335 = client.aClass68Array1.length - 1; local335 >= 0; local335--) {
				@Pc(341) Class68 local341 = client.aClass68Array1[local335];
				if (local341 != null && local341.anInt2016 * -564396041 != -1) {
					@Pc(382) int local382;
					if (local341.anInt2017 * 207391421 == 1) {
						@Pc(364) Class3_Sub29 local364 = (Class3_Sub29) client.aClass581_21.method33217((long) (local341.anInt2012 * 403468169));
						if (local364 != null) {
							@Pc(370) Class26_Sub1_Sub1_Sub1_Sub1 local370 = (Class26_Sub1_Sub1_Sub1_Sub1) local364.anObject2;
							@Pc(378) Class320 local378 = Class320.method25928(local370.method21431().aClass320_61, Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.method21431().aClass320_61);
							local382 = (int) local378.aFloat259;
							@Pc(386) int local386 = (int) local378.aFloat261;
							this.method16733(arg0, local13, this.aClass20Array3[0], (long) local382, (long) local386, local341.anInt2016 * -564396041, 92160000L);
						}
					}
					if (local341.anInt2017 * 207391421 == 2) {
						@Pc(413) Class320 local413 = Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.method21431().aClass320_61;
						@Pc(423) long local423 = (long) (local341.anInt2009 * -2046314719 - (int) local413.aFloat259);
						@Pc(433) long local433 = (long) (local341.anInt2011 * -1644403279 - (int) local413.aFloat261);
						@Pc(441) long local441 = (long) (local341.anInt2014 * 138848077 << 9);
						@Pc(445) long local445 = local441 * local441;
						this.method16733(arg0, local13, this.aClass20Array3[0], local423, local433, local341.anInt2016 * -564396041, local445);
					}
					if (local341.anInt2017 * 207391421 == 10 && local341.anInt2012 * 403468169 >= 0 && local341.anInt2012 * 403468169 < client.aClass26_Sub1_Sub1_Sub1_Sub2Array1.length) {
						@Pc(485) Class26_Sub1_Sub1_Sub1_Sub2 local485 = client.aClass26_Sub1_Sub1_Sub1_Sub2Array1[local341.anInt2012 * 403468169];
						if (local485 != null) {
							@Pc(496) Class320 local496 = Class320.method25928(local485.method21431().aClass320_61, Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.method21431().aClass320_61);
							@Pc(500) int local500 = (int) local496.aFloat259;
							local382 = (int) local496.aFloat261;
							this.method16733(arg0, local13, this.aClass20Array3[0], (long) local500, (long) local382, local341.anInt2016 * -564396041, 92160000L);
						}
					}
				}
			}
		}
		local13.method26235(local16);
		local13.method26203(0.0F, (float) (-5 - this.anInt2361 * 246492159), 0.0F);
		if (this.aClass136Array21 == null || this.aClass136Array21.length < this.aClass20Array3.length) {
			this.method21480(this.aClass20Array3.length);
		}
		if (local111 == null) {
			local111 = Class508.method29569(true);
		}
		this.method16638(arg0, this.aClass20Array3, local13, false);
		for (local335 = 0; local335 < this.aClass20Array3.length; local335++) {
			if (this.aClass20Array3[local335] == null) {
				this.aClass136Array21[local335].aBoolean621 = false;
			} else {
				this.aClass20Array3[local335].method5352(local13, this.aClass136Array21[local335], Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3 == this ? 1 : 0);
			}
		}
		if (this.aClass478_3 != null) {
			@Pc(614) Class128 local614 = this.aClass478_3.method28843();
			arg0.method17105(local614);
		}
		for (local335 = 0; local335 < this.aClass20Array3.length; local335++) {
			if (this.aClass20Array3[local335] != null) {
				this.aBoolean417 |= this.aClass20Array3[local335].method5375();
			}
			this.aClass20Array3[local335] = null;
		}
		this.anInt2356 = client.anInt3100 * 1519967779;
		return local111;
	}

	@OriginalMember(owner = "client!akp", name = "ff", descriptor = "(Lclient!de;)Lclient!ry;", line = 242)
	@Override
	Class446 method21494(@OriginalArg(0) Class21 arg0) {
		if (this.aClass488_1 == null || !this.method16734(arg0, 2048)) {
			return null;
		}
		@Pc(13) Class332 local13 = arg0.method17098();
		@Pc(16) Class332 local16 = this.method21433();
		@Pc(19) Class322 local19 = this.method21431();
		@Pc(24) int local24 = this.aClass106_7.method21910();
		@Pc(45) Class432 local45 = this.aClass438_23.aClass432ArrayArrayArray3[this.aByte101][(int) local19.aClass320_61.aFloat259 >> 9][(int) local19.aClass320_61.aFloat261 >> 9];
		if (local45 == null || local45.aClass26_Sub1_Sub2_1 == null) {
			this.anInt2361 = (int) ((float) (this.anInt2361 * 246492159) - (float) (this.anInt2361 * 246492159) / 10.0F) * 1371460607;
		} else {
			@Pc(61) int local61 = this.anInt2361 * 246492159 - local45.aClass26_Sub1_Sub2_1.aShort60;
			this.anInt2361 = (int) ((float) (this.anInt2361 * 246492159) - (float) local61 / 10.0F) * 1371460607;
		}
		local13.method26235(local16);
		local13.method26203(0.0F, (float) (-20 - this.anInt2361 * 246492159), 0.0F);
		@Pc(111) Class446 local111 = null;
		this.aBoolean417 = false;
		if (Class510.aClass3_Sub45_37.aClass60_Sub3_1.method12813() == 1) {
			@Pc(124) Class445 local124 = this.method16690();
			if (local124.aBoolean772 && (this.aClass488_1.anInt5185 * -945292479 == -1 || Class498.aClass579_1.method33185(this.aClass488_1.anInt5185 * -945292479).aBoolean834)) {
				@Pc(159) Class71 local159 = this.aClass71_3.method20021() && this.aClass71_3.method20032() ? this.aClass71_3 : null;
				@Pc(175) Class71_Sub1 local175 = this.aClass71_Sub1_3.method20021() && (!this.aClass71_Sub1_3.aBoolean351 || local159 == null) ? this.aClass71_Sub1_3 : null;
				@Pc(178) short local178 = Class630.aClass493_1.aShort177;
				@Pc(181) byte local181 = Class630.aClass493_1.aByte168;
				if (this.aClass488_1.anInt5185 * -945292479 != -1) {
					local178 = Class498.aClass579_1.method33185(this.aClass488_1.anInt5185 * -945292479).aShort178;
					local181 = Class498.aClass579_1.method33185(this.aClass488_1.anInt5185 * -945292479).aByte178;
				}
				@Pc(248) Class20 local248;
				if (local178 > -1 && Class510.aClass3_Sub45_37.aClass60_Sub6_1.method12966() == 1) {
					local248 = Class108.method21935(arg0, local24, this.anInt2363 * -1473816677, this.anInt2371 * -1889629045, this.anInt2383 * 1437316903, this.aClass20Array3[0], local178, local181, local175 == null ? local159 : local175);
				} else {
					local248 = Class135.method22919(arg0, local24, this.anInt2363 * -1473816677, this.anInt2371 * -1889629045, this.anInt2383 * 1437316903, 1, this.aClass20Array3[0], 0, 0, 160, 240, local175 == null ? local159 : local175);
				}
				if (local248 != null) {
					if (this.aClass136Array21 == null || this.aClass136Array21.length < this.aClass20Array3.length + 1) {
						this.method21480(this.aClass20Array3.length + 1);
					}
					local111 = Class508.method29569(true);
					this.aBoolean417 = true;
					arg0.method17108(false);
					local248.method5352(local13, this.aClass136Array21[this.aClass20Array3.length], 0);
					arg0.method17108(true);
				}
			}
		}
		@Pc(335) int local335;
		if (Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3 == this) {
			for (local335 = client.aClass68Array1.length - 1; local335 >= 0; local335--) {
				@Pc(341) Class68 local341 = client.aClass68Array1[local335];
				if (local341 != null && local341.anInt2016 * -564396041 != -1) {
					@Pc(382) int local382;
					if (local341.anInt2017 * 207391421 == 1) {
						@Pc(364) Class3_Sub29 local364 = (Class3_Sub29) client.aClass581_21.method33217((long) (local341.anInt2012 * 403468169));
						if (local364 != null) {
							@Pc(370) Class26_Sub1_Sub1_Sub1_Sub1 local370 = (Class26_Sub1_Sub1_Sub1_Sub1) local364.anObject2;
							@Pc(378) Class320 local378 = Class320.method25928(local370.method21431().aClass320_61, Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.method21431().aClass320_61);
							local382 = (int) local378.aFloat259;
							@Pc(386) int local386 = (int) local378.aFloat261;
							this.method16733(arg0, local13, this.aClass20Array3[0], (long) local382, (long) local386, local341.anInt2016 * -564396041, 92160000L);
						}
					}
					if (local341.anInt2017 * 207391421 == 2) {
						@Pc(413) Class320 local413 = Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.method21431().aClass320_61;
						@Pc(423) long local423 = (long) (local341.anInt2009 * -2046314719 - (int) local413.aFloat259);
						@Pc(433) long local433 = (long) (local341.anInt2011 * -1644403279 - (int) local413.aFloat261);
						@Pc(441) long local441 = (long) (local341.anInt2014 * 138848077 << 9);
						@Pc(445) long local445 = local441 * local441;
						this.method16733(arg0, local13, this.aClass20Array3[0], local423, local433, local341.anInt2016 * -564396041, local445);
					}
					if (local341.anInt2017 * 207391421 == 10 && local341.anInt2012 * 403468169 >= 0 && local341.anInt2012 * 403468169 < client.aClass26_Sub1_Sub1_Sub1_Sub2Array1.length) {
						@Pc(485) Class26_Sub1_Sub1_Sub1_Sub2 local485 = client.aClass26_Sub1_Sub1_Sub1_Sub2Array1[local341.anInt2012 * 403468169];
						if (local485 != null) {
							@Pc(496) Class320 local496 = Class320.method25928(local485.method21431().aClass320_61, Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.method21431().aClass320_61);
							@Pc(500) int local500 = (int) local496.aFloat259;
							local382 = (int) local496.aFloat261;
							this.method16733(arg0, local13, this.aClass20Array3[0], (long) local500, (long) local382, local341.anInt2016 * -564396041, 92160000L);
						}
					}
				}
			}
		}
		local13.method26235(local16);
		local13.method26203(0.0F, (float) (-5 - this.anInt2361 * 246492159), 0.0F);
		if (this.aClass136Array21 == null || this.aClass136Array21.length < this.aClass20Array3.length) {
			this.method21480(this.aClass20Array3.length);
		}
		if (local111 == null) {
			local111 = Class508.method29569(true);
		}
		this.method16638(arg0, this.aClass20Array3, local13, false);
		for (local335 = 0; local335 < this.aClass20Array3.length; local335++) {
			if (this.aClass20Array3[local335] == null) {
				this.aClass136Array21[local335].aBoolean621 = false;
			} else {
				this.aClass20Array3[local335].method5352(local13, this.aClass136Array21[local335], Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3 == this ? 1 : 0);
			}
		}
		if (this.aClass478_3 != null) {
			@Pc(614) Class128 local614 = this.aClass478_3.method28843();
			arg0.method17105(local614);
		}
		for (local335 = 0; local335 < this.aClass20Array3.length; local335++) {
			if (this.aClass20Array3[local335] != null) {
				this.aBoolean417 |= this.aClass20Array3[local335].method5375();
			}
			this.aClass20Array3[local335] = null;
		}
		this.anInt2356 = client.anInt3100 * 1519967779;
		return local111;
	}

	@OriginalMember(owner = "client!akp", name = "fk", descriptor = "(Lclient!de;)Lclient!ry;", line = 242)
	@Override
	Class446 method21499(@OriginalArg(0) Class21 arg0) {
		if (this.aClass488_1 == null || !this.method16734(arg0, 2048)) {
			return null;
		}
		@Pc(13) Class332 local13 = arg0.method17098();
		@Pc(16) Class332 local16 = this.method21433();
		@Pc(19) Class322 local19 = this.method21431();
		@Pc(24) int local24 = this.aClass106_7.method21910();
		@Pc(45) Class432 local45 = this.aClass438_23.aClass432ArrayArrayArray3[this.aByte101][(int) local19.aClass320_61.aFloat259 >> 9][(int) local19.aClass320_61.aFloat261 >> 9];
		if (local45 == null || local45.aClass26_Sub1_Sub2_1 == null) {
			this.anInt2361 = (int) ((float) (this.anInt2361 * 246492159) - (float) (this.anInt2361 * 246492159) / 10.0F) * 1371460607;
		} else {
			@Pc(61) int local61 = this.anInt2361 * 246492159 - local45.aClass26_Sub1_Sub2_1.aShort60;
			this.anInt2361 = (int) ((float) (this.anInt2361 * 246492159) - (float) local61 / 10.0F) * 1371460607;
		}
		local13.method26235(local16);
		local13.method26203(0.0F, (float) (-20 - this.anInt2361 * 246492159), 0.0F);
		@Pc(111) Class446 local111 = null;
		this.aBoolean417 = false;
		if (Class510.aClass3_Sub45_37.aClass60_Sub3_1.method12813() == 1) {
			@Pc(124) Class445 local124 = this.method16690();
			if (local124.aBoolean772 && (this.aClass488_1.anInt5185 * -945292479 == -1 || Class498.aClass579_1.method33185(this.aClass488_1.anInt5185 * -945292479).aBoolean834)) {
				@Pc(159) Class71 local159 = this.aClass71_3.method20021() && this.aClass71_3.method20032() ? this.aClass71_3 : null;
				@Pc(175) Class71_Sub1 local175 = this.aClass71_Sub1_3.method20021() && (!this.aClass71_Sub1_3.aBoolean351 || local159 == null) ? this.aClass71_Sub1_3 : null;
				@Pc(178) short local178 = Class630.aClass493_1.aShort177;
				@Pc(181) byte local181 = Class630.aClass493_1.aByte168;
				if (this.aClass488_1.anInt5185 * -945292479 != -1) {
					local178 = Class498.aClass579_1.method33185(this.aClass488_1.anInt5185 * -945292479).aShort178;
					local181 = Class498.aClass579_1.method33185(this.aClass488_1.anInt5185 * -945292479).aByte178;
				}
				@Pc(248) Class20 local248;
				if (local178 > -1 && Class510.aClass3_Sub45_37.aClass60_Sub6_1.method12966() == 1) {
					local248 = Class108.method21935(arg0, local24, this.anInt2363 * -1473816677, this.anInt2371 * -1889629045, this.anInt2383 * 1437316903, this.aClass20Array3[0], local178, local181, local175 == null ? local159 : local175);
				} else {
					local248 = Class135.method22919(arg0, local24, this.anInt2363 * -1473816677, this.anInt2371 * -1889629045, this.anInt2383 * 1437316903, 1, this.aClass20Array3[0], 0, 0, 160, 240, local175 == null ? local159 : local175);
				}
				if (local248 != null) {
					if (this.aClass136Array21 == null || this.aClass136Array21.length < this.aClass20Array3.length + 1) {
						this.method21480(this.aClass20Array3.length + 1);
					}
					local111 = Class508.method29569(true);
					this.aBoolean417 = true;
					arg0.method17108(false);
					local248.method5352(local13, this.aClass136Array21[this.aClass20Array3.length], 0);
					arg0.method17108(true);
				}
			}
		}
		@Pc(335) int local335;
		if (Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3 == this) {
			for (local335 = client.aClass68Array1.length - 1; local335 >= 0; local335--) {
				@Pc(341) Class68 local341 = client.aClass68Array1[local335];
				if (local341 != null && local341.anInt2016 * -564396041 != -1) {
					@Pc(382) int local382;
					if (local341.anInt2017 * 207391421 == 1) {
						@Pc(364) Class3_Sub29 local364 = (Class3_Sub29) client.aClass581_21.method33217((long) (local341.anInt2012 * 403468169));
						if (local364 != null) {
							@Pc(370) Class26_Sub1_Sub1_Sub1_Sub1 local370 = (Class26_Sub1_Sub1_Sub1_Sub1) local364.anObject2;
							@Pc(378) Class320 local378 = Class320.method25928(local370.method21431().aClass320_61, Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.method21431().aClass320_61);
							local382 = (int) local378.aFloat259;
							@Pc(386) int local386 = (int) local378.aFloat261;
							this.method16733(arg0, local13, this.aClass20Array3[0], (long) local382, (long) local386, local341.anInt2016 * -564396041, 92160000L);
						}
					}
					if (local341.anInt2017 * 207391421 == 2) {
						@Pc(413) Class320 local413 = Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.method21431().aClass320_61;
						@Pc(423) long local423 = (long) (local341.anInt2009 * -2046314719 - (int) local413.aFloat259);
						@Pc(433) long local433 = (long) (local341.anInt2011 * -1644403279 - (int) local413.aFloat261);
						@Pc(441) long local441 = (long) (local341.anInt2014 * 138848077 << 9);
						@Pc(445) long local445 = local441 * local441;
						this.method16733(arg0, local13, this.aClass20Array3[0], local423, local433, local341.anInt2016 * -564396041, local445);
					}
					if (local341.anInt2017 * 207391421 == 10 && local341.anInt2012 * 403468169 >= 0 && local341.anInt2012 * 403468169 < client.aClass26_Sub1_Sub1_Sub1_Sub2Array1.length) {
						@Pc(485) Class26_Sub1_Sub1_Sub1_Sub2 local485 = client.aClass26_Sub1_Sub1_Sub1_Sub2Array1[local341.anInt2012 * 403468169];
						if (local485 != null) {
							@Pc(496) Class320 local496 = Class320.method25928(local485.method21431().aClass320_61, Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.method21431().aClass320_61);
							@Pc(500) int local500 = (int) local496.aFloat259;
							local382 = (int) local496.aFloat261;
							this.method16733(arg0, local13, this.aClass20Array3[0], (long) local500, (long) local382, local341.anInt2016 * -564396041, 92160000L);
						}
					}
				}
			}
		}
		local13.method26235(local16);
		local13.method26203(0.0F, (float) (-5 - this.anInt2361 * 246492159), 0.0F);
		if (this.aClass136Array21 == null || this.aClass136Array21.length < this.aClass20Array3.length) {
			this.method21480(this.aClass20Array3.length);
		}
		if (local111 == null) {
			local111 = Class508.method29569(true);
		}
		this.method16638(arg0, this.aClass20Array3, local13, false);
		for (local335 = 0; local335 < this.aClass20Array3.length; local335++) {
			if (this.aClass20Array3[local335] == null) {
				this.aClass136Array21[local335].aBoolean621 = false;
			} else {
				this.aClass20Array3[local335].method5352(local13, this.aClass136Array21[local335], Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3 == this ? 1 : 0);
			}
		}
		if (this.aClass478_3 != null) {
			@Pc(614) Class128 local614 = this.aClass478_3.method28843();
			arg0.method17105(local614);
		}
		for (local335 = 0; local335 < this.aClass20Array3.length; local335++) {
			if (this.aClass20Array3[local335] != null) {
				this.aBoolean417 |= this.aClass20Array3[local335].method5375();
			}
			this.aClass20Array3[local335] = null;
		}
		this.anInt2356 = client.anInt3100 * 1519967779;
		return local111;
	}

	@OriginalMember(owner = "client!akp", name = "fa", descriptor = "(Lclient!de;)Lclient!ry;", line = 242)
	@Override
	Class446 method21488(@OriginalArg(0) Class21 arg0) {
		if (this.aClass488_1 == null || !this.method16734(arg0, 2048)) {
			return null;
		}
		@Pc(13) Class332 local13 = arg0.method17098();
		@Pc(16) Class332 local16 = this.method21433();
		@Pc(19) Class322 local19 = this.method21431();
		@Pc(24) int local24 = this.aClass106_7.method21910();
		@Pc(45) Class432 local45 = this.aClass438_23.aClass432ArrayArrayArray3[this.aByte101][(int) local19.aClass320_61.aFloat259 >> 9][(int) local19.aClass320_61.aFloat261 >> 9];
		if (local45 == null || local45.aClass26_Sub1_Sub2_1 == null) {
			this.anInt2361 = (int) ((float) (this.anInt2361 * 246492159) - (float) (this.anInt2361 * 246492159) / 10.0F) * 1371460607;
		} else {
			@Pc(61) int local61 = this.anInt2361 * 246492159 - local45.aClass26_Sub1_Sub2_1.aShort60;
			this.anInt2361 = (int) ((float) (this.anInt2361 * 246492159) - (float) local61 / 10.0F) * 1371460607;
		}
		local13.method26235(local16);
		local13.method26203(0.0F, (float) (-20 - this.anInt2361 * 246492159), 0.0F);
		@Pc(111) Class446 local111 = null;
		this.aBoolean417 = false;
		if (Class510.aClass3_Sub45_37.aClass60_Sub3_1.method12813() == 1) {
			@Pc(124) Class445 local124 = this.method16690();
			if (local124.aBoolean772 && (this.aClass488_1.anInt5185 * -945292479 == -1 || Class498.aClass579_1.method33185(this.aClass488_1.anInt5185 * -945292479).aBoolean834)) {
				@Pc(159) Class71 local159 = this.aClass71_3.method20021() && this.aClass71_3.method20032() ? this.aClass71_3 : null;
				@Pc(175) Class71_Sub1 local175 = this.aClass71_Sub1_3.method20021() && (!this.aClass71_Sub1_3.aBoolean351 || local159 == null) ? this.aClass71_Sub1_3 : null;
				@Pc(178) short local178 = Class630.aClass493_1.aShort177;
				@Pc(181) byte local181 = Class630.aClass493_1.aByte168;
				if (this.aClass488_1.anInt5185 * -945292479 != -1) {
					local178 = Class498.aClass579_1.method33185(this.aClass488_1.anInt5185 * -945292479).aShort178;
					local181 = Class498.aClass579_1.method33185(this.aClass488_1.anInt5185 * -945292479).aByte178;
				}
				@Pc(248) Class20 local248;
				if (local178 > -1 && Class510.aClass3_Sub45_37.aClass60_Sub6_1.method12966() == 1) {
					local248 = Class108.method21935(arg0, local24, this.anInt2363 * -1473816677, this.anInt2371 * -1889629045, this.anInt2383 * 1437316903, this.aClass20Array3[0], local178, local181, local175 == null ? local159 : local175);
				} else {
					local248 = Class135.method22919(arg0, local24, this.anInt2363 * -1473816677, this.anInt2371 * -1889629045, this.anInt2383 * 1437316903, 1, this.aClass20Array3[0], 0, 0, 160, 240, local175 == null ? local159 : local175);
				}
				if (local248 != null) {
					if (this.aClass136Array21 == null || this.aClass136Array21.length < this.aClass20Array3.length + 1) {
						this.method21480(this.aClass20Array3.length + 1);
					}
					local111 = Class508.method29569(true);
					this.aBoolean417 = true;
					arg0.method17108(false);
					local248.method5352(local13, this.aClass136Array21[this.aClass20Array3.length], 0);
					arg0.method17108(true);
				}
			}
		}
		@Pc(335) int local335;
		if (Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3 == this) {
			for (local335 = client.aClass68Array1.length - 1; local335 >= 0; local335--) {
				@Pc(341) Class68 local341 = client.aClass68Array1[local335];
				if (local341 != null && local341.anInt2016 * -564396041 != -1) {
					@Pc(382) int local382;
					if (local341.anInt2017 * 207391421 == 1) {
						@Pc(364) Class3_Sub29 local364 = (Class3_Sub29) client.aClass581_21.method33217((long) (local341.anInt2012 * 403468169));
						if (local364 != null) {
							@Pc(370) Class26_Sub1_Sub1_Sub1_Sub1 local370 = (Class26_Sub1_Sub1_Sub1_Sub1) local364.anObject2;
							@Pc(378) Class320 local378 = Class320.method25928(local370.method21431().aClass320_61, Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.method21431().aClass320_61);
							local382 = (int) local378.aFloat259;
							@Pc(386) int local386 = (int) local378.aFloat261;
							this.method16733(arg0, local13, this.aClass20Array3[0], (long) local382, (long) local386, local341.anInt2016 * -564396041, 92160000L);
						}
					}
					if (local341.anInt2017 * 207391421 == 2) {
						@Pc(413) Class320 local413 = Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.method21431().aClass320_61;
						@Pc(423) long local423 = (long) (local341.anInt2009 * -2046314719 - (int) local413.aFloat259);
						@Pc(433) long local433 = (long) (local341.anInt2011 * -1644403279 - (int) local413.aFloat261);
						@Pc(441) long local441 = (long) (local341.anInt2014 * 138848077 << 9);
						@Pc(445) long local445 = local441 * local441;
						this.method16733(arg0, local13, this.aClass20Array3[0], local423, local433, local341.anInt2016 * -564396041, local445);
					}
					if (local341.anInt2017 * 207391421 == 10 && local341.anInt2012 * 403468169 >= 0 && local341.anInt2012 * 403468169 < client.aClass26_Sub1_Sub1_Sub1_Sub2Array1.length) {
						@Pc(485) Class26_Sub1_Sub1_Sub1_Sub2 local485 = client.aClass26_Sub1_Sub1_Sub1_Sub2Array1[local341.anInt2012 * 403468169];
						if (local485 != null) {
							@Pc(496) Class320 local496 = Class320.method25928(local485.method21431().aClass320_61, Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.method21431().aClass320_61);
							@Pc(500) int local500 = (int) local496.aFloat259;
							local382 = (int) local496.aFloat261;
							this.method16733(arg0, local13, this.aClass20Array3[0], (long) local500, (long) local382, local341.anInt2016 * -564396041, 92160000L);
						}
					}
				}
			}
		}
		local13.method26235(local16);
		local13.method26203(0.0F, (float) (-5 - this.anInt2361 * 246492159), 0.0F);
		if (this.aClass136Array21 == null || this.aClass136Array21.length < this.aClass20Array3.length) {
			this.method21480(this.aClass20Array3.length);
		}
		if (local111 == null) {
			local111 = Class508.method29569(true);
		}
		this.method16638(arg0, this.aClass20Array3, local13, false);
		for (local335 = 0; local335 < this.aClass20Array3.length; local335++) {
			if (this.aClass20Array3[local335] == null) {
				this.aClass136Array21[local335].aBoolean621 = false;
			} else {
				this.aClass20Array3[local335].method5352(local13, this.aClass136Array21[local335], Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3 == this ? 1 : 0);
			}
		}
		if (this.aClass478_3 != null) {
			@Pc(614) Class128 local614 = this.aClass478_3.method28843();
			arg0.method17105(local614);
		}
		for (local335 = 0; local335 < this.aClass20Array3.length; local335++) {
			if (this.aClass20Array3[local335] != null) {
				this.aBoolean417 |= this.aClass20Array3[local335].method5375();
			}
			this.aClass20Array3[local335] = null;
		}
		this.anInt2356 = client.anInt3100 * 1519967779;
		return local111;
	}

	@OriginalMember(owner = "client!akp", name = "fj", descriptor = "(Lclient!de;)Lclient!ry;", line = 242)
	@Override
	Class446 method21500(@OriginalArg(0) Class21 arg0) {
		if (this.aClass488_1 == null || !this.method16734(arg0, 2048)) {
			return null;
		}
		@Pc(13) Class332 local13 = arg0.method17098();
		@Pc(16) Class332 local16 = this.method21433();
		@Pc(19) Class322 local19 = this.method21431();
		@Pc(24) int local24 = this.aClass106_7.method21910();
		@Pc(45) Class432 local45 = this.aClass438_23.aClass432ArrayArrayArray3[this.aByte101][(int) local19.aClass320_61.aFloat259 >> 9][(int) local19.aClass320_61.aFloat261 >> 9];
		if (local45 == null || local45.aClass26_Sub1_Sub2_1 == null) {
			this.anInt2361 = (int) ((float) (this.anInt2361 * 246492159) - (float) (this.anInt2361 * 246492159) / 10.0F) * 1371460607;
		} else {
			@Pc(61) int local61 = this.anInt2361 * 246492159 - local45.aClass26_Sub1_Sub2_1.aShort60;
			this.anInt2361 = (int) ((float) (this.anInt2361 * 246492159) - (float) local61 / 10.0F) * 1371460607;
		}
		local13.method26235(local16);
		local13.method26203(0.0F, (float) (-20 - this.anInt2361 * 246492159), 0.0F);
		@Pc(111) Class446 local111 = null;
		this.aBoolean417 = false;
		if (Class510.aClass3_Sub45_37.aClass60_Sub3_1.method12813() == 1) {
			@Pc(124) Class445 local124 = this.method16690();
			if (local124.aBoolean772 && (this.aClass488_1.anInt5185 * -945292479 == -1 || Class498.aClass579_1.method33185(this.aClass488_1.anInt5185 * -945292479).aBoolean834)) {
				@Pc(159) Class71 local159 = this.aClass71_3.method20021() && this.aClass71_3.method20032() ? this.aClass71_3 : null;
				@Pc(175) Class71_Sub1 local175 = this.aClass71_Sub1_3.method20021() && (!this.aClass71_Sub1_3.aBoolean351 || local159 == null) ? this.aClass71_Sub1_3 : null;
				@Pc(178) short local178 = Class630.aClass493_1.aShort177;
				@Pc(181) byte local181 = Class630.aClass493_1.aByte168;
				if (this.aClass488_1.anInt5185 * -945292479 != -1) {
					local178 = Class498.aClass579_1.method33185(this.aClass488_1.anInt5185 * -945292479).aShort178;
					local181 = Class498.aClass579_1.method33185(this.aClass488_1.anInt5185 * -945292479).aByte178;
				}
				@Pc(248) Class20 local248;
				if (local178 > -1 && Class510.aClass3_Sub45_37.aClass60_Sub6_1.method12966() == 1) {
					local248 = Class108.method21935(arg0, local24, this.anInt2363 * -1473816677, this.anInt2371 * -1889629045, this.anInt2383 * 1437316903, this.aClass20Array3[0], local178, local181, local175 == null ? local159 : local175);
				} else {
					local248 = Class135.method22919(arg0, local24, this.anInt2363 * -1473816677, this.anInt2371 * -1889629045, this.anInt2383 * 1437316903, 1, this.aClass20Array3[0], 0, 0, 160, 240, local175 == null ? local159 : local175);
				}
				if (local248 != null) {
					if (this.aClass136Array21 == null || this.aClass136Array21.length < this.aClass20Array3.length + 1) {
						this.method21480(this.aClass20Array3.length + 1);
					}
					local111 = Class508.method29569(true);
					this.aBoolean417 = true;
					arg0.method17108(false);
					local248.method5352(local13, this.aClass136Array21[this.aClass20Array3.length], 0);
					arg0.method17108(true);
				}
			}
		}
		@Pc(335) int local335;
		if (Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3 == this) {
			for (local335 = client.aClass68Array1.length - 1; local335 >= 0; local335--) {
				@Pc(341) Class68 local341 = client.aClass68Array1[local335];
				if (local341 != null && local341.anInt2016 * -564396041 != -1) {
					@Pc(382) int local382;
					if (local341.anInt2017 * 207391421 == 1) {
						@Pc(364) Class3_Sub29 local364 = (Class3_Sub29) client.aClass581_21.method33217((long) (local341.anInt2012 * 403468169));
						if (local364 != null) {
							@Pc(370) Class26_Sub1_Sub1_Sub1_Sub1 local370 = (Class26_Sub1_Sub1_Sub1_Sub1) local364.anObject2;
							@Pc(378) Class320 local378 = Class320.method25928(local370.method21431().aClass320_61, Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.method21431().aClass320_61);
							local382 = (int) local378.aFloat259;
							@Pc(386) int local386 = (int) local378.aFloat261;
							this.method16733(arg0, local13, this.aClass20Array3[0], (long) local382, (long) local386, local341.anInt2016 * -564396041, 92160000L);
						}
					}
					if (local341.anInt2017 * 207391421 == 2) {
						@Pc(413) Class320 local413 = Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.method21431().aClass320_61;
						@Pc(423) long local423 = (long) (local341.anInt2009 * -2046314719 - (int) local413.aFloat259);
						@Pc(433) long local433 = (long) (local341.anInt2011 * -1644403279 - (int) local413.aFloat261);
						@Pc(441) long local441 = (long) (local341.anInt2014 * 138848077 << 9);
						@Pc(445) long local445 = local441 * local441;
						this.method16733(arg0, local13, this.aClass20Array3[0], local423, local433, local341.anInt2016 * -564396041, local445);
					}
					if (local341.anInt2017 * 207391421 == 10 && local341.anInt2012 * 403468169 >= 0 && local341.anInt2012 * 403468169 < client.aClass26_Sub1_Sub1_Sub1_Sub2Array1.length) {
						@Pc(485) Class26_Sub1_Sub1_Sub1_Sub2 local485 = client.aClass26_Sub1_Sub1_Sub1_Sub2Array1[local341.anInt2012 * 403468169];
						if (local485 != null) {
							@Pc(496) Class320 local496 = Class320.method25928(local485.method21431().aClass320_61, Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.method21431().aClass320_61);
							@Pc(500) int local500 = (int) local496.aFloat259;
							local382 = (int) local496.aFloat261;
							this.method16733(arg0, local13, this.aClass20Array3[0], (long) local500, (long) local382, local341.anInt2016 * -564396041, 92160000L);
						}
					}
				}
			}
		}
		local13.method26235(local16);
		local13.method26203(0.0F, (float) (-5 - this.anInt2361 * 246492159), 0.0F);
		if (this.aClass136Array21 == null || this.aClass136Array21.length < this.aClass20Array3.length) {
			this.method21480(this.aClass20Array3.length);
		}
		if (local111 == null) {
			local111 = Class508.method29569(true);
		}
		this.method16638(arg0, this.aClass20Array3, local13, false);
		for (local335 = 0; local335 < this.aClass20Array3.length; local335++) {
			if (this.aClass20Array3[local335] == null) {
				this.aClass136Array21[local335].aBoolean621 = false;
			} else {
				this.aClass20Array3[local335].method5352(local13, this.aClass136Array21[local335], Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3 == this ? 1 : 0);
			}
		}
		if (this.aClass478_3 != null) {
			@Pc(614) Class128 local614 = this.aClass478_3.method28843();
			arg0.method17105(local614);
		}
		for (local335 = 0; local335 < this.aClass20Array3.length; local335++) {
			if (this.aClass20Array3[local335] != null) {
				this.aBoolean417 |= this.aClass20Array3[local335].method5375();
			}
			this.aClass20Array3[local335] = null;
		}
		this.anInt2356 = client.anInt3100 * 1519967779;
		return local111;
	}

	@OriginalMember(owner = "client!akp", name = "fx", descriptor = "(Lclient!de;I)V", line = 343)
	@Override
	void method21485(@OriginalArg(0) Class21 arg0) {
		if (this.aClass488_1 == null || !this.aBoolean416 && !this.method16734(arg0, 0)) {
			return;
		}
		@Pc(17) Class332 local17 = arg0.method17098();
		local17.method26216(this.method21431());
		local17.method26203(0.0F, -5.0F, 0.0F);
		this.method16638(arg0, this.aClass20Array3, local17, this.aBoolean416);
		for (@Pc(37) int local37 = 0; local37 < this.aClass20Array3.length; local37++) {
			this.aClass20Array3[local37] = null;
		}
	}

	@OriginalMember(owner = "client!akp", name = "fq", descriptor = "(Lclient!de;)V", line = 343)
	@Override
	void method21502(@OriginalArg(0) Class21 arg0) {
		if (this.aClass488_1 == null || !this.aBoolean416 && !this.method16734(arg0, 0)) {
			return;
		}
		@Pc(17) Class332 local17 = arg0.method17098();
		local17.method26216(this.method21431());
		local17.method26203(0.0F, -5.0F, 0.0F);
		this.method16638(arg0, this.aClass20Array3, local17, this.aBoolean416);
		for (@Pc(37) int local37 = 0; local37 < this.aClass20Array3.length; local37++) {
			this.aClass20Array3[local37] = null;
		}
	}

	@OriginalMember(owner = "client!akp", name = "hn", descriptor = "(Lclient!de;Lclient!mu;Lclient!dh;JJIJ)V", line = 355)
	void method16733(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class332 arg1, @OriginalArg(2) Class20 arg2, @OriginalArg(3) long arg3, @OriginalArg(4) long arg4, @OriginalArg(5) int arg5, @OriginalArg(6) long arg6) {
		@Pc(7) long local7 = arg4 * arg4 + arg3 * arg3;
		if (local7 < 262144L || local7 > arg6) {
			return;
		}
		@Pc(33) int local33 = (int) (Math.atan2((double) arg3, (double) arg4) * 2607.5945876176133D - (double) this.aClass106_7.method21910()) & 0x3FFF;
		@Pc(51) Class20 local51 = Class159.method23204(arg0, local33, this.anInt2363 * -1473816677, this.anInt2371 * -1889629045, this.anInt2383 * 1437316903, arg5);
		if (local51 != null) {
			arg0.method17108(false);
			local51.method5352(arg1, null, 0);
			arg0.method17108(true);
		}
	}

	@OriginalMember(owner = "client!akp", name = "il", descriptor = "(Lclient!de;Lclient!mu;Lclient!dh;JJIJ)V", line = 355)
	void method16737(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class332 arg1, @OriginalArg(2) Class20 arg2, @OriginalArg(3) long arg3, @OriginalArg(4) long arg4, @OriginalArg(5) int arg5, @OriginalArg(6) long arg6) {
		@Pc(7) long local7 = arg4 * arg4 + arg3 * arg3;
		if (local7 < 262144L || local7 > arg6) {
			return;
		}
		@Pc(33) int local33 = (int) (Math.atan2((double) arg3, (double) arg4) * 2607.5945876176133D - (double) this.aClass106_7.method21910()) & 0x3FFF;
		@Pc(51) Class20 local51 = Class159.method23204(arg0, local33, this.anInt2363 * -1473816677, this.anInt2371 * -1889629045, this.anInt2383 * 1437316903, arg5);
		if (local51 != null) {
			arg0.method17108(false);
			local51.method5352(arg1, null, 0);
			arg0.method17108(true);
		}
	}

	@OriginalMember(owner = "client!akp", name = "ik", descriptor = "(Lclient!de;Lclient!mu;Lclient!dh;JJIJ)V", line = 355)
	void method16752(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class332 arg1, @OriginalArg(2) Class20 arg2, @OriginalArg(3) long arg3, @OriginalArg(4) long arg4, @OriginalArg(5) int arg5, @OriginalArg(6) long arg6) {
		@Pc(7) long local7 = arg4 * arg4 + arg3 * arg3;
		if (local7 < 262144L || local7 > arg6) {
			return;
		}
		@Pc(33) int local33 = (int) (Math.atan2((double) arg3, (double) arg4) * 2607.5945876176133D - (double) this.aClass106_7.method21910()) & 0x3FFF;
		@Pc(51) Class20 local51 = Class159.method23204(arg0, local33, this.anInt2363 * -1473816677, this.anInt2371 * -1889629045, this.anInt2383 * 1437316903, arg5);
		if (local51 != null) {
			arg0.method17108(false);
			local51.method5352(arg1, null, 0);
			arg0.method17108(true);
		}
	}

	@OriginalMember(owner = "client!akp", name = "id", descriptor = "(Lclient!de;Lclient!mu;Lclient!dh;JJIJ)V", line = 355)
	void method16753(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class332 arg1, @OriginalArg(2) Class20 arg2, @OriginalArg(3) long arg3, @OriginalArg(4) long arg4, @OriginalArg(5) int arg5, @OriginalArg(6) long arg6) {
		@Pc(7) long local7 = arg4 * arg4 + arg3 * arg3;
		if (local7 < 262144L || local7 > arg6) {
			return;
		}
		@Pc(33) int local33 = (int) (Math.atan2((double) arg3, (double) arg4) * 2607.5945876176133D - (double) this.aClass106_7.method21910()) & 0x3FFF;
		@Pc(51) Class20 local51 = Class159.method23204(arg0, local33, this.anInt2363 * -1473816677, this.anInt2371 * -1889629045, this.anInt2383 * 1437316903, arg5);
		if (local51 != null) {
			arg0.method17108(false);
			local51.method5352(arg1, null, 0);
			arg0.method17108(true);
		}
	}

	@OriginalMember(owner = "client!akp", name = "iu", descriptor = "(Lclient!de;Lclient!mu;Lclient!dh;JJIJ)V", line = 355)
	void method16755(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class332 arg1, @OriginalArg(2) Class20 arg2, @OriginalArg(3) long arg3, @OriginalArg(4) long arg4, @OriginalArg(5) int arg5, @OriginalArg(6) long arg6) {
		@Pc(7) long local7 = arg4 * arg4 + arg3 * arg3;
		if (local7 < 262144L || local7 > arg6) {
			return;
		}
		@Pc(33) int local33 = (int) (Math.atan2((double) arg3, (double) arg4) * 2607.5945876176133D - (double) this.aClass106_7.method21910()) & 0x3FFF;
		@Pc(51) Class20 local51 = Class159.method23204(arg0, local33, this.anInt2363 * -1473816677, this.anInt2371 * -1889629045, this.anInt2383 * 1437316903, arg5);
		if (local51 != null) {
			arg0.method17108(false);
			local51.method5352(arg1, null, 0);
			arg0.method17108(true);
		}
	}

	@OriginalMember(owner = "client!akp", name = "iq", descriptor = "(Lclient!de;Lclient!mu;Lclient!dh;JJIJ)V", line = 355)
	void method16756(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class332 arg1, @OriginalArg(2) Class20 arg2, @OriginalArg(3) long arg3, @OriginalArg(4) long arg4, @OriginalArg(5) int arg5, @OriginalArg(6) long arg6) {
		@Pc(7) long local7 = arg4 * arg4 + arg3 * arg3;
		if (local7 < 262144L || local7 > arg6) {
			return;
		}
		@Pc(33) int local33 = (int) (Math.atan2((double) arg3, (double) arg4) * 2607.5945876176133D - (double) this.aClass106_7.method21910()) & 0x3FFF;
		@Pc(51) Class20 local51 = Class159.method23204(arg0, local33, this.anInt2363 * -1473816677, this.anInt2371 * -1889629045, this.anInt2383 * 1437316903, arg5);
		if (local51 != null) {
			arg0.method17108(false);
			local51.method5352(arg1, null, 0);
			arg0.method17108(true);
		}
	}

	@OriginalMember(owner = "client!akp", name = "hw", descriptor = "(Lclient!de;II)Z", line = 367)
	boolean method16734(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = arg1;
		@Pc(5) Class445 local5 = this.method16690();
		@Pc(20) Class71 local20 = this.aClass71_3.method20021() && !this.aClass71_3.method20032() ? this.aClass71_3 : null;
		@Pc(40) Class71_Sub1 local40 = !this.aClass71_Sub1_3.method20021() || this.aBoolean418 || this.aClass71_Sub1_3.aBoolean351 && local20 != null ? null : this.aClass71_Sub1_3;
		@Pc(45) int local45 = local5.anInt4988 * 1661161713;
		@Pc(50) int local50 = local5.anInt4991 * 1222505007;
		if (local45 != 0 || local50 != 0 || local5.anInt4994 * 1917917773 != 0 || local5.anInt5000 * 1058805945 != 0) {
			arg1 |= 0x7;
		}
		@Pc(74) int local74 = this.aClass106_7.method21910();
		@Pc(94) boolean local94 = this.aByte76 != 0 && client.anInt3034 >= this.anInt2374 * -1137693473 && client.anInt3034 < this.anInt2375 * 2062081869;
		if (local94) {
			arg1 |= 0x80000;
		}
		@Pc(127) Class20 local127 = this.aClass20Array3[0] = this.aClass488_1.method29200(arg0, arg1, Class399.aClass428_1, Class585.aClass228_2, Class498.aClass579_1, Class44_Sub3.aClass596_1, Class424.aClass165_1, Class424.aClass165_1, local20, local40, this.aClass71_Sub3_Sub1Array3, this.anIntArray240, local74, true, Class589.aClass489_2);
		@Pc(130) int local130 = Class457.method28511();
		if (Class390.anInt3031 * -435910341 < 96 && local130 > 50) {
			Class334.method26291();
		}
		if (Class1.aClass527_1 != Class527.aClass527_10 && local130 < 50) {
			@Pc(150) int local150 = 50 - local130;
			while (local150 > client.anInt3040 * -1966277319) {
				Class324.aByteArrayArray15[client.anInt3040 * -1966277319] = new byte[102400];
				client.anInt3040 += 1377624329;
			}
			while (local150 < client.anInt3040 * -1966277319) {
				client.anInt3040 -= 1377624329;
				Class324.aByteArrayArray15[client.anInt3040 * -1966277319] = null;
			}
		} else if (Class527.aClass527_10 != Class1.aClass527_1) {
			Class324.aByteArrayArray15 = new byte[50][];
			client.anInt3040 = 0;
		}
		if (local127 == null) {
			return false;
		}
		this.anInt2387 = local127.method5466() * 976667007;
		this.anInt2357 = local127.method5519() * 1248824327;
		local127.method5356();
		this.method16647(local127);
		if (local45 == 0 && local50 == 0) {
			this.method16648(local74, this.method16630() << 9, this.method16630() << 9, 0, 0);
		} else {
			this.method16648(local74, local45, local50, local5.anInt4973 * -1640586807, local5.anInt4993 * 1115401197);
			if (this.anInt2363 * -1473816677 != 0) {
				local127.method5331(this.anInt2363 * -1473816677);
			}
			if (this.anInt2371 * -1889629045 != 0) {
				local127.method5482(this.anInt2371 * -1889629045);
			}
			if (this.anInt2383 * 1437316903 != 0) {
				local127.method5333(0, this.anInt2383 * 1437316903, 0);
			}
		}
		if (local94) {
			local127.method5373(this.aByte74, this.aByte72, this.aByte75, this.aByte76 & 0xFF);
		}
		if (!this.aBoolean418) {
			this.method16661(arg0, local5, local1, local45, local50, local74);
		}
		return true;
	}

	@OriginalMember(owner = "client!akp", name = "im", descriptor = "(Lclient!de;I)Z", line = 367)
	boolean method16757(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = arg1;
		@Pc(5) Class445 local5 = this.method16690();
		@Pc(20) Class71 local20 = this.aClass71_3.method20021() && !this.aClass71_3.method20032() ? this.aClass71_3 : null;
		@Pc(40) Class71_Sub1 local40 = !this.aClass71_Sub1_3.method20021() || this.aBoolean418 || this.aClass71_Sub1_3.aBoolean351 && local20 != null ? null : this.aClass71_Sub1_3;
		@Pc(45) int local45 = local5.anInt4988 * 1661161713;
		@Pc(50) int local50 = local5.anInt4991 * 1222505007;
		if (local45 != 0 || local50 != 0 || local5.anInt4994 * 1917917773 != 0 || local5.anInt5000 * 1058805945 != 0) {
			arg1 |= 0x7;
		}
		@Pc(74) int local74 = this.aClass106_7.method21910();
		@Pc(94) boolean local94 = this.aByte76 != 0 && client.anInt3034 >= this.anInt2374 * -1137693473 && client.anInt3034 < this.anInt2375 * 2062081869;
		if (local94) {
			arg1 |= 0x80000;
		}
		@Pc(127) Class20 local127 = this.aClass20Array3[0] = this.aClass488_1.method29200(arg0, arg1, Class399.aClass428_1, Class585.aClass228_2, Class498.aClass579_1, Class44_Sub3.aClass596_1, Class424.aClass165_1, Class424.aClass165_1, local20, local40, this.aClass71_Sub3_Sub1Array3, this.anIntArray240, local74, true, Class589.aClass489_2);
		@Pc(130) int local130 = Class457.method28511();
		if (Class390.anInt3031 * -435910341 < 96 && local130 > 50) {
			Class334.method26291();
		}
		if (Class1.aClass527_1 != Class527.aClass527_10 && local130 < 50) {
			@Pc(150) int local150 = 50 - local130;
			while (local150 > client.anInt3040 * -1966277319) {
				Class324.aByteArrayArray15[client.anInt3040 * -1966277319] = new byte[102400];
				client.anInt3040 += 1377624329;
			}
			while (local150 < client.anInt3040 * -1966277319) {
				client.anInt3040 -= 1377624329;
				Class324.aByteArrayArray15[client.anInt3040 * -1966277319] = null;
			}
		} else if (Class527.aClass527_10 != Class1.aClass527_1) {
			Class324.aByteArrayArray15 = new byte[50][];
			client.anInt3040 = 0;
		}
		if (local127 == null) {
			return false;
		}
		this.anInt2387 = local127.method5466() * 976667007;
		this.anInt2357 = local127.method5519() * 1248824327;
		local127.method5356();
		this.method16647(local127);
		if (local45 == 0 && local50 == 0) {
			this.method16648(local74, this.method16630() << 9, this.method16630() << 9, 0, 0);
		} else {
			this.method16648(local74, local45, local50, local5.anInt4973 * -1640586807, local5.anInt4993 * 1115401197);
			if (this.anInt2363 * -1473816677 != 0) {
				local127.method5331(this.anInt2363 * -1473816677);
			}
			if (this.anInt2371 * -1889629045 != 0) {
				local127.method5482(this.anInt2371 * -1889629045);
			}
			if (this.anInt2383 * 1437316903 != 0) {
				local127.method5333(0, this.anInt2383 * 1437316903, 0);
			}
		}
		if (local94) {
			local127.method5373(this.aByte74, this.aByte72, this.aByte75, this.aByte76 & 0xFF);
		}
		if (!this.aBoolean418) {
			this.method16661(arg0, local5, local1, local45, local50, local74);
		}
		return true;
	}

	@OriginalMember(owner = "client!akp", name = "hy", descriptor = "(ZI)Ljava/lang/String;", line = 413)
	public String method16735(@OriginalArg(0) boolean arg0) {
		@Pc(1) String local1 = "";
		if (this.aString76 != null) {
			local1 = this.aString76;
		}
		if (arg0) {
			local1 = local1 + this.aString77;
		} else {
			local1 = local1 + this.aString75;
		}
		if (this.aString78 != null) {
			local1 = local1 + this.aString78;
		}
		return local1;
	}

	@OriginalMember(owner = "client!akp", name = "ig", descriptor = "(Z)Ljava/lang/String;", line = 413)
	public String method16744(@OriginalArg(0) boolean arg0) {
		@Pc(1) String local1 = "";
		if (this.aString76 != null) {
			local1 = this.aString76;
		}
		if (arg0) {
			local1 = local1 + this.aString77;
		} else {
			local1 = local1 + this.aString75;
		}
		if (this.aString78 != null) {
			local1 = local1 + this.aString78;
		}
		return local1;
	}

	@OriginalMember(owner = "client!akp", name = "ir", descriptor = "(Z)Ljava/lang/String;", line = 413)
	public String method16758(@OriginalArg(0) boolean arg0) {
		@Pc(1) String local1 = "";
		if (this.aString76 != null) {
			local1 = this.aString76;
		}
		if (arg0) {
			local1 = local1 + this.aString77;
		} else {
			local1 = local1 + this.aString75;
		}
		if (this.aString78 != null) {
			local1 = local1 + this.aString78;
		}
		return local1;
	}

	@OriginalMember(owner = "client!akp", name = "hr", descriptor = "(ZI)Ljava/lang/String;", line = 422)
	public String method16750(@OriginalArg(0) boolean arg0) {
		return arg0 ? this.aString77 : this.aString75;
	}

	@OriginalMember(owner = "client!akp", name = "ip", descriptor = "(Z)Ljava/lang/String;", line = 422)
	public String method16759(@OriginalArg(0) boolean arg0) {
		return arg0 ? this.aString77 : this.aString75;
	}

	@OriginalMember(owner = "client!akp", name = "hf", descriptor = "(IIBI)V", line = 427)
	public final void method16732(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		if (this.aClass71_3.method20021() && this.aClass71_3.method20069().anInt4937 * 988717411 == 1) {
			this.anIntArray234 = null;
			this.aClass71_3.method20038(-1);
		}
		for (@Pc(23) int local23 = 0; local23 < this.aClass384Array3.length; local23++) {
			if (this.aClass384Array3[local23].anInt4716 * 1164757693 != -1) {
				@Pc(48) Class520 local48 = Class19.aClass523_14.method29823(this.aClass384Array3[local23].anInt4716 * 1164757693);
				if (local48.aBoolean820 && local48.anInt5294 * -1332447219 != -1 && Class110.aClass436_1.method27999(local48.anInt5294 * -1332447219).anInt4937 * 988717411 == 1) {
					this.aClass384Array3[local23].aClass71_7.method20038(-1);
					this.aClass384Array3[local23].anInt4716 = -1212547221;
				}
			}
		}
		this.anInt2395 = 1905570099;
		if (arg0 < 0 || arg0 >= client.aClass370_1.method26943() || arg1 < 0 || arg1 >= client.aClass370_1.method27062()) {
			this.method16738(arg0, arg1);
		} else if (this.anIntArray241[0] >= 0 && this.anIntArray241[0] < client.aClass370_1.method26943() && this.anIntArray239[0] >= 0 && this.anIntArray239[0] < client.aClass370_1.method27062()) {
			this.method16754(arg0, arg1, arg2);
		} else {
			this.method16738(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!akp", name = "ih", descriptor = "(IIB)V", line = 427)
	public final void method16747(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		if (this.aClass71_3.method20021() && this.aClass71_3.method20069().anInt4937 * 988717411 == 1) {
			this.anIntArray234 = null;
			this.aClass71_3.method20038(-1);
		}
		for (@Pc(23) int local23 = 0; local23 < this.aClass384Array3.length; local23++) {
			if (this.aClass384Array3[local23].anInt4716 * 1164757693 != -1) {
				@Pc(48) Class520 local48 = Class19.aClass523_14.method29823(this.aClass384Array3[local23].anInt4716 * 1164757693);
				if (local48.aBoolean820 && local48.anInt5294 * -1332447219 != -1 && Class110.aClass436_1.method27999(local48.anInt5294 * -1332447219).anInt4937 * 988717411 == 1) {
					this.aClass384Array3[local23].aClass71_7.method20038(-1);
					this.aClass384Array3[local23].anInt4716 = -1212547221;
				}
			}
		}
		this.anInt2395 = 1905570099;
		if (arg0 < 0 || arg0 >= client.aClass370_1.method26943() || arg1 < 0 || arg1 >= client.aClass370_1.method27062()) {
			this.method16738(arg0, arg1);
		} else if (this.anIntArray241[0] >= 0 && this.anIntArray241[0] < client.aClass370_1.method26943() && this.anIntArray239[0] >= 0 && this.anIntArray239[0] < client.aClass370_1.method27062()) {
			this.method16754(arg0, arg1, arg2);
		} else {
			this.method16738(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!akp", name = "in", descriptor = "(IIB)V", line = 427)
	public final void method16761(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		if (this.aClass71_3.method20021() && this.aClass71_3.method20069().anInt4937 * 988717411 == 1) {
			this.anIntArray234 = null;
			this.aClass71_3.method20038(-1);
		}
		for (@Pc(23) int local23 = 0; local23 < this.aClass384Array3.length; local23++) {
			if (this.aClass384Array3[local23].anInt4716 * 1164757693 != -1) {
				@Pc(48) Class520 local48 = Class19.aClass523_14.method29823(this.aClass384Array3[local23].anInt4716 * 1164757693);
				if (local48.aBoolean820 && local48.anInt5294 * -1332447219 != -1 && Class110.aClass436_1.method27999(local48.anInt5294 * -1332447219).anInt4937 * 988717411 == 1) {
					this.aClass384Array3[local23].aClass71_7.method20038(-1);
					this.aClass384Array3[local23].anInt4716 = -1212547221;
				}
			}
		}
		this.anInt2395 = 1905570099;
		if (arg0 < 0 || arg0 >= client.aClass370_1.method26943() || arg1 < 0 || arg1 >= client.aClass370_1.method27062()) {
			this.method16738(arg0, arg1);
		} else if (this.anIntArray241[0] >= 0 && this.anIntArray241[0] < client.aClass370_1.method26943() && this.anIntArray239[0] >= 0 && this.anIntArray239[0] < client.aClass370_1.method27062()) {
			this.method16754(arg0, arg1, arg2);
		} else {
			this.method16738(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!akp", name = "ia", descriptor = "(IIB)V", line = 427)
	public final void method16762(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		if (this.aClass71_3.method20021() && this.aClass71_3.method20069().anInt4937 * 988717411 == 1) {
			this.anIntArray234 = null;
			this.aClass71_3.method20038(-1);
		}
		for (@Pc(23) int local23 = 0; local23 < this.aClass384Array3.length; local23++) {
			if (this.aClass384Array3[local23].anInt4716 * 1164757693 != -1) {
				@Pc(48) Class520 local48 = Class19.aClass523_14.method29823(this.aClass384Array3[local23].anInt4716 * 1164757693);
				if (local48.aBoolean820 && local48.anInt5294 * -1332447219 != -1 && Class110.aClass436_1.method27999(local48.anInt5294 * -1332447219).anInt4937 * 988717411 == 1) {
					this.aClass384Array3[local23].aClass71_7.method20038(-1);
					this.aClass384Array3[local23].anInt4716 = -1212547221;
				}
			}
		}
		this.anInt2395 = 1905570099;
		if (arg0 < 0 || arg0 >= client.aClass370_1.method26943() || arg1 < 0 || arg1 >= client.aClass370_1.method27062()) {
			this.method16738(arg0, arg1);
		} else if (this.anIntArray241[0] >= 0 && this.anIntArray241[0] < client.aClass370_1.method26943() && this.anIntArray239[0] >= 0 && this.anIntArray239[0] < client.aClass370_1.method27062()) {
			this.method16754(arg0, arg1, arg2);
		} else {
			this.method16738(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!akp", name = "ix", descriptor = "(IIB)V", line = 427)
	public final void method16766(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		if (this.aClass71_3.method20021() && this.aClass71_3.method20069().anInt4937 * 988717411 == 1) {
			this.anIntArray234 = null;
			this.aClass71_3.method20038(-1);
		}
		for (@Pc(23) int local23 = 0; local23 < this.aClass384Array3.length; local23++) {
			if (this.aClass384Array3[local23].anInt4716 * 1164757693 != -1) {
				@Pc(48) Class520 local48 = Class19.aClass523_14.method29823(this.aClass384Array3[local23].anInt4716 * 1164757693);
				if (local48.aBoolean820 && local48.anInt5294 * -1332447219 != -1 && Class110.aClass436_1.method27999(local48.anInt5294 * -1332447219).anInt4937 * 988717411 == 1) {
					this.aClass384Array3[local23].aClass71_7.method20038(-1);
					this.aClass384Array3[local23].anInt4716 = -1212547221;
				}
			}
		}
		this.anInt2395 = 1905570099;
		if (arg0 < 0 || arg0 >= client.aClass370_1.method26943() || arg1 < 0 || arg1 >= client.aClass370_1.method27062()) {
			this.method16738(arg0, arg1);
		} else if (this.anIntArray241[0] >= 0 && this.anIntArray241[0] < client.aClass370_1.method26943() && this.anIntArray239[0] >= 0 && this.anIntArray239[0] < client.aClass370_1.method27062()) {
			this.method16754(arg0, arg1, arg2);
		} else {
			this.method16738(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!akp", name = "hp", descriptor = "(III)V", line = 447)
	public void method16738(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2362 = 0;
		this.anInt2385 = 0;
		this.anInt2384 = 0;
		this.anIntArray241[0] = arg0;
		this.anIntArray239[0] = arg1;
		@Pc(22) int local22 = this.method16630();
		@Pc(27) Class320 local27 = Class320.method25906(this.method21431().aClass320_61);
		local27.aFloat259 = this.anIntArray241[0] * 512 + local22 * 256;
		local27.aFloat261 = local22 * 256 + this.anIntArray239[0] * 512;
		this.method21436(local27);
		local27.method25874();
		if (Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3 == this) {
			client.aClass370_1.method26953().method28901();
		}
		if (this.aClass478_3 != null) {
			this.aClass478_3.method28855();
		}
	}

	@OriginalMember(owner = "client!akp", name = "ij", descriptor = "(II)V", line = 447)
	public void method16739(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2362 = 0;
		this.anInt2385 = 0;
		this.anInt2384 = 0;
		this.anIntArray241[0] = arg0;
		this.anIntArray239[0] = arg1;
		@Pc(22) int local22 = this.method16630();
		@Pc(27) Class320 local27 = Class320.method25906(this.method21431().aClass320_61);
		local27.aFloat259 = this.anIntArray241[0] * 512 + local22 * 256;
		local27.aFloat261 = local22 * 256 + this.anIntArray239[0] * 512;
		this.method21436(local27);
		local27.method25874();
		if (Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3 == this) {
			client.aClass370_1.method26953().method28901();
		}
		if (this.aClass478_3 != null) {
			this.aClass478_3.method28855();
		}
	}

	@OriginalMember(owner = "client!akp", name = "if", descriptor = "(II)V", line = 447)
	public void method16746(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2362 = 0;
		this.anInt2385 = 0;
		this.anInt2384 = 0;
		this.anIntArray241[0] = arg0;
		this.anIntArray239[0] = arg1;
		@Pc(22) int local22 = this.method16630();
		@Pc(27) Class320 local27 = Class320.method25906(this.method21431().aClass320_61);
		local27.aFloat259 = this.anIntArray241[0] * 512 + local22 * 256;
		local27.aFloat261 = local22 * 256 + this.anIntArray239[0] * 512;
		this.method21436(local27);
		local27.method25874();
		if (Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3 == this) {
			client.aClass370_1.method26953().method28901();
		}
		if (this.aClass478_3 != null) {
			this.aClass478_3.method28855();
		}
	}

	@OriginalMember(owner = "client!akp", name = "iy", descriptor = "(II)V", line = 447)
	public void method16764(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2362 = 0;
		this.anInt2385 = 0;
		this.anInt2384 = 0;
		this.anIntArray241[0] = arg0;
		this.anIntArray239[0] = arg1;
		@Pc(22) int local22 = this.method16630();
		@Pc(27) Class320 local27 = Class320.method25906(this.method21431().aClass320_61);
		local27.aFloat259 = this.anIntArray241[0] * 512 + local22 * 256;
		local27.aFloat261 = local22 * 256 + this.anIntArray239[0] * 512;
		this.method21436(local27);
		local27.method25874();
		if (Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3 == this) {
			client.aClass370_1.method26953().method28901();
		}
		if (this.aClass478_3 != null) {
			this.aClass478_3.method28855();
		}
	}

	@OriginalMember(owner = "client!akp", name = "is", descriptor = "(IIB)V", line = 463)
	final void method16741(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		if (this.anInt2362 * -162520433 < this.anIntArray241.length - 1) {
			this.anInt2362 += 2015411311;
		}
		for (@Pc(20) int local20 = this.anInt2362 * -162520433; local20 > 0; local20--) {
			this.anIntArray241[local20] = this.anIntArray241[local20 - 1];
			this.anIntArray239[local20] = this.anIntArray239[local20 - 1];
			this.aByteArray41[local20] = this.aByteArray41[local20 - 1];
		}
		this.anIntArray241[0] = arg0;
		this.anIntArray239[0] = arg1;
		this.aByteArray41[0] = arg2;
	}

	@OriginalMember(owner = "client!akp", name = "hq", descriptor = "(IIBI)V", line = 463)
	final void method16754(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		if (this.anInt2362 * -162520433 < this.anIntArray241.length - 1) {
			this.anInt2362 += 2015411311;
		}
		for (@Pc(20) int local20 = this.anInt2362 * -162520433; local20 > 0; local20--) {
			this.anIntArray241[local20] = this.anIntArray241[local20 - 1];
			this.anIntArray239[local20] = this.anIntArray239[local20 - 1];
			this.aByteArray41[local20] = this.aByteArray41[local20 - 1];
		}
		this.anIntArray241[0] = arg0;
		this.anIntArray239[0] = arg1;
		this.aByteArray41[0] = arg2;
	}

	@OriginalMember(owner = "client!akp", name = "ii", descriptor = "()Z", line = 475)
	public final boolean method16736() {
		return this.aClass488_1 != null;
	}

	@OriginalMember(owner = "client!akp", name = "hv", descriptor = "(S)Z", line = 475)
	public final boolean method16740() {
		return this.aClass488_1 != null;
	}

	@OriginalMember(owner = "client!akp", name = "it", descriptor = "()Z", line = 475)
	public final boolean method16749() {
		return this.aClass488_1 != null;
	}

	@OriginalMember(owner = "client!akp", name = "iw", descriptor = "()Z", line = 475)
	public final boolean method16765() {
		return this.aClass488_1 != null;
	}

	@OriginalMember(owner = "client!akp", name = "bl", descriptor = "(I)I", line = 480)
	@Override
	public int method16630() {
		return this.aClass488_1 == null || this.aClass488_1.anInt5185 * -945292479 == -1 ? super.method16630() : Class498.aClass579_1.method33185(this.aClass488_1.anInt5185 * -945292479).anInt5389 * 2130228951;
	}

	@OriginalMember(owner = "client!akp", name = "dj", descriptor = "()I", line = 480)
	@Override
	public int method16662() {
		return this.aClass488_1 == null || this.aClass488_1.anInt5185 * -945292479 == -1 ? super.method16630() : Class498.aClass579_1.method33185(this.aClass488_1.anInt5185 * -945292479).anInt5389 * 2130228951;
	}

	@OriginalMember(owner = "client!akp", name = "dl", descriptor = "()I", line = 480)
	@Override
	public int method16708() {
		return this.aClass488_1 == null || this.aClass488_1.anInt5185 * -945292479 == -1 ? super.method16630() : Class498.aClass579_1.method33185(this.aClass488_1.anInt5185 * -945292479).anInt5389 * 2130228951;
	}

	@OriginalMember(owner = "client!akp", name = "bn", descriptor = "(B)I", line = 485)
	@Override
	int method16650() {
		return this.anInt2402 * 1516056375;
	}

	@OriginalMember(owner = "client!akp", name = "fp", descriptor = "()I", line = 485)
	@Override
	int method16725() {
		return this.anInt2402 * 1516056375;
	}

	@OriginalMember(owner = "client!akp", name = "fm", descriptor = "()I", line = 485)
	@Override
	int method16713() {
		return this.anInt2402 * 1516056375;
	}

	@OriginalMember(owner = "client!akp", name = "dn", descriptor = "()I", line = 489)
	@Override
	public int method16699() {
		return -1;
	}

	@OriginalMember(owner = "client!akp", name = "ee", descriptor = "()I", line = 489)
	@Override
	public int method16700() {
		return -1;
	}

	@OriginalMember(owner = "client!akp", name = "ex", descriptor = "()I", line = 489)
	@Override
	public int method16701() {
		return -1;
	}

	@OriginalMember(owner = "client!akp", name = "be", descriptor = "(I)I", line = 489)
	@Override
	public int method16694() {
		return -1;
	}

	@OriginalMember(owner = "client!akp", name = "fh", descriptor = "(Lclient!de;IIB)Z", line = 493)
	@Override
	boolean method21486(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass488_1 == null || !this.method16734(arg0, 131072)) {
			return false;
		}
		@Pc(14) Class332 local14 = this.method21433();
		@Pc(16) boolean local16 = false;
		@Pc(18) int local18;
		for (local18 = 0; local18 < this.aClass20Array3.length; local18++) {
			if (this.aClass20Array3[local18] != null && this.aClass20Array3[local18].method5417(arg1, arg2, local14, true, 0)) {
				local16 = true;
				break;
			}
		}
		for (local18 = 0; local18 < this.aClass20Array3.length; local18++) {
			this.aClass20Array3[local18] = null;
		}
		return local16;
	}

	@OriginalMember(owner = "client!akp", name = "fy", descriptor = "(Lclient!de;II)Z", line = 493)
	@Override
	boolean method21493(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass488_1 == null || !this.method16734(arg0, 131072)) {
			return false;
		}
		@Pc(14) Class332 local14 = this.method21433();
		@Pc(16) boolean local16 = false;
		@Pc(18) int local18;
		for (local18 = 0; local18 < this.aClass20Array3.length; local18++) {
			if (this.aClass20Array3[local18] != null && this.aClass20Array3[local18].method5417(arg1, arg2, local14, true, 0)) {
				local16 = true;
				break;
			}
		}
		for (local18 = 0; local18 < this.aClass20Array3.length; local18++) {
			this.aClass20Array3[local18] = null;
		}
		return local16;
	}

	@OriginalMember(owner = "client!akp", name = "fv", descriptor = "(Lclient!de;II)Z", line = 493)
	@Override
	boolean method21492(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass488_1 == null || !this.method16734(arg0, 131072)) {
			return false;
		}
		@Pc(14) Class332 local14 = this.method21433();
		@Pc(16) boolean local16 = false;
		@Pc(18) int local18;
		for (local18 = 0; local18 < this.aClass20Array3.length; local18++) {
			if (this.aClass20Array3[local18] != null && this.aClass20Array3[local18].method5417(arg1, arg2, local14, true, 0)) {
				local16 = true;
				break;
			}
		}
		for (local18 = 0; local18 < this.aClass20Array3.length; local18++) {
			this.aClass20Array3[local18] = null;
		}
		return local16;
	}

	@OriginalMember(owner = "client!akp", name = "fu", descriptor = "(B)Z", line = 509)
	@Override
	final boolean method21465() {
		return false;
	}

	@OriginalMember(owner = "client!akp", name = "fw", descriptor = "()Z", line = 509)
	@Override
	final boolean method21495() {
		return false;
	}

	@OriginalMember(owner = "client!akp", name = "fe", descriptor = "()Z", line = 509)
	@Override
	final boolean method21503() {
		return false;
	}

	@OriginalMember(owner = "client!akp", name = "fg", descriptor = "(Lclient!de;Lclient!ahn;IIIZI)V", line = 513)
	@Override
	final void method21511(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class26_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!akp", name = "fc", descriptor = "(Lclient!de;Lclient!ahn;IIIZ)V", line = 513)
	@Override
	final void method21510(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class26_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!akp", name = "fb", descriptor = "(I)V", line = 517)
	@Override
	final void method21469() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!akp", name = "fo", descriptor = "()V", line = 517)
	@Override
	final void method21481() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!akp", name = "fl", descriptor = "()V", line = 517)
	@Override
	final void method21497() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!akp", name = "bh", descriptor = "(I)Z", line = 521)
	@Override
	public boolean method16653() {
		return Class630.aClass493_1.aBoolean814;
	}

	@OriginalMember(owner = "client!akp", name = "ef", descriptor = "()Z", line = 521)
	@Override
	public boolean method16703() {
		return Class630.aClass493_1.aBoolean814;
	}

	@OriginalMember(owner = "client!akp", name = "ey", descriptor = "()Z", line = 521)
	@Override
	public boolean method16704() {
		return Class630.aClass493_1.aBoolean814;
	}

	@OriginalMember(owner = "client!akp", name = "bj", descriptor = "(I)Lclient!pw;", line = 525)
	@Override
	public Class399 method16654() {
		if (this.aClass399_3 != null) {
			if (this.aClass399_3.aString217 == null) {
				return null;
			}
			if (client.anInt3186 * -1581600013 == 0 || client.anInt3186 * -1581600013 == 3 || client.anInt3186 * -1581600013 == 1 && Class283.method25455(this.aString75)) {
				return this.aClass399_3;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!akp", name = "er", descriptor = "()Lclient!pw;", line = 525)
	@Override
	public Class399 method16705() {
		if (this.aClass399_3 != null) {
			if (this.aClass399_3.aString217 == null) {
				return null;
			}
			if (client.anInt3186 * -1581600013 == 0 || client.anInt3186 * -1581600013 == 3 || client.anInt3186 * -1581600013 == 1 && Class283.method25455(this.aString75)) {
				return this.aClass399_3;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!akp", name = "ej", descriptor = "()Lclient!pw;", line = 525)
	@Override
	public Class399 method16670() {
		if (this.aClass399_3 != null) {
			if (this.aClass399_3.aString217 == null) {
				return null;
			}
			if (client.anInt3186 * -1581600013 == 0 || client.anInt3186 * -1581600013 == 3 || client.anInt3186 * -1581600013 == 1 && Class283.method25455(this.aString75)) {
				return this.aClass399_3;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!akp", name = "en", descriptor = "()Lclient!pw;", line = 525)
	@Override
	public Class399 method16718() {
		if (this.aClass399_3 != null) {
			if (this.aClass399_3.aString217 == null) {
				return null;
			}
			if (client.anInt3186 * -1581600013 == 0 || client.anInt3186 * -1581600013 == 3 || client.anInt3186 * -1581600013 == 1 && Class283.method25455(this.aString75)) {
				return this.aClass399_3;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!akp", name = "ht", descriptor = "(Ljava/lang/String;IIB)V", line = 533)
	public void method16745(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method16655(arg0, arg1, arg2, Class498.method29361() * Class630.aClass493_1.anInt5226 * -561404645);
	}

	@OriginalMember(owner = "client!akp", name = "iv", descriptor = "(Ljava/lang/String;II)V", line = 533)
	public void method16767(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method16655(arg0, arg1, arg2, Class498.method29361() * Class630.aClass493_1.anInt5226 * -561404645);
	}

	@OriginalMember(owner = "client!akp", name = "iz", descriptor = "(Ljava/lang/String;II)V", line = 533)
	public void method16768(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method16655(arg0, arg1, arg2, Class498.method29361() * Class630.aClass493_1.anInt5226 * -561404645);
	}

	@OriginalMember(owner = "client!akp", name = "n", descriptor = "()Lclient!hi;", line = 537)
	@Override
	public Class223 method16628() {
		return Class223.aClass223_1;
	}

	@OriginalMember(owner = "client!akp", name = "p", descriptor = "(I)Lclient!hi;", line = 537)
	@Override
	public Class223 method16615() {
		return Class223.aClass223_1;
	}

	@OriginalMember(owner = "client!akp", name = "e", descriptor = "()Lclient!hi;", line = 537)
	@Override
	public Class223 method16616() {
		return Class223.aClass223_1;
	}

	@OriginalMember(owner = "client!akp", name = "a", descriptor = "(I)I", line = 541)
	@Override
	public int method16622() {
		return this.anInt2355 * 144783765;
	}

	@OriginalMember(owner = "client!akp", name = "s", descriptor = "()I", line = 541)
	@Override
	public int method16629() {
		return this.anInt2355 * 144783765;
	}

	@OriginalMember(owner = "client!akp", name = "x", descriptor = "()I", line = 541)
	@Override
	public int method16620() {
		return this.anInt2355 * 144783765;
	}

	@OriginalMember(owner = "client!akp", name = "g", descriptor = "(B)Lclient!agq;", line = 545)
	@Override
	public Class3_Sub32 method16617() {
		@Pc(3) Class464 local3 = client.aClass370_1.method26942();
		return Class338.method26416(this.aByte101, (int) this.method21431().aClass320_61.aFloat259 + local3.anInt5071 * 439329280, -((int) this.method21431().aClass320_61.aFloat260), (int) this.method21431().aClass320_61.aFloat261 + local3.anInt5073 * 625123840);
	}

	@OriginalMember(owner = "client!akp", name = "u", descriptor = "()Lclient!agq;", line = 545)
	@Override
	public Class3_Sub32 method16621() {
		@Pc(3) Class464 local3 = client.aClass370_1.method26942();
		return Class338.method26416(this.aByte101, (int) this.method21431().aClass320_61.aFloat259 + local3.anInt5071 * 439329280, -((int) this.method21431().aClass320_61.aFloat260), (int) this.method21431().aClass320_61.aFloat261 + local3.anInt5073 * 625123840);
	}

	@OriginalMember(owner = "client!akp", name = "y", descriptor = "()Lclient!mx;", line = 550)
	@Override
	public Class335 method16623() {
		@Pc(1) Class335 local1 = Class335.method26300();
		local1.method26303(Class317.method25842(this.aClass106_7.anInt2990 * 1871843793), 0.0F, 0.0F);
		return local1;
	}

	@OriginalMember(owner = "client!akp", name = "l", descriptor = "(I)Lclient!mx;", line = 550)
	@Override
	public Class335 method16618() {
		@Pc(1) Class335 local1 = Class335.method26300();
		local1.method26303(Class317.method25842(this.aClass106_7.anInt2990 * 1871843793), 0.0F, 0.0F);
		return local1;
	}

	@OriginalMember(owner = "client!akp", name = "b", descriptor = "()Lclient!mx;", line = 550)
	@Override
	public Class335 method16624() {
		@Pc(1) Class335 local1 = Class335.method26300();
		local1.method26303(Class317.method25842(this.aClass106_7.anInt2990 * 1871843793), 0.0F, 0.0F);
		return local1;
	}

	@OriginalMember(owner = "client!akp", name = "c", descriptor = "()Lclient!mh;", line = 556)
	@Override
	public Class320 method16625() {
		return Class320.method25859();
	}

	@OriginalMember(owner = "client!akp", name = "z", descriptor = "()Lclient!mh;", line = 556)
	@Override
	public Class320 method16626() {
		return Class320.method25859();
	}

	@OriginalMember(owner = "client!akp", name = "j", descriptor = "()Lclient!mh;", line = 556)
	@Override
	public Class320 method16627() {
		return Class320.method25859();
	}

	@OriginalMember(owner = "client!akp", name = "h", descriptor = "(I)Lclient!mh;", line = 556)
	@Override
	public Class320 method16619() {
		return Class320.method25859();
	}

	@OriginalMember(owner = "client!akp", name = "cl", descriptor = "(I)I", line = 560)
	@Override
	public int method16726() {
		return -(this.anInt2355 * 144783765) - 1;
	}

	@OriginalMember(owner = "client!akp", name = "eu", descriptor = "()I", line = 560)
	@Override
	public int method16720() {
		return -(this.anInt2355 * 144783765) - 1;
	}

	@OriginalMember(owner = "client!akp", name = "eg", descriptor = "()I", line = 560)
	@Override
	public int method16721() {
		return -(this.anInt2355 * 144783765) - 1;
	}

	@OriginalMember(owner = "client!akp", name = "ur", descriptor = "(Lclient!vs;I)V", line = 7784)
	static final void method16769(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class424.aClass165_1.method23321(local12);
	}
}
