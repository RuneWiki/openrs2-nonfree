package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aep")
public class Class88_Sub3 extends Class88 {

	@OriginalMember(owner = "client!aep", name = "t", descriptor = "I")
	static final int anInt611 = -1694498816;

	@OriginalMember(owner = "client!aep", name = "x", descriptor = "I")
	static final int anInt612 = 2;

	@OriginalMember(owner = "client!aep", name = "q", descriptor = "I")
	static final int anInt613 = 1;

	@OriginalMember(owner = "client!aep", name = "ad", descriptor = "Z")
	static final boolean aBoolean109 = true;

	@OriginalMember(owner = "client!aep", name = "d", descriptor = "I")
	static final int anInt614 = 4;

	@OriginalMember(owner = "client!aep", name = "w", descriptor = "I")
	static final int anInt616 = 64;

	@OriginalMember(owner = "client!aep", name = "ac", descriptor = "Z")
	static final boolean aBoolean110 = true;

	@OriginalMember(owner = "client!aep", name = "av", descriptor = "Z")
	static final boolean aBoolean111 = false;

	@OriginalMember(owner = "client!aep", name = "g", descriptor = "[[Lclient!bv;")
	Class180[][] aClass180ArrayArray1;

	@OriginalMember(owner = "client!aep", name = "z", descriptor = "[[Lclient!ap;")
	Class153[][] aClass153ArrayArray1;

	@OriginalMember(owner = "client!aep", name = "j", descriptor = "[[Lclient!bc;")
	Class165[][] aClass165ArrayArray1;

	@OriginalMember(owner = "client!aep", name = "i", descriptor = "[[Lclient!bj;")
	Class171[][] aClass171ArrayArray1;

	@OriginalMember(owner = "client!aep", name = "k", descriptor = "[[Lclient!bb;")
	Class164[][] aClass164ArrayArray1;

	@OriginalMember(owner = "client!aep", name = "u", descriptor = "F")
	float aFloat37;

	@OriginalMember(owner = "client!aep", name = "f", descriptor = "F")
	float aFloat38;

	@OriginalMember(owner = "client!aep", name = "o", descriptor = "F")
	float aFloat39;

	@OriginalMember(owner = "client!aep", name = "b", descriptor = "F")
	float aFloat40;

	@OriginalMember(owner = "client!aep", name = "n", descriptor = "F")
	float aFloat41;

	@OriginalMember(owner = "client!aep", name = "au", descriptor = "F")
	float aFloat42;

	@OriginalMember(owner = "client!aep", name = "aj", descriptor = "F")
	float aFloat43;

	@OriginalMember(owner = "client!aep", name = "h", descriptor = "F")
	float aFloat44;

	@OriginalMember(owner = "client!aep", name = "ai", descriptor = "F")
	float aFloat45;

	@OriginalMember(owner = "client!aep", name = "ag", descriptor = "F")
	float aFloat46;

	@OriginalMember(owner = "client!aep", name = "al", descriptor = "F")
	float aFloat47;

	@OriginalMember(owner = "client!aep", name = "ao", descriptor = "F")
	float aFloat48;

	@OriginalMember(owner = "client!aep", name = "a", descriptor = "F")
	float aFloat49;

	@OriginalMember(owner = "client!aep", name = "m", descriptor = "F")
	float aFloat50;

	@OriginalMember(owner = "client!aep", name = "ak", descriptor = "F")
	float aFloat51;

	@OriginalMember(owner = "client!aep", name = "e", descriptor = "F")
	float aFloat52;

	@OriginalMember(owner = "client!aep", name = "s", descriptor = "Lclient!aeh;")
	final Class86_Sub2 aClass86_Sub2_3;

	@OriginalMember(owner = "client!aep", name = "r", descriptor = "I")
	final int anInt615;

	@OriginalMember(owner = "client!aep", name = "ax", descriptor = "[[B")
	byte[][] aByteArrayArray6;

	@OriginalMember(owner = "client!aep", name = "ar", descriptor = "[[B")
	byte[][] aByteArrayArray7;

	@OriginalMember(owner = "client!aep", name = "<init>", descriptor = "(Lclient!aeh;IIII[[I[[II)V", line = 46)
	Class88_Sub3(@OriginalArg(0) Class86_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass86_Sub2_3 = arg0;
		this.anInt615 = arg2;
		this.aByteArrayArray6 = new byte[arg3 + 1][arg4 + 1];
		@Pc(28) int local28 = this.aClass86_Sub2_3.anInt545 * -1021814047 >> 9;
		for (@Pc(30) int local30 = 1; local30 < arg4; local30++) {
			for (@Pc(35) int local35 = 1; local35 < arg3; local35++) {
				@Pc(56) int local56 = arg6[local35 + 1][local30] - arg6[local35 - 1][local30];
				@Pc(72) int local72 = arg6[local35][local30 + 1] - arg6[local35][local30 - 1];
				@Pc(87) int local87 = (int) Math.sqrt((double) (local56 * local56 + arg7 * 512 + local72 * local72));
				@Pc(93) int local93 = (local56 << 8) / local87;
				@Pc(99) int local99 = arg7 * -512 / local87;
				@Pc(105) int local105 = (local72 << 8) / local87;
				@Pc(133) int local133 = local28 + (this.aClass86_Sub2_3.anInt546 * 845036313 * local93 + this.aClass86_Sub2_3.anInt543 * 1141856477 * local99 + this.aClass86_Sub2_3.anInt544 * 568046319 * local105 >> 17);
				local133 >>= 0x1;
				if (local133 < 2) {
					local133 = 2;
				} else if (local133 > 126) {
					local133 = 126;
				}
				this.aByteArrayArray6[local35][local30] = (byte) local133;
			}
		}
		this.aByteArrayArray7 = new byte[arg3 + 1][arg4 + 1];
	}

	@OriginalMember(owner = "client!aep", name = "p", descriptor = "(III)V", line = 71)
	@Override
	public void method5508(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int local9 = Math.min(this.aByteArrayArray7.length - 1, Math.max(0, arg0));
		@Pc(21) int local21 = Math.min(this.aByteArrayArray7[local9].length - 1, Math.max(0, arg1));
		if (this.aByteArrayArray7[local9][local21] < arg2) {
			this.aByteArrayArray7[local9][local21] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!aep", name = "k", descriptor = "(III)V", line = 71)
	@Override
	public void method5521(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int local9 = Math.min(this.aByteArrayArray7.length - 1, Math.max(0, arg0));
		@Pc(21) int local21 = Math.min(this.aByteArrayArray7[local9].length - 1, Math.max(0, arg1));
		if (this.aByteArrayArray7[local9][local21] < arg2) {
			this.aByteArrayArray7[local9][local21] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!aep", name = "u", descriptor = "(III)V", line = 71)
	@Override
	public void method5522(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int local9 = Math.min(this.aByteArrayArray7.length - 1, Math.max(0, arg0));
		@Pc(21) int local21 = Math.min(this.aByteArrayArray7[local9].length - 1, Math.max(0, arg1));
		if (this.aByteArrayArray7[local9][local21] < arg2) {
			this.aByteArrayArray7[local9][local21] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!aep", name = "e", descriptor = "(III)V", line = 71)
	@Override
	public void method5523(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int local9 = Math.min(this.aByteArrayArray7.length - 1, Math.max(0, arg0));
		@Pc(21) int local21 = Math.min(this.aByteArrayArray7[local9].length - 1, Math.max(0, arg1));
		if (this.aByteArrayArray7[local9][local21] < arg2) {
			this.aByteArrayArray7[local9][local21] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!aep", name = "i", descriptor = "(III)V", line = 71)
	@Override
	public void method5525(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int local9 = Math.min(this.aByteArrayArray7.length - 1, Math.max(0, arg0));
		@Pc(21) int local21 = Math.min(this.aByteArrayArray7[local9].length - 1, Math.max(0, arg1));
		if (this.aByteArrayArray7[local9][local21] < arg2) {
			this.aByteArrayArray7[local9][local21] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!aep", name = "f", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[ILclient!db;Z)V", line = 77)
	@Override
	public void method5524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) Class202 arg13, @OriginalArg(14) boolean arg14) {
		if (this.aClass180ArrayArray1 == null) {
			this.aClass180ArrayArray1 = new Class180[this.anInt607 * -1924295585][this.anInt606 * -1466328823];
			this.aClass153ArrayArray1 = new Class153[this.anInt607 * -1924295585][this.anInt606 * -1466328823];
		} else if (this.aClass165ArrayArray1 != null || this.aClass164ArrayArray1 != null) {
			throw new IllegalStateException();
		}
		@Pc(37) boolean local37 = false;
		@Pc(77) int local77;
		@Pc(83) int local83;
		if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
			local37 = true;
			for (@Pc(68) int local68 = 1; local68 < 2; local68++) {
				local77 = arg2[arg6[local68]];
				local83 = arg4[arg6[local68]];
				if (local77 != 0 && local77 != this.anInt608 * 127780559 || local83 != 0 && local83 != this.anInt608 * 127780559) {
					local37 = false;
					break;
				}
			}
		}
		if (!local37) {
			@Pc(110) Class153 local110 = new Class153();
			@Pc(114) short local114 = (short) arg2.length;
			@Pc(118) short local118 = (short) arg9.length;
			local110.aShort102 = local114;
			local110.aShortArray59 = new short[local114];
			local110.aShortArray53 = new short[local114];
			local110.aShortArray54 = new short[local114];
			local110.aShortArray55 = new short[local114];
			@Pc(146) int local146;
			@Pc(150) int local150;
			@Pc(315) int local315;
			for (@Pc(139) int local139 = 0; local139 < local114; local139++) {
				local146 = arg2[local139];
				local150 = arg4[local139];
				@Pc(364) int local364;
				if (local146 == 0 && local150 == 0) {
					local110.aShortArray59[local139] = (short) (this.aByteArrayArray6[arg0][arg1] - this.aByteArrayArray7[arg0][arg1]);
				} else if (local146 == 0 && local150 == this.anInt608 * 127780559) {
					local110.aShortArray59[local139] = (short) (this.aByteArrayArray6[arg0][arg1 + 1] - this.aByteArrayArray7[arg0][arg1 + 1]);
				} else if (local146 == this.anInt608 * 127780559 && local150 == this.anInt608 * 127780559) {
					local110.aShortArray59[local139] = (short) (this.aByteArrayArray6[arg0 + 1][arg1 + 1] - this.aByteArrayArray7[arg0 + 1][arg1 + 1]);
				} else if (local146 == this.anInt608 * 127780559 && local150 == 0) {
					local110.aShortArray59[local139] = (short) (this.aByteArrayArray6[arg0 + 1][arg1] - this.aByteArrayArray7[arg0 + 1][arg1]);
				} else {
					local315 = (this.aByteArrayArray6[arg0][arg1] - this.aByteArrayArray7[arg0][arg1]) * (this.anInt608 * 127780559 - local146) + (this.aByteArrayArray6[arg0 + 1][arg1] - this.aByteArrayArray7[arg0 + 1][arg1]) * local146;
					local364 = (this.aByteArrayArray6[arg0][arg1 + 1] - this.aByteArrayArray7[arg0][arg1 + 1]) * (this.anInt608 * 127780559 - local146) + (this.aByteArrayArray6[arg0 + 1][arg1 + 1] - this.aByteArrayArray7[arg0 + 1][arg1 + 1]) * local146;
					local110.aShortArray59[local139] = (short) (local315 * (this.anInt608 * 127780559 - local150) + local364 * local150 >> this.anInt609 * 1304764278);
				}
				local315 = (arg0 << this.anInt609 * -1495101509) + local146;
				local364 = (arg1 << this.anInt609 * -1495101509) + local150;
				local110.aShortArray53[local139] = (short) local146;
				local110.aShortArray55[local139] = (short) local150;
				local110.aShortArray54[local139] = (short) (this.method5493(local315, local364) + (arg3 == null ? 0 : arg3[local139]));
				if (local110.aShortArray59[local139] < 2) {
					local110.aShortArray59[local139] = 2;
				}
			}
			@Pc(449) boolean local449 = false;
			local146 = 0;
			for (local150 = 0; local150 < local118; local150++) {
				if (arg9[local150] >= 0 || arg10 != null && arg10[local150] >= 0) {
					local146++;
				}
				local315 = arg11[local150];
				if (local315 != -1) {
					@Pc(482) Class215 local482 = this.aClass86_Sub2_3.aClass209_9.method25584(local315);
					if (!local482.aBoolean641) {
						local449 = true;
						if (this.method5560(local482.aByte118) || local482.aByte113 != 0 || local482.aByte114 != 0) {
							local110.aByte58 = (byte) (local110.aByte58 | 0x4);
						}
					}
				}
			}
			local110.anIntArray233 = new int[local146];
			if (arg10 != null) {
				local110.anIntArray232 = new int[local146];
			}
			local110.aShortArray56 = new short[local146];
			local110.aShortArray57 = new short[local146];
			local110.aShortArray58 = new short[local146];
			if (local449) {
				local110.aShortArray52 = new short[local146];
				local110.aShortArray60 = new short[local146];
			}
			for (local150 = 0; local150 < local118; local150++) {
				if (arg9[local150] >= 0 || arg10 != null && arg10[local150] >= 0) {
					if (arg9[local150] >= 0) {
						local110.anIntArray233[local110.aShort103] = Class340.method27746(arg9[local150]);
					} else {
						local110.anIntArray233[local110.aShort103] = -1;
					}
					if (arg10 != null) {
						if (arg10[local150] == -1) {
							local110.anIntArray232[local110.aShort103] = -1;
						} else {
							local110.anIntArray232[local110.aShort103] = Class340.method27746(arg10[local150]);
						}
					}
					local110.aShortArray56[local110.aShort103] = (short) arg6[local150];
					local110.aShortArray57[local110.aShort103] = (short) arg7[local150];
					local110.aShortArray58[local110.aShort103] = (short) arg8[local150];
					if (local449) {
						if (arg11[local150] == -1 || this.aClass86_Sub2_3.aClass209_9.method25584(arg11[local150]).aBoolean641) {
							local110.aShortArray52[local110.aShort103] = -1;
						} else {
							local110.aShortArray52[local110.aShort103] = (short) arg11[local150];
							local110.aShortArray60[local110.aShort103] = (short) arg12[local150];
						}
					}
					local110.aShort103++;
				}
			}
			this.aClass153ArrayArray1[arg0][arg1] = local110;
		} else if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
			@Pc(700) Class180 local700 = new Class180();
			local77 = arg9[0];
			local83 = arg11[0];
			if (arg10 != null) {
				local700.anInt3313 = Class186.method24627(Class340.method27746(arg10[0]), this.aByteArrayArray6[arg0][arg1] - this.aByteArrayArray7[arg0][arg1]);
				if (local77 == -1) {
					local700.aByte108 = (byte) (local700.aByte108 | 0x2);
				}
			}
			if (this.anIntArrayArray10[arg0][arg1] == this.anIntArrayArray10[arg0 + 1][arg1] && this.anIntArrayArray10[arg0][arg1] == this.anIntArrayArray10[arg0 + 1][arg1 + 1] && this.anIntArrayArray10[arg0][arg1] == this.anIntArrayArray10[arg0][arg1 + 1]) {
				local700.aByte108 = (byte) (local700.aByte108 | 0x1);
			}
			@Pc(798) Class215 local798 = null;
			if (local83 != -1) {
				local798 = this.aClass86_Sub2_3.aClass209_9.method25584(local83);
			}
			if (local798 == null || (local700.aByte108 & 0x2) != 0 || local798.aBoolean641) {
				@Pc(925) short local925 = Class340.method27746(local77);
				local700.aShort146 = (short) Class186.method24627(local925, this.aByteArrayArray6[arg0][arg1] - this.aByteArrayArray7[arg0][arg1]);
				local700.aShort150 = (short) Class186.method24627(local925, this.aByteArrayArray6[arg0 + 1][arg1] - this.aByteArrayArray7[arg0 + 1][arg1]);
				local700.aShort148 = (short) Class186.method24627(local925, this.aByteArrayArray6[arg0 + 1][arg1 + 1] - this.aByteArrayArray7[arg0 + 1][arg1 + 1]);
				local700.aShort149 = (short) Class186.method24627(local925, this.aByteArrayArray6[arg0][arg1 + 1] - this.aByteArrayArray7[arg0][arg1 + 1]);
				local700.aShort147 = -1;
			} else {
				local700.aShort146 = (short) (this.aByteArrayArray6[arg0][arg1] - this.aByteArrayArray7[arg0][arg1]);
				local700.aShort150 = (short) (this.aByteArrayArray6[arg0 + 1][arg1] - this.aByteArrayArray7[arg0 + 1][arg1]);
				local700.aShort148 = (short) (this.aByteArrayArray6[arg0 + 1][arg1 + 1] - this.aByteArrayArray7[arg0 + 1][arg1 + 1]);
				local700.aShort149 = (short) (this.aByteArrayArray6[arg0][arg1 + 1] - this.aByteArrayArray7[arg0][arg1 + 1]);
				local700.aShort147 = (short) local83;
				if (this.method5560(local798.aByte118) || local798.aByte113 != 0 || local798.aByte114 != 0) {
					local700.aByte108 = (byte) (local700.aByte108 | 0x4);
				}
			}
			this.aClass180ArrayArray1[arg0][arg1] = local700;
		}
	}

	@OriginalMember(owner = "client!aep", name = "v", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[ILclient!db;Z)V", line = 77)
	@Override
	public void method5510(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) Class202 arg13, @OriginalArg(14) boolean arg14) {
		if (this.aClass180ArrayArray1 == null) {
			this.aClass180ArrayArray1 = new Class180[this.anInt607 * -1924295585][this.anInt606 * -1466328823];
			this.aClass153ArrayArray1 = new Class153[this.anInt607 * -1924295585][this.anInt606 * -1466328823];
		} else if (this.aClass165ArrayArray1 != null || this.aClass164ArrayArray1 != null) {
			throw new IllegalStateException();
		}
		@Pc(37) boolean local37 = false;
		@Pc(77) int local77;
		@Pc(83) int local83;
		if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
			local37 = true;
			for (@Pc(68) int local68 = 1; local68 < 2; local68++) {
				local77 = arg2[arg6[local68]];
				local83 = arg4[arg6[local68]];
				if (local77 != 0 && local77 != this.anInt608 * 127780559 || local83 != 0 && local83 != this.anInt608 * 127780559) {
					local37 = false;
					break;
				}
			}
		}
		if (!local37) {
			@Pc(110) Class153 local110 = new Class153();
			@Pc(114) short local114 = (short) arg2.length;
			@Pc(118) short local118 = (short) arg9.length;
			local110.aShort102 = local114;
			local110.aShortArray59 = new short[local114];
			local110.aShortArray53 = new short[local114];
			local110.aShortArray54 = new short[local114];
			local110.aShortArray55 = new short[local114];
			@Pc(146) int local146;
			@Pc(150) int local150;
			@Pc(315) int local315;
			for (@Pc(139) int local139 = 0; local139 < local114; local139++) {
				local146 = arg2[local139];
				local150 = arg4[local139];
				@Pc(364) int local364;
				if (local146 == 0 && local150 == 0) {
					local110.aShortArray59[local139] = (short) (this.aByteArrayArray6[arg0][arg1] - this.aByteArrayArray7[arg0][arg1]);
				} else if (local146 == 0 && local150 == this.anInt608 * 127780559) {
					local110.aShortArray59[local139] = (short) (this.aByteArrayArray6[arg0][arg1 + 1] - this.aByteArrayArray7[arg0][arg1 + 1]);
				} else if (local146 == this.anInt608 * 127780559 && local150 == this.anInt608 * 127780559) {
					local110.aShortArray59[local139] = (short) (this.aByteArrayArray6[arg0 + 1][arg1 + 1] - this.aByteArrayArray7[arg0 + 1][arg1 + 1]);
				} else if (local146 == this.anInt608 * 127780559 && local150 == 0) {
					local110.aShortArray59[local139] = (short) (this.aByteArrayArray6[arg0 + 1][arg1] - this.aByteArrayArray7[arg0 + 1][arg1]);
				} else {
					local315 = (this.aByteArrayArray6[arg0][arg1] - this.aByteArrayArray7[arg0][arg1]) * (this.anInt608 * 127780559 - local146) + (this.aByteArrayArray6[arg0 + 1][arg1] - this.aByteArrayArray7[arg0 + 1][arg1]) * local146;
					local364 = (this.aByteArrayArray6[arg0][arg1 + 1] - this.aByteArrayArray7[arg0][arg1 + 1]) * (this.anInt608 * 127780559 - local146) + (this.aByteArrayArray6[arg0 + 1][arg1 + 1] - this.aByteArrayArray7[arg0 + 1][arg1 + 1]) * local146;
					local110.aShortArray59[local139] = (short) (local315 * (this.anInt608 * 127780559 - local150) + local364 * local150 >> this.anInt609 * 1304764278);
				}
				local315 = (arg0 << this.anInt609 * -1495101509) + local146;
				local364 = (arg1 << this.anInt609 * -1495101509) + local150;
				local110.aShortArray53[local139] = (short) local146;
				local110.aShortArray55[local139] = (short) local150;
				local110.aShortArray54[local139] = (short) (this.method5493(local315, local364) + (arg3 == null ? 0 : arg3[local139]));
				if (local110.aShortArray59[local139] < 2) {
					local110.aShortArray59[local139] = 2;
				}
			}
			@Pc(449) boolean local449 = false;
			local146 = 0;
			for (local150 = 0; local150 < local118; local150++) {
				if (arg9[local150] >= 0 || arg10 != null && arg10[local150] >= 0) {
					local146++;
				}
				local315 = arg11[local150];
				if (local315 != -1) {
					@Pc(482) Class215 local482 = this.aClass86_Sub2_3.aClass209_9.method25584(local315);
					if (!local482.aBoolean641) {
						local449 = true;
						if (this.method5560(local482.aByte118) || local482.aByte113 != 0 || local482.aByte114 != 0) {
							local110.aByte58 = (byte) (local110.aByte58 | 0x4);
						}
					}
				}
			}
			local110.anIntArray233 = new int[local146];
			if (arg10 != null) {
				local110.anIntArray232 = new int[local146];
			}
			local110.aShortArray56 = new short[local146];
			local110.aShortArray57 = new short[local146];
			local110.aShortArray58 = new short[local146];
			if (local449) {
				local110.aShortArray52 = new short[local146];
				local110.aShortArray60 = new short[local146];
			}
			for (local150 = 0; local150 < local118; local150++) {
				if (arg9[local150] >= 0 || arg10 != null && arg10[local150] >= 0) {
					if (arg9[local150] >= 0) {
						local110.anIntArray233[local110.aShort103] = Class340.method27746(arg9[local150]);
					} else {
						local110.anIntArray233[local110.aShort103] = -1;
					}
					if (arg10 != null) {
						if (arg10[local150] == -1) {
							local110.anIntArray232[local110.aShort103] = -1;
						} else {
							local110.anIntArray232[local110.aShort103] = Class340.method27746(arg10[local150]);
						}
					}
					local110.aShortArray56[local110.aShort103] = (short) arg6[local150];
					local110.aShortArray57[local110.aShort103] = (short) arg7[local150];
					local110.aShortArray58[local110.aShort103] = (short) arg8[local150];
					if (local449) {
						if (arg11[local150] == -1 || this.aClass86_Sub2_3.aClass209_9.method25584(arg11[local150]).aBoolean641) {
							local110.aShortArray52[local110.aShort103] = -1;
						} else {
							local110.aShortArray52[local110.aShort103] = (short) arg11[local150];
							local110.aShortArray60[local110.aShort103] = (short) arg12[local150];
						}
					}
					local110.aShort103++;
				}
			}
			this.aClass153ArrayArray1[arg0][arg1] = local110;
		} else if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
			@Pc(700) Class180 local700 = new Class180();
			local77 = arg9[0];
			local83 = arg11[0];
			if (arg10 != null) {
				local700.anInt3313 = Class186.method24627(Class340.method27746(arg10[0]), this.aByteArrayArray6[arg0][arg1] - this.aByteArrayArray7[arg0][arg1]);
				if (local77 == -1) {
					local700.aByte108 = (byte) (local700.aByte108 | 0x2);
				}
			}
			if (this.anIntArrayArray10[arg0][arg1] == this.anIntArrayArray10[arg0 + 1][arg1] && this.anIntArrayArray10[arg0][arg1] == this.anIntArrayArray10[arg0 + 1][arg1 + 1] && this.anIntArrayArray10[arg0][arg1] == this.anIntArrayArray10[arg0][arg1 + 1]) {
				local700.aByte108 = (byte) (local700.aByte108 | 0x1);
			}
			@Pc(798) Class215 local798 = null;
			if (local83 != -1) {
				local798 = this.aClass86_Sub2_3.aClass209_9.method25584(local83);
			}
			if (local798 == null || (local700.aByte108 & 0x2) != 0 || local798.aBoolean641) {
				@Pc(925) short local925 = Class340.method27746(local77);
				local700.aShort146 = (short) Class186.method24627(local925, this.aByteArrayArray6[arg0][arg1] - this.aByteArrayArray7[arg0][arg1]);
				local700.aShort150 = (short) Class186.method24627(local925, this.aByteArrayArray6[arg0 + 1][arg1] - this.aByteArrayArray7[arg0 + 1][arg1]);
				local700.aShort148 = (short) Class186.method24627(local925, this.aByteArrayArray6[arg0 + 1][arg1 + 1] - this.aByteArrayArray7[arg0 + 1][arg1 + 1]);
				local700.aShort149 = (short) Class186.method24627(local925, this.aByteArrayArray6[arg0][arg1 + 1] - this.aByteArrayArray7[arg0][arg1 + 1]);
				local700.aShort147 = -1;
			} else {
				local700.aShort146 = (short) (this.aByteArrayArray6[arg0][arg1] - this.aByteArrayArray7[arg0][arg1]);
				local700.aShort150 = (short) (this.aByteArrayArray6[arg0 + 1][arg1] - this.aByteArrayArray7[arg0 + 1][arg1]);
				local700.aShort148 = (short) (this.aByteArrayArray6[arg0 + 1][arg1 + 1] - this.aByteArrayArray7[arg0 + 1][arg1 + 1]);
				local700.aShort149 = (short) (this.aByteArrayArray6[arg0][arg1 + 1] - this.aByteArrayArray7[arg0][arg1 + 1]);
				local700.aShort147 = (short) local83;
				if (this.method5560(local798.aByte118) || local798.aByte113 != 0 || local798.aByte114 != 0) {
					local700.aByte108 = (byte) (local700.aByte108 | 0x4);
				}
			}
			this.aClass180ArrayArray1[arg0][arg1] = local700;
		}
	}

	@OriginalMember(owner = "client!aep", name = "c", descriptor = "(II[I[I[I[I[I[I[I[ILclient!db;Z)V", line = 209)
	@Override
	public void method5509(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) Class202 arg10, @OriginalArg(11) boolean arg11) {
		@Pc(8) boolean local8 = (this.anInt615 & 0x20) == 0;
		if (this.aClass165ArrayArray1 == null && !local8) {
			this.aClass165ArrayArray1 = new Class165[this.anInt607 * -1924295585][this.anInt606 * -1466328823];
			this.aClass171ArrayArray1 = new Class171[this.anInt607 * -1924295585][this.anInt606 * -1466328823];
		} else if (this.aClass164ArrayArray1 == null && local8) {
			this.aClass164ArrayArray1 = new Class164[this.anInt607 * -1924295585][this.anInt606 * -1466328823];
		} else if (this.aClass180ArrayArray1 != null) {
			throw new IllegalStateException();
		}
		if (arg2 == null || arg2.length == 0) {
			return;
		}
		@Pc(68) int local68;
		for (local68 = 0; local68 < arg6.length; local68++) {
			if (arg6[local68] == -1) {
				arg6[local68] = 0;
			} else {
				arg6[local68] = Class424.anIntArray462[Class340.method27746(arg6[local68]) & 0xFFFF] << 8 | 0xFF;
			}
		}
		if (arg7 != null) {
			for (local68 = 0; local68 < arg7.length; local68++) {
				if (arg7[local68] == -1) {
					arg7[local68] = 0;
				} else {
					arg7[local68] = Class424.anIntArray462[Class340.method27746(arg7[local68]) & 0xFFFF] << 8 | 0xFF;
				}
			}
		}
		@Pc(198) int local198;
		@Pc(206) int local206;
		@Pc(210) int local210;
		@Pc(361) int local361;
		@Pc(410) int local410;
		@Pc(500) int local500;
		@Pc(230) int local230;
		@Pc(538) int local538;
		if (local8) {
			@Pc(142) Class164 local142 = new Class164();
			local142.aShort136 = (short) arg2.length;
			local142.aShort137 = (short) (arg2.length / 3);
			local142.aShortArray72 = new short[local142.aShort136];
			local142.aShortArray76 = new short[local142.aShort136];
			local142.aShortArray73 = new short[local142.aShort136];
			local142.anIntArray306 = new int[local142.aShort136];
			local142.aShortArray74 = new short[local142.aShort136];
			local142.aShortArray75 = new short[local142.aShort136];
			local142.aByteArray57 = new byte[local142.aShort136];
			if (arg5 != null) {
				local142.aShortArray71 = new short[local142.aShort136];
			}
			for (local198 = 0; local198 < local142.aShort136; local198++) {
				local206 = arg2[local198];
				local210 = arg4[local198];
				@Pc(212) boolean local212 = false;
				if (local206 == 0 && local210 == 0) {
					local230 = this.aByteArrayArray6[arg0][arg1] - this.aByteArrayArray7[arg0][arg1];
				} else if (local206 == 0 && local210 == this.anInt608 * 127780559) {
					local230 = this.aByteArrayArray6[arg0][arg1 + 1] - this.aByteArrayArray7[arg0][arg1 + 1];
				} else if (local206 == this.anInt608 * 127780559 && local210 == this.anInt608 * 127780559) {
					local230 = this.aByteArrayArray6[arg0 + 1][arg1 + 1] - this.aByteArrayArray7[arg0 + 1][arg1 + 1];
				} else if (local206 == this.anInt608 * 127780559 && local210 == 0) {
					local230 = this.aByteArrayArray6[arg0 + 1][arg1] - this.aByteArrayArray7[arg0 + 1][arg1];
				} else {
					local361 = (this.aByteArrayArray6[arg0][arg1] - this.aByteArrayArray7[arg0][arg1]) * (this.anInt608 * 127780559 - local206) + (this.aByteArrayArray6[arg0 + 1][arg1] - this.aByteArrayArray7[arg0 + 1][arg1]) * local206;
					local410 = (this.aByteArrayArray6[arg0][arg1 + 1] - this.aByteArrayArray7[arg0][arg1 + 1]) * (this.anInt608 * 127780559 - local206) + (this.aByteArrayArray6[arg0 + 1][arg1 + 1] - this.aByteArrayArray7[arg0 + 1][arg1 + 1]) * local206;
					local230 = local361 * (this.anInt608 * 127780559 - local210) + local410 * local210 >> this.anInt609 * 1304764278;
				}
				local361 = (arg0 << this.anInt609 * -1495101509) + local206;
				local410 = (arg1 << this.anInt609 * -1495101509) + local210;
				local142.aShortArray72[local198] = (short) local206;
				local142.aShortArray73[local198] = (short) local210;
				local142.aShortArray76[local198] = (short) (this.method5493(local361, local410) + (arg3 == null ? 0 : arg3[local198]));
				if (local230 < 0) {
					local230 = 0;
				}
				if (arg6[local198] == 0) {
					local142.anIntArray306[local198] = 0;
					if (arg7 != null) {
						local142.aByteArray57[local198] = (byte) local230;
					}
				} else {
					local500 = 0;
					if (arg5 != null) {
						@Pc(512) short local512 = local142.aShortArray71[local198] = (short) arg5[local198];
						if (arg10.anInt3553 * -1095140607 != 0) {
							local500 = local512 * 255 / (arg10.anInt3553 * -1095140607);
							if (local500 < 0) {
								local500 = 0;
							} else if (local500 > 255) {
								local500 = 255;
							}
						}
					}
					local538 = -16777216;
					if (arg8[local198] != -1) {
						@Pc(552) Class215 local552 = this.aClass86_Sub2_3.aClass209_9.method25584(arg8[local198]);
						if (local552.aBoolean638 && this.method5560(local552.aByte118)) {
							local538 = -1694498816;
						}
					}
					local142.anIntArray306[local198] = local538 | Class227.method25798(method5548(arg6[local198] >> 8, local230), arg10.anInt3554 * 2113275141, local500);
					if (arg7 != null) {
						local142.aByteArray57[local198] = (byte) local230;
					}
				}
				local142.aShortArray74[local198] = (short) arg8[local198];
				local142.aShortArray75[local198] = (short) arg9[local198];
			}
			if (arg7 != null) {
				local142.anIntArray307 = new int[local142.aShort137];
				for (local198 = 0; local198 < local142.aShort137; local198++) {
					local206 = local198 * 3;
					if (arg7[local206] != 0) {
						local142.anIntArray307[local198] = arg7[local206] >> 8 | 0xFF000000;
					}
				}
			}
			this.aClass164ArrayArray1[arg0][arg1] = local142;
			return;
		}
		@Pc(652) boolean local652 = true;
		local198 = -1;
		local206 = -1;
		local210 = -1;
		local230 = -1;
		if (arg2.length == 6) {
			for (local361 = 0; local361 < 6; local361++) {
				if (arg2[local361] == 0 && arg4[local361] == 0) {
					if (local198 != -1 && arg6[local198] != arg6[local361]) {
						local652 = false;
						break;
					}
					local198 = local361;
				} else if (arg2[local361] == this.anInt608 * 127780559 && arg4[local361] == 0) {
					if (local206 != -1 && arg6[local206] != arg6[local361]) {
						local652 = false;
						break;
					}
					local206 = local361;
				} else if (arg2[local361] == this.anInt608 * 127780559 && arg4[local361] == this.anInt608 * 127780559) {
					if (local210 != -1 && arg6[local210] != arg6[local361]) {
						local652 = false;
						break;
					}
					local210 = local361;
				} else if (arg2[local361] == 0 && arg4[local361] == this.anInt608 * 127780559) {
					if (local230 != -1 && arg6[local230] != arg6[local361]) {
						local652 = false;
						break;
					}
					local230 = local361;
				}
			}
			if (local198 == -1 || local206 == -1 || local210 == -1 || local230 == -1) {
				local652 = false;
			}
			if (local652) {
				if (arg3 != null) {
					for (local361 = 0; local361 < 4; local361++) {
						if (arg3[local361] != 0) {
							local652 = false;
							break;
						}
					}
				}
				if (local652) {
					for (local361 = 1; local361 < 4; local361++) {
						if (arg2[local361] != arg2[0] && arg2[local361] != arg2[0] + this.anInt608 * 127780559 && arg2[local361] != arg2[0] - this.anInt608 * 127780559) {
							local652 = false;
							break;
						}
						if (arg4[local361] != arg4[0] && arg4[local361] != arg4[0] + this.anInt608 * 127780559 && arg4[local361] != arg4[0] - this.anInt608 * 127780559) {
							local652 = false;
							break;
						}
					}
				}
			}
		} else {
			local652 = false;
		}
		if (!local652) {
			@Pc(1753) Class171 local1753 = new Class171();
			local1753.aShort143 = (short) arg2.length;
			local1753.aShort144 = (short) (arg2.length / 3);
			local1753.aShortArray77 = new short[local1753.aShort143];
			local1753.aShortArray79 = new short[local1753.aShort143];
			local1753.aShortArray80 = new short[local1753.aShort143];
			local1753.anIntArray309 = new int[local1753.aShort143];
			if (arg5 != null) {
				local1753.aShortArray78 = new short[local1753.aShort143];
			}
			@Pc(1957) int local1957;
			@Pc(1826) int local1826;
			for (local410 = 0; local410 < local1753.aShort143; local410++) {
				local500 = arg2[local410];
				local538 = arg4[local410];
				@Pc(1808) boolean local1808 = false;
				@Pc(2006) int local2006;
				if (local500 == 0 && local538 == 0) {
					local1826 = this.aByteArrayArray6[arg0][arg1] - this.aByteArrayArray7[arg0][arg1];
				} else if (local500 == 0 && local538 == this.anInt608 * 127780559) {
					local1826 = this.aByteArrayArray6[arg0][arg1 + 1] - this.aByteArrayArray7[arg0][arg1 + 1];
				} else if (local500 == this.anInt608 * 127780559 && local538 == this.anInt608 * 127780559) {
					local1826 = this.aByteArrayArray6[arg0 + 1][arg1 + 1] - this.aByteArrayArray7[arg0 + 1][arg1 + 1];
				} else if (local500 == this.anInt608 * 127780559 && local538 == 0) {
					local1826 = this.aByteArrayArray6[arg0 + 1][arg1] - this.aByteArrayArray7[arg0 + 1][arg1];
				} else {
					local1957 = (this.aByteArrayArray6[arg0][arg1] - this.aByteArrayArray7[arg0][arg1]) * (this.anInt608 * 127780559 - local500) + (this.aByteArrayArray6[arg0 + 1][arg1] - this.aByteArrayArray7[arg0 + 1][arg1]) * local500;
					local2006 = (this.aByteArrayArray6[arg0][arg1 + 1] - this.aByteArrayArray7[arg0][arg1 + 1]) * (this.anInt608 * 127780559 - local500) + (this.aByteArrayArray6[arg0 + 1][arg1 + 1] - this.aByteArrayArray7[arg0 + 1][arg1 + 1]) * local500;
					local1826 = local1957 * (this.anInt608 * 127780559 - local538) + local2006 * local538 >> this.anInt609 * 1304764278;
				}
				local1957 = (arg0 << this.anInt609 * -1495101509) + local500;
				local2006 = (arg1 << this.anInt609 * -1495101509) + local538;
				local1753.aShortArray77[local410] = (short) local500;
				local1753.aShortArray80[local410] = (short) local538;
				local1753.aShortArray79[local410] = (short) (this.method5493(local1957, local2006) + (arg3 == null ? 0 : arg3[local410]));
				if (local1826 < 0) {
					local1826 = 0;
				}
				if (arg6[local410] != 0) {
					@Pc(2098) int local2098 = 0;
					if (arg5 != null) {
						@Pc(2110) short local2110 = local1753.aShortArray78[local410] = (short) arg5[local410];
						if (arg10.anInt3553 * -1095140607 != 0) {
							local2098 = local2110 * 255 / (arg10.anInt3553 * -1095140607);
							if (local2098 < 0) {
								local2098 = 0;
							} else if (local2098 > 255) {
								local2098 = 255;
							}
						}
					}
					local1753.anIntArray309[local410] = Class227.method25798(method5548(arg6[local410] >> 8, local1826), arg10.anInt3554 * 2113275141, local2098);
					if (arg7 != null) {
						local1753.anIntArray309[local410] |= local1826 << 25;
					}
				} else if (arg7 == null) {
					local1753.anIntArray309[local410] = 0;
				} else {
					local1753.anIntArray309[local410] = local1826 << 25;
				}
			}
			@Pc(2168) boolean local2168 = false;
			for (local500 = 0; local500 < local1753.aShort144; local500++) {
				if (arg8[local500 * 3] != -1 && !this.aClass86_Sub2_3.aClass209_9.method25584(arg8[local500 * 3]).aBoolean641) {
					local2168 = true;
				}
			}
			if (arg7 != null) {
				local1753.anIntArray310 = new int[local1753.aShort144];
			}
			if (local2168) {
				local1753.aShortArray81 = new short[local1753.aShort144];
				local1753.aShortArray82 = new short[local1753.aShort144];
			}
			for (local500 = 0; local500 < local1753.aShort144; local500++) {
				local538 = local500 * 3;
				if (arg7 != null && arg7[local538] != 0) {
					local1753.anIntArray310[local500] = arg7[local538] >> 8;
				}
				if (local2168) {
					local1826 = local538 + 1;
					local1957 = local1826 + 1;
					@Pc(2253) boolean local2253 = false;
					@Pc(2255) boolean local2255 = true;
					@Pc(2259) int local2259 = arg8[local538];
					if (local2259 == -1 || this.aClass86_Sub2_3.aClass209_9.method25584(local2259).aBoolean641) {
						local2255 = false;
					} else {
						local2253 = true;
					}
					local2259 = arg8[local1826];
					if (local2259 == -1 || this.aClass86_Sub2_3.aClass209_9.method25584(local2259).aBoolean641) {
						local2255 = false;
					} else {
						local2253 = true;
					}
					local2259 = arg8[local1957];
					if (local2259 == -1 || this.aClass86_Sub2_3.aClass209_9.method25584(local2259).aBoolean641) {
						local2255 = false;
					} else {
						local2253 = true;
					}
					if (local2255) {
						local1753.aShortArray81[local500] = (short) local2259;
						local1753.aShortArray82[local500] = (short) arg9[local538];
					} else {
						if (local2253) {
							local2259 = arg8[local538];
							if (local2259 != -1 && !this.aClass86_Sub2_3.aClass209_9.method25584(local2259).aBoolean641) {
								local1753.anIntArray309[local538] = Class424.anIntArray462[Class340.method27746(this.aClass86_Sub2_3.aClass209_9.method25584(local2259).aShort162 & 0xFFFF) & 0xFFFF];
							}
							local2259 = arg8[local1826];
							if (local2259 != -1 && !this.aClass86_Sub2_3.aClass209_9.method25584(local2259).aBoolean641) {
								local1753.anIntArray309[local1826] = Class424.anIntArray462[Class340.method27746(this.aClass86_Sub2_3.aClass209_9.method25584(local2259).aShort162 & 0xFFFF) & 0xFFFF];
							}
							local2259 = arg8[local1957];
							if (local2259 != -1 && !this.aClass86_Sub2_3.aClass209_9.method25584(local2259).aBoolean641) {
								local1753.anIntArray309[local1957] = Class424.anIntArray462[Class340.method27746(this.aClass86_Sub2_3.aClass209_9.method25584(local2259).aShort162 & 0xFFFF) & 0xFFFF];
							}
						}
						local1753.aShortArray81[local500] = -1;
					}
				}
			}
			this.aClass171ArrayArray1[arg0][arg1] = local1753;
			return;
		}
		@Pc(900) Class165 local900 = new Class165();
		local410 = arg6[0];
		local500 = arg8[0];
		if (arg7 != null) {
			local900.anInt3283 = arg7[0] >> 8;
			if (local410 == 0) {
				local900.aByte104 = (byte) (local900.aByte104 | 0x2);
			}
		} else if (local410 == 0) {
			return;
		}
		if (this.anIntArrayArray10[arg0][arg1] == this.anIntArrayArray10[arg0 + 1][arg1] && this.anIntArrayArray10[arg0][arg1] == this.anIntArrayArray10[arg0 + 1][arg1 + 1] && this.anIntArrayArray10[arg0][arg1] == this.anIntArrayArray10[arg0][arg1 + 1]) {
			local900.aByte104 = (byte) (local900.aByte104 | 0x1);
		}
		if (local500 == -1 || (local900.aByte104 & 0x2) != 0 || this.aClass86_Sub2_3.aClass209_9.method25584(local500).aBoolean641) {
			if (arg5 == null || arg10.anInt3553 * -1095140607 == 0) {
				local538 = 0;
			} else {
				local538 = arg5[local198] * 255 / (arg10.anInt3553 * -1095140607);
				if (local538 < 0) {
					local538 = 0;
				} else if (local538 > 255) {
					local538 = 255;
				}
			}
			local900.anInt3281 = Class227.method25798(method5548(arg6[local198] >> 8, this.aByteArrayArray6[arg0][arg1] - this.aByteArrayArray7[arg0][arg1]), arg10.anInt3554 * 2113275141, local538);
			if (local900.anInt3283 != 0) {
				local900.anInt3281 |= 255 - (this.aByteArrayArray6[arg0][arg1] - this.aByteArrayArray7[arg0][arg1]) << 25;
			}
			if (arg5 == null || arg10.anInt3553 * -1095140607 == 0) {
				local538 = 0;
			} else {
				local538 = arg5[local206] * 255 / (arg10.anInt3553 * -1095140607);
				if (local538 < 0) {
					local538 = 0;
				} else if (local538 > 255) {
					local538 = 255;
				}
			}
			local900.anInt3279 = Class227.method25798(method5548(arg6[local206] >> 8, this.aByteArrayArray6[arg0 + 1][arg1] - this.aByteArrayArray7[arg0 + 1][arg1]), arg10.anInt3554 * 2113275141, local538);
			if (local900.anInt3283 != 0) {
				local900.anInt3279 |= 255 - (this.aByteArrayArray6[arg0 + 1][arg1] - this.aByteArrayArray7[arg0 + 1][arg1]) << 25;
			}
			if (arg5 == null || arg10.anInt3553 * -1095140607 == 0) {
				local538 = 0;
			} else {
				local538 = arg5[local210] * 255 / (arg10.anInt3553 * -1095140607);
				if (local538 < 0) {
					local538 = 0;
				} else if (local538 > 255) {
					local538 = 255;
				}
			}
			local900.anInt3282 = Class227.method25798(method5548(arg6[local210] >> 8, this.aByteArrayArray6[arg0 + 1][arg1 + 1] - this.aByteArrayArray7[arg0 + 1][arg1 + 1]), arg10.anInt3554 * 2113275141, local538);
			if (local900.anInt3283 != 0) {
				local900.anInt3282 |= 255 - (this.aByteArrayArray6[arg0 + 1][arg1 + 1] - this.aByteArrayArray7[arg0 + 1][arg1 + 1]) << 25;
			}
			if (arg5 == null || arg10.anInt3553 * -1095140607 == 0) {
				local538 = 0;
			} else {
				local538 = arg5[local230] * 255 / (arg10.anInt3553 * -1095140607);
				if (local538 < 0) {
					local538 = 0;
				} else if (local538 > 255) {
					local538 = 255;
				}
			}
			local900.anInt3280 = Class227.method25798(method5548(arg6[local230] >> 8, this.aByteArrayArray6[arg0][arg1 + 1] - this.aByteArrayArray7[arg0][arg1 + 1]), arg10.anInt3554 * 2113275141, local538);
			if (local900.anInt3283 != 0) {
				local900.anInt3280 |= 255 - (this.aByteArrayArray6[arg0][arg1 + 1] - this.aByteArrayArray7[arg0][arg1 + 1]) << 25;
			}
			local900.aShort142 = -1;
		} else {
			if (arg5 == null || arg10.anInt3553 * -1095140607 == 0) {
				local538 = 0;
			} else {
				local538 = arg5[local198] * 255 / (arg10.anInt3553 * -1095140607);
				if (local538 < 0) {
					local538 = 0;
				} else if (local538 > 255) {
					local538 = 255;
				}
			}
			local900.anInt3281 = Class227.method25798(method5548(arg6[local198] >> 8, this.aByteArrayArray6[arg0][arg1] - this.aByteArrayArray7[arg0][arg1]), arg10.anInt3554 * 2113275141, local538);
			if (local900.anInt3283 != 0) {
				local900.anInt3281 |= 255 - (this.aByteArrayArray6[arg0][arg1] - this.aByteArrayArray7[arg0][arg1]) << 25;
			}
			if (arg5 == null || arg10.anInt3553 * -1095140607 == 0) {
				local538 = 0;
			} else {
				local538 = arg5[local206] * 255 / (arg10.anInt3553 * -1095140607);
				if (local538 < 0) {
					local538 = 0;
				} else if (local538 > 255) {
					local538 = 255;
				}
			}
			local900.anInt3279 = Class227.method25798(method5548(arg6[local206] >> 8, this.aByteArrayArray6[arg0 + 1][arg1] - this.aByteArrayArray7[arg0 + 1][arg1]), arg10.anInt3554 * 2113275141, local538);
			if (local900.anInt3283 != 0) {
				local900.anInt3279 |= 255 - (this.aByteArrayArray6[arg0 + 1][arg1] - this.aByteArrayArray7[arg0 + 1][arg1]) << 25;
			}
			if (arg5 == null || arg10.anInt3553 * -1095140607 == 0) {
				local538 = 0;
			} else {
				local538 = arg5[local210] * 255 / (arg10.anInt3553 * -1095140607);
				if (local538 < 0) {
					local538 = 0;
				} else if (local538 > 255) {
					local538 = 255;
				}
			}
			local900.anInt3282 = Class227.method25798(method5548(arg6[local210] >> 8, this.aByteArrayArray6[arg0 + 1][arg1 + 1] - this.aByteArrayArray7[arg0 + 1][arg1 + 1]), arg10.anInt3554 * 2113275141, local538);
			if (local900.anInt3283 != 0) {
				local900.anInt3282 |= 255 - (this.aByteArrayArray6[arg0 + 1][arg1 + 1] - this.aByteArrayArray7[arg0 + 1][arg1 + 1]) << 25;
			}
			if (arg5 == null || arg10.anInt3553 * -1095140607 == 0) {
				local538 = 0;
			} else {
				local538 = arg5[local230] * 255 / (arg10.anInt3553 * -1095140607);
				if (local538 < 0) {
					local538 = 0;
				} else if (local538 > 255) {
					local538 = 255;
				}
			}
			local900.anInt3280 = Class227.method25798(method5548(arg6[local230] >> 8, this.aByteArrayArray6[arg0][arg1 + 1] - this.aByteArrayArray7[arg0][arg1 + 1]), arg10.anInt3554 * 2113275141, local538);
			local900.aShort142 = (short) local500;
		}
		if (arg5 != null) {
			local900.aShort141 = (short) arg5[local210];
			local900.aShort138 = (short) arg5[local230];
			local900.aShort139 = (short) arg5[local206];
			local900.aShort140 = (short) arg5[local198];
		}
		this.aClass165ArrayArray1[arg0][arg1] = local900;
	}

	@OriginalMember(owner = "client!aep", name = "o", descriptor = "(II[I[I[I[I[I[I[I[ILclient!db;Z)V", line = 209)
	@Override
	public void method5536(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) Class202 arg10, @OriginalArg(11) boolean arg11) {
		@Pc(8) boolean local8 = (this.anInt615 & 0x20) == 0;
		if (this.aClass165ArrayArray1 == null && !local8) {
			this.aClass165ArrayArray1 = new Class165[this.anInt607 * -1924295585][this.anInt606 * -1466328823];
			this.aClass171ArrayArray1 = new Class171[this.anInt607 * -1924295585][this.anInt606 * -1466328823];
		} else if (this.aClass164ArrayArray1 == null && local8) {
			this.aClass164ArrayArray1 = new Class164[this.anInt607 * -1924295585][this.anInt606 * -1466328823];
		} else if (this.aClass180ArrayArray1 != null) {
			throw new IllegalStateException();
		}
		if (arg2 == null || arg2.length == 0) {
			return;
		}
		@Pc(68) int local68;
		for (local68 = 0; local68 < arg6.length; local68++) {
			if (arg6[local68] == -1) {
				arg6[local68] = 0;
			} else {
				arg6[local68] = Class424.anIntArray462[Class340.method27746(arg6[local68]) & 0xFFFF] << 8 | 0xFF;
			}
		}
		if (arg7 != null) {
			for (local68 = 0; local68 < arg7.length; local68++) {
				if (arg7[local68] == -1) {
					arg7[local68] = 0;
				} else {
					arg7[local68] = Class424.anIntArray462[Class340.method27746(arg7[local68]) & 0xFFFF] << 8 | 0xFF;
				}
			}
		}
		@Pc(198) int local198;
		@Pc(206) int local206;
		@Pc(210) int local210;
		@Pc(361) int local361;
		@Pc(410) int local410;
		@Pc(500) int local500;
		@Pc(230) int local230;
		@Pc(538) int local538;
		if (local8) {
			@Pc(142) Class164 local142 = new Class164();
			local142.aShort136 = (short) arg2.length;
			local142.aShort137 = (short) (arg2.length / 3);
			local142.aShortArray72 = new short[local142.aShort136];
			local142.aShortArray76 = new short[local142.aShort136];
			local142.aShortArray73 = new short[local142.aShort136];
			local142.anIntArray306 = new int[local142.aShort136];
			local142.aShortArray74 = new short[local142.aShort136];
			local142.aShortArray75 = new short[local142.aShort136];
			local142.aByteArray57 = new byte[local142.aShort136];
			if (arg5 != null) {
				local142.aShortArray71 = new short[local142.aShort136];
			}
			for (local198 = 0; local198 < local142.aShort136; local198++) {
				local206 = arg2[local198];
				local210 = arg4[local198];
				@Pc(212) boolean local212 = false;
				if (local206 == 0 && local210 == 0) {
					local230 = this.aByteArrayArray6[arg0][arg1] - this.aByteArrayArray7[arg0][arg1];
				} else if (local206 == 0 && local210 == this.anInt608 * 127780559) {
					local230 = this.aByteArrayArray6[arg0][arg1 + 1] - this.aByteArrayArray7[arg0][arg1 + 1];
				} else if (local206 == this.anInt608 * 127780559 && local210 == this.anInt608 * 127780559) {
					local230 = this.aByteArrayArray6[arg0 + 1][arg1 + 1] - this.aByteArrayArray7[arg0 + 1][arg1 + 1];
				} else if (local206 == this.anInt608 * 127780559 && local210 == 0) {
					local230 = this.aByteArrayArray6[arg0 + 1][arg1] - this.aByteArrayArray7[arg0 + 1][arg1];
				} else {
					local361 = (this.aByteArrayArray6[arg0][arg1] - this.aByteArrayArray7[arg0][arg1]) * (this.anInt608 * 127780559 - local206) + (this.aByteArrayArray6[arg0 + 1][arg1] - this.aByteArrayArray7[arg0 + 1][arg1]) * local206;
					local410 = (this.aByteArrayArray6[arg0][arg1 + 1] - this.aByteArrayArray7[arg0][arg1 + 1]) * (this.anInt608 * 127780559 - local206) + (this.aByteArrayArray6[arg0 + 1][arg1 + 1] - this.aByteArrayArray7[arg0 + 1][arg1 + 1]) * local206;
					local230 = local361 * (this.anInt608 * 127780559 - local210) + local410 * local210 >> this.anInt609 * 1304764278;
				}
				local361 = (arg0 << this.anInt609 * -1495101509) + local206;
				local410 = (arg1 << this.anInt609 * -1495101509) + local210;
				local142.aShortArray72[local198] = (short) local206;
				local142.aShortArray73[local198] = (short) local210;
				local142.aShortArray76[local198] = (short) (this.method5493(local361, local410) + (arg3 == null ? 0 : arg3[local198]));
				if (local230 < 0) {
					local230 = 0;
				}
				if (arg6[local198] == 0) {
					local142.anIntArray306[local198] = 0;
					if (arg7 != null) {
						local142.aByteArray57[local198] = (byte) local230;
					}
				} else {
					local500 = 0;
					if (arg5 != null) {
						@Pc(512) short local512 = local142.aShortArray71[local198] = (short) arg5[local198];
						if (arg10.anInt3553 * -1095140607 != 0) {
							local500 = local512 * 255 / (arg10.anInt3553 * -1095140607);
							if (local500 < 0) {
								local500 = 0;
							} else if (local500 > 255) {
								local500 = 255;
							}
						}
					}
					local538 = -16777216;
					if (arg8[local198] != -1) {
						@Pc(552) Class215 local552 = this.aClass86_Sub2_3.aClass209_9.method25584(arg8[local198]);
						if (local552.aBoolean638 && this.method5560(local552.aByte118)) {
							local538 = -1694498816;
						}
					}
					local142.anIntArray306[local198] = local538 | Class227.method25798(method5548(arg6[local198] >> 8, local230), arg10.anInt3554 * 2113275141, local500);
					if (arg7 != null) {
						local142.aByteArray57[local198] = (byte) local230;
					}
				}
				local142.aShortArray74[local198] = (short) arg8[local198];
				local142.aShortArray75[local198] = (short) arg9[local198];
			}
			if (arg7 != null) {
				local142.anIntArray307 = new int[local142.aShort137];
				for (local198 = 0; local198 < local142.aShort137; local198++) {
					local206 = local198 * 3;
					if (arg7[local206] != 0) {
						local142.anIntArray307[local198] = arg7[local206] >> 8 | 0xFF000000;
					}
				}
			}
			this.aClass164ArrayArray1[arg0][arg1] = local142;
			return;
		}
		@Pc(652) boolean local652 = true;
		local198 = -1;
		local206 = -1;
		local210 = -1;
		local230 = -1;
		if (arg2.length == 6) {
			for (local361 = 0; local361 < 6; local361++) {
				if (arg2[local361] == 0 && arg4[local361] == 0) {
					if (local198 != -1 && arg6[local198] != arg6[local361]) {
						local652 = false;
						break;
					}
					local198 = local361;
				} else if (arg2[local361] == this.anInt608 * 127780559 && arg4[local361] == 0) {
					if (local206 != -1 && arg6[local206] != arg6[local361]) {
						local652 = false;
						break;
					}
					local206 = local361;
				} else if (arg2[local361] == this.anInt608 * 127780559 && arg4[local361] == this.anInt608 * 127780559) {
					if (local210 != -1 && arg6[local210] != arg6[local361]) {
						local652 = false;
						break;
					}
					local210 = local361;
				} else if (arg2[local361] == 0 && arg4[local361] == this.anInt608 * 127780559) {
					if (local230 != -1 && arg6[local230] != arg6[local361]) {
						local652 = false;
						break;
					}
					local230 = local361;
				}
			}
			if (local198 == -1 || local206 == -1 || local210 == -1 || local230 == -1) {
				local652 = false;
			}
			if (local652) {
				if (arg3 != null) {
					for (local361 = 0; local361 < 4; local361++) {
						if (arg3[local361] != 0) {
							local652 = false;
							break;
						}
					}
				}
				if (local652) {
					for (local361 = 1; local361 < 4; local361++) {
						if (arg2[local361] != arg2[0] && arg2[local361] != arg2[0] + this.anInt608 * 127780559 && arg2[local361] != arg2[0] - this.anInt608 * 127780559) {
							local652 = false;
							break;
						}
						if (arg4[local361] != arg4[0] && arg4[local361] != arg4[0] + this.anInt608 * 127780559 && arg4[local361] != arg4[0] - this.anInt608 * 127780559) {
							local652 = false;
							break;
						}
					}
				}
			}
		} else {
			local652 = false;
		}
		if (!local652) {
			@Pc(1753) Class171 local1753 = new Class171();
			local1753.aShort143 = (short) arg2.length;
			local1753.aShort144 = (short) (arg2.length / 3);
			local1753.aShortArray77 = new short[local1753.aShort143];
			local1753.aShortArray79 = new short[local1753.aShort143];
			local1753.aShortArray80 = new short[local1753.aShort143];
			local1753.anIntArray309 = new int[local1753.aShort143];
			if (arg5 != null) {
				local1753.aShortArray78 = new short[local1753.aShort143];
			}
			@Pc(1957) int local1957;
			@Pc(1826) int local1826;
			for (local410 = 0; local410 < local1753.aShort143; local410++) {
				local500 = arg2[local410];
				local538 = arg4[local410];
				@Pc(1808) boolean local1808 = false;
				@Pc(2006) int local2006;
				if (local500 == 0 && local538 == 0) {
					local1826 = this.aByteArrayArray6[arg0][arg1] - this.aByteArrayArray7[arg0][arg1];
				} else if (local500 == 0 && local538 == this.anInt608 * 127780559) {
					local1826 = this.aByteArrayArray6[arg0][arg1 + 1] - this.aByteArrayArray7[arg0][arg1 + 1];
				} else if (local500 == this.anInt608 * 127780559 && local538 == this.anInt608 * 127780559) {
					local1826 = this.aByteArrayArray6[arg0 + 1][arg1 + 1] - this.aByteArrayArray7[arg0 + 1][arg1 + 1];
				} else if (local500 == this.anInt608 * 127780559 && local538 == 0) {
					local1826 = this.aByteArrayArray6[arg0 + 1][arg1] - this.aByteArrayArray7[arg0 + 1][arg1];
				} else {
					local1957 = (this.aByteArrayArray6[arg0][arg1] - this.aByteArrayArray7[arg0][arg1]) * (this.anInt608 * 127780559 - local500) + (this.aByteArrayArray6[arg0 + 1][arg1] - this.aByteArrayArray7[arg0 + 1][arg1]) * local500;
					local2006 = (this.aByteArrayArray6[arg0][arg1 + 1] - this.aByteArrayArray7[arg0][arg1 + 1]) * (this.anInt608 * 127780559 - local500) + (this.aByteArrayArray6[arg0 + 1][arg1 + 1] - this.aByteArrayArray7[arg0 + 1][arg1 + 1]) * local500;
					local1826 = local1957 * (this.anInt608 * 127780559 - local538) + local2006 * local538 >> this.anInt609 * 1304764278;
				}
				local1957 = (arg0 << this.anInt609 * -1495101509) + local500;
				local2006 = (arg1 << this.anInt609 * -1495101509) + local538;
				local1753.aShortArray77[local410] = (short) local500;
				local1753.aShortArray80[local410] = (short) local538;
				local1753.aShortArray79[local410] = (short) (this.method5493(local1957, local2006) + (arg3 == null ? 0 : arg3[local410]));
				if (local1826 < 0) {
					local1826 = 0;
				}
				if (arg6[local410] != 0) {
					@Pc(2098) int local2098 = 0;
					if (arg5 != null) {
						@Pc(2110) short local2110 = local1753.aShortArray78[local410] = (short) arg5[local410];
						if (arg10.anInt3553 * -1095140607 != 0) {
							local2098 = local2110 * 255 / (arg10.anInt3553 * -1095140607);
							if (local2098 < 0) {
								local2098 = 0;
							} else if (local2098 > 255) {
								local2098 = 255;
							}
						}
					}
					local1753.anIntArray309[local410] = Class227.method25798(method5548(arg6[local410] >> 8, local1826), arg10.anInt3554 * 2113275141, local2098);
					if (arg7 != null) {
						local1753.anIntArray309[local410] |= local1826 << 25;
					}
				} else if (arg7 == null) {
					local1753.anIntArray309[local410] = 0;
				} else {
					local1753.anIntArray309[local410] = local1826 << 25;
				}
			}
			@Pc(2168) boolean local2168 = false;
			for (local500 = 0; local500 < local1753.aShort144; local500++) {
				if (arg8[local500 * 3] != -1 && !this.aClass86_Sub2_3.aClass209_9.method25584(arg8[local500 * 3]).aBoolean641) {
					local2168 = true;
				}
			}
			if (arg7 != null) {
				local1753.anIntArray310 = new int[local1753.aShort144];
			}
			if (local2168) {
				local1753.aShortArray81 = new short[local1753.aShort144];
				local1753.aShortArray82 = new short[local1753.aShort144];
			}
			for (local500 = 0; local500 < local1753.aShort144; local500++) {
				local538 = local500 * 3;
				if (arg7 != null && arg7[local538] != 0) {
					local1753.anIntArray310[local500] = arg7[local538] >> 8;
				}
				if (local2168) {
					local1826 = local538 + 1;
					local1957 = local1826 + 1;
					@Pc(2253) boolean local2253 = false;
					@Pc(2255) boolean local2255 = true;
					@Pc(2259) int local2259 = arg8[local538];
					if (local2259 == -1 || this.aClass86_Sub2_3.aClass209_9.method25584(local2259).aBoolean641) {
						local2255 = false;
					} else {
						local2253 = true;
					}
					local2259 = arg8[local1826];
					if (local2259 == -1 || this.aClass86_Sub2_3.aClass209_9.method25584(local2259).aBoolean641) {
						local2255 = false;
					} else {
						local2253 = true;
					}
					local2259 = arg8[local1957];
					if (local2259 == -1 || this.aClass86_Sub2_3.aClass209_9.method25584(local2259).aBoolean641) {
						local2255 = false;
					} else {
						local2253 = true;
					}
					if (local2255) {
						local1753.aShortArray81[local500] = (short) local2259;
						local1753.aShortArray82[local500] = (short) arg9[local538];
					} else {
						if (local2253) {
							local2259 = arg8[local538];
							if (local2259 != -1 && !this.aClass86_Sub2_3.aClass209_9.method25584(local2259).aBoolean641) {
								local1753.anIntArray309[local538] = Class424.anIntArray462[Class340.method27746(this.aClass86_Sub2_3.aClass209_9.method25584(local2259).aShort162 & 0xFFFF) & 0xFFFF];
							}
							local2259 = arg8[local1826];
							if (local2259 != -1 && !this.aClass86_Sub2_3.aClass209_9.method25584(local2259).aBoolean641) {
								local1753.anIntArray309[local1826] = Class424.anIntArray462[Class340.method27746(this.aClass86_Sub2_3.aClass209_9.method25584(local2259).aShort162 & 0xFFFF) & 0xFFFF];
							}
							local2259 = arg8[local1957];
							if (local2259 != -1 && !this.aClass86_Sub2_3.aClass209_9.method25584(local2259).aBoolean641) {
								local1753.anIntArray309[local1957] = Class424.anIntArray462[Class340.method27746(this.aClass86_Sub2_3.aClass209_9.method25584(local2259).aShort162 & 0xFFFF) & 0xFFFF];
							}
						}
						local1753.aShortArray81[local500] = -1;
					}
				}
			}
			this.aClass171ArrayArray1[arg0][arg1] = local1753;
			return;
		}
		@Pc(900) Class165 local900 = new Class165();
		local410 = arg6[0];
		local500 = arg8[0];
		if (arg7 != null) {
			local900.anInt3283 = arg7[0] >> 8;
			if (local410 == 0) {
				local900.aByte104 = (byte) (local900.aByte104 | 0x2);
			}
		} else if (local410 == 0) {
			return;
		}
		if (this.anIntArrayArray10[arg0][arg1] == this.anIntArrayArray10[arg0 + 1][arg1] && this.anIntArrayArray10[arg0][arg1] == this.anIntArrayArray10[arg0 + 1][arg1 + 1] && this.anIntArrayArray10[arg0][arg1] == this.anIntArrayArray10[arg0][arg1 + 1]) {
			local900.aByte104 = (byte) (local900.aByte104 | 0x1);
		}
		if (local500 == -1 || (local900.aByte104 & 0x2) != 0 || this.aClass86_Sub2_3.aClass209_9.method25584(local500).aBoolean641) {
			if (arg5 == null || arg10.anInt3553 * -1095140607 == 0) {
				local538 = 0;
			} else {
				local538 = arg5[local198] * 255 / (arg10.anInt3553 * -1095140607);
				if (local538 < 0) {
					local538 = 0;
				} else if (local538 > 255) {
					local538 = 255;
				}
			}
			local900.anInt3281 = Class227.method25798(method5548(arg6[local198] >> 8, this.aByteArrayArray6[arg0][arg1] - this.aByteArrayArray7[arg0][arg1]), arg10.anInt3554 * 2113275141, local538);
			if (local900.anInt3283 != 0) {
				local900.anInt3281 |= 255 - (this.aByteArrayArray6[arg0][arg1] - this.aByteArrayArray7[arg0][arg1]) << 25;
			}
			if (arg5 == null || arg10.anInt3553 * -1095140607 == 0) {
				local538 = 0;
			} else {
				local538 = arg5[local206] * 255 / (arg10.anInt3553 * -1095140607);
				if (local538 < 0) {
					local538 = 0;
				} else if (local538 > 255) {
					local538 = 255;
				}
			}
			local900.anInt3279 = Class227.method25798(method5548(arg6[local206] >> 8, this.aByteArrayArray6[arg0 + 1][arg1] - this.aByteArrayArray7[arg0 + 1][arg1]), arg10.anInt3554 * 2113275141, local538);
			if (local900.anInt3283 != 0) {
				local900.anInt3279 |= 255 - (this.aByteArrayArray6[arg0 + 1][arg1] - this.aByteArrayArray7[arg0 + 1][arg1]) << 25;
			}
			if (arg5 == null || arg10.anInt3553 * -1095140607 == 0) {
				local538 = 0;
			} else {
				local538 = arg5[local210] * 255 / (arg10.anInt3553 * -1095140607);
				if (local538 < 0) {
					local538 = 0;
				} else if (local538 > 255) {
					local538 = 255;
				}
			}
			local900.anInt3282 = Class227.method25798(method5548(arg6[local210] >> 8, this.aByteArrayArray6[arg0 + 1][arg1 + 1] - this.aByteArrayArray7[arg0 + 1][arg1 + 1]), arg10.anInt3554 * 2113275141, local538);
			if (local900.anInt3283 != 0) {
				local900.anInt3282 |= 255 - (this.aByteArrayArray6[arg0 + 1][arg1 + 1] - this.aByteArrayArray7[arg0 + 1][arg1 + 1]) << 25;
			}
			if (arg5 == null || arg10.anInt3553 * -1095140607 == 0) {
				local538 = 0;
			} else {
				local538 = arg5[local230] * 255 / (arg10.anInt3553 * -1095140607);
				if (local538 < 0) {
					local538 = 0;
				} else if (local538 > 255) {
					local538 = 255;
				}
			}
			local900.anInt3280 = Class227.method25798(method5548(arg6[local230] >> 8, this.aByteArrayArray6[arg0][arg1 + 1] - this.aByteArrayArray7[arg0][arg1 + 1]), arg10.anInt3554 * 2113275141, local538);
			if (local900.anInt3283 != 0) {
				local900.anInt3280 |= 255 - (this.aByteArrayArray6[arg0][arg1 + 1] - this.aByteArrayArray7[arg0][arg1 + 1]) << 25;
			}
			local900.aShort142 = -1;
		} else {
			if (arg5 == null || arg10.anInt3553 * -1095140607 == 0) {
				local538 = 0;
			} else {
				local538 = arg5[local198] * 255 / (arg10.anInt3553 * -1095140607);
				if (local538 < 0) {
					local538 = 0;
				} else if (local538 > 255) {
					local538 = 255;
				}
			}
			local900.anInt3281 = Class227.method25798(method5548(arg6[local198] >> 8, this.aByteArrayArray6[arg0][arg1] - this.aByteArrayArray7[arg0][arg1]), arg10.anInt3554 * 2113275141, local538);
			if (local900.anInt3283 != 0) {
				local900.anInt3281 |= 255 - (this.aByteArrayArray6[arg0][arg1] - this.aByteArrayArray7[arg0][arg1]) << 25;
			}
			if (arg5 == null || arg10.anInt3553 * -1095140607 == 0) {
				local538 = 0;
			} else {
				local538 = arg5[local206] * 255 / (arg10.anInt3553 * -1095140607);
				if (local538 < 0) {
					local538 = 0;
				} else if (local538 > 255) {
					local538 = 255;
				}
			}
			local900.anInt3279 = Class227.method25798(method5548(arg6[local206] >> 8, this.aByteArrayArray6[arg0 + 1][arg1] - this.aByteArrayArray7[arg0 + 1][arg1]), arg10.anInt3554 * 2113275141, local538);
			if (local900.anInt3283 != 0) {
				local900.anInt3279 |= 255 - (this.aByteArrayArray6[arg0 + 1][arg1] - this.aByteArrayArray7[arg0 + 1][arg1]) << 25;
			}
			if (arg5 == null || arg10.anInt3553 * -1095140607 == 0) {
				local538 = 0;
			} else {
				local538 = arg5[local210] * 255 / (arg10.anInt3553 * -1095140607);
				if (local538 < 0) {
					local538 = 0;
				} else if (local538 > 255) {
					local538 = 255;
				}
			}
			local900.anInt3282 = Class227.method25798(method5548(arg6[local210] >> 8, this.aByteArrayArray6[arg0 + 1][arg1 + 1] - this.aByteArrayArray7[arg0 + 1][arg1 + 1]), arg10.anInt3554 * 2113275141, local538);
			if (local900.anInt3283 != 0) {
				local900.anInt3282 |= 255 - (this.aByteArrayArray6[arg0 + 1][arg1 + 1] - this.aByteArrayArray7[arg0 + 1][arg1 + 1]) << 25;
			}
			if (arg5 == null || arg10.anInt3553 * -1095140607 == 0) {
				local538 = 0;
			} else {
				local538 = arg5[local230] * 255 / (arg10.anInt3553 * -1095140607);
				if (local538 < 0) {
					local538 = 0;
				} else if (local538 > 255) {
					local538 = 255;
				}
			}
			local900.anInt3280 = Class227.method25798(method5548(arg6[local230] >> 8, this.aByteArrayArray6[arg0][arg1 + 1] - this.aByteArrayArray7[arg0][arg1 + 1]), arg10.anInt3554 * 2113275141, local538);
			local900.aShort142 = (short) local500;
		}
		if (arg5 != null) {
			local900.aShort141 = (short) arg5[local210];
			local900.aShort138 = (short) arg5[local230];
			local900.aShort139 = (short) arg5[local206];
			local900.aShort140 = (short) arg5[local198];
		}
		this.aClass165ArrayArray1[arg0][arg1] = local900;
	}

	@OriginalMember(owner = "client!aep", name = "bx", descriptor = "(II)I", line = 560)
	static int method5547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = (arg0 & 0xFF0000) * arg1 >> 23;
		if (local7 < 2) {
			local7 = 2;
		} else if (local7 > 253) {
			local7 = 253;
		}
		@Pc(26) int local26 = (arg0 & 0xFF00) * arg1 >> 15;
		if (local26 < 2) {
			local26 = 2;
		} else if (local26 > 253) {
			local26 = 253;
		}
		@Pc(45) int local45 = (arg0 & 0xFF) * arg1 >> 7;
		if (local45 < 2) {
			local45 = 2;
		} else if (local45 > 253) {
			local45 = 253;
		}
		return local7 << 16 | local26 << 8 | local45;
	}

	@OriginalMember(owner = "client!aep", name = "bc", descriptor = "(II)I", line = 560)
	static int method5548(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = (arg0 & 0xFF0000) * arg1 >> 23;
		if (local7 < 2) {
			local7 = 2;
		} else if (local7 > 253) {
			local7 = 253;
		}
		@Pc(26) int local26 = (arg0 & 0xFF00) * arg1 >> 15;
		if (local26 < 2) {
			local26 = 2;
		} else if (local26 > 253) {
			local26 = 253;
		}
		@Pc(45) int local45 = (arg0 & 0xFF) * arg1 >> 7;
		if (local45 < 2) {
			local45 = 2;
		} else if (local45 > 253) {
			local45 = 253;
		}
		return local7 << 16 | local26 << 8 | local45;
	}

	@OriginalMember(owner = "client!aep", name = "b", descriptor = "()V", line = 573)
	@Override
	public void method5526() {
		this.aByteArrayArray6 = null;
		this.aByteArrayArray7 = null;
	}

	@OriginalMember(owner = "client!aep", name = "l", descriptor = "()V", line = 573)
	@Override
	public void method5511() {
		this.aByteArrayArray6 = null;
		this.aByteArrayArray7 = null;
	}

	@OriginalMember(owner = "client!aep", name = "y", descriptor = "(III[[ZZI)V", line = 578)
	@Override
	public void method5520(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		if (this.aClass86_Sub2_3.anIntArray39 == null || this.aClass86_Sub2_3.aFloatArray15 == null) {
			throw new IllegalStateException("");
		}
		@Pc(16) Class442 local16 = this.aClass86_Sub2_3.aClass442_18;
		this.aFloat37 = local16.aFloatArray109[0];
		this.aFloat52 = local16.aFloatArray109[1];
		this.aFloat38 = local16.aFloatArray109[2];
		this.aFloat39 = local16.aFloatArray109[3];
		this.aFloat40 = local16.aFloatArray109[4];
		this.aFloat41 = local16.aFloatArray109[5];
		this.aFloat49 = local16.aFloatArray109[6];
		this.aFloat50 = local16.aFloatArray109[7];
		this.aFloat44 = local16.aFloatArray109[8];
		this.aFloat43 = local16.aFloatArray109[9];
		this.aFloat45 = local16.aFloatArray109[10];
		this.aFloat46 = local16.aFloatArray109[11];
		this.aFloat47 = local16.aFloatArray109[12];
		this.aFloat48 = local16.aFloatArray109[13];
		this.aFloat51 = local16.aFloatArray109[14];
		this.aFloat42 = local16.aFloatArray109[15];
		for (@Pc(114) int local114 = 0; local114 < arg2 + arg2; local114++) {
			for (@Pc(121) int local121 = 0; local121 < arg2 + arg2; local121++) {
				if (arg3[local114][local121]) {
					@Pc(139) int local139 = arg0 - arg2 + local114;
					@Pc(145) int local145 = arg1 - arg2 + local121;
					if (local139 >= 0 && local139 < this.anInt607 * -1924295585 && local145 >= 0 && local145 < this.anInt606 * -1466328823) {
						this.method5549(local139, local145, arg5);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!aep", name = "h", descriptor = "(III[[ZZI)V", line = 578)
	@Override
	public void method5530(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		if (this.aClass86_Sub2_3.anIntArray39 == null || this.aClass86_Sub2_3.aFloatArray15 == null) {
			throw new IllegalStateException("");
		}
		@Pc(16) Class442 local16 = this.aClass86_Sub2_3.aClass442_18;
		this.aFloat37 = local16.aFloatArray109[0];
		this.aFloat52 = local16.aFloatArray109[1];
		this.aFloat38 = local16.aFloatArray109[2];
		this.aFloat39 = local16.aFloatArray109[3];
		this.aFloat40 = local16.aFloatArray109[4];
		this.aFloat41 = local16.aFloatArray109[5];
		this.aFloat49 = local16.aFloatArray109[6];
		this.aFloat50 = local16.aFloatArray109[7];
		this.aFloat44 = local16.aFloatArray109[8];
		this.aFloat43 = local16.aFloatArray109[9];
		this.aFloat45 = local16.aFloatArray109[10];
		this.aFloat46 = local16.aFloatArray109[11];
		this.aFloat47 = local16.aFloatArray109[12];
		this.aFloat48 = local16.aFloatArray109[13];
		this.aFloat51 = local16.aFloatArray109[14];
		this.aFloat42 = local16.aFloatArray109[15];
		for (@Pc(114) int local114 = 0; local114 < arg2 + arg2; local114++) {
			for (@Pc(121) int local121 = 0; local121 < arg2 + arg2; local121++) {
				if (arg3[local114][local121]) {
					@Pc(139) int local139 = arg0 - arg2 + local114;
					@Pc(145) int local145 = arg1 - arg2 + local121;
					if (local139 >= 0 && local139 < this.anInt607 * -1924295585 && local145 >= 0 && local145 < this.anInt606 * -1466328823) {
						this.method5549(local139, local145, arg5);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!aep", name = "n", descriptor = "(III[[ZZI)V", line = 578)
	@Override
	public void method5514(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		if (this.aClass86_Sub2_3.anIntArray39 == null || this.aClass86_Sub2_3.aFloatArray15 == null) {
			throw new IllegalStateException("");
		}
		@Pc(16) Class442 local16 = this.aClass86_Sub2_3.aClass442_18;
		this.aFloat37 = local16.aFloatArray109[0];
		this.aFloat52 = local16.aFloatArray109[1];
		this.aFloat38 = local16.aFloatArray109[2];
		this.aFloat39 = local16.aFloatArray109[3];
		this.aFloat40 = local16.aFloatArray109[4];
		this.aFloat41 = local16.aFloatArray109[5];
		this.aFloat49 = local16.aFloatArray109[6];
		this.aFloat50 = local16.aFloatArray109[7];
		this.aFloat44 = local16.aFloatArray109[8];
		this.aFloat43 = local16.aFloatArray109[9];
		this.aFloat45 = local16.aFloatArray109[10];
		this.aFloat46 = local16.aFloatArray109[11];
		this.aFloat47 = local16.aFloatArray109[12];
		this.aFloat48 = local16.aFloatArray109[13];
		this.aFloat51 = local16.aFloatArray109[14];
		this.aFloat42 = local16.aFloatArray109[15];
		for (@Pc(114) int local114 = 0; local114 < arg2 + arg2; local114++) {
			for (@Pc(121) int local121 = 0; local121 < arg2 + arg2; local121++) {
				if (arg3[local114][local121]) {
					@Pc(139) int local139 = arg0 - arg2 + local114;
					@Pc(145) int local145 = arg1 - arg2 + local121;
					if (local139 >= 0 && local139 < this.anInt607 * -1924295585 && local145 >= 0 && local145 < this.anInt606 * -1466328823) {
						this.method5549(local139, local145, arg5);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!aep", name = "a", descriptor = "(III[[ZZI)V", line = 578)
	@Override
	public void method5528(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		if (this.aClass86_Sub2_3.anIntArray39 == null || this.aClass86_Sub2_3.aFloatArray15 == null) {
			throw new IllegalStateException("");
		}
		@Pc(16) Class442 local16 = this.aClass86_Sub2_3.aClass442_18;
		this.aFloat37 = local16.aFloatArray109[0];
		this.aFloat52 = local16.aFloatArray109[1];
		this.aFloat38 = local16.aFloatArray109[2];
		this.aFloat39 = local16.aFloatArray109[3];
		this.aFloat40 = local16.aFloatArray109[4];
		this.aFloat41 = local16.aFloatArray109[5];
		this.aFloat49 = local16.aFloatArray109[6];
		this.aFloat50 = local16.aFloatArray109[7];
		this.aFloat44 = local16.aFloatArray109[8];
		this.aFloat43 = local16.aFloatArray109[9];
		this.aFloat45 = local16.aFloatArray109[10];
		this.aFloat46 = local16.aFloatArray109[11];
		this.aFloat47 = local16.aFloatArray109[12];
		this.aFloat48 = local16.aFloatArray109[13];
		this.aFloat51 = local16.aFloatArray109[14];
		this.aFloat42 = local16.aFloatArray109[15];
		for (@Pc(114) int local114 = 0; local114 < arg2 + arg2; local114++) {
			for (@Pc(121) int local121 = 0; local121 < arg2 + arg2; local121++) {
				if (arg3[local114][local121]) {
					@Pc(139) int local139 = arg0 - arg2 + local114;
					@Pc(145) int local145 = arg1 - arg2 + local121;
					if (local139 >= 0 && local139 < this.anInt607 * -1924295585 && local145 >= 0 && local145 < this.anInt606 * -1466328823) {
						this.method5549(local139, local145, arg5);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!aep", name = "m", descriptor = "(III[[ZZI)V", line = 578)
	@Override
	public void method5529(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		if (this.aClass86_Sub2_3.anIntArray39 == null || this.aClass86_Sub2_3.aFloatArray15 == null) {
			throw new IllegalStateException("");
		}
		@Pc(16) Class442 local16 = this.aClass86_Sub2_3.aClass442_18;
		this.aFloat37 = local16.aFloatArray109[0];
		this.aFloat52 = local16.aFloatArray109[1];
		this.aFloat38 = local16.aFloatArray109[2];
		this.aFloat39 = local16.aFloatArray109[3];
		this.aFloat40 = local16.aFloatArray109[4];
		this.aFloat41 = local16.aFloatArray109[5];
		this.aFloat49 = local16.aFloatArray109[6];
		this.aFloat50 = local16.aFloatArray109[7];
		this.aFloat44 = local16.aFloatArray109[8];
		this.aFloat43 = local16.aFloatArray109[9];
		this.aFloat45 = local16.aFloatArray109[10];
		this.aFloat46 = local16.aFloatArray109[11];
		this.aFloat47 = local16.aFloatArray109[12];
		this.aFloat48 = local16.aFloatArray109[13];
		this.aFloat51 = local16.aFloatArray109[14];
		this.aFloat42 = local16.aFloatArray109[15];
		for (@Pc(114) int local114 = 0; local114 < arg2 + arg2; local114++) {
			for (@Pc(121) int local121 = 0; local121 < arg2 + arg2; local121++) {
				if (arg3[local114][local121]) {
					@Pc(139) int local139 = arg0 - arg2 + local114;
					@Pc(145) int local145 = arg1 - arg2 + local121;
					if (local139 >= 0 && local139 < this.anInt607 * -1924295585 && local145 >= 0 && local145 < this.anInt606 * -1466328823) {
						this.method5549(local139, local145, arg5);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!aep", name = "aj", descriptor = "(III[[ZZI)V", line = 578)
	@Override
	public void method5531(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		if (this.aClass86_Sub2_3.anIntArray39 == null || this.aClass86_Sub2_3.aFloatArray15 == null) {
			throw new IllegalStateException("");
		}
		@Pc(16) Class442 local16 = this.aClass86_Sub2_3.aClass442_18;
		this.aFloat37 = local16.aFloatArray109[0];
		this.aFloat52 = local16.aFloatArray109[1];
		this.aFloat38 = local16.aFloatArray109[2];
		this.aFloat39 = local16.aFloatArray109[3];
		this.aFloat40 = local16.aFloatArray109[4];
		this.aFloat41 = local16.aFloatArray109[5];
		this.aFloat49 = local16.aFloatArray109[6];
		this.aFloat50 = local16.aFloatArray109[7];
		this.aFloat44 = local16.aFloatArray109[8];
		this.aFloat43 = local16.aFloatArray109[9];
		this.aFloat45 = local16.aFloatArray109[10];
		this.aFloat46 = local16.aFloatArray109[11];
		this.aFloat47 = local16.aFloatArray109[12];
		this.aFloat48 = local16.aFloatArray109[13];
		this.aFloat51 = local16.aFloatArray109[14];
		this.aFloat42 = local16.aFloatArray109[15];
		for (@Pc(114) int local114 = 0; local114 < arg2 + arg2; local114++) {
			for (@Pc(121) int local121 = 0; local121 < arg2 + arg2; local121++) {
				if (arg3[local114][local121]) {
					@Pc(139) int local139 = arg0 - arg2 + local114;
					@Pc(145) int local145 = arg1 - arg2 + local121;
					if (local139 >= 0 && local139 < this.anInt607 * -1924295585 && local145 >= 0 && local145 < this.anInt606 * -1466328823) {
						this.method5549(local139, local145, arg5);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!aep", name = "ai", descriptor = "(III[[ZZI)V", line = 578)
	@Override
	public void method5546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		if (this.aClass86_Sub2_3.anIntArray39 == null || this.aClass86_Sub2_3.aFloatArray15 == null) {
			throw new IllegalStateException("");
		}
		@Pc(16) Class442 local16 = this.aClass86_Sub2_3.aClass442_18;
		this.aFloat37 = local16.aFloatArray109[0];
		this.aFloat52 = local16.aFloatArray109[1];
		this.aFloat38 = local16.aFloatArray109[2];
		this.aFloat39 = local16.aFloatArray109[3];
		this.aFloat40 = local16.aFloatArray109[4];
		this.aFloat41 = local16.aFloatArray109[5];
		this.aFloat49 = local16.aFloatArray109[6];
		this.aFloat50 = local16.aFloatArray109[7];
		this.aFloat44 = local16.aFloatArray109[8];
		this.aFloat43 = local16.aFloatArray109[9];
		this.aFloat45 = local16.aFloatArray109[10];
		this.aFloat46 = local16.aFloatArray109[11];
		this.aFloat47 = local16.aFloatArray109[12];
		this.aFloat48 = local16.aFloatArray109[13];
		this.aFloat51 = local16.aFloatArray109[14];
		this.aFloat42 = local16.aFloatArray109[15];
		for (@Pc(114) int local114 = 0; local114 < arg2 + arg2; local114++) {
			for (@Pc(121) int local121 = 0; local121 < arg2 + arg2; local121++) {
				if (arg3[local114][local121]) {
					@Pc(139) int local139 = arg0 - arg2 + local114;
					@Pc(145) int local145 = arg1 - arg2 + local121;
					if (local139 >= 0 && local139 < this.anInt607 * -1924295585 && local145 >= 0 && local145 < this.anInt606 * -1466328823) {
						this.method5549(local139, local145, arg5);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!aep", name = "bj", descriptor = "(III)V", line = 609)
	void method5549(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class95 local4 = this.aClass86_Sub2_3.method4886(Thread.currentThread());
		local4.aClass163_2.anInt3269 = 0;
		if (this.aClass165ArrayArray1 != null) {
			this.method5556(arg0, arg1, local4.aBoolean163, local4, local4.aClass163_2, local4.aFloatArray35, local4.aFloatArray38, local4.aFloatArray39, local4.aFloatArray40, local4.aFloatArray41, arg2);
		} else if (this.aClass180ArrayArray1 != null) {
			this.method5553(arg0, arg1, local4.aClass163_2, local4.aFloatArray35, local4.aFloatArray38, local4.aFloatArray39, local4.aFloatArray40, local4.aFloatArray41, arg2);
		} else if (this.aClass164ArrayArray1 != null) {
			this.method5557(arg0, arg1, local4.aBoolean163, local4, local4.aClass163_2, local4.aFloatArray35, local4.aFloatArray38, local4.aFloatArray39, local4.aFloatArray40, local4.aFloatArray41, arg2);
		}
	}

	@OriginalMember(owner = "client!aep", name = "bw", descriptor = "(III)V", line = 609)
	void method5550(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class95 local4 = this.aClass86_Sub2_3.method4886(Thread.currentThread());
		local4.aClass163_2.anInt3269 = 0;
		if (this.aClass165ArrayArray1 != null) {
			this.method5556(arg0, arg1, local4.aBoolean163, local4, local4.aClass163_2, local4.aFloatArray35, local4.aFloatArray38, local4.aFloatArray39, local4.aFloatArray40, local4.aFloatArray41, arg2);
		} else if (this.aClass180ArrayArray1 != null) {
			this.method5553(arg0, arg1, local4.aClass163_2, local4.aFloatArray35, local4.aFloatArray38, local4.aFloatArray39, local4.aFloatArray40, local4.aFloatArray41, arg2);
		} else if (this.aClass164ArrayArray1 != null) {
			this.method5557(arg0, arg1, local4.aBoolean163, local4, local4.aClass163_2, local4.aFloatArray35, local4.aFloatArray38, local4.aFloatArray39, local4.aFloatArray40, local4.aFloatArray41, arg2);
		}
	}

	@OriginalMember(owner = "client!aep", name = "bg", descriptor = "(IILclient!ba;[F[F[F[F[FI)V", line = 617)
	void method5551(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class163 arg2, @OriginalArg(3) float[] arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) float[] arg7, @OriginalArg(8) int arg8) {
		@Pc(6) Class180 local6 = this.aClass180ArrayArray1[arg0][arg1];
		@Pc(45) int local45;
		@Pc(59) int local59;
		@Pc(282) float local282;
		@Pc(346) float local346;
		@Pc(410) float local410;
		@Pc(474) float local474;
		@Pc(319) float local319;
		@Pc(383) float local383;
		@Pc(447) float local447;
		@Pc(511) float local511;
		@Pc(272) float local272;
		@Pc(336) float local336;
		if (local6 == null) {
			@Pc(1347) Class153 local1347 = this.aClass153ArrayArray1[arg0][arg1];
			if (local1347 != null) {
				if (arg8 != 0) {
					if ((local1347.aByte58 & 0x4) == 0) {
						if ((arg8 & 0x2) != 0) {
							return;
						}
					} else if ((arg8 & 0x1) != 0) {
						return;
					}
				}
				@Pc(1368) int local1368;
				for (local1368 = 0; local1368 < local1347.aShort102; local1368++) {
					local45 = local1347.aShortArray53[local1368] + (arg0 << this.anInt609 * -1495101509);
					@Pc(1389) short local1389 = local1347.aShortArray54[local1368];
					local59 = local1347.aShortArray55[local1368] + (arg1 << this.anInt609 * -1495101509);
					local410 = this.aFloat51 + this.aFloat38 * (float) local45 + this.aFloat49 * (float) local1389 + this.aFloat45 * (float) local59;
					local474 = this.aFloat42 + this.aFloat39 * (float) local45 + this.aFloat50 * (float) local1389 + this.aFloat46 * (float) local59;
					if (local410 < -local474) {
						return;
					}
					local282 = this.aFloat47 + this.aFloat37 * (float) local45 + this.aFloat40 * (float) local1389 + this.aFloat44 * (float) local59;
					local346 = this.aFloat48 + this.aFloat52 * (float) local45 + this.aFloat41 * (float) local1389 + this.aFloat43 * (float) local59;
					arg3[local1368] = arg2.aFloat238 + arg2.aFloat239 * local282 / local474;
					arg4[local1368] = arg2.aFloat240 + arg2.aFloat241 * local346 / local474;
					arg5[local1368] = arg2.aFloat242 + arg2.aFloat243 * local410 / local474;
					arg6[local1368] = local474;
				}
				@Pc(1547) short local1547;
				@Pc(1552) short local1552;
				@Pc(1557) short local1557;
				if (local1347.aShortArray52 == null) {
					for (local1368 = 0; local1368 < local1347.aShort103; local1368++) {
						local1547 = local1347.aShortArray56[local1368];
						local1552 = local1347.aShortArray57[local1368];
						local1557 = local1347.aShortArray58[local1368];
						local319 = arg3[local1547];
						local383 = arg3[local1552];
						local447 = arg3[local1557];
						local511 = arg4[local1547];
						local272 = arg4[local1552];
						local336 = arg4[local1557];
						if ((local319 - local383) * (local336 - local272) - (local511 - local272) * (local447 - local383) > 0.0F) {
							@Pc(1924) int local1924 = local1347.anIntArray233[local1368];
							if (local1924 != -1) {
								arg2.aBoolean558 = local319 < 0.0F || local383 < 0.0F || local447 < 0.0F || local319 > (float) arg2.anInt3270 || local383 > (float) arg2.anInt3270 || local447 > (float) arg2.anInt3270;
								arg2.method24354(true, true, false, local511, local272, local336, local319, local383, local447, arg5[local1547], arg5[local1552], arg5[local1557], (float) Class186.method24627(local1924, local1347.aShortArray59[local1547]), (float) Class186.method24627(local1924, local1347.aShortArray59[local1552]), (float) Class186.method24627(local1924, local1347.aShortArray59[local1557]));
							}
						}
					}
				} else {
					for (local1368 = 0; local1368 < local1347.aShort103; local1368++) {
						local1547 = local1347.aShortArray56[local1368];
						local1552 = local1347.aShortArray57[local1368];
						local1557 = local1347.aShortArray58[local1368];
						local319 = arg3[local1547];
						local383 = arg3[local1552];
						local447 = arg3[local1557];
						local511 = arg4[local1547];
						local272 = arg4[local1552];
						local336 = arg4[local1557];
						if ((local319 - local383) * (local336 - local272) - (local511 - local272) * (local447 - local383) > 0.0F) {
							arg2.aBoolean558 = local319 < 0.0F || local383 < 0.0F || local447 < 0.0F || local319 > (float) arg2.anInt3270 || local383 > (float) arg2.anInt3270 || local447 > (float) arg2.anInt3270;
							@Pc(1636) boolean local1636 = false;
							if (local1347.aShortArray52[local1368] != -1) {
								@Pc(1654) Class215 local1654 = this.aClass86_Sub2_3.aClass209_9.method25584(local1347.aShortArray52[local1368] & 0xFFFF);
								local1636 = local1654.aBoolean638;
							}
							if (local1636) {
								arg2.method24376(true, true, false, local511, local272, local336, local319, local383, local447, arg5[local1547], arg5[local1552], arg5[local1557], arg6[local1547], arg6[local1552], arg6[local1557], (float) local1347.aShortArray53[local1547] / (float) (this.anInt608 * 127780559), (float) local1347.aShortArray53[local1552] / (float) (this.anInt608 * 127780559), (float) local1347.aShortArray53[local1557] / (float) (this.anInt608 * 127780559), (float) local1347.aShortArray55[local1547] / (float) (this.anInt608 * 127780559), (float) local1347.aShortArray55[local1552] / (float) (this.anInt608 * 127780559), (float) local1347.aShortArray55[local1557] / (float) (this.anInt608 * 127780559), Class424.anIntArray462[local1347.aShortArray59[local1547] & 0xFFFF] & 0xFFFFFF | 0xFF000000, Class424.anIntArray462[local1347.aShortArray59[local1552] & 0xFFFF] & 0xFFFFFF | 0xFF000000, Class424.anIntArray462[local1347.aShortArray59[local1557] & 0xFFFF] & 0xFFFFFF | 0xFF000000, 0, 0.0F, 0.0F, 0.0F, local1347.aShortArray52[local1368] & 0xFFFF);
							} else {
								@Pc(1806) int local1806 = local1347.anIntArray233[local1368];
								if (local1806 != -1) {
									arg2.method24354(true, true, false, local511, local272, local336, local319, local383, local447, arg5[local1547], arg5[local1552], arg5[local1557], (float) Class186.method24627(local1806, local1347.aShortArray59[local1547]), (float) Class186.method24627(local1806, local1347.aShortArray59[local1552]), (float) Class186.method24627(local1806, local1347.aShortArray59[local1557]));
								}
							}
						}
					}
				}
			}
		} else if ((local6.aByte108 & 0x2) == 0) {
			if (arg8 != 0) {
				if ((local6.aByte108 & 0x4) == 0) {
					if ((arg8 & 0x2) != 0) {
						return;
					}
				} else if ((arg8 & 0x1) != 0) {
					return;
				}
			}
			@Pc(38) int local38 = arg0 * this.anInt608 * 127780559;
			local45 = local38 + this.anInt608 * 127780559;
			@Pc(52) int local52 = arg1 * this.anInt608 * 127780559;
			local59 = local52 + this.anInt608 * 127780559;
			@Pc(299) float local299;
			@Pc(363) float local363;
			@Pc(427) float local427;
			@Pc(491) float local491;
			@Pc(100) float local100;
			@Pc(140) float local140;
			@Pc(180) float local180;
			@Pc(220) float local220;
			@Pc(117) float local117;
			@Pc(157) float local157;
			@Pc(197) float local197;
			@Pc(237) float local237;
			@Pc(71) int local71;
			@Pc(373) float local373;
			@Pc(309) float local309;
			@Pc(437) float local437;
			@Pc(501) float local501;
			@Pc(400) float local400;
			@Pc(464) float local464;
			if ((local6.aByte108 & 0x1) == 0) {
				local71 = this.anIntArrayArray10[arg0][arg1];
				@Pc(528) int local528 = this.anIntArrayArray10[arg0 + 1][arg1];
				@Pc(539) int local539 = this.anIntArrayArray10[arg0 + 1][arg1 + 1];
				@Pc(548) int local548 = this.anIntArrayArray10[arg0][arg1 + 1];
				local100 = this.aFloat51 + this.aFloat38 * (float) local38 + this.aFloat49 * (float) local71 + this.aFloat45 * (float) local52;
				local117 = this.aFloat42 + this.aFloat39 * (float) local38 + this.aFloat50 * (float) local71 + this.aFloat46 * (float) local52;
				if (local100 < -local117) {
					return;
				}
				local140 = this.aFloat51 + this.aFloat38 * (float) local45 + this.aFloat49 * (float) local528 + this.aFloat45 * (float) local52;
				local157 = this.aFloat42 + this.aFloat39 * (float) local45 + this.aFloat50 * (float) local528 + this.aFloat46 * (float) local52;
				if (local140 < -local157) {
					return;
				}
				local180 = this.aFloat51 + this.aFloat38 * (float) local45 + this.aFloat49 * (float) local539 + this.aFloat45 * (float) local59;
				local197 = this.aFloat42 + this.aFloat39 * (float) local45 + this.aFloat50 * (float) local539 + this.aFloat46 * (float) local59;
				if (local180 < -local197) {
					return;
				}
				local220 = this.aFloat51 + this.aFloat38 * (float) local38 + this.aFloat49 * (float) local548 + this.aFloat45 * (float) local59;
				local237 = this.aFloat42 + this.aFloat39 * (float) local38 + this.aFloat50 * (float) local548 + this.aFloat46 * (float) local59;
				if (local220 < -local237) {
					return;
				}
				local272 = this.aFloat47 + this.aFloat37 * (float) local38 + this.aFloat40 * (float) local71 + this.aFloat44 * (float) local52;
				local282 = arg2.aFloat238 + arg2.aFloat239 * local272 / local117;
				local299 = this.aFloat48 + this.aFloat52 * (float) local38 + this.aFloat41 * (float) local71 + this.aFloat43 * (float) local52;
				local309 = arg2.aFloat240 + arg2.aFloat241 * local299 / local117;
				local319 = arg2.aFloat242 + arg2.aFloat243 * local100 / local117;
				local336 = this.aFloat47 + this.aFloat37 * (float) local45 + this.aFloat40 * (float) local528 + this.aFloat44 * (float) local52;
				local346 = arg2.aFloat238 + arg2.aFloat239 * local336 / local157;
				local363 = this.aFloat48 + this.aFloat52 * (float) local45 + this.aFloat41 * (float) local528 + this.aFloat43 * (float) local52;
				local373 = arg2.aFloat240 + arg2.aFloat241 * local363 / local157;
				local383 = arg2.aFloat242 + arg2.aFloat243 * local140 / local157;
				local400 = this.aFloat47 + this.aFloat37 * (float) local45 + this.aFloat40 * (float) local539 + this.aFloat44 * (float) local59;
				local410 = arg2.aFloat238 + arg2.aFloat239 * local400 / local197;
				local427 = this.aFloat48 + this.aFloat52 * (float) local45 + this.aFloat41 * (float) local539 + this.aFloat43 * (float) local59;
				local437 = arg2.aFloat240 + arg2.aFloat241 * local427 / local197;
				local447 = arg2.aFloat242 + arg2.aFloat243 * local180 / local197;
				local464 = this.aFloat47 + this.aFloat37 * (float) local38 + this.aFloat40 * (float) local548 + this.aFloat44 * (float) local59;
				local474 = arg2.aFloat238 + arg2.aFloat239 * local464 / local237;
				local491 = this.aFloat48 + this.aFloat52 * (float) local38 + this.aFloat41 * (float) local548 + this.aFloat43 * (float) local59;
				local501 = arg2.aFloat240 + arg2.aFloat241 * local491 / local237;
				local511 = arg2.aFloat242 + arg2.aFloat243 * local220 / local237;
			} else {
				local71 = this.anIntArrayArray10[arg0][arg1];
				@Pc(77) float local77 = this.aFloat49 * (float) local71;
				@Pc(83) float local83 = this.aFloat50 * (float) local71;
				local100 = this.aFloat51 + this.aFloat38 * (float) local38 + local77 + this.aFloat45 * (float) local52;
				local117 = this.aFloat42 + this.aFloat39 * (float) local38 + local83 + this.aFloat46 * (float) local52;
				if (local100 < -local117) {
					return;
				}
				local140 = this.aFloat51 + this.aFloat38 * (float) local45 + local77 + this.aFloat45 * (float) local52;
				local157 = this.aFloat42 + this.aFloat39 * (float) local45 + local83 + this.aFloat46 * (float) local52;
				if (local140 < -local157) {
					return;
				}
				local180 = this.aFloat51 + this.aFloat38 * (float) local45 + local77 + this.aFloat45 * (float) local59;
				local197 = this.aFloat42 + this.aFloat39 * (float) local45 + local83 + this.aFloat46 * (float) local59;
				if (local180 < -local197) {
					return;
				}
				local220 = this.aFloat51 + this.aFloat38 * (float) local38 + local77 + this.aFloat45 * (float) local59;
				local237 = this.aFloat42 + this.aFloat39 * (float) local38 + local83 + this.aFloat46 * (float) local59;
				if (local220 < -local237) {
					return;
				}
				@Pc(249) float local249 = this.aFloat40 * (float) local71;
				@Pc(255) float local255 = this.aFloat41 * (float) local71;
				local272 = this.aFloat47 + this.aFloat37 * (float) local38 + local249 + this.aFloat44 * (float) local52;
				local282 = arg2.aFloat238 + arg2.aFloat239 * local272 / local117;
				local299 = this.aFloat48 + this.aFloat52 * (float) local38 + local255 + this.aFloat43 * (float) local52;
				local309 = arg2.aFloat240 + arg2.aFloat241 * local299 / local117;
				local319 = arg2.aFloat242 + arg2.aFloat243 * local100 / local117;
				local336 = this.aFloat47 + this.aFloat37 * (float) local45 + local249 + this.aFloat44 * (float) local52;
				local346 = arg2.aFloat238 + arg2.aFloat239 * local336 / local157;
				local363 = this.aFloat48 + this.aFloat52 * (float) local45 + local255 + this.aFloat43 * (float) local52;
				local373 = arg2.aFloat240 + arg2.aFloat241 * local363 / local157;
				local383 = arg2.aFloat242 + arg2.aFloat243 * local140 / local157;
				local400 = this.aFloat47 + this.aFloat37 * (float) local45 + local249 + this.aFloat44 * (float) local59;
				local410 = arg2.aFloat238 + arg2.aFloat239 * local400 / local197;
				local427 = this.aFloat48 + this.aFloat52 * (float) local45 + local255 + this.aFloat43 * (float) local59;
				local437 = arg2.aFloat240 + arg2.aFloat241 * local427 / local197;
				local447 = arg2.aFloat242 + arg2.aFloat243 * local180 / local197;
				local464 = this.aFloat47 + this.aFloat37 * (float) local38 + local249 + this.aFloat44 * (float) local59;
				local474 = arg2.aFloat238 + arg2.aFloat239 * local464 / local237;
				local491 = this.aFloat48 + this.aFloat52 * (float) local38 + local255 + this.aFloat43 * (float) local59;
				local501 = arg2.aFloat240 + arg2.aFloat241 * local491 / local237;
				local511 = arg2.aFloat242 + arg2.aFloat243 * local220 / local237;
			}
			@Pc(1030) boolean local1030 = false;
			if (local6.aShort147 != -1) {
				@Pc(1044) Class215 local1044 = this.aClass86_Sub2_3.aClass209_9.method25584(local6.aShort147 & 0xFFFF);
				local1030 = local1044.aBoolean638;
			}
			if ((local410 - local474) * (local373 - local501) - (local437 - local501) * (local346 - local474) > 0.0F) {
				arg2.aBoolean558 = local410 < 0.0F || local474 < 0.0F || local346 < 0.0F || local410 > (float) arg2.anInt3270 || local474 > (float) arg2.anInt3270 || local346 > (float) arg2.anInt3270;
				if (local1030) {
					arg2.method24376(true, true, false, local437, local501, local373, local410, local474, local346, local447, local511, local383, local197, local237, local157, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, Class424.anIntArray462[local6.aShort148 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Class424.anIntArray462[local6.aShort149 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Class424.anIntArray462[local6.aShort150 & 0xFFFF] & 0xFFFFFF | 0xFF000000, 0, 0.0F, 0.0F, 0.0F, local6.aShort147 & 0xFFFF);
				} else {
					arg2.method24354(true, true, false, local437, local501, local373, local410, local474, local346, local447, local511, local383, (float) (local6.aShort148 & 0xFFFF), (float) (local6.aShort149 & 0xFFFF), (float) (local6.aShort150 & 0xFFFF));
				}
			}
			if ((local282 - local346) * (local501 - local373) - (local309 - local373) * (local474 - local346) > 0.0F) {
				arg2.aBoolean558 = local282 < 0.0F || local346 < 0.0F || local474 < 0.0F || local282 > (float) arg2.anInt3270 || local346 > (float) arg2.anInt3270 || local474 > (float) arg2.anInt3270;
				if (local1030) {
					arg2.method24376(true, true, false, local309, local373, local501, local282, local346, local474, local319, local383, local511, local117, local157, local237, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, Class424.anIntArray462[local6.aShort146 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Class424.anIntArray462[local6.aShort150 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Class424.anIntArray462[local6.aShort149 & 0xFFFF] & 0xFFFFFF | 0xFF000000, 0, 0.0F, 0.0F, 0.0F, local6.aShort147 & 0xFFFF);
				} else {
					arg2.method24354(true, true, false, local309, local373, local501, local282, local346, local474, local319, local383, local511, (float) (local6.aShort146 & 0xFFFF), (float) (local6.aShort150 & 0xFFFF), (float) (local6.aShort149 & 0xFFFF));
				}
			}
		}
	}

	@OriginalMember(owner = "client!aep", name = "bi", descriptor = "(IILclient!ba;[F[F[F[F[FI)V", line = 617)
	void method5552(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class163 arg2, @OriginalArg(3) float[] arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) float[] arg7, @OriginalArg(8) int arg8) {
		@Pc(6) Class180 local6 = this.aClass180ArrayArray1[arg0][arg1];
		@Pc(45) int local45;
		@Pc(59) int local59;
		@Pc(282) float local282;
		@Pc(346) float local346;
		@Pc(410) float local410;
		@Pc(474) float local474;
		@Pc(319) float local319;
		@Pc(383) float local383;
		@Pc(447) float local447;
		@Pc(511) float local511;
		@Pc(272) float local272;
		@Pc(336) float local336;
		if (local6 == null) {
			@Pc(1347) Class153 local1347 = this.aClass153ArrayArray1[arg0][arg1];
			if (local1347 != null) {
				if (arg8 != 0) {
					if ((local1347.aByte58 & 0x4) == 0) {
						if ((arg8 & 0x2) != 0) {
							return;
						}
					} else if ((arg8 & 0x1) != 0) {
						return;
					}
				}
				@Pc(1368) int local1368;
				for (local1368 = 0; local1368 < local1347.aShort102; local1368++) {
					local45 = local1347.aShortArray53[local1368] + (arg0 << this.anInt609 * -1495101509);
					@Pc(1389) short local1389 = local1347.aShortArray54[local1368];
					local59 = local1347.aShortArray55[local1368] + (arg1 << this.anInt609 * -1495101509);
					local410 = this.aFloat51 + this.aFloat38 * (float) local45 + this.aFloat49 * (float) local1389 + this.aFloat45 * (float) local59;
					local474 = this.aFloat42 + this.aFloat39 * (float) local45 + this.aFloat50 * (float) local1389 + this.aFloat46 * (float) local59;
					if (local410 < -local474) {
						return;
					}
					local282 = this.aFloat47 + this.aFloat37 * (float) local45 + this.aFloat40 * (float) local1389 + this.aFloat44 * (float) local59;
					local346 = this.aFloat48 + this.aFloat52 * (float) local45 + this.aFloat41 * (float) local1389 + this.aFloat43 * (float) local59;
					arg3[local1368] = arg2.aFloat238 + arg2.aFloat239 * local282 / local474;
					arg4[local1368] = arg2.aFloat240 + arg2.aFloat241 * local346 / local474;
					arg5[local1368] = arg2.aFloat242 + arg2.aFloat243 * local410 / local474;
					arg6[local1368] = local474;
				}
				@Pc(1547) short local1547;
				@Pc(1552) short local1552;
				@Pc(1557) short local1557;
				if (local1347.aShortArray52 == null) {
					for (local1368 = 0; local1368 < local1347.aShort103; local1368++) {
						local1547 = local1347.aShortArray56[local1368];
						local1552 = local1347.aShortArray57[local1368];
						local1557 = local1347.aShortArray58[local1368];
						local319 = arg3[local1547];
						local383 = arg3[local1552];
						local447 = arg3[local1557];
						local511 = arg4[local1547];
						local272 = arg4[local1552];
						local336 = arg4[local1557];
						if ((local319 - local383) * (local336 - local272) - (local511 - local272) * (local447 - local383) > 0.0F) {
							@Pc(1924) int local1924 = local1347.anIntArray233[local1368];
							if (local1924 != -1) {
								arg2.aBoolean558 = local319 < 0.0F || local383 < 0.0F || local447 < 0.0F || local319 > (float) arg2.anInt3270 || local383 > (float) arg2.anInt3270 || local447 > (float) arg2.anInt3270;
								arg2.method24354(true, true, false, local511, local272, local336, local319, local383, local447, arg5[local1547], arg5[local1552], arg5[local1557], (float) Class186.method24627(local1924, local1347.aShortArray59[local1547]), (float) Class186.method24627(local1924, local1347.aShortArray59[local1552]), (float) Class186.method24627(local1924, local1347.aShortArray59[local1557]));
							}
						}
					}
				} else {
					for (local1368 = 0; local1368 < local1347.aShort103; local1368++) {
						local1547 = local1347.aShortArray56[local1368];
						local1552 = local1347.aShortArray57[local1368];
						local1557 = local1347.aShortArray58[local1368];
						local319 = arg3[local1547];
						local383 = arg3[local1552];
						local447 = arg3[local1557];
						local511 = arg4[local1547];
						local272 = arg4[local1552];
						local336 = arg4[local1557];
						if ((local319 - local383) * (local336 - local272) - (local511 - local272) * (local447 - local383) > 0.0F) {
							arg2.aBoolean558 = local319 < 0.0F || local383 < 0.0F || local447 < 0.0F || local319 > (float) arg2.anInt3270 || local383 > (float) arg2.anInt3270 || local447 > (float) arg2.anInt3270;
							@Pc(1636) boolean local1636 = false;
							if (local1347.aShortArray52[local1368] != -1) {
								@Pc(1654) Class215 local1654 = this.aClass86_Sub2_3.aClass209_9.method25584(local1347.aShortArray52[local1368] & 0xFFFF);
								local1636 = local1654.aBoolean638;
							}
							if (local1636) {
								arg2.method24376(true, true, false, local511, local272, local336, local319, local383, local447, arg5[local1547], arg5[local1552], arg5[local1557], arg6[local1547], arg6[local1552], arg6[local1557], (float) local1347.aShortArray53[local1547] / (float) (this.anInt608 * 127780559), (float) local1347.aShortArray53[local1552] / (float) (this.anInt608 * 127780559), (float) local1347.aShortArray53[local1557] / (float) (this.anInt608 * 127780559), (float) local1347.aShortArray55[local1547] / (float) (this.anInt608 * 127780559), (float) local1347.aShortArray55[local1552] / (float) (this.anInt608 * 127780559), (float) local1347.aShortArray55[local1557] / (float) (this.anInt608 * 127780559), Class424.anIntArray462[local1347.aShortArray59[local1547] & 0xFFFF] & 0xFFFFFF | 0xFF000000, Class424.anIntArray462[local1347.aShortArray59[local1552] & 0xFFFF] & 0xFFFFFF | 0xFF000000, Class424.anIntArray462[local1347.aShortArray59[local1557] & 0xFFFF] & 0xFFFFFF | 0xFF000000, 0, 0.0F, 0.0F, 0.0F, local1347.aShortArray52[local1368] & 0xFFFF);
							} else {
								@Pc(1806) int local1806 = local1347.anIntArray233[local1368];
								if (local1806 != -1) {
									arg2.method24354(true, true, false, local511, local272, local336, local319, local383, local447, arg5[local1547], arg5[local1552], arg5[local1557], (float) Class186.method24627(local1806, local1347.aShortArray59[local1547]), (float) Class186.method24627(local1806, local1347.aShortArray59[local1552]), (float) Class186.method24627(local1806, local1347.aShortArray59[local1557]));
								}
							}
						}
					}
				}
			}
		} else if ((local6.aByte108 & 0x2) == 0) {
			if (arg8 != 0) {
				if ((local6.aByte108 & 0x4) == 0) {
					if ((arg8 & 0x2) != 0) {
						return;
					}
				} else if ((arg8 & 0x1) != 0) {
					return;
				}
			}
			@Pc(38) int local38 = arg0 * this.anInt608 * 127780559;
			local45 = local38 + this.anInt608 * 127780559;
			@Pc(52) int local52 = arg1 * this.anInt608 * 127780559;
			local59 = local52 + this.anInt608 * 127780559;
			@Pc(299) float local299;
			@Pc(363) float local363;
			@Pc(427) float local427;
			@Pc(491) float local491;
			@Pc(100) float local100;
			@Pc(140) float local140;
			@Pc(180) float local180;
			@Pc(220) float local220;
			@Pc(117) float local117;
			@Pc(157) float local157;
			@Pc(197) float local197;
			@Pc(237) float local237;
			@Pc(71) int local71;
			@Pc(373) float local373;
			@Pc(309) float local309;
			@Pc(437) float local437;
			@Pc(501) float local501;
			@Pc(400) float local400;
			@Pc(464) float local464;
			if ((local6.aByte108 & 0x1) == 0) {
				local71 = this.anIntArrayArray10[arg0][arg1];
				@Pc(528) int local528 = this.anIntArrayArray10[arg0 + 1][arg1];
				@Pc(539) int local539 = this.anIntArrayArray10[arg0 + 1][arg1 + 1];
				@Pc(548) int local548 = this.anIntArrayArray10[arg0][arg1 + 1];
				local100 = this.aFloat51 + this.aFloat38 * (float) local38 + this.aFloat49 * (float) local71 + this.aFloat45 * (float) local52;
				local117 = this.aFloat42 + this.aFloat39 * (float) local38 + this.aFloat50 * (float) local71 + this.aFloat46 * (float) local52;
				if (local100 < -local117) {
					return;
				}
				local140 = this.aFloat51 + this.aFloat38 * (float) local45 + this.aFloat49 * (float) local528 + this.aFloat45 * (float) local52;
				local157 = this.aFloat42 + this.aFloat39 * (float) local45 + this.aFloat50 * (float) local528 + this.aFloat46 * (float) local52;
				if (local140 < -local157) {
					return;
				}
				local180 = this.aFloat51 + this.aFloat38 * (float) local45 + this.aFloat49 * (float) local539 + this.aFloat45 * (float) local59;
				local197 = this.aFloat42 + this.aFloat39 * (float) local45 + this.aFloat50 * (float) local539 + this.aFloat46 * (float) local59;
				if (local180 < -local197) {
					return;
				}
				local220 = this.aFloat51 + this.aFloat38 * (float) local38 + this.aFloat49 * (float) local548 + this.aFloat45 * (float) local59;
				local237 = this.aFloat42 + this.aFloat39 * (float) local38 + this.aFloat50 * (float) local548 + this.aFloat46 * (float) local59;
				if (local220 < -local237) {
					return;
				}
				local272 = this.aFloat47 + this.aFloat37 * (float) local38 + this.aFloat40 * (float) local71 + this.aFloat44 * (float) local52;
				local282 = arg2.aFloat238 + arg2.aFloat239 * local272 / local117;
				local299 = this.aFloat48 + this.aFloat52 * (float) local38 + this.aFloat41 * (float) local71 + this.aFloat43 * (float) local52;
				local309 = arg2.aFloat240 + arg2.aFloat241 * local299 / local117;
				local319 = arg2.aFloat242 + arg2.aFloat243 * local100 / local117;
				local336 = this.aFloat47 + this.aFloat37 * (float) local45 + this.aFloat40 * (float) local528 + this.aFloat44 * (float) local52;
				local346 = arg2.aFloat238 + arg2.aFloat239 * local336 / local157;
				local363 = this.aFloat48 + this.aFloat52 * (float) local45 + this.aFloat41 * (float) local528 + this.aFloat43 * (float) local52;
				local373 = arg2.aFloat240 + arg2.aFloat241 * local363 / local157;
				local383 = arg2.aFloat242 + arg2.aFloat243 * local140 / local157;
				local400 = this.aFloat47 + this.aFloat37 * (float) local45 + this.aFloat40 * (float) local539 + this.aFloat44 * (float) local59;
				local410 = arg2.aFloat238 + arg2.aFloat239 * local400 / local197;
				local427 = this.aFloat48 + this.aFloat52 * (float) local45 + this.aFloat41 * (float) local539 + this.aFloat43 * (float) local59;
				local437 = arg2.aFloat240 + arg2.aFloat241 * local427 / local197;
				local447 = arg2.aFloat242 + arg2.aFloat243 * local180 / local197;
				local464 = this.aFloat47 + this.aFloat37 * (float) local38 + this.aFloat40 * (float) local548 + this.aFloat44 * (float) local59;
				local474 = arg2.aFloat238 + arg2.aFloat239 * local464 / local237;
				local491 = this.aFloat48 + this.aFloat52 * (float) local38 + this.aFloat41 * (float) local548 + this.aFloat43 * (float) local59;
				local501 = arg2.aFloat240 + arg2.aFloat241 * local491 / local237;
				local511 = arg2.aFloat242 + arg2.aFloat243 * local220 / local237;
			} else {
				local71 = this.anIntArrayArray10[arg0][arg1];
				@Pc(77) float local77 = this.aFloat49 * (float) local71;
				@Pc(83) float local83 = this.aFloat50 * (float) local71;
				local100 = this.aFloat51 + this.aFloat38 * (float) local38 + local77 + this.aFloat45 * (float) local52;
				local117 = this.aFloat42 + this.aFloat39 * (float) local38 + local83 + this.aFloat46 * (float) local52;
				if (local100 < -local117) {
					return;
				}
				local140 = this.aFloat51 + this.aFloat38 * (float) local45 + local77 + this.aFloat45 * (float) local52;
				local157 = this.aFloat42 + this.aFloat39 * (float) local45 + local83 + this.aFloat46 * (float) local52;
				if (local140 < -local157) {
					return;
				}
				local180 = this.aFloat51 + this.aFloat38 * (float) local45 + local77 + this.aFloat45 * (float) local59;
				local197 = this.aFloat42 + this.aFloat39 * (float) local45 + local83 + this.aFloat46 * (float) local59;
				if (local180 < -local197) {
					return;
				}
				local220 = this.aFloat51 + this.aFloat38 * (float) local38 + local77 + this.aFloat45 * (float) local59;
				local237 = this.aFloat42 + this.aFloat39 * (float) local38 + local83 + this.aFloat46 * (float) local59;
				if (local220 < -local237) {
					return;
				}
				@Pc(249) float local249 = this.aFloat40 * (float) local71;
				@Pc(255) float local255 = this.aFloat41 * (float) local71;
				local272 = this.aFloat47 + this.aFloat37 * (float) local38 + local249 + this.aFloat44 * (float) local52;
				local282 = arg2.aFloat238 + arg2.aFloat239 * local272 / local117;
				local299 = this.aFloat48 + this.aFloat52 * (float) local38 + local255 + this.aFloat43 * (float) local52;
				local309 = arg2.aFloat240 + arg2.aFloat241 * local299 / local117;
				local319 = arg2.aFloat242 + arg2.aFloat243 * local100 / local117;
				local336 = this.aFloat47 + this.aFloat37 * (float) local45 + local249 + this.aFloat44 * (float) local52;
				local346 = arg2.aFloat238 + arg2.aFloat239 * local336 / local157;
				local363 = this.aFloat48 + this.aFloat52 * (float) local45 + local255 + this.aFloat43 * (float) local52;
				local373 = arg2.aFloat240 + arg2.aFloat241 * local363 / local157;
				local383 = arg2.aFloat242 + arg2.aFloat243 * local140 / local157;
				local400 = this.aFloat47 + this.aFloat37 * (float) local45 + local249 + this.aFloat44 * (float) local59;
				local410 = arg2.aFloat238 + arg2.aFloat239 * local400 / local197;
				local427 = this.aFloat48 + this.aFloat52 * (float) local45 + local255 + this.aFloat43 * (float) local59;
				local437 = arg2.aFloat240 + arg2.aFloat241 * local427 / local197;
				local447 = arg2.aFloat242 + arg2.aFloat243 * local180 / local197;
				local464 = this.aFloat47 + this.aFloat37 * (float) local38 + local249 + this.aFloat44 * (float) local59;
				local474 = arg2.aFloat238 + arg2.aFloat239 * local464 / local237;
				local491 = this.aFloat48 + this.aFloat52 * (float) local38 + local255 + this.aFloat43 * (float) local59;
				local501 = arg2.aFloat240 + arg2.aFloat241 * local491 / local237;
				local511 = arg2.aFloat242 + arg2.aFloat243 * local220 / local237;
			}
			@Pc(1030) boolean local1030 = false;
			if (local6.aShort147 != -1) {
				@Pc(1044) Class215 local1044 = this.aClass86_Sub2_3.aClass209_9.method25584(local6.aShort147 & 0xFFFF);
				local1030 = local1044.aBoolean638;
			}
			if ((local410 - local474) * (local373 - local501) - (local437 - local501) * (local346 - local474) > 0.0F) {
				arg2.aBoolean558 = local410 < 0.0F || local474 < 0.0F || local346 < 0.0F || local410 > (float) arg2.anInt3270 || local474 > (float) arg2.anInt3270 || local346 > (float) arg2.anInt3270;
				if (local1030) {
					arg2.method24376(true, true, false, local437, local501, local373, local410, local474, local346, local447, local511, local383, local197, local237, local157, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, Class424.anIntArray462[local6.aShort148 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Class424.anIntArray462[local6.aShort149 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Class424.anIntArray462[local6.aShort150 & 0xFFFF] & 0xFFFFFF | 0xFF000000, 0, 0.0F, 0.0F, 0.0F, local6.aShort147 & 0xFFFF);
				} else {
					arg2.method24354(true, true, false, local437, local501, local373, local410, local474, local346, local447, local511, local383, (float) (local6.aShort148 & 0xFFFF), (float) (local6.aShort149 & 0xFFFF), (float) (local6.aShort150 & 0xFFFF));
				}
			}
			if ((local282 - local346) * (local501 - local373) - (local309 - local373) * (local474 - local346) > 0.0F) {
				arg2.aBoolean558 = local282 < 0.0F || local346 < 0.0F || local474 < 0.0F || local282 > (float) arg2.anInt3270 || local346 > (float) arg2.anInt3270 || local474 > (float) arg2.anInt3270;
				if (local1030) {
					arg2.method24376(true, true, false, local309, local373, local501, local282, local346, local474, local319, local383, local511, local117, local157, local237, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, Class424.anIntArray462[local6.aShort146 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Class424.anIntArray462[local6.aShort150 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Class424.anIntArray462[local6.aShort149 & 0xFFFF] & 0xFFFFFF | 0xFF000000, 0, 0.0F, 0.0F, 0.0F, local6.aShort147 & 0xFFFF);
				} else {
					arg2.method24354(true, true, false, local309, local373, local501, local282, local346, local474, local319, local383, local511, (float) (local6.aShort146 & 0xFFFF), (float) (local6.aShort150 & 0xFFFF), (float) (local6.aShort149 & 0xFFFF));
				}
			}
		}
	}

	@OriginalMember(owner = "client!aep", name = "bv", descriptor = "(IILclient!ba;[F[F[F[F[FI)V", line = 617)
	void method5553(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class163 arg2, @OriginalArg(3) float[] arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) float[] arg7, @OriginalArg(8) int arg8) {
		@Pc(6) Class180 local6 = this.aClass180ArrayArray1[arg0][arg1];
		@Pc(45) int local45;
		@Pc(59) int local59;
		@Pc(282) float local282;
		@Pc(346) float local346;
		@Pc(410) float local410;
		@Pc(474) float local474;
		@Pc(319) float local319;
		@Pc(383) float local383;
		@Pc(447) float local447;
		@Pc(511) float local511;
		@Pc(272) float local272;
		@Pc(336) float local336;
		if (local6 == null) {
			@Pc(1347) Class153 local1347 = this.aClass153ArrayArray1[arg0][arg1];
			if (local1347 != null) {
				if (arg8 != 0) {
					if ((local1347.aByte58 & 0x4) == 0) {
						if ((arg8 & 0x2) != 0) {
							return;
						}
					} else if ((arg8 & 0x1) != 0) {
						return;
					}
				}
				@Pc(1368) int local1368;
				for (local1368 = 0; local1368 < local1347.aShort102; local1368++) {
					local45 = local1347.aShortArray53[local1368] + (arg0 << this.anInt609 * -1495101509);
					@Pc(1389) short local1389 = local1347.aShortArray54[local1368];
					local59 = local1347.aShortArray55[local1368] + (arg1 << this.anInt609 * -1495101509);
					local410 = this.aFloat51 + this.aFloat38 * (float) local45 + this.aFloat49 * (float) local1389 + this.aFloat45 * (float) local59;
					local474 = this.aFloat42 + this.aFloat39 * (float) local45 + this.aFloat50 * (float) local1389 + this.aFloat46 * (float) local59;
					if (local410 < -local474) {
						return;
					}
					local282 = this.aFloat47 + this.aFloat37 * (float) local45 + this.aFloat40 * (float) local1389 + this.aFloat44 * (float) local59;
					local346 = this.aFloat48 + this.aFloat52 * (float) local45 + this.aFloat41 * (float) local1389 + this.aFloat43 * (float) local59;
					arg3[local1368] = arg2.aFloat238 + arg2.aFloat239 * local282 / local474;
					arg4[local1368] = arg2.aFloat240 + arg2.aFloat241 * local346 / local474;
					arg5[local1368] = arg2.aFloat242 + arg2.aFloat243 * local410 / local474;
					arg6[local1368] = local474;
				}
				@Pc(1547) short local1547;
				@Pc(1552) short local1552;
				@Pc(1557) short local1557;
				if (local1347.aShortArray52 == null) {
					for (local1368 = 0; local1368 < local1347.aShort103; local1368++) {
						local1547 = local1347.aShortArray56[local1368];
						local1552 = local1347.aShortArray57[local1368];
						local1557 = local1347.aShortArray58[local1368];
						local319 = arg3[local1547];
						local383 = arg3[local1552];
						local447 = arg3[local1557];
						local511 = arg4[local1547];
						local272 = arg4[local1552];
						local336 = arg4[local1557];
						if ((local319 - local383) * (local336 - local272) - (local511 - local272) * (local447 - local383) > 0.0F) {
							@Pc(1924) int local1924 = local1347.anIntArray233[local1368];
							if (local1924 != -1) {
								arg2.aBoolean558 = local319 < 0.0F || local383 < 0.0F || local447 < 0.0F || local319 > (float) arg2.anInt3270 || local383 > (float) arg2.anInt3270 || local447 > (float) arg2.anInt3270;
								arg2.method24354(true, true, false, local511, local272, local336, local319, local383, local447, arg5[local1547], arg5[local1552], arg5[local1557], (float) Class186.method24627(local1924, local1347.aShortArray59[local1547]), (float) Class186.method24627(local1924, local1347.aShortArray59[local1552]), (float) Class186.method24627(local1924, local1347.aShortArray59[local1557]));
							}
						}
					}
				} else {
					for (local1368 = 0; local1368 < local1347.aShort103; local1368++) {
						local1547 = local1347.aShortArray56[local1368];
						local1552 = local1347.aShortArray57[local1368];
						local1557 = local1347.aShortArray58[local1368];
						local319 = arg3[local1547];
						local383 = arg3[local1552];
						local447 = arg3[local1557];
						local511 = arg4[local1547];
						local272 = arg4[local1552];
						local336 = arg4[local1557];
						if ((local319 - local383) * (local336 - local272) - (local511 - local272) * (local447 - local383) > 0.0F) {
							arg2.aBoolean558 = local319 < 0.0F || local383 < 0.0F || local447 < 0.0F || local319 > (float) arg2.anInt3270 || local383 > (float) arg2.anInt3270 || local447 > (float) arg2.anInt3270;
							@Pc(1636) boolean local1636 = false;
							if (local1347.aShortArray52[local1368] != -1) {
								@Pc(1654) Class215 local1654 = this.aClass86_Sub2_3.aClass209_9.method25584(local1347.aShortArray52[local1368] & 0xFFFF);
								local1636 = local1654.aBoolean638;
							}
							if (local1636) {
								arg2.method24376(true, true, false, local511, local272, local336, local319, local383, local447, arg5[local1547], arg5[local1552], arg5[local1557], arg6[local1547], arg6[local1552], arg6[local1557], (float) local1347.aShortArray53[local1547] / (float) (this.anInt608 * 127780559), (float) local1347.aShortArray53[local1552] / (float) (this.anInt608 * 127780559), (float) local1347.aShortArray53[local1557] / (float) (this.anInt608 * 127780559), (float) local1347.aShortArray55[local1547] / (float) (this.anInt608 * 127780559), (float) local1347.aShortArray55[local1552] / (float) (this.anInt608 * 127780559), (float) local1347.aShortArray55[local1557] / (float) (this.anInt608 * 127780559), Class424.anIntArray462[local1347.aShortArray59[local1547] & 0xFFFF] & 0xFFFFFF | 0xFF000000, Class424.anIntArray462[local1347.aShortArray59[local1552] & 0xFFFF] & 0xFFFFFF | 0xFF000000, Class424.anIntArray462[local1347.aShortArray59[local1557] & 0xFFFF] & 0xFFFFFF | 0xFF000000, 0, 0.0F, 0.0F, 0.0F, local1347.aShortArray52[local1368] & 0xFFFF);
							} else {
								@Pc(1806) int local1806 = local1347.anIntArray233[local1368];
								if (local1806 != -1) {
									arg2.method24354(true, true, false, local511, local272, local336, local319, local383, local447, arg5[local1547], arg5[local1552], arg5[local1557], (float) Class186.method24627(local1806, local1347.aShortArray59[local1547]), (float) Class186.method24627(local1806, local1347.aShortArray59[local1552]), (float) Class186.method24627(local1806, local1347.aShortArray59[local1557]));
								}
							}
						}
					}
				}
			}
		} else if ((local6.aByte108 & 0x2) == 0) {
			if (arg8 != 0) {
				if ((local6.aByte108 & 0x4) == 0) {
					if ((arg8 & 0x2) != 0) {
						return;
					}
				} else if ((arg8 & 0x1) != 0) {
					return;
				}
			}
			@Pc(38) int local38 = arg0 * this.anInt608 * 127780559;
			local45 = local38 + this.anInt608 * 127780559;
			@Pc(52) int local52 = arg1 * this.anInt608 * 127780559;
			local59 = local52 + this.anInt608 * 127780559;
			@Pc(299) float local299;
			@Pc(363) float local363;
			@Pc(427) float local427;
			@Pc(491) float local491;
			@Pc(100) float local100;
			@Pc(140) float local140;
			@Pc(180) float local180;
			@Pc(220) float local220;
			@Pc(117) float local117;
			@Pc(157) float local157;
			@Pc(197) float local197;
			@Pc(237) float local237;
			@Pc(71) int local71;
			@Pc(373) float local373;
			@Pc(309) float local309;
			@Pc(437) float local437;
			@Pc(501) float local501;
			@Pc(400) float local400;
			@Pc(464) float local464;
			if ((local6.aByte108 & 0x1) == 0) {
				local71 = this.anIntArrayArray10[arg0][arg1];
				@Pc(528) int local528 = this.anIntArrayArray10[arg0 + 1][arg1];
				@Pc(539) int local539 = this.anIntArrayArray10[arg0 + 1][arg1 + 1];
				@Pc(548) int local548 = this.anIntArrayArray10[arg0][arg1 + 1];
				local100 = this.aFloat51 + this.aFloat38 * (float) local38 + this.aFloat49 * (float) local71 + this.aFloat45 * (float) local52;
				local117 = this.aFloat42 + this.aFloat39 * (float) local38 + this.aFloat50 * (float) local71 + this.aFloat46 * (float) local52;
				if (local100 < -local117) {
					return;
				}
				local140 = this.aFloat51 + this.aFloat38 * (float) local45 + this.aFloat49 * (float) local528 + this.aFloat45 * (float) local52;
				local157 = this.aFloat42 + this.aFloat39 * (float) local45 + this.aFloat50 * (float) local528 + this.aFloat46 * (float) local52;
				if (local140 < -local157) {
					return;
				}
				local180 = this.aFloat51 + this.aFloat38 * (float) local45 + this.aFloat49 * (float) local539 + this.aFloat45 * (float) local59;
				local197 = this.aFloat42 + this.aFloat39 * (float) local45 + this.aFloat50 * (float) local539 + this.aFloat46 * (float) local59;
				if (local180 < -local197) {
					return;
				}
				local220 = this.aFloat51 + this.aFloat38 * (float) local38 + this.aFloat49 * (float) local548 + this.aFloat45 * (float) local59;
				local237 = this.aFloat42 + this.aFloat39 * (float) local38 + this.aFloat50 * (float) local548 + this.aFloat46 * (float) local59;
				if (local220 < -local237) {
					return;
				}
				local272 = this.aFloat47 + this.aFloat37 * (float) local38 + this.aFloat40 * (float) local71 + this.aFloat44 * (float) local52;
				local282 = arg2.aFloat238 + arg2.aFloat239 * local272 / local117;
				local299 = this.aFloat48 + this.aFloat52 * (float) local38 + this.aFloat41 * (float) local71 + this.aFloat43 * (float) local52;
				local309 = arg2.aFloat240 + arg2.aFloat241 * local299 / local117;
				local319 = arg2.aFloat242 + arg2.aFloat243 * local100 / local117;
				local336 = this.aFloat47 + this.aFloat37 * (float) local45 + this.aFloat40 * (float) local528 + this.aFloat44 * (float) local52;
				local346 = arg2.aFloat238 + arg2.aFloat239 * local336 / local157;
				local363 = this.aFloat48 + this.aFloat52 * (float) local45 + this.aFloat41 * (float) local528 + this.aFloat43 * (float) local52;
				local373 = arg2.aFloat240 + arg2.aFloat241 * local363 / local157;
				local383 = arg2.aFloat242 + arg2.aFloat243 * local140 / local157;
				local400 = this.aFloat47 + this.aFloat37 * (float) local45 + this.aFloat40 * (float) local539 + this.aFloat44 * (float) local59;
				local410 = arg2.aFloat238 + arg2.aFloat239 * local400 / local197;
				local427 = this.aFloat48 + this.aFloat52 * (float) local45 + this.aFloat41 * (float) local539 + this.aFloat43 * (float) local59;
				local437 = arg2.aFloat240 + arg2.aFloat241 * local427 / local197;
				local447 = arg2.aFloat242 + arg2.aFloat243 * local180 / local197;
				local464 = this.aFloat47 + this.aFloat37 * (float) local38 + this.aFloat40 * (float) local548 + this.aFloat44 * (float) local59;
				local474 = arg2.aFloat238 + arg2.aFloat239 * local464 / local237;
				local491 = this.aFloat48 + this.aFloat52 * (float) local38 + this.aFloat41 * (float) local548 + this.aFloat43 * (float) local59;
				local501 = arg2.aFloat240 + arg2.aFloat241 * local491 / local237;
				local511 = arg2.aFloat242 + arg2.aFloat243 * local220 / local237;
			} else {
				local71 = this.anIntArrayArray10[arg0][arg1];
				@Pc(77) float local77 = this.aFloat49 * (float) local71;
				@Pc(83) float local83 = this.aFloat50 * (float) local71;
				local100 = this.aFloat51 + this.aFloat38 * (float) local38 + local77 + this.aFloat45 * (float) local52;
				local117 = this.aFloat42 + this.aFloat39 * (float) local38 + local83 + this.aFloat46 * (float) local52;
				if (local100 < -local117) {
					return;
				}
				local140 = this.aFloat51 + this.aFloat38 * (float) local45 + local77 + this.aFloat45 * (float) local52;
				local157 = this.aFloat42 + this.aFloat39 * (float) local45 + local83 + this.aFloat46 * (float) local52;
				if (local140 < -local157) {
					return;
				}
				local180 = this.aFloat51 + this.aFloat38 * (float) local45 + local77 + this.aFloat45 * (float) local59;
				local197 = this.aFloat42 + this.aFloat39 * (float) local45 + local83 + this.aFloat46 * (float) local59;
				if (local180 < -local197) {
					return;
				}
				local220 = this.aFloat51 + this.aFloat38 * (float) local38 + local77 + this.aFloat45 * (float) local59;
				local237 = this.aFloat42 + this.aFloat39 * (float) local38 + local83 + this.aFloat46 * (float) local59;
				if (local220 < -local237) {
					return;
				}
				@Pc(249) float local249 = this.aFloat40 * (float) local71;
				@Pc(255) float local255 = this.aFloat41 * (float) local71;
				local272 = this.aFloat47 + this.aFloat37 * (float) local38 + local249 + this.aFloat44 * (float) local52;
				local282 = arg2.aFloat238 + arg2.aFloat239 * local272 / local117;
				local299 = this.aFloat48 + this.aFloat52 * (float) local38 + local255 + this.aFloat43 * (float) local52;
				local309 = arg2.aFloat240 + arg2.aFloat241 * local299 / local117;
				local319 = arg2.aFloat242 + arg2.aFloat243 * local100 / local117;
				local336 = this.aFloat47 + this.aFloat37 * (float) local45 + local249 + this.aFloat44 * (float) local52;
				local346 = arg2.aFloat238 + arg2.aFloat239 * local336 / local157;
				local363 = this.aFloat48 + this.aFloat52 * (float) local45 + local255 + this.aFloat43 * (float) local52;
				local373 = arg2.aFloat240 + arg2.aFloat241 * local363 / local157;
				local383 = arg2.aFloat242 + arg2.aFloat243 * local140 / local157;
				local400 = this.aFloat47 + this.aFloat37 * (float) local45 + local249 + this.aFloat44 * (float) local59;
				local410 = arg2.aFloat238 + arg2.aFloat239 * local400 / local197;
				local427 = this.aFloat48 + this.aFloat52 * (float) local45 + local255 + this.aFloat43 * (float) local59;
				local437 = arg2.aFloat240 + arg2.aFloat241 * local427 / local197;
				local447 = arg2.aFloat242 + arg2.aFloat243 * local180 / local197;
				local464 = this.aFloat47 + this.aFloat37 * (float) local38 + local249 + this.aFloat44 * (float) local59;
				local474 = arg2.aFloat238 + arg2.aFloat239 * local464 / local237;
				local491 = this.aFloat48 + this.aFloat52 * (float) local38 + local255 + this.aFloat43 * (float) local59;
				local501 = arg2.aFloat240 + arg2.aFloat241 * local491 / local237;
				local511 = arg2.aFloat242 + arg2.aFloat243 * local220 / local237;
			}
			@Pc(1030) boolean local1030 = false;
			if (local6.aShort147 != -1) {
				@Pc(1044) Class215 local1044 = this.aClass86_Sub2_3.aClass209_9.method25584(local6.aShort147 & 0xFFFF);
				local1030 = local1044.aBoolean638;
			}
			if ((local410 - local474) * (local373 - local501) - (local437 - local501) * (local346 - local474) > 0.0F) {
				arg2.aBoolean558 = local410 < 0.0F || local474 < 0.0F || local346 < 0.0F || local410 > (float) arg2.anInt3270 || local474 > (float) arg2.anInt3270 || local346 > (float) arg2.anInt3270;
				if (local1030) {
					arg2.method24376(true, true, false, local437, local501, local373, local410, local474, local346, local447, local511, local383, local197, local237, local157, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, Class424.anIntArray462[local6.aShort148 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Class424.anIntArray462[local6.aShort149 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Class424.anIntArray462[local6.aShort150 & 0xFFFF] & 0xFFFFFF | 0xFF000000, 0, 0.0F, 0.0F, 0.0F, local6.aShort147 & 0xFFFF);
				} else {
					arg2.method24354(true, true, false, local437, local501, local373, local410, local474, local346, local447, local511, local383, (float) (local6.aShort148 & 0xFFFF), (float) (local6.aShort149 & 0xFFFF), (float) (local6.aShort150 & 0xFFFF));
				}
			}
			if ((local282 - local346) * (local501 - local373) - (local309 - local373) * (local474 - local346) > 0.0F) {
				arg2.aBoolean558 = local282 < 0.0F || local346 < 0.0F || local474 < 0.0F || local282 > (float) arg2.anInt3270 || local346 > (float) arg2.anInt3270 || local474 > (float) arg2.anInt3270;
				if (local1030) {
					arg2.method24376(true, true, false, local309, local373, local501, local282, local346, local474, local319, local383, local511, local117, local157, local237, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, Class424.anIntArray462[local6.aShort146 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Class424.anIntArray462[local6.aShort150 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Class424.anIntArray462[local6.aShort149 & 0xFFFF] & 0xFFFFFF | 0xFF000000, 0, 0.0F, 0.0F, 0.0F, local6.aShort147 & 0xFFFF);
				} else {
					arg2.method24354(true, true, false, local309, local373, local501, local282, local346, local474, local319, local383, local511, (float) (local6.aShort146 & 0xFFFF), (float) (local6.aShort150 & 0xFFFF), (float) (local6.aShort149 & 0xFFFF));
				}
			}
		}
	}

	@OriginalMember(owner = "client!aep", name = "bt", descriptor = "(IIZLclient!af;Lclient!ba;[F[F[F[F[FI)V", line = 841)
	void method5554(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class95 arg3, @OriginalArg(4) Class163 arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) float[] arg7, @OriginalArg(8) float[] arg8, @OriginalArg(9) float[] arg9, @OriginalArg(10) int arg10) {
		@Pc(6) Class165 local6 = this.aClass165ArrayArray1[arg0][arg1];
		@Pc(45) int local45;
		@Pc(52) int local52;
		@Pc(59) int local59;
		@Pc(415) float local415;
		@Pc(469) float local469;
		@Pc(523) float local523;
		@Pc(577) float local577;
		@Pc(442) float local442;
		@Pc(550) float local550;
		@Pc(273) float local273;
		@Pc(283) float local283;
		@Pc(293) float local293;
		@Pc(405) float local405;
		@Pc(459) float local459;
		@Pc(513) float local513;
		@Pc(567) float local567;
		if (local6 == null) {
			@Pc(2006) Class171 local2006 = this.aClass171ArrayArray1[arg0][arg1];
			if (local2006 != null) {
				if (arg10 != 0) {
					if ((local2006.aByte105 & 0x4) == 0) {
						if ((arg10 & 0x2) != 0) {
							return;
						}
					} else if ((arg10 & 0x1) != 0) {
						return;
					}
				}
				@Pc(2027) int local2027;
				@Pc(2157) int local2157;
				for (local2027 = 0; local2027 < local2006.aShort143; local2027++) {
					local45 = local2006.aShortArray77[local2027] + (arg0 << this.anInt609 * -1495101509);
					local52 = local2006.aShortArray79[local2027];
					local59 = local2006.aShortArray80[local2027] + (arg1 << this.anInt609 * -1495101509);
					local523 = this.aFloat51 + this.aFloat38 * (float) local45 + this.aFloat49 * (float) local52 + this.aFloat45 * (float) local59;
					local577 = this.aFloat42 + this.aFloat39 * (float) local45 + this.aFloat50 * (float) local52 + this.aFloat46 * (float) local59;
					if (local523 < -local577) {
						return;
					}
					local442 = arg4.aFloat242 + arg4.aFloat243 * local523 / local577;
					arg9[local2027] = 0.0F;
					if (arg2) {
						local550 = local523 - arg3.aFloat78;
						if (local550 > 0.0F) {
							local550 /= arg3.aFloat79;
							if (local550 > 1.0F) {
								local550 = 1.0F;
							}
							arg9[local2027] = local550;
							local2157 = (int) ((float) local2006.aShortArray78[local2027] * local550);
							if (local2157 > 0) {
								local52 -= local2157;
							}
						}
					} else if (arg3.aBoolean161) {
						local550 = local523 - arg3.aFloat78;
						if (local550 > 0.0F) {
							arg9[local2027] = local550 / arg3.aFloat79;
							if (arg9[local2027] > 1.0F) {
								arg9[local2027] = 1.0F;
							}
						}
					}
					local415 = this.aFloat47 + this.aFloat37 * (float) local45 + this.aFloat40 * (float) local52 + this.aFloat44 * (float) local59;
					local469 = this.aFloat48 + this.aFloat52 * (float) local45 + this.aFloat41 * (float) local52 + this.aFloat43 * (float) local59;
					arg5[local2027] = arg4.aFloat238 + arg4.aFloat239 * local415 / local577;
					arg6[local2027] = arg4.aFloat240 + arg4.aFloat241 * local469 / local577;
					arg7[local2027] = local442;
					arg8[local2027] = local577;
				}
				@Pc(2290) int local2290;
				@Pc(2282) int local2282;
				if (local2006.aShortArray81 == null) {
					for (local2027 = 0; local2027 < local2006.aShort144; local2027++) {
						local2282 = local2027 * 3;
						local2157 = local2282 + 1;
						local2290 = local2157 + 1;
						local273 = arg5[local2282];
						local283 = arg5[local2157];
						local293 = arg5[local2290];
						local405 = arg6[local2282];
						local459 = arg6[local2157];
						local513 = arg6[local2290];
						local567 = arg9[local2282] + arg9[local2157] + arg9[local2290];
						if ((local273 - local283) * (local513 - local459) - (local405 - local459) * (local293 - local283) > 0.0F) {
							arg4.aBoolean558 = local273 < 0.0F || local283 < 0.0F || local293 < 0.0F || local273 > (float) arg4.anInt3270 || local283 > (float) arg4.anInt3270 || local293 > (float) arg4.anInt3270;
							if (local567 >= 3.0F) {
								arg4.method24367(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2282], arg7[local2157], arg7[local2290], arg3.anInt789 * 1046269871);
							} else if (local567 > 0.0F) {
								if ((local2006.anIntArray309[local2282] & 0xFFFFFF) != 0) {
									arg4.method24361(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2282], arg7[local2157], arg7[local2290], Class636.method32688(local2006.anIntArray309[local2282], arg3.anInt789 * 1046269871, arg9[local2282] * 255.0F), Class636.method32688(local2006.anIntArray309[local2157], arg3.anInt789 * 1046269871, arg9[local2157] * 255.0F), Class636.method32688(local2006.anIntArray309[local2290], arg3.anInt789 * 1046269871, arg9[local2290] * 255.0F));
								}
							} else if ((local2006.anIntArray309[local2282] & 0xFFFFFF) != 0) {
								arg4.method24361(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2282], arg7[local2157], arg7[local2290], local2006.anIntArray309[local2282], local2006.anIntArray309[local2157], local2006.anIntArray309[local2290]);
							}
						}
					}
				} else {
					for (local2027 = 0; local2027 < local2006.aShort144; local2027++) {
						local2282 = local2027 * 3;
						local2157 = local2282 + 1;
						local2290 = local2157 + 1;
						local273 = arg5[local2282];
						local283 = arg5[local2157];
						local293 = arg5[local2290];
						local405 = arg6[local2282];
						local459 = arg6[local2157];
						local513 = arg6[local2290];
						local567 = arg9[local2282] + arg9[local2157] + arg9[local2290];
						if ((local273 - local283) * (local513 - local459) - (local405 - local459) * (local293 - local283) > 0.0F) {
							arg4.aBoolean558 = local273 < 0.0F || local283 < 0.0F || local293 < 0.0F || local273 > (float) arg4.anInt3270 || local283 > (float) arg4.anInt3270 || local293 > (float) arg4.anInt3270;
							@Pc(2381) Class215 local2381 = null;
							@Pc(2383) boolean local2383 = false;
							if (local2006.aShortArray81[local2027] != -1) {
								local2381 = this.aClass86_Sub2_3.aClass209_9.method25584(local2006.aShortArray81[local2027] & 0xFFFF);
								local2383 = local2381.aBoolean638;
							}
							if (local567 < 3.0F) {
								@Pc(2416) int local2416;
								if (local567 > 0.0F) {
									if (local2383) {
										local2416 = -16777216;
										if (this.method5560(local2381.aByte118)) {
											local2416 = -1694498816;
										}
										arg4.method24376(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2282], arg7[local2157], arg7[local2290], arg8[local2282], arg8[local2157], arg8[local2290], (float) local2006.aShortArray77[local2282] / (float) (this.anInt608 * 127780559), (float) local2006.aShortArray77[local2157] / (float) (this.anInt608 * 127780559), (float) local2006.aShortArray77[local2290] / (float) (this.anInt608 * 127780559), (float) local2006.aShortArray80[local2282] / (float) (this.anInt608 * 127780559), (float) local2006.aShortArray80[local2157] / (float) (this.anInt608 * 127780559), (float) local2006.aShortArray80[local2290] / (float) (this.anInt608 * 127780559), local2416 | local2006.anIntArray309[local2282] & 0xFFFFFF, local2416 | local2006.anIntArray309[local2157] & 0xFFFFFF, local2416 | local2006.anIntArray309[local2290] & 0xFFFFFF, arg3.anInt789 * 1046269871, arg9[local2282] * 255.0F, arg9[local2157] * 255.0F, arg9[local2290] * 255.0F, local2006.aShortArray81[local2027] & 0xFFFF);
									} else if ((local2006.anIntArray309[local2282] & 0xFFFFFF) != 0) {
										arg4.method24361(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2282], arg7[local2157], arg7[local2290], Class334.method27666(local2006.anIntArray309[local2282], (int) (arg9[local2282] * 255.0F) << 24 | arg3.anInt789 * 1046269871), Class334.method27666(local2006.anIntArray309[local2157], (int) (arg9[local2157] * 255.0F) << 24 | arg3.anInt789 * 1046269871), Class334.method27666(local2006.anIntArray309[local2290], (int) (arg9[local2290] * 255.0F) << 24 | arg3.anInt789 * 1046269871));
										arg4.anInt3269 = 0;
									}
								} else if (local2383) {
									local2416 = -16777216;
									if (this.method5560(local2381.aByte118)) {
										local2416 = -1694498816;
									}
									arg4.method24376(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2282], arg7[local2157], arg7[local2290], arg8[local2282], arg8[local2157], arg8[local2290], (float) local2006.aShortArray77[local2282] / (float) (this.anInt608 * 127780559), (float) local2006.aShortArray77[local2157] / (float) (this.anInt608 * 127780559), (float) local2006.aShortArray77[local2290] / (float) (this.anInt608 * 127780559), (float) local2006.aShortArray80[local2282] / (float) (this.anInt608 * 127780559), (float) local2006.aShortArray80[local2157] / (float) (this.anInt608 * 127780559), (float) local2006.aShortArray80[local2290] / (float) (this.anInt608 * 127780559), local2416 | local2006.anIntArray309[local2282] & 0xFFFFFF, local2416 | local2006.anIntArray309[local2157] & 0xFFFFFF, local2416 | local2006.anIntArray309[local2290] & 0xFFFFFF, 0, 0.0F, 0.0F, 0.0F, local2006.aShortArray81[local2027] & 0xFFFF);
								} else if ((local2006.anIntArray309[local2282] & 0xFFFFFF) != 0) {
									arg4.method24361(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2282], arg7[local2157], arg7[local2290], local2006.anIntArray309[local2282], local2006.anIntArray309[local2157], local2006.anIntArray309[local2290]);
									arg4.anInt3269 = 0;
								}
							} else {
								arg4.method24367(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2282], arg7[local2157], arg7[local2290], arg3.anInt789 * 1046269871);
							}
						}
					}
				}
			}
		} else if ((local6.aByte104 & 0x2) == 0) {
			if (arg10 != 0) {
				if ((local6.aByte104 & 0x4) == 0) {
					if ((arg10 & 0x2) != 0) {
						return;
					}
				} else if ((arg10 & 0x1) != 0) {
					return;
				}
			}
			@Pc(38) int local38 = arg0 * this.anInt608 * 127780559;
			local45 = local38 + this.anInt608 * 127780559;
			local52 = arg1 * this.anInt608 * 127780559;
			local59 = local52 + this.anInt608 * 127780559;
			@Pc(61) float local61 = 0.0F;
			@Pc(63) float local63 = 0.0F;
			@Pc(65) float local65 = 0.0F;
			@Pc(67) float local67 = 0.0F;
			@Pc(594) float local594;
			@Pc(110) float local110;
			@Pc(150) float local150;
			@Pc(190) float local190;
			@Pc(230) float local230;
			@Pc(127) float local127;
			@Pc(167) float local167;
			@Pc(207) float local207;
			@Pc(247) float local247;
			@Pc(301) float local301;
			@Pc(81) int local81;
			@Pc(904) int local904;
			@Pc(496) float local496;
			@Pc(604) float local604;
			@Pc(263) float local263;
			@Pc(432) float local432;
			@Pc(486) float local486;
			@Pc(540) float local540;
			@Pc(382) float local382;
			if ((local6.aByte104 & 0x1) == 0 || arg2) {
				local81 = this.anIntArrayArray10[arg0][arg1];
				@Pc(621) int local621 = this.anIntArrayArray10[arg0 + 1][arg1];
				@Pc(632) int local632 = this.anIntArrayArray10[arg0 + 1][arg1 + 1];
				@Pc(641) int local641 = this.anIntArrayArray10[arg0][arg1 + 1];
				local110 = this.aFloat51 + this.aFloat38 * (float) local38 + this.aFloat49 * (float) local81 + this.aFloat45 * (float) local52;
				local127 = this.aFloat42 + this.aFloat39 * (float) local38 + this.aFloat50 * (float) local81 + this.aFloat46 * (float) local52;
				if (local110 < -local127) {
					return;
				}
				local150 = this.aFloat51 + this.aFloat38 * (float) local45 + this.aFloat49 * (float) local621 + this.aFloat45 * (float) local52;
				local167 = this.aFloat42 + this.aFloat39 * (float) local45 + this.aFloat50 * (float) local621 + this.aFloat46 * (float) local52;
				if (local150 < -local167) {
					return;
				}
				local190 = this.aFloat51 + this.aFloat38 * (float) local45 + this.aFloat49 * (float) local632 + this.aFloat45 * (float) local59;
				local207 = this.aFloat42 + this.aFloat39 * (float) local45 + this.aFloat50 * (float) local632 + this.aFloat46 * (float) local59;
				if (local190 < -local207) {
					return;
				}
				local230 = this.aFloat51 + this.aFloat38 * (float) local38 + this.aFloat49 * (float) local641 + this.aFloat45 * (float) local59;
				local247 = this.aFloat42 + this.aFloat39 * (float) local38 + this.aFloat50 * (float) local641 + this.aFloat46 * (float) local59;
				if (local230 < -local247) {
					return;
				}
				local263 = arg4.aFloat242 + arg4.aFloat243 * local110 / local127;
				local273 = arg4.aFloat242 + arg4.aFloat243 * local150 / local167;
				local283 = arg4.aFloat242 + arg4.aFloat243 * local190 / local207;
				local293 = arg4.aFloat242 + arg4.aFloat243 * local230 / local247;
				if (arg2) {
					local301 = local110 - arg3.aFloat78;
					if (local301 > 0.0F) {
						local301 /= arg3.aFloat79;
						if (local301 > 1.0F) {
							local301 = 1.0F;
						}
						local61 = local301;
						local904 = (int) ((float) local6.aShort140 * local301);
						if (local904 > 0) {
							local81 -= local904;
						}
					}
					local301 = local150 - arg3.aFloat78;
					if (local301 > 0.0F) {
						local301 /= arg3.aFloat79;
						if (local301 > 1.0F) {
							local301 = 1.0F;
						}
						local63 = local301;
						local904 = (int) ((float) local6.aShort139 * local301);
						if (local904 > 0) {
							local621 -= local904;
						}
					}
					local301 = local190 - arg3.aFloat78;
					if (local301 > 0.0F) {
						local301 /= arg3.aFloat79;
						if (local301 > 1.0F) {
							local301 = 1.0F;
						}
						local65 = local301;
						local904 = (int) ((float) local6.aShort141 * local301);
						if (local904 > 0) {
							local632 -= local904;
						}
					}
					local301 = local230 - arg3.aFloat78;
					if (local301 > 0.0F) {
						local301 /= arg3.aFloat79;
						if (local301 > 1.0F) {
							local301 = 1.0F;
						}
						local67 = local301;
						local904 = (int) ((float) local6.aShort138 * local301);
						if (local904 > 0) {
							local641 -= local904;
						}
					}
				} else if (arg3.aBoolean161) {
					local301 = local110 - arg3.aFloat78;
					if (local301 > 0.0F) {
						local61 = local301 / arg3.aFloat79;
						if (local61 > 1.0F) {
							local61 = 1.0F;
						}
					}
					local301 = local150 - arg3.aFloat78;
					if (local301 > 0.0F) {
						local63 = local301 / arg3.aFloat79;
						if (local63 > 1.0F) {
							local63 = 1.0F;
						}
					}
					local301 = local190 - arg3.aFloat78;
					if (local301 > 0.0F) {
						local65 = local301 / arg3.aFloat79;
						if (local65 > 1.0F) {
							local65 = 1.0F;
						}
					}
					local301 = local230 - arg3.aFloat78;
					if (local301 > 0.0F) {
						local67 = local301 / arg3.aFloat79;
						if (local67 > 1.0F) {
							local67 = 1.0F;
						}
					}
				}
				local405 = this.aFloat47 + this.aFloat37 * (float) local38 + this.aFloat40 * (float) local81 + this.aFloat44 * (float) local52;
				local415 = arg4.aFloat238 + arg4.aFloat239 * local405 / local127;
				local432 = this.aFloat48 + this.aFloat52 * (float) local38 + this.aFloat41 * (float) local81 + this.aFloat43 * (float) local52;
				local442 = arg4.aFloat240 + arg4.aFloat241 * local432 / local127;
				local459 = this.aFloat47 + this.aFloat37 * (float) local45 + this.aFloat40 * (float) local621 + this.aFloat44 * (float) local52;
				local469 = arg4.aFloat238 + arg4.aFloat239 * local459 / local167;
				local486 = this.aFloat48 + this.aFloat52 * (float) local45 + this.aFloat41 * (float) local621 + this.aFloat43 * (float) local52;
				local496 = arg4.aFloat240 + arg4.aFloat241 * local486 / local167;
				local513 = this.aFloat47 + this.aFloat37 * (float) local45 + this.aFloat40 * (float) local632 + this.aFloat44 * (float) local59;
				local523 = arg4.aFloat238 + arg4.aFloat239 * local513 / local207;
				local540 = this.aFloat48 + this.aFloat52 * (float) local45 + this.aFloat41 * (float) local632 + this.aFloat43 * (float) local59;
				local550 = arg4.aFloat240 + arg4.aFloat241 * local540 / local207;
				local567 = this.aFloat47 + this.aFloat37 * (float) local38 + this.aFloat40 * (float) local641 + this.aFloat44 * (float) local59;
				local577 = arg4.aFloat238 + arg4.aFloat239 * local567 / local247;
				local594 = this.aFloat48 + this.aFloat52 * (float) local38 + this.aFloat41 * (float) local641 + this.aFloat43 * (float) local59;
				local604 = arg4.aFloat240 + arg4.aFloat241 * local594 / local247;
			} else {
				local81 = this.anIntArrayArray10[arg0][arg1];
				@Pc(87) float local87 = this.aFloat49 * (float) local81;
				@Pc(93) float local93 = this.aFloat50 * (float) local81;
				local110 = this.aFloat51 + this.aFloat38 * (float) local38 + local87 + this.aFloat45 * (float) local52;
				local127 = this.aFloat42 + this.aFloat39 * (float) local38 + local93 + this.aFloat46 * (float) local52;
				if (local110 < -local127) {
					return;
				}
				local150 = this.aFloat51 + this.aFloat38 * (float) local45 + local87 + this.aFloat45 * (float) local52;
				local167 = this.aFloat42 + this.aFloat39 * (float) local45 + local93 + this.aFloat46 * (float) local52;
				if (local150 < -local167) {
					return;
				}
				local190 = this.aFloat51 + this.aFloat38 * (float) local45 + local87 + this.aFloat45 * (float) local59;
				local207 = this.aFloat42 + this.aFloat39 * (float) local45 + local93 + this.aFloat46 * (float) local59;
				if (local190 < -local207) {
					return;
				}
				local230 = this.aFloat51 + this.aFloat38 * (float) local38 + local87 + this.aFloat45 * (float) local59;
				local247 = this.aFloat42 + this.aFloat39 * (float) local38 + local93 + this.aFloat46 * (float) local59;
				if (local230 < -local247) {
					return;
				}
				local263 = arg4.aFloat242 + arg4.aFloat243 * local110 / local127;
				local273 = arg4.aFloat242 + arg4.aFloat243 * local150 / local167;
				local283 = arg4.aFloat242 + arg4.aFloat243 * local190 / local207;
				local293 = arg4.aFloat242 + arg4.aFloat243 * local230 / local247;
				if (arg3.aBoolean161) {
					local301 = local110 - arg3.aFloat78;
					if (local301 > 0.0F) {
						local61 = local301 / arg3.aFloat79;
						if (local61 > 1.0F) {
							local61 = 1.0F;
						}
					}
					local301 = local150 - arg3.aFloat78;
					if (local301 > 0.0F) {
						local63 = local301 / arg3.aFloat79;
						if (local63 > 1.0F) {
							local63 = 1.0F;
						}
					}
					local301 = local190 - arg3.aFloat78;
					if (local301 > 0.0F) {
						local65 = local301 / arg3.aFloat79;
						if (local65 > 1.0F) {
							local65 = 1.0F;
						}
					}
					local301 = local230 - arg3.aFloat78;
					if (local301 > 0.0F) {
						local67 = local301 / arg3.aFloat79;
						if (local67 > 1.0F) {
							local67 = 1.0F;
						}
					}
				}
				local382 = this.aFloat40 * (float) local81;
				@Pc(388) float local388 = this.aFloat41 * (float) local81;
				local405 = this.aFloat47 + this.aFloat37 * (float) local38 + local382 + this.aFloat44 * (float) local52;
				local415 = arg4.aFloat238 + arg4.aFloat239 * local405 / local127;
				local432 = this.aFloat48 + this.aFloat52 * (float) local38 + local388 + this.aFloat43 * (float) local52;
				local442 = arg4.aFloat240 + arg4.aFloat241 * local432 / local127;
				local459 = this.aFloat47 + this.aFloat37 * (float) local45 + local382 + this.aFloat44 * (float) local52;
				local469 = arg4.aFloat238 + arg4.aFloat239 * local459 / local167;
				local486 = this.aFloat48 + this.aFloat52 * (float) local45 + local388 + this.aFloat43 * (float) local52;
				local496 = arg4.aFloat240 + arg4.aFloat241 * local486 / local167;
				local513 = this.aFloat47 + this.aFloat37 * (float) local45 + local382 + this.aFloat44 * (float) local59;
				local523 = arg4.aFloat238 + arg4.aFloat239 * local513 / local207;
				local540 = this.aFloat48 + this.aFloat52 * (float) local45 + local388 + this.aFloat43 * (float) local59;
				local550 = arg4.aFloat240 + arg4.aFloat241 * local540 / local207;
				local567 = this.aFloat47 + this.aFloat37 * (float) local38 + local382 + this.aFloat44 * (float) local59;
				local577 = arg4.aFloat238 + arg4.aFloat239 * local567 / local247;
				local594 = this.aFloat48 + this.aFloat52 * (float) local38 + local388 + this.aFloat43 * (float) local59;
				local604 = arg4.aFloat240 + arg4.aFloat241 * local594 / local247;
			}
			@Pc(1349) Class215 local1349 = null;
			@Pc(1351) boolean local1351 = false;
			if (local6.aShort142 != -1) {
				local1349 = this.aClass86_Sub2_3.aClass209_9.method25584(local6.aShort142 & 0xFFFF);
				local1351 = local1349.aBoolean638;
			}
			@Pc(1379) boolean local1379 = local1349 != null && this.method5560(local1349.aByte118);
			local382 = local63 + local65 + local67;
			if ((local523 - local577) * (local496 - local604) - (local550 - local604) * (local469 - local577) > 0.0F) {
				arg4.aBoolean558 = local523 < 0.0F || local577 < 0.0F || local469 < 0.0F || local523 > (float) arg4.anInt3270 || local577 > (float) arg4.anInt3270 || local469 > (float) arg4.anInt3270;
				if (local382 >= 3.0F) {
					arg4.method24367(true, true, false, local550, local604, local496, local523, local577, local469, local283, local293, local273, arg3.anInt789 * 1046269871);
				} else if (local382 > 0.0F) {
					if (local1351) {
						local904 = -16777216;
						if (local1379) {
							local904 = -1694498816;
						}
						arg4.method24376(true, true, false, local550, local604, local496, local523, local577, local469, local283, local293, local273, local207, local247, local167, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, local904 | local6.anInt3282 & 0xFFFFFF, local904 | local6.anInt3280 & 0xFFFFFF, local904 | local6.anInt3279 & 0xFFFFFF, arg3.anInt789 * 1046269871, local65 * 255.0F, local67 * 255.0F, local63 * 255.0F, local6.aShort142 & 0xFFFF);
					} else {
						if (local1379) {
							arg4.anInt3269 = 100;
						}
						arg4.method24361(true, true, false, local550, local604, local496, local523, local577, local469, local283, local293, local273, Class334.method27666(local6.anInt3282, (int) (local65 * 255.0F) << 24 | arg3.anInt789 * 1046269871), Class334.method27666(local6.anInt3280, (int) (local67 * 255.0F) << 24 | arg3.anInt789 * 1046269871), Class334.method27666(local6.anInt3279, (int) (local63 * 255.0F) << 24 | arg3.anInt789 * 1046269871));
						arg4.anInt3269 = 0;
					}
				} else if (local1351) {
					local904 = -16777216;
					if (local1379) {
						local904 = -1694498816;
					}
					arg4.method24376(true, true, false, local550, local604, local496, local523, local577, local469, local283, local293, local273, local207, local247, local167, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, local904 | local6.anInt3282 & 0xFFFFFF, local904 | local6.anInt3280 & 0xFFFFFF, local904 | local6.anInt3279 & 0xFFFFFF, 0, 0.0F, 0.0F, 0.0F, local6.aShort142 & 0xFFFF);
				} else {
					if (local1379) {
						arg4.anInt3269 = 100;
					}
					arg4.method24361(true, true, false, local550, local604, local496, local523, local577, local469, local283, local293, local273, local6.anInt3282, local6.anInt3280, local6.anInt3279);
					arg4.anInt3269 = 0;
				}
			}
			local382 = local61 + local63 + local67;
			if ((local415 - local469) * (local604 - local496) - (local442 - local496) * (local577 - local469) > 0.0F) {
				arg4.aBoolean558 = local415 < 0.0F || local469 < 0.0F || local577 < 0.0F || local415 > (float) arg4.anInt3270 || local469 > (float) arg4.anInt3270 || local577 > (float) arg4.anInt3270;
				if (local382 < 3.0F) {
					if (local1379) {
						arg4.anInt3269 = -1694498816;
					}
					if (local382 > 0.0F) {
						if (local1351) {
							local904 = -16777216;
							if (local1379) {
								local904 = -1694498816;
							}
							arg4.method24376(true, true, false, local442, local496, local604, local415, local469, local577, local263, local273, local293, local127, local167, local247, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, local904 | local6.anInt3281 & 0xFFFFFF, local904 | local6.anInt3279 & 0xFFFFFF, local904 | local6.anInt3280 & 0xFFFFFF, arg3.anInt789 * 1046269871, local61 * 255.0F, local63 * 255.0F, local67 * 255.0F, local6.aShort142 & 0xFFFF);
						} else {
							if (local1379) {
								arg4.anInt3269 = 100;
							}
							arg4.method24361(true, true, false, local442, local496, local604, local415, local469, local577, local263, local273, local293, Class334.method27666(local6.anInt3281, (int) (local61 * 255.0F) << 24 | arg3.anInt789 * 1046269871), Class334.method27666(local6.anInt3279, (int) (local63 * 255.0F) << 24 | arg3.anInt789 * 1046269871), Class334.method27666(local6.anInt3280, (int) (local67 * 255.0F) << 24 | arg3.anInt789 * 1046269871));
							arg4.anInt3269 = 0;
						}
					} else if (local1351) {
						local904 = -16777216;
						if (local1379) {
							local904 = -1694498816;
						}
						arg4.method24376(true, true, false, local442, local496, local604, local415, local469, local577, local263, local273, local293, local127, local167, local247, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, local904 | local6.anInt3281 & 0xFFFFFF, local904 | local6.anInt3279 & 0xFFFFFF, local904 | local6.anInt3280 & 0xFFFFFF, 0, 0.0F, 0.0F, 0.0F, local6.aShort142 & 0xFFFF);
					} else {
						if (local1379) {
							arg4.anInt3269 = 100;
						}
						arg4.method24361(true, true, false, local442, local496, local604, local415, local469, local577, local263, local273, local293, local6.anInt3281, local6.anInt3279, local6.anInt3280);
						arg4.anInt3269 = 0;
					}
				} else {
					arg4.method24367(true, true, false, local442, local496, local604, local415, local469, local577, local263, local273, local293, arg3.anInt789 * 1046269871);
				}
			}
		}
	}

	@OriginalMember(owner = "client!aep", name = "bs", descriptor = "(IIZLclient!af;Lclient!ba;[F[F[F[F[FI)V", line = 841)
	void method5555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class95 arg3, @OriginalArg(4) Class163 arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) float[] arg7, @OriginalArg(8) float[] arg8, @OriginalArg(9) float[] arg9, @OriginalArg(10) int arg10) {
		@Pc(6) Class165 local6 = this.aClass165ArrayArray1[arg0][arg1];
		@Pc(45) int local45;
		@Pc(52) int local52;
		@Pc(59) int local59;
		@Pc(415) float local415;
		@Pc(469) float local469;
		@Pc(523) float local523;
		@Pc(577) float local577;
		@Pc(442) float local442;
		@Pc(550) float local550;
		@Pc(273) float local273;
		@Pc(283) float local283;
		@Pc(293) float local293;
		@Pc(405) float local405;
		@Pc(459) float local459;
		@Pc(513) float local513;
		@Pc(567) float local567;
		if (local6 == null) {
			@Pc(2006) Class171 local2006 = this.aClass171ArrayArray1[arg0][arg1];
			if (local2006 != null) {
				if (arg10 != 0) {
					if ((local2006.aByte105 & 0x4) == 0) {
						if ((arg10 & 0x2) != 0) {
							return;
						}
					} else if ((arg10 & 0x1) != 0) {
						return;
					}
				}
				@Pc(2027) int local2027;
				@Pc(2157) int local2157;
				for (local2027 = 0; local2027 < local2006.aShort143; local2027++) {
					local45 = local2006.aShortArray77[local2027] + (arg0 << this.anInt609 * -1495101509);
					local52 = local2006.aShortArray79[local2027];
					local59 = local2006.aShortArray80[local2027] + (arg1 << this.anInt609 * -1495101509);
					local523 = this.aFloat51 + this.aFloat38 * (float) local45 + this.aFloat49 * (float) local52 + this.aFloat45 * (float) local59;
					local577 = this.aFloat42 + this.aFloat39 * (float) local45 + this.aFloat50 * (float) local52 + this.aFloat46 * (float) local59;
					if (local523 < -local577) {
						return;
					}
					local442 = arg4.aFloat242 + arg4.aFloat243 * local523 / local577;
					arg9[local2027] = 0.0F;
					if (arg2) {
						local550 = local523 - arg3.aFloat78;
						if (local550 > 0.0F) {
							local550 /= arg3.aFloat79;
							if (local550 > 1.0F) {
								local550 = 1.0F;
							}
							arg9[local2027] = local550;
							local2157 = (int) ((float) local2006.aShortArray78[local2027] * local550);
							if (local2157 > 0) {
								local52 -= local2157;
							}
						}
					} else if (arg3.aBoolean161) {
						local550 = local523 - arg3.aFloat78;
						if (local550 > 0.0F) {
							arg9[local2027] = local550 / arg3.aFloat79;
							if (arg9[local2027] > 1.0F) {
								arg9[local2027] = 1.0F;
							}
						}
					}
					local415 = this.aFloat47 + this.aFloat37 * (float) local45 + this.aFloat40 * (float) local52 + this.aFloat44 * (float) local59;
					local469 = this.aFloat48 + this.aFloat52 * (float) local45 + this.aFloat41 * (float) local52 + this.aFloat43 * (float) local59;
					arg5[local2027] = arg4.aFloat238 + arg4.aFloat239 * local415 / local577;
					arg6[local2027] = arg4.aFloat240 + arg4.aFloat241 * local469 / local577;
					arg7[local2027] = local442;
					arg8[local2027] = local577;
				}
				@Pc(2290) int local2290;
				@Pc(2282) int local2282;
				if (local2006.aShortArray81 == null) {
					for (local2027 = 0; local2027 < local2006.aShort144; local2027++) {
						local2282 = local2027 * 3;
						local2157 = local2282 + 1;
						local2290 = local2157 + 1;
						local273 = arg5[local2282];
						local283 = arg5[local2157];
						local293 = arg5[local2290];
						local405 = arg6[local2282];
						local459 = arg6[local2157];
						local513 = arg6[local2290];
						local567 = arg9[local2282] + arg9[local2157] + arg9[local2290];
						if ((local273 - local283) * (local513 - local459) - (local405 - local459) * (local293 - local283) > 0.0F) {
							arg4.aBoolean558 = local273 < 0.0F || local283 < 0.0F || local293 < 0.0F || local273 > (float) arg4.anInt3270 || local283 > (float) arg4.anInt3270 || local293 > (float) arg4.anInt3270;
							if (local567 >= 3.0F) {
								arg4.method24367(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2282], arg7[local2157], arg7[local2290], arg3.anInt789 * 1046269871);
							} else if (local567 > 0.0F) {
								if ((local2006.anIntArray309[local2282] & 0xFFFFFF) != 0) {
									arg4.method24361(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2282], arg7[local2157], arg7[local2290], Class636.method32688(local2006.anIntArray309[local2282], arg3.anInt789 * 1046269871, arg9[local2282] * 255.0F), Class636.method32688(local2006.anIntArray309[local2157], arg3.anInt789 * 1046269871, arg9[local2157] * 255.0F), Class636.method32688(local2006.anIntArray309[local2290], arg3.anInt789 * 1046269871, arg9[local2290] * 255.0F));
								}
							} else if ((local2006.anIntArray309[local2282] & 0xFFFFFF) != 0) {
								arg4.method24361(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2282], arg7[local2157], arg7[local2290], local2006.anIntArray309[local2282], local2006.anIntArray309[local2157], local2006.anIntArray309[local2290]);
							}
						}
					}
				} else {
					for (local2027 = 0; local2027 < local2006.aShort144; local2027++) {
						local2282 = local2027 * 3;
						local2157 = local2282 + 1;
						local2290 = local2157 + 1;
						local273 = arg5[local2282];
						local283 = arg5[local2157];
						local293 = arg5[local2290];
						local405 = arg6[local2282];
						local459 = arg6[local2157];
						local513 = arg6[local2290];
						local567 = arg9[local2282] + arg9[local2157] + arg9[local2290];
						if ((local273 - local283) * (local513 - local459) - (local405 - local459) * (local293 - local283) > 0.0F) {
							arg4.aBoolean558 = local273 < 0.0F || local283 < 0.0F || local293 < 0.0F || local273 > (float) arg4.anInt3270 || local283 > (float) arg4.anInt3270 || local293 > (float) arg4.anInt3270;
							@Pc(2381) Class215 local2381 = null;
							@Pc(2383) boolean local2383 = false;
							if (local2006.aShortArray81[local2027] != -1) {
								local2381 = this.aClass86_Sub2_3.aClass209_9.method25584(local2006.aShortArray81[local2027] & 0xFFFF);
								local2383 = local2381.aBoolean638;
							}
							if (local567 < 3.0F) {
								@Pc(2416) int local2416;
								if (local567 > 0.0F) {
									if (local2383) {
										local2416 = -16777216;
										if (this.method5560(local2381.aByte118)) {
											local2416 = -1694498816;
										}
										arg4.method24376(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2282], arg7[local2157], arg7[local2290], arg8[local2282], arg8[local2157], arg8[local2290], (float) local2006.aShortArray77[local2282] / (float) (this.anInt608 * 127780559), (float) local2006.aShortArray77[local2157] / (float) (this.anInt608 * 127780559), (float) local2006.aShortArray77[local2290] / (float) (this.anInt608 * 127780559), (float) local2006.aShortArray80[local2282] / (float) (this.anInt608 * 127780559), (float) local2006.aShortArray80[local2157] / (float) (this.anInt608 * 127780559), (float) local2006.aShortArray80[local2290] / (float) (this.anInt608 * 127780559), local2416 | local2006.anIntArray309[local2282] & 0xFFFFFF, local2416 | local2006.anIntArray309[local2157] & 0xFFFFFF, local2416 | local2006.anIntArray309[local2290] & 0xFFFFFF, arg3.anInt789 * 1046269871, arg9[local2282] * 255.0F, arg9[local2157] * 255.0F, arg9[local2290] * 255.0F, local2006.aShortArray81[local2027] & 0xFFFF);
									} else if ((local2006.anIntArray309[local2282] & 0xFFFFFF) != 0) {
										arg4.method24361(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2282], arg7[local2157], arg7[local2290], Class334.method27666(local2006.anIntArray309[local2282], (int) (arg9[local2282] * 255.0F) << 24 | arg3.anInt789 * 1046269871), Class334.method27666(local2006.anIntArray309[local2157], (int) (arg9[local2157] * 255.0F) << 24 | arg3.anInt789 * 1046269871), Class334.method27666(local2006.anIntArray309[local2290], (int) (arg9[local2290] * 255.0F) << 24 | arg3.anInt789 * 1046269871));
										arg4.anInt3269 = 0;
									}
								} else if (local2383) {
									local2416 = -16777216;
									if (this.method5560(local2381.aByte118)) {
										local2416 = -1694498816;
									}
									arg4.method24376(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2282], arg7[local2157], arg7[local2290], arg8[local2282], arg8[local2157], arg8[local2290], (float) local2006.aShortArray77[local2282] / (float) (this.anInt608 * 127780559), (float) local2006.aShortArray77[local2157] / (float) (this.anInt608 * 127780559), (float) local2006.aShortArray77[local2290] / (float) (this.anInt608 * 127780559), (float) local2006.aShortArray80[local2282] / (float) (this.anInt608 * 127780559), (float) local2006.aShortArray80[local2157] / (float) (this.anInt608 * 127780559), (float) local2006.aShortArray80[local2290] / (float) (this.anInt608 * 127780559), local2416 | local2006.anIntArray309[local2282] & 0xFFFFFF, local2416 | local2006.anIntArray309[local2157] & 0xFFFFFF, local2416 | local2006.anIntArray309[local2290] & 0xFFFFFF, 0, 0.0F, 0.0F, 0.0F, local2006.aShortArray81[local2027] & 0xFFFF);
								} else if ((local2006.anIntArray309[local2282] & 0xFFFFFF) != 0) {
									arg4.method24361(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2282], arg7[local2157], arg7[local2290], local2006.anIntArray309[local2282], local2006.anIntArray309[local2157], local2006.anIntArray309[local2290]);
									arg4.anInt3269 = 0;
								}
							} else {
								arg4.method24367(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2282], arg7[local2157], arg7[local2290], arg3.anInt789 * 1046269871);
							}
						}
					}
				}
			}
		} else if ((local6.aByte104 & 0x2) == 0) {
			if (arg10 != 0) {
				if ((local6.aByte104 & 0x4) == 0) {
					if ((arg10 & 0x2) != 0) {
						return;
					}
				} else if ((arg10 & 0x1) != 0) {
					return;
				}
			}
			@Pc(38) int local38 = arg0 * this.anInt608 * 127780559;
			local45 = local38 + this.anInt608 * 127780559;
			local52 = arg1 * this.anInt608 * 127780559;
			local59 = local52 + this.anInt608 * 127780559;
			@Pc(61) float local61 = 0.0F;
			@Pc(63) float local63 = 0.0F;
			@Pc(65) float local65 = 0.0F;
			@Pc(67) float local67 = 0.0F;
			@Pc(594) float local594;
			@Pc(110) float local110;
			@Pc(150) float local150;
			@Pc(190) float local190;
			@Pc(230) float local230;
			@Pc(127) float local127;
			@Pc(167) float local167;
			@Pc(207) float local207;
			@Pc(247) float local247;
			@Pc(301) float local301;
			@Pc(81) int local81;
			@Pc(904) int local904;
			@Pc(496) float local496;
			@Pc(604) float local604;
			@Pc(263) float local263;
			@Pc(432) float local432;
			@Pc(486) float local486;
			@Pc(540) float local540;
			@Pc(382) float local382;
			if ((local6.aByte104 & 0x1) == 0 || arg2) {
				local81 = this.anIntArrayArray10[arg0][arg1];
				@Pc(621) int local621 = this.anIntArrayArray10[arg0 + 1][arg1];
				@Pc(632) int local632 = this.anIntArrayArray10[arg0 + 1][arg1 + 1];
				@Pc(641) int local641 = this.anIntArrayArray10[arg0][arg1 + 1];
				local110 = this.aFloat51 + this.aFloat38 * (float) local38 + this.aFloat49 * (float) local81 + this.aFloat45 * (float) local52;
				local127 = this.aFloat42 + this.aFloat39 * (float) local38 + this.aFloat50 * (float) local81 + this.aFloat46 * (float) local52;
				if (local110 < -local127) {
					return;
				}
				local150 = this.aFloat51 + this.aFloat38 * (float) local45 + this.aFloat49 * (float) local621 + this.aFloat45 * (float) local52;
				local167 = this.aFloat42 + this.aFloat39 * (float) local45 + this.aFloat50 * (float) local621 + this.aFloat46 * (float) local52;
				if (local150 < -local167) {
					return;
				}
				local190 = this.aFloat51 + this.aFloat38 * (float) local45 + this.aFloat49 * (float) local632 + this.aFloat45 * (float) local59;
				local207 = this.aFloat42 + this.aFloat39 * (float) local45 + this.aFloat50 * (float) local632 + this.aFloat46 * (float) local59;
				if (local190 < -local207) {
					return;
				}
				local230 = this.aFloat51 + this.aFloat38 * (float) local38 + this.aFloat49 * (float) local641 + this.aFloat45 * (float) local59;
				local247 = this.aFloat42 + this.aFloat39 * (float) local38 + this.aFloat50 * (float) local641 + this.aFloat46 * (float) local59;
				if (local230 < -local247) {
					return;
				}
				local263 = arg4.aFloat242 + arg4.aFloat243 * local110 / local127;
				local273 = arg4.aFloat242 + arg4.aFloat243 * local150 / local167;
				local283 = arg4.aFloat242 + arg4.aFloat243 * local190 / local207;
				local293 = arg4.aFloat242 + arg4.aFloat243 * local230 / local247;
				if (arg2) {
					local301 = local110 - arg3.aFloat78;
					if (local301 > 0.0F) {
						local301 /= arg3.aFloat79;
						if (local301 > 1.0F) {
							local301 = 1.0F;
						}
						local61 = local301;
						local904 = (int) ((float) local6.aShort140 * local301);
						if (local904 > 0) {
							local81 -= local904;
						}
					}
					local301 = local150 - arg3.aFloat78;
					if (local301 > 0.0F) {
						local301 /= arg3.aFloat79;
						if (local301 > 1.0F) {
							local301 = 1.0F;
						}
						local63 = local301;
						local904 = (int) ((float) local6.aShort139 * local301);
						if (local904 > 0) {
							local621 -= local904;
						}
					}
					local301 = local190 - arg3.aFloat78;
					if (local301 > 0.0F) {
						local301 /= arg3.aFloat79;
						if (local301 > 1.0F) {
							local301 = 1.0F;
						}
						local65 = local301;
						local904 = (int) ((float) local6.aShort141 * local301);
						if (local904 > 0) {
							local632 -= local904;
						}
					}
					local301 = local230 - arg3.aFloat78;
					if (local301 > 0.0F) {
						local301 /= arg3.aFloat79;
						if (local301 > 1.0F) {
							local301 = 1.0F;
						}
						local67 = local301;
						local904 = (int) ((float) local6.aShort138 * local301);
						if (local904 > 0) {
							local641 -= local904;
						}
					}
				} else if (arg3.aBoolean161) {
					local301 = local110 - arg3.aFloat78;
					if (local301 > 0.0F) {
						local61 = local301 / arg3.aFloat79;
						if (local61 > 1.0F) {
							local61 = 1.0F;
						}
					}
					local301 = local150 - arg3.aFloat78;
					if (local301 > 0.0F) {
						local63 = local301 / arg3.aFloat79;
						if (local63 > 1.0F) {
							local63 = 1.0F;
						}
					}
					local301 = local190 - arg3.aFloat78;
					if (local301 > 0.0F) {
						local65 = local301 / arg3.aFloat79;
						if (local65 > 1.0F) {
							local65 = 1.0F;
						}
					}
					local301 = local230 - arg3.aFloat78;
					if (local301 > 0.0F) {
						local67 = local301 / arg3.aFloat79;
						if (local67 > 1.0F) {
							local67 = 1.0F;
						}
					}
				}
				local405 = this.aFloat47 + this.aFloat37 * (float) local38 + this.aFloat40 * (float) local81 + this.aFloat44 * (float) local52;
				local415 = arg4.aFloat238 + arg4.aFloat239 * local405 / local127;
				local432 = this.aFloat48 + this.aFloat52 * (float) local38 + this.aFloat41 * (float) local81 + this.aFloat43 * (float) local52;
				local442 = arg4.aFloat240 + arg4.aFloat241 * local432 / local127;
				local459 = this.aFloat47 + this.aFloat37 * (float) local45 + this.aFloat40 * (float) local621 + this.aFloat44 * (float) local52;
				local469 = arg4.aFloat238 + arg4.aFloat239 * local459 / local167;
				local486 = this.aFloat48 + this.aFloat52 * (float) local45 + this.aFloat41 * (float) local621 + this.aFloat43 * (float) local52;
				local496 = arg4.aFloat240 + arg4.aFloat241 * local486 / local167;
				local513 = this.aFloat47 + this.aFloat37 * (float) local45 + this.aFloat40 * (float) local632 + this.aFloat44 * (float) local59;
				local523 = arg4.aFloat238 + arg4.aFloat239 * local513 / local207;
				local540 = this.aFloat48 + this.aFloat52 * (float) local45 + this.aFloat41 * (float) local632 + this.aFloat43 * (float) local59;
				local550 = arg4.aFloat240 + arg4.aFloat241 * local540 / local207;
				local567 = this.aFloat47 + this.aFloat37 * (float) local38 + this.aFloat40 * (float) local641 + this.aFloat44 * (float) local59;
				local577 = arg4.aFloat238 + arg4.aFloat239 * local567 / local247;
				local594 = this.aFloat48 + this.aFloat52 * (float) local38 + this.aFloat41 * (float) local641 + this.aFloat43 * (float) local59;
				local604 = arg4.aFloat240 + arg4.aFloat241 * local594 / local247;
			} else {
				local81 = this.anIntArrayArray10[arg0][arg1];
				@Pc(87) float local87 = this.aFloat49 * (float) local81;
				@Pc(93) float local93 = this.aFloat50 * (float) local81;
				local110 = this.aFloat51 + this.aFloat38 * (float) local38 + local87 + this.aFloat45 * (float) local52;
				local127 = this.aFloat42 + this.aFloat39 * (float) local38 + local93 + this.aFloat46 * (float) local52;
				if (local110 < -local127) {
					return;
				}
				local150 = this.aFloat51 + this.aFloat38 * (float) local45 + local87 + this.aFloat45 * (float) local52;
				local167 = this.aFloat42 + this.aFloat39 * (float) local45 + local93 + this.aFloat46 * (float) local52;
				if (local150 < -local167) {
					return;
				}
				local190 = this.aFloat51 + this.aFloat38 * (float) local45 + local87 + this.aFloat45 * (float) local59;
				local207 = this.aFloat42 + this.aFloat39 * (float) local45 + local93 + this.aFloat46 * (float) local59;
				if (local190 < -local207) {
					return;
				}
				local230 = this.aFloat51 + this.aFloat38 * (float) local38 + local87 + this.aFloat45 * (float) local59;
				local247 = this.aFloat42 + this.aFloat39 * (float) local38 + local93 + this.aFloat46 * (float) local59;
				if (local230 < -local247) {
					return;
				}
				local263 = arg4.aFloat242 + arg4.aFloat243 * local110 / local127;
				local273 = arg4.aFloat242 + arg4.aFloat243 * local150 / local167;
				local283 = arg4.aFloat242 + arg4.aFloat243 * local190 / local207;
				local293 = arg4.aFloat242 + arg4.aFloat243 * local230 / local247;
				if (arg3.aBoolean161) {
					local301 = local110 - arg3.aFloat78;
					if (local301 > 0.0F) {
						local61 = local301 / arg3.aFloat79;
						if (local61 > 1.0F) {
							local61 = 1.0F;
						}
					}
					local301 = local150 - arg3.aFloat78;
					if (local301 > 0.0F) {
						local63 = local301 / arg3.aFloat79;
						if (local63 > 1.0F) {
							local63 = 1.0F;
						}
					}
					local301 = local190 - arg3.aFloat78;
					if (local301 > 0.0F) {
						local65 = local301 / arg3.aFloat79;
						if (local65 > 1.0F) {
							local65 = 1.0F;
						}
					}
					local301 = local230 - arg3.aFloat78;
					if (local301 > 0.0F) {
						local67 = local301 / arg3.aFloat79;
						if (local67 > 1.0F) {
							local67 = 1.0F;
						}
					}
				}
				local382 = this.aFloat40 * (float) local81;
				@Pc(388) float local388 = this.aFloat41 * (float) local81;
				local405 = this.aFloat47 + this.aFloat37 * (float) local38 + local382 + this.aFloat44 * (float) local52;
				local415 = arg4.aFloat238 + arg4.aFloat239 * local405 / local127;
				local432 = this.aFloat48 + this.aFloat52 * (float) local38 + local388 + this.aFloat43 * (float) local52;
				local442 = arg4.aFloat240 + arg4.aFloat241 * local432 / local127;
				local459 = this.aFloat47 + this.aFloat37 * (float) local45 + local382 + this.aFloat44 * (float) local52;
				local469 = arg4.aFloat238 + arg4.aFloat239 * local459 / local167;
				local486 = this.aFloat48 + this.aFloat52 * (float) local45 + local388 + this.aFloat43 * (float) local52;
				local496 = arg4.aFloat240 + arg4.aFloat241 * local486 / local167;
				local513 = this.aFloat47 + this.aFloat37 * (float) local45 + local382 + this.aFloat44 * (float) local59;
				local523 = arg4.aFloat238 + arg4.aFloat239 * local513 / local207;
				local540 = this.aFloat48 + this.aFloat52 * (float) local45 + local388 + this.aFloat43 * (float) local59;
				local550 = arg4.aFloat240 + arg4.aFloat241 * local540 / local207;
				local567 = this.aFloat47 + this.aFloat37 * (float) local38 + local382 + this.aFloat44 * (float) local59;
				local577 = arg4.aFloat238 + arg4.aFloat239 * local567 / local247;
				local594 = this.aFloat48 + this.aFloat52 * (float) local38 + local388 + this.aFloat43 * (float) local59;
				local604 = arg4.aFloat240 + arg4.aFloat241 * local594 / local247;
			}
			@Pc(1349) Class215 local1349 = null;
			@Pc(1351) boolean local1351 = false;
			if (local6.aShort142 != -1) {
				local1349 = this.aClass86_Sub2_3.aClass209_9.method25584(local6.aShort142 & 0xFFFF);
				local1351 = local1349.aBoolean638;
			}
			@Pc(1379) boolean local1379 = local1349 != null && this.method5560(local1349.aByte118);
			local382 = local63 + local65 + local67;
			if ((local523 - local577) * (local496 - local604) - (local550 - local604) * (local469 - local577) > 0.0F) {
				arg4.aBoolean558 = local523 < 0.0F || local577 < 0.0F || local469 < 0.0F || local523 > (float) arg4.anInt3270 || local577 > (float) arg4.anInt3270 || local469 > (float) arg4.anInt3270;
				if (local382 >= 3.0F) {
					arg4.method24367(true, true, false, local550, local604, local496, local523, local577, local469, local283, local293, local273, arg3.anInt789 * 1046269871);
				} else if (local382 > 0.0F) {
					if (local1351) {
						local904 = -16777216;
						if (local1379) {
							local904 = -1694498816;
						}
						arg4.method24376(true, true, false, local550, local604, local496, local523, local577, local469, local283, local293, local273, local207, local247, local167, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, local904 | local6.anInt3282 & 0xFFFFFF, local904 | local6.anInt3280 & 0xFFFFFF, local904 | local6.anInt3279 & 0xFFFFFF, arg3.anInt789 * 1046269871, local65 * 255.0F, local67 * 255.0F, local63 * 255.0F, local6.aShort142 & 0xFFFF);
					} else {
						if (local1379) {
							arg4.anInt3269 = 100;
						}
						arg4.method24361(true, true, false, local550, local604, local496, local523, local577, local469, local283, local293, local273, Class334.method27666(local6.anInt3282, (int) (local65 * 255.0F) << 24 | arg3.anInt789 * 1046269871), Class334.method27666(local6.anInt3280, (int) (local67 * 255.0F) << 24 | arg3.anInt789 * 1046269871), Class334.method27666(local6.anInt3279, (int) (local63 * 255.0F) << 24 | arg3.anInt789 * 1046269871));
						arg4.anInt3269 = 0;
					}
				} else if (local1351) {
					local904 = -16777216;
					if (local1379) {
						local904 = -1694498816;
					}
					arg4.method24376(true, true, false, local550, local604, local496, local523, local577, local469, local283, local293, local273, local207, local247, local167, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, local904 | local6.anInt3282 & 0xFFFFFF, local904 | local6.anInt3280 & 0xFFFFFF, local904 | local6.anInt3279 & 0xFFFFFF, 0, 0.0F, 0.0F, 0.0F, local6.aShort142 & 0xFFFF);
				} else {
					if (local1379) {
						arg4.anInt3269 = 100;
					}
					arg4.method24361(true, true, false, local550, local604, local496, local523, local577, local469, local283, local293, local273, local6.anInt3282, local6.anInt3280, local6.anInt3279);
					arg4.anInt3269 = 0;
				}
			}
			local382 = local61 + local63 + local67;
			if ((local415 - local469) * (local604 - local496) - (local442 - local496) * (local577 - local469) > 0.0F) {
				arg4.aBoolean558 = local415 < 0.0F || local469 < 0.0F || local577 < 0.0F || local415 > (float) arg4.anInt3270 || local469 > (float) arg4.anInt3270 || local577 > (float) arg4.anInt3270;
				if (local382 < 3.0F) {
					if (local1379) {
						arg4.anInt3269 = -1694498816;
					}
					if (local382 > 0.0F) {
						if (local1351) {
							local904 = -16777216;
							if (local1379) {
								local904 = -1694498816;
							}
							arg4.method24376(true, true, false, local442, local496, local604, local415, local469, local577, local263, local273, local293, local127, local167, local247, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, local904 | local6.anInt3281 & 0xFFFFFF, local904 | local6.anInt3279 & 0xFFFFFF, local904 | local6.anInt3280 & 0xFFFFFF, arg3.anInt789 * 1046269871, local61 * 255.0F, local63 * 255.0F, local67 * 255.0F, local6.aShort142 & 0xFFFF);
						} else {
							if (local1379) {
								arg4.anInt3269 = 100;
							}
							arg4.method24361(true, true, false, local442, local496, local604, local415, local469, local577, local263, local273, local293, Class334.method27666(local6.anInt3281, (int) (local61 * 255.0F) << 24 | arg3.anInt789 * 1046269871), Class334.method27666(local6.anInt3279, (int) (local63 * 255.0F) << 24 | arg3.anInt789 * 1046269871), Class334.method27666(local6.anInt3280, (int) (local67 * 255.0F) << 24 | arg3.anInt789 * 1046269871));
							arg4.anInt3269 = 0;
						}
					} else if (local1351) {
						local904 = -16777216;
						if (local1379) {
							local904 = -1694498816;
						}
						arg4.method24376(true, true, false, local442, local496, local604, local415, local469, local577, local263, local273, local293, local127, local167, local247, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, local904 | local6.anInt3281 & 0xFFFFFF, local904 | local6.anInt3279 & 0xFFFFFF, local904 | local6.anInt3280 & 0xFFFFFF, 0, 0.0F, 0.0F, 0.0F, local6.aShort142 & 0xFFFF);
					} else {
						if (local1379) {
							arg4.anInt3269 = 100;
						}
						arg4.method24361(true, true, false, local442, local496, local604, local415, local469, local577, local263, local273, local293, local6.anInt3281, local6.anInt3279, local6.anInt3280);
						arg4.anInt3269 = 0;
					}
				} else {
					arg4.method24367(true, true, false, local442, local496, local604, local415, local469, local577, local263, local273, local293, arg3.anInt789 * 1046269871);
				}
			}
		}
	}

	@OriginalMember(owner = "client!aep", name = "ba", descriptor = "(IIZLclient!af;Lclient!ba;[F[F[F[F[FI)V", line = 841)
	void method5556(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class95 arg3, @OriginalArg(4) Class163 arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) float[] arg7, @OriginalArg(8) float[] arg8, @OriginalArg(9) float[] arg9, @OriginalArg(10) int arg10) {
		@Pc(6) Class165 local6 = this.aClass165ArrayArray1[arg0][arg1];
		@Pc(45) int local45;
		@Pc(52) int local52;
		@Pc(59) int local59;
		@Pc(415) float local415;
		@Pc(469) float local469;
		@Pc(523) float local523;
		@Pc(577) float local577;
		@Pc(442) float local442;
		@Pc(550) float local550;
		@Pc(273) float local273;
		@Pc(283) float local283;
		@Pc(293) float local293;
		@Pc(405) float local405;
		@Pc(459) float local459;
		@Pc(513) float local513;
		@Pc(567) float local567;
		if (local6 == null) {
			@Pc(2006) Class171 local2006 = this.aClass171ArrayArray1[arg0][arg1];
			if (local2006 != null) {
				if (arg10 != 0) {
					if ((local2006.aByte105 & 0x4) == 0) {
						if ((arg10 & 0x2) != 0) {
							return;
						}
					} else if ((arg10 & 0x1) != 0) {
						return;
					}
				}
				@Pc(2027) int local2027;
				@Pc(2157) int local2157;
				for (local2027 = 0; local2027 < local2006.aShort143; local2027++) {
					local45 = local2006.aShortArray77[local2027] + (arg0 << this.anInt609 * -1495101509);
					local52 = local2006.aShortArray79[local2027];
					local59 = local2006.aShortArray80[local2027] + (arg1 << this.anInt609 * -1495101509);
					local523 = this.aFloat51 + this.aFloat38 * (float) local45 + this.aFloat49 * (float) local52 + this.aFloat45 * (float) local59;
					local577 = this.aFloat42 + this.aFloat39 * (float) local45 + this.aFloat50 * (float) local52 + this.aFloat46 * (float) local59;
					if (local523 < -local577) {
						return;
					}
					local442 = arg4.aFloat242 + arg4.aFloat243 * local523 / local577;
					arg9[local2027] = 0.0F;
					if (arg2) {
						local550 = local523 - arg3.aFloat78;
						if (local550 > 0.0F) {
							local550 /= arg3.aFloat79;
							if (local550 > 1.0F) {
								local550 = 1.0F;
							}
							arg9[local2027] = local550;
							local2157 = (int) ((float) local2006.aShortArray78[local2027] * local550);
							if (local2157 > 0) {
								local52 -= local2157;
							}
						}
					} else if (arg3.aBoolean161) {
						local550 = local523 - arg3.aFloat78;
						if (local550 > 0.0F) {
							arg9[local2027] = local550 / arg3.aFloat79;
							if (arg9[local2027] > 1.0F) {
								arg9[local2027] = 1.0F;
							}
						}
					}
					local415 = this.aFloat47 + this.aFloat37 * (float) local45 + this.aFloat40 * (float) local52 + this.aFloat44 * (float) local59;
					local469 = this.aFloat48 + this.aFloat52 * (float) local45 + this.aFloat41 * (float) local52 + this.aFloat43 * (float) local59;
					arg5[local2027] = arg4.aFloat238 + arg4.aFloat239 * local415 / local577;
					arg6[local2027] = arg4.aFloat240 + arg4.aFloat241 * local469 / local577;
					arg7[local2027] = local442;
					arg8[local2027] = local577;
				}
				@Pc(2290) int local2290;
				@Pc(2282) int local2282;
				if (local2006.aShortArray81 == null) {
					for (local2027 = 0; local2027 < local2006.aShort144; local2027++) {
						local2282 = local2027 * 3;
						local2157 = local2282 + 1;
						local2290 = local2157 + 1;
						local273 = arg5[local2282];
						local283 = arg5[local2157];
						local293 = arg5[local2290];
						local405 = arg6[local2282];
						local459 = arg6[local2157];
						local513 = arg6[local2290];
						local567 = arg9[local2282] + arg9[local2157] + arg9[local2290];
						if ((local273 - local283) * (local513 - local459) - (local405 - local459) * (local293 - local283) > 0.0F) {
							arg4.aBoolean558 = local273 < 0.0F || local283 < 0.0F || local293 < 0.0F || local273 > (float) arg4.anInt3270 || local283 > (float) arg4.anInt3270 || local293 > (float) arg4.anInt3270;
							if (local567 >= 3.0F) {
								arg4.method24367(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2282], arg7[local2157], arg7[local2290], arg3.anInt789 * 1046269871);
							} else if (local567 > 0.0F) {
								if ((local2006.anIntArray309[local2282] & 0xFFFFFF) != 0) {
									arg4.method24361(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2282], arg7[local2157], arg7[local2290], Class636.method32688(local2006.anIntArray309[local2282], arg3.anInt789 * 1046269871, arg9[local2282] * 255.0F), Class636.method32688(local2006.anIntArray309[local2157], arg3.anInt789 * 1046269871, arg9[local2157] * 255.0F), Class636.method32688(local2006.anIntArray309[local2290], arg3.anInt789 * 1046269871, arg9[local2290] * 255.0F));
								}
							} else if ((local2006.anIntArray309[local2282] & 0xFFFFFF) != 0) {
								arg4.method24361(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2282], arg7[local2157], arg7[local2290], local2006.anIntArray309[local2282], local2006.anIntArray309[local2157], local2006.anIntArray309[local2290]);
							}
						}
					}
				} else {
					for (local2027 = 0; local2027 < local2006.aShort144; local2027++) {
						local2282 = local2027 * 3;
						local2157 = local2282 + 1;
						local2290 = local2157 + 1;
						local273 = arg5[local2282];
						local283 = arg5[local2157];
						local293 = arg5[local2290];
						local405 = arg6[local2282];
						local459 = arg6[local2157];
						local513 = arg6[local2290];
						local567 = arg9[local2282] + arg9[local2157] + arg9[local2290];
						if ((local273 - local283) * (local513 - local459) - (local405 - local459) * (local293 - local283) > 0.0F) {
							arg4.aBoolean558 = local273 < 0.0F || local283 < 0.0F || local293 < 0.0F || local273 > (float) arg4.anInt3270 || local283 > (float) arg4.anInt3270 || local293 > (float) arg4.anInt3270;
							@Pc(2381) Class215 local2381 = null;
							@Pc(2383) boolean local2383 = false;
							if (local2006.aShortArray81[local2027] != -1) {
								local2381 = this.aClass86_Sub2_3.aClass209_9.method25584(local2006.aShortArray81[local2027] & 0xFFFF);
								local2383 = local2381.aBoolean638;
							}
							if (local567 < 3.0F) {
								@Pc(2416) int local2416;
								if (local567 > 0.0F) {
									if (local2383) {
										local2416 = -16777216;
										if (this.method5560(local2381.aByte118)) {
											local2416 = -1694498816;
										}
										arg4.method24376(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2282], arg7[local2157], arg7[local2290], arg8[local2282], arg8[local2157], arg8[local2290], (float) local2006.aShortArray77[local2282] / (float) (this.anInt608 * 127780559), (float) local2006.aShortArray77[local2157] / (float) (this.anInt608 * 127780559), (float) local2006.aShortArray77[local2290] / (float) (this.anInt608 * 127780559), (float) local2006.aShortArray80[local2282] / (float) (this.anInt608 * 127780559), (float) local2006.aShortArray80[local2157] / (float) (this.anInt608 * 127780559), (float) local2006.aShortArray80[local2290] / (float) (this.anInt608 * 127780559), local2416 | local2006.anIntArray309[local2282] & 0xFFFFFF, local2416 | local2006.anIntArray309[local2157] & 0xFFFFFF, local2416 | local2006.anIntArray309[local2290] & 0xFFFFFF, arg3.anInt789 * 1046269871, arg9[local2282] * 255.0F, arg9[local2157] * 255.0F, arg9[local2290] * 255.0F, local2006.aShortArray81[local2027] & 0xFFFF);
									} else if ((local2006.anIntArray309[local2282] & 0xFFFFFF) != 0) {
										arg4.method24361(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2282], arg7[local2157], arg7[local2290], Class334.method27666(local2006.anIntArray309[local2282], (int) (arg9[local2282] * 255.0F) << 24 | arg3.anInt789 * 1046269871), Class334.method27666(local2006.anIntArray309[local2157], (int) (arg9[local2157] * 255.0F) << 24 | arg3.anInt789 * 1046269871), Class334.method27666(local2006.anIntArray309[local2290], (int) (arg9[local2290] * 255.0F) << 24 | arg3.anInt789 * 1046269871));
										arg4.anInt3269 = 0;
									}
								} else if (local2383) {
									local2416 = -16777216;
									if (this.method5560(local2381.aByte118)) {
										local2416 = -1694498816;
									}
									arg4.method24376(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2282], arg7[local2157], arg7[local2290], arg8[local2282], arg8[local2157], arg8[local2290], (float) local2006.aShortArray77[local2282] / (float) (this.anInt608 * 127780559), (float) local2006.aShortArray77[local2157] / (float) (this.anInt608 * 127780559), (float) local2006.aShortArray77[local2290] / (float) (this.anInt608 * 127780559), (float) local2006.aShortArray80[local2282] / (float) (this.anInt608 * 127780559), (float) local2006.aShortArray80[local2157] / (float) (this.anInt608 * 127780559), (float) local2006.aShortArray80[local2290] / (float) (this.anInt608 * 127780559), local2416 | local2006.anIntArray309[local2282] & 0xFFFFFF, local2416 | local2006.anIntArray309[local2157] & 0xFFFFFF, local2416 | local2006.anIntArray309[local2290] & 0xFFFFFF, 0, 0.0F, 0.0F, 0.0F, local2006.aShortArray81[local2027] & 0xFFFF);
								} else if ((local2006.anIntArray309[local2282] & 0xFFFFFF) != 0) {
									arg4.method24361(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2282], arg7[local2157], arg7[local2290], local2006.anIntArray309[local2282], local2006.anIntArray309[local2157], local2006.anIntArray309[local2290]);
									arg4.anInt3269 = 0;
								}
							} else {
								arg4.method24367(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2282], arg7[local2157], arg7[local2290], arg3.anInt789 * 1046269871);
							}
						}
					}
				}
			}
		} else if ((local6.aByte104 & 0x2) == 0) {
			if (arg10 != 0) {
				if ((local6.aByte104 & 0x4) == 0) {
					if ((arg10 & 0x2) != 0) {
						return;
					}
				} else if ((arg10 & 0x1) != 0) {
					return;
				}
			}
			@Pc(38) int local38 = arg0 * this.anInt608 * 127780559;
			local45 = local38 + this.anInt608 * 127780559;
			local52 = arg1 * this.anInt608 * 127780559;
			local59 = local52 + this.anInt608 * 127780559;
			@Pc(61) float local61 = 0.0F;
			@Pc(63) float local63 = 0.0F;
			@Pc(65) float local65 = 0.0F;
			@Pc(67) float local67 = 0.0F;
			@Pc(594) float local594;
			@Pc(110) float local110;
			@Pc(150) float local150;
			@Pc(190) float local190;
			@Pc(230) float local230;
			@Pc(127) float local127;
			@Pc(167) float local167;
			@Pc(207) float local207;
			@Pc(247) float local247;
			@Pc(301) float local301;
			@Pc(81) int local81;
			@Pc(904) int local904;
			@Pc(496) float local496;
			@Pc(604) float local604;
			@Pc(263) float local263;
			@Pc(432) float local432;
			@Pc(486) float local486;
			@Pc(540) float local540;
			@Pc(382) float local382;
			if ((local6.aByte104 & 0x1) == 0 || arg2) {
				local81 = this.anIntArrayArray10[arg0][arg1];
				@Pc(621) int local621 = this.anIntArrayArray10[arg0 + 1][arg1];
				@Pc(632) int local632 = this.anIntArrayArray10[arg0 + 1][arg1 + 1];
				@Pc(641) int local641 = this.anIntArrayArray10[arg0][arg1 + 1];
				local110 = this.aFloat51 + this.aFloat38 * (float) local38 + this.aFloat49 * (float) local81 + this.aFloat45 * (float) local52;
				local127 = this.aFloat42 + this.aFloat39 * (float) local38 + this.aFloat50 * (float) local81 + this.aFloat46 * (float) local52;
				if (local110 < -local127) {
					return;
				}
				local150 = this.aFloat51 + this.aFloat38 * (float) local45 + this.aFloat49 * (float) local621 + this.aFloat45 * (float) local52;
				local167 = this.aFloat42 + this.aFloat39 * (float) local45 + this.aFloat50 * (float) local621 + this.aFloat46 * (float) local52;
				if (local150 < -local167) {
					return;
				}
				local190 = this.aFloat51 + this.aFloat38 * (float) local45 + this.aFloat49 * (float) local632 + this.aFloat45 * (float) local59;
				local207 = this.aFloat42 + this.aFloat39 * (float) local45 + this.aFloat50 * (float) local632 + this.aFloat46 * (float) local59;
				if (local190 < -local207) {
					return;
				}
				local230 = this.aFloat51 + this.aFloat38 * (float) local38 + this.aFloat49 * (float) local641 + this.aFloat45 * (float) local59;
				local247 = this.aFloat42 + this.aFloat39 * (float) local38 + this.aFloat50 * (float) local641 + this.aFloat46 * (float) local59;
				if (local230 < -local247) {
					return;
				}
				local263 = arg4.aFloat242 + arg4.aFloat243 * local110 / local127;
				local273 = arg4.aFloat242 + arg4.aFloat243 * local150 / local167;
				local283 = arg4.aFloat242 + arg4.aFloat243 * local190 / local207;
				local293 = arg4.aFloat242 + arg4.aFloat243 * local230 / local247;
				if (arg2) {
					local301 = local110 - arg3.aFloat78;
					if (local301 > 0.0F) {
						local301 /= arg3.aFloat79;
						if (local301 > 1.0F) {
							local301 = 1.0F;
						}
						local61 = local301;
						local904 = (int) ((float) local6.aShort140 * local301);
						if (local904 > 0) {
							local81 -= local904;
						}
					}
					local301 = local150 - arg3.aFloat78;
					if (local301 > 0.0F) {
						local301 /= arg3.aFloat79;
						if (local301 > 1.0F) {
							local301 = 1.0F;
						}
						local63 = local301;
						local904 = (int) ((float) local6.aShort139 * local301);
						if (local904 > 0) {
							local621 -= local904;
						}
					}
					local301 = local190 - arg3.aFloat78;
					if (local301 > 0.0F) {
						local301 /= arg3.aFloat79;
						if (local301 > 1.0F) {
							local301 = 1.0F;
						}
						local65 = local301;
						local904 = (int) ((float) local6.aShort141 * local301);
						if (local904 > 0) {
							local632 -= local904;
						}
					}
					local301 = local230 - arg3.aFloat78;
					if (local301 > 0.0F) {
						local301 /= arg3.aFloat79;
						if (local301 > 1.0F) {
							local301 = 1.0F;
						}
						local67 = local301;
						local904 = (int) ((float) local6.aShort138 * local301);
						if (local904 > 0) {
							local641 -= local904;
						}
					}
				} else if (arg3.aBoolean161) {
					local301 = local110 - arg3.aFloat78;
					if (local301 > 0.0F) {
						local61 = local301 / arg3.aFloat79;
						if (local61 > 1.0F) {
							local61 = 1.0F;
						}
					}
					local301 = local150 - arg3.aFloat78;
					if (local301 > 0.0F) {
						local63 = local301 / arg3.aFloat79;
						if (local63 > 1.0F) {
							local63 = 1.0F;
						}
					}
					local301 = local190 - arg3.aFloat78;
					if (local301 > 0.0F) {
						local65 = local301 / arg3.aFloat79;
						if (local65 > 1.0F) {
							local65 = 1.0F;
						}
					}
					local301 = local230 - arg3.aFloat78;
					if (local301 > 0.0F) {
						local67 = local301 / arg3.aFloat79;
						if (local67 > 1.0F) {
							local67 = 1.0F;
						}
					}
				}
				local405 = this.aFloat47 + this.aFloat37 * (float) local38 + this.aFloat40 * (float) local81 + this.aFloat44 * (float) local52;
				local415 = arg4.aFloat238 + arg4.aFloat239 * local405 / local127;
				local432 = this.aFloat48 + this.aFloat52 * (float) local38 + this.aFloat41 * (float) local81 + this.aFloat43 * (float) local52;
				local442 = arg4.aFloat240 + arg4.aFloat241 * local432 / local127;
				local459 = this.aFloat47 + this.aFloat37 * (float) local45 + this.aFloat40 * (float) local621 + this.aFloat44 * (float) local52;
				local469 = arg4.aFloat238 + arg4.aFloat239 * local459 / local167;
				local486 = this.aFloat48 + this.aFloat52 * (float) local45 + this.aFloat41 * (float) local621 + this.aFloat43 * (float) local52;
				local496 = arg4.aFloat240 + arg4.aFloat241 * local486 / local167;
				local513 = this.aFloat47 + this.aFloat37 * (float) local45 + this.aFloat40 * (float) local632 + this.aFloat44 * (float) local59;
				local523 = arg4.aFloat238 + arg4.aFloat239 * local513 / local207;
				local540 = this.aFloat48 + this.aFloat52 * (float) local45 + this.aFloat41 * (float) local632 + this.aFloat43 * (float) local59;
				local550 = arg4.aFloat240 + arg4.aFloat241 * local540 / local207;
				local567 = this.aFloat47 + this.aFloat37 * (float) local38 + this.aFloat40 * (float) local641 + this.aFloat44 * (float) local59;
				local577 = arg4.aFloat238 + arg4.aFloat239 * local567 / local247;
				local594 = this.aFloat48 + this.aFloat52 * (float) local38 + this.aFloat41 * (float) local641 + this.aFloat43 * (float) local59;
				local604 = arg4.aFloat240 + arg4.aFloat241 * local594 / local247;
			} else {
				local81 = this.anIntArrayArray10[arg0][arg1];
				@Pc(87) float local87 = this.aFloat49 * (float) local81;
				@Pc(93) float local93 = this.aFloat50 * (float) local81;
				local110 = this.aFloat51 + this.aFloat38 * (float) local38 + local87 + this.aFloat45 * (float) local52;
				local127 = this.aFloat42 + this.aFloat39 * (float) local38 + local93 + this.aFloat46 * (float) local52;
				if (local110 < -local127) {
					return;
				}
				local150 = this.aFloat51 + this.aFloat38 * (float) local45 + local87 + this.aFloat45 * (float) local52;
				local167 = this.aFloat42 + this.aFloat39 * (float) local45 + local93 + this.aFloat46 * (float) local52;
				if (local150 < -local167) {
					return;
				}
				local190 = this.aFloat51 + this.aFloat38 * (float) local45 + local87 + this.aFloat45 * (float) local59;
				local207 = this.aFloat42 + this.aFloat39 * (float) local45 + local93 + this.aFloat46 * (float) local59;
				if (local190 < -local207) {
					return;
				}
				local230 = this.aFloat51 + this.aFloat38 * (float) local38 + local87 + this.aFloat45 * (float) local59;
				local247 = this.aFloat42 + this.aFloat39 * (float) local38 + local93 + this.aFloat46 * (float) local59;
				if (local230 < -local247) {
					return;
				}
				local263 = arg4.aFloat242 + arg4.aFloat243 * local110 / local127;
				local273 = arg4.aFloat242 + arg4.aFloat243 * local150 / local167;
				local283 = arg4.aFloat242 + arg4.aFloat243 * local190 / local207;
				local293 = arg4.aFloat242 + arg4.aFloat243 * local230 / local247;
				if (arg3.aBoolean161) {
					local301 = local110 - arg3.aFloat78;
					if (local301 > 0.0F) {
						local61 = local301 / arg3.aFloat79;
						if (local61 > 1.0F) {
							local61 = 1.0F;
						}
					}
					local301 = local150 - arg3.aFloat78;
					if (local301 > 0.0F) {
						local63 = local301 / arg3.aFloat79;
						if (local63 > 1.0F) {
							local63 = 1.0F;
						}
					}
					local301 = local190 - arg3.aFloat78;
					if (local301 > 0.0F) {
						local65 = local301 / arg3.aFloat79;
						if (local65 > 1.0F) {
							local65 = 1.0F;
						}
					}
					local301 = local230 - arg3.aFloat78;
					if (local301 > 0.0F) {
						local67 = local301 / arg3.aFloat79;
						if (local67 > 1.0F) {
							local67 = 1.0F;
						}
					}
				}
				local382 = this.aFloat40 * (float) local81;
				@Pc(388) float local388 = this.aFloat41 * (float) local81;
				local405 = this.aFloat47 + this.aFloat37 * (float) local38 + local382 + this.aFloat44 * (float) local52;
				local415 = arg4.aFloat238 + arg4.aFloat239 * local405 / local127;
				local432 = this.aFloat48 + this.aFloat52 * (float) local38 + local388 + this.aFloat43 * (float) local52;
				local442 = arg4.aFloat240 + arg4.aFloat241 * local432 / local127;
				local459 = this.aFloat47 + this.aFloat37 * (float) local45 + local382 + this.aFloat44 * (float) local52;
				local469 = arg4.aFloat238 + arg4.aFloat239 * local459 / local167;
				local486 = this.aFloat48 + this.aFloat52 * (float) local45 + local388 + this.aFloat43 * (float) local52;
				local496 = arg4.aFloat240 + arg4.aFloat241 * local486 / local167;
				local513 = this.aFloat47 + this.aFloat37 * (float) local45 + local382 + this.aFloat44 * (float) local59;
				local523 = arg4.aFloat238 + arg4.aFloat239 * local513 / local207;
				local540 = this.aFloat48 + this.aFloat52 * (float) local45 + local388 + this.aFloat43 * (float) local59;
				local550 = arg4.aFloat240 + arg4.aFloat241 * local540 / local207;
				local567 = this.aFloat47 + this.aFloat37 * (float) local38 + local382 + this.aFloat44 * (float) local59;
				local577 = arg4.aFloat238 + arg4.aFloat239 * local567 / local247;
				local594 = this.aFloat48 + this.aFloat52 * (float) local38 + local388 + this.aFloat43 * (float) local59;
				local604 = arg4.aFloat240 + arg4.aFloat241 * local594 / local247;
			}
			@Pc(1349) Class215 local1349 = null;
			@Pc(1351) boolean local1351 = false;
			if (local6.aShort142 != -1) {
				local1349 = this.aClass86_Sub2_3.aClass209_9.method25584(local6.aShort142 & 0xFFFF);
				local1351 = local1349.aBoolean638;
			}
			@Pc(1379) boolean local1379 = local1349 != null && this.method5560(local1349.aByte118);
			local382 = local63 + local65 + local67;
			if ((local523 - local577) * (local496 - local604) - (local550 - local604) * (local469 - local577) > 0.0F) {
				arg4.aBoolean558 = local523 < 0.0F || local577 < 0.0F || local469 < 0.0F || local523 > (float) arg4.anInt3270 || local577 > (float) arg4.anInt3270 || local469 > (float) arg4.anInt3270;
				if (local382 >= 3.0F) {
					arg4.method24367(true, true, false, local550, local604, local496, local523, local577, local469, local283, local293, local273, arg3.anInt789 * 1046269871);
				} else if (local382 > 0.0F) {
					if (local1351) {
						local904 = -16777216;
						if (local1379) {
							local904 = -1694498816;
						}
						arg4.method24376(true, true, false, local550, local604, local496, local523, local577, local469, local283, local293, local273, local207, local247, local167, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, local904 | local6.anInt3282 & 0xFFFFFF, local904 | local6.anInt3280 & 0xFFFFFF, local904 | local6.anInt3279 & 0xFFFFFF, arg3.anInt789 * 1046269871, local65 * 255.0F, local67 * 255.0F, local63 * 255.0F, local6.aShort142 & 0xFFFF);
					} else {
						if (local1379) {
							arg4.anInt3269 = 100;
						}
						arg4.method24361(true, true, false, local550, local604, local496, local523, local577, local469, local283, local293, local273, Class334.method27666(local6.anInt3282, (int) (local65 * 255.0F) << 24 | arg3.anInt789 * 1046269871), Class334.method27666(local6.anInt3280, (int) (local67 * 255.0F) << 24 | arg3.anInt789 * 1046269871), Class334.method27666(local6.anInt3279, (int) (local63 * 255.0F) << 24 | arg3.anInt789 * 1046269871));
						arg4.anInt3269 = 0;
					}
				} else if (local1351) {
					local904 = -16777216;
					if (local1379) {
						local904 = -1694498816;
					}
					arg4.method24376(true, true, false, local550, local604, local496, local523, local577, local469, local283, local293, local273, local207, local247, local167, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, local904 | local6.anInt3282 & 0xFFFFFF, local904 | local6.anInt3280 & 0xFFFFFF, local904 | local6.anInt3279 & 0xFFFFFF, 0, 0.0F, 0.0F, 0.0F, local6.aShort142 & 0xFFFF);
				} else {
					if (local1379) {
						arg4.anInt3269 = 100;
					}
					arg4.method24361(true, true, false, local550, local604, local496, local523, local577, local469, local283, local293, local273, local6.anInt3282, local6.anInt3280, local6.anInt3279);
					arg4.anInt3269 = 0;
				}
			}
			local382 = local61 + local63 + local67;
			if ((local415 - local469) * (local604 - local496) - (local442 - local496) * (local577 - local469) > 0.0F) {
				arg4.aBoolean558 = local415 < 0.0F || local469 < 0.0F || local577 < 0.0F || local415 > (float) arg4.anInt3270 || local469 > (float) arg4.anInt3270 || local577 > (float) arg4.anInt3270;
				if (local382 < 3.0F) {
					if (local1379) {
						arg4.anInt3269 = -1694498816;
					}
					if (local382 > 0.0F) {
						if (local1351) {
							local904 = -16777216;
							if (local1379) {
								local904 = -1694498816;
							}
							arg4.method24376(true, true, false, local442, local496, local604, local415, local469, local577, local263, local273, local293, local127, local167, local247, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, local904 | local6.anInt3281 & 0xFFFFFF, local904 | local6.anInt3279 & 0xFFFFFF, local904 | local6.anInt3280 & 0xFFFFFF, arg3.anInt789 * 1046269871, local61 * 255.0F, local63 * 255.0F, local67 * 255.0F, local6.aShort142 & 0xFFFF);
						} else {
							if (local1379) {
								arg4.anInt3269 = 100;
							}
							arg4.method24361(true, true, false, local442, local496, local604, local415, local469, local577, local263, local273, local293, Class334.method27666(local6.anInt3281, (int) (local61 * 255.0F) << 24 | arg3.anInt789 * 1046269871), Class334.method27666(local6.anInt3279, (int) (local63 * 255.0F) << 24 | arg3.anInt789 * 1046269871), Class334.method27666(local6.anInt3280, (int) (local67 * 255.0F) << 24 | arg3.anInt789 * 1046269871));
							arg4.anInt3269 = 0;
						}
					} else if (local1351) {
						local904 = -16777216;
						if (local1379) {
							local904 = -1694498816;
						}
						arg4.method24376(true, true, false, local442, local496, local604, local415, local469, local577, local263, local273, local293, local127, local167, local247, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, local904 | local6.anInt3281 & 0xFFFFFF, local904 | local6.anInt3279 & 0xFFFFFF, local904 | local6.anInt3280 & 0xFFFFFF, 0, 0.0F, 0.0F, 0.0F, local6.aShort142 & 0xFFFF);
					} else {
						if (local1379) {
							arg4.anInt3269 = 100;
						}
						arg4.method24361(true, true, false, local442, local496, local604, local415, local469, local577, local263, local273, local293, local6.anInt3281, local6.anInt3279, local6.anInt3280);
						arg4.anInt3269 = 0;
					}
				} else {
					arg4.method24367(true, true, false, local442, local496, local604, local415, local469, local577, local263, local273, local293, arg3.anInt789 * 1046269871);
				}
			}
		}
	}

	@OriginalMember(owner = "client!aep", name = "bl", descriptor = "(IIZLclient!af;Lclient!ba;[F[F[F[F[FI)V", line = 1243)
	void method5557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class95 arg3, @OriginalArg(4) Class163 arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) float[] arg7, @OriginalArg(8) float[] arg8, @OriginalArg(9) float[] arg9, @OriginalArg(10) int arg10) {
		@Pc(6) Class164 local6 = this.aClass164ArrayArray1[arg0][arg1];
		if (arg10 != 0 && (arg10 & 0x2) != 0 || local6 == null) {
			return;
		}
		@Pc(137) int local137;
		for (@Pc(17) int local17 = 0; local17 < local6.aShort136; local17++) {
			@Pc(33) int local33 = local6.aShortArray72[local17] + (arg0 << this.anInt609 * -1495101509);
			@Pc(38) int local38 = local6.aShortArray76[local17];
			@Pc(50) int local50 = local6.aShortArray73[local17] + (arg1 << this.anInt609 * -1495101509);
			@Pc(71) float local71 = this.aFloat51 + this.aFloat38 * (float) local33 + this.aFloat49 * (float) local38 + this.aFloat45 * (float) local50;
			@Pc(92) float local92 = this.aFloat42 + this.aFloat39 * (float) local33 + this.aFloat50 * (float) local38 + this.aFloat46 * (float) local50;
			if (local71 < -local92) {
				return;
			}
			arg9[local17] = 0.0F;
			@Pc(109) float local109;
			if (arg2) {
				local109 = local71 - arg3.aFloat78;
				if (local109 > 0.0F) {
					local109 /= arg3.aFloat79;
					if (local109 > 1.0F) {
						local109 = 1.0F;
					}
					arg9[local17] = local109;
					local137 = (int) ((float) local6.aShortArray71[local17] * local109);
					if (local137 > 0) {
						local38 -= local137;
					}
				}
			} else if (arg3.aBoolean161) {
				local109 = local71 - arg3.aFloat78;
				if (local109 > 0.0F) {
					arg9[local17] = local109 / arg3.aFloat79;
					if (arg9[local17] > 1.0F) {
						arg9[local17] = 1.0F;
					}
				}
			}
			@Pc(194) float local194 = this.aFloat47 + this.aFloat37 * (float) local33 + this.aFloat40 * (float) local38 + this.aFloat44 * (float) local50;
			@Pc(215) float local215 = this.aFloat48 + this.aFloat52 * (float) local33 + this.aFloat41 * (float) local38 + this.aFloat43 * (float) local50;
			arg5[local17] = arg4.aFloat238 + arg4.aFloat239 * local194 / local92;
			arg6[local17] = arg4.aFloat240 + arg4.aFloat241 * local215 / local92;
			arg7[local17] = arg4.aFloat242 + arg4.aFloat243 * local71 / local92;
			arg8[local17] = local92;
		}
		@Pc(263) float local263 = (float) (this.anInt608 * 127780559);
		for (@Pc(265) int local265 = 0; local265 < local6.aShort137; local265++) {
			local137 = local265 * 3;
			@Pc(277) int local277 = local137 + 1;
			@Pc(281) int local281 = local277 + 1;
			@Pc(285) float local285 = arg5[local137];
			@Pc(289) float local289 = arg5[local277];
			@Pc(293) float local293 = arg5[local281];
			@Pc(297) float local297 = arg6[local137];
			@Pc(301) float local301 = arg6[local277];
			@Pc(305) float local305 = arg6[local281];
			if ((local285 - local289) * (local305 - local301) - (local297 - local301) * (local293 - local289) > 0.0F) {
				arg4.aBoolean558 = local285 < 0.0F || local289 < 0.0F || local293 < 0.0F || local285 > (float) arg4.anInt3270 || local289 > (float) arg4.anInt3270 || local293 > (float) arg4.anInt3270;
				if (arg9[local137] + arg9[local277] + arg9[local281] < 3.0F) {
					@Pc(379) int local379 = arg0 << this.anInt609 * -1495101509;
					@Pc(386) int local386 = arg1 << this.anInt609 * -1495101509;
					if ((local6.anIntArray306[local137] & 0xFFFFFF) != 0) {
						if (local6.aShortArray74[local137] == -1 || local6.aShortArray74[local277] == -1 || local6.aShortArray74[local281] == -1) {
							if (arg9[local137] + arg9[local277] + arg9[local281] > 0.0F) {
								arg4.method24361(true, true, false, local297, local301, local305, local285, local289, local293, arg7[local137], arg7[local277], arg7[local281], Class636.method32688(local6.anIntArray306[local137], arg3.anInt789 * 1046269871, arg9[local137] * 255.0F), Class636.method32688(local6.anIntArray306[local277], arg3.anInt789 * 1046269871, arg9[local277] * 255.0F), Class636.method32688(local6.anIntArray306[local281], arg3.anInt789 * 1046269871, arg9[local281] * 255.0F));
							} else {
								arg4.method24361(true, true, false, local297, local301, local305, local285, local289, local293, arg7[local137], arg7[local277], arg7[local281], local6.anIntArray306[local137], local6.anIntArray306[local277], local6.anIntArray306[local281]);
							}
						} else if (local6.aShortArray74[local137] == local6.aShortArray74[local277] && local6.aShortArray74[local137] == local6.aShortArray74[local281] && local6.aShortArray75[local137] == local6.aShortArray75[local277] && local6.aShortArray75[local137] == local6.aShortArray75[local281]) {
							arg4.method24376(true, true, false, local297, local301, local305, local285, local289, local293, arg7[local137], arg7[local277], arg7[local281], arg8[local137], arg8[local277], arg8[local281], (float) (local379 + local6.aShortArray72[local137]) / (float) local6.aShortArray75[local137], (float) (local379 + local6.aShortArray72[local277]) / (float) local6.aShortArray75[local277], (float) (local379 + local6.aShortArray72[local281]) / (float) local6.aShortArray75[local281], (float) (local386 + local6.aShortArray73[local137]) / (float) local6.aShortArray75[local137], (float) (local386 + local6.aShortArray73[local277]) / (float) local6.aShortArray75[local277], (float) (local386 + local6.aShortArray73[local281]) / (float) local6.aShortArray75[local281], local6.anIntArray306[local137], local6.anIntArray306[local277], local6.anIntArray306[local281], arg3.anInt789 * 1046269871, arg9[local137] * 255.0F, arg9[local277] * 255.0F, arg9[local281] * 255.0F, local6.aShortArray74[local137] & 0xFFFF);
						} else {
							arg4.method24379(true, true, false, local297, local301, local305, local285, local289, local293, arg7[local137], arg7[local277], arg7[local281], arg8[local137], arg8[local277], arg8[local281], (float) (local379 + local6.aShortArray72[local137]) / local263, (float) (local379 + local6.aShortArray72[local277]) / local263, (float) (local379 + local6.aShortArray72[local281]) / local263, (float) (local386 + local6.aShortArray73[local137]) / local263, (float) (local386 + local6.aShortArray73[local277]) / local263, (float) (local386 + local6.aShortArray73[local281]) / local263, local6.anIntArray306[local137], local6.anIntArray306[local277], local6.anIntArray306[local281], arg3.anInt789 * 1046269871, arg9[local137] * 255.0F, arg9[local277] * 255.0F, arg9[local281] * 255.0F, local6.aShortArray74[local137] & 0xFFFF, local263 / (float) local6.aShortArray75[local137], local6.aShortArray74[local277] & 0xFFFF, local263 / (float) local6.aShortArray75[local277], local6.aShortArray74[local281] & 0xFFFF, local263 / (float) local6.aShortArray75[local281]);
						}
					}
				} else {
					arg4.method24367(true, true, false, local297, local301, local305, local285, local289, local293, arg7[local137], arg7[local277], arg7[local281], arg3.anInt789 * 1046269871);
				}
			}
		}
	}

	@OriginalMember(owner = "client!aep", name = "bz", descriptor = "(IIZLclient!af;Lclient!ba;[F[F[F[F[FI)V", line = 1243)
	void method5558(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class95 arg3, @OriginalArg(4) Class163 arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) float[] arg7, @OriginalArg(8) float[] arg8, @OriginalArg(9) float[] arg9, @OriginalArg(10) int arg10) {
		@Pc(6) Class164 local6 = this.aClass164ArrayArray1[arg0][arg1];
		if (arg10 != 0 && (arg10 & 0x2) != 0 || local6 == null) {
			return;
		}
		@Pc(137) int local137;
		for (@Pc(17) int local17 = 0; local17 < local6.aShort136; local17++) {
			@Pc(33) int local33 = local6.aShortArray72[local17] + (arg0 << this.anInt609 * -1495101509);
			@Pc(38) int local38 = local6.aShortArray76[local17];
			@Pc(50) int local50 = local6.aShortArray73[local17] + (arg1 << this.anInt609 * -1495101509);
			@Pc(71) float local71 = this.aFloat51 + this.aFloat38 * (float) local33 + this.aFloat49 * (float) local38 + this.aFloat45 * (float) local50;
			@Pc(92) float local92 = this.aFloat42 + this.aFloat39 * (float) local33 + this.aFloat50 * (float) local38 + this.aFloat46 * (float) local50;
			if (local71 < -local92) {
				return;
			}
			arg9[local17] = 0.0F;
			@Pc(109) float local109;
			if (arg2) {
				local109 = local71 - arg3.aFloat78;
				if (local109 > 0.0F) {
					local109 /= arg3.aFloat79;
					if (local109 > 1.0F) {
						local109 = 1.0F;
					}
					arg9[local17] = local109;
					local137 = (int) ((float) local6.aShortArray71[local17] * local109);
					if (local137 > 0) {
						local38 -= local137;
					}
				}
			} else if (arg3.aBoolean161) {
				local109 = local71 - arg3.aFloat78;
				if (local109 > 0.0F) {
					arg9[local17] = local109 / arg3.aFloat79;
					if (arg9[local17] > 1.0F) {
						arg9[local17] = 1.0F;
					}
				}
			}
			@Pc(194) float local194 = this.aFloat47 + this.aFloat37 * (float) local33 + this.aFloat40 * (float) local38 + this.aFloat44 * (float) local50;
			@Pc(215) float local215 = this.aFloat48 + this.aFloat52 * (float) local33 + this.aFloat41 * (float) local38 + this.aFloat43 * (float) local50;
			arg5[local17] = arg4.aFloat238 + arg4.aFloat239 * local194 / local92;
			arg6[local17] = arg4.aFloat240 + arg4.aFloat241 * local215 / local92;
			arg7[local17] = arg4.aFloat242 + arg4.aFloat243 * local71 / local92;
			arg8[local17] = local92;
		}
		@Pc(263) float local263 = (float) (this.anInt608 * 127780559);
		for (@Pc(265) int local265 = 0; local265 < local6.aShort137; local265++) {
			local137 = local265 * 3;
			@Pc(277) int local277 = local137 + 1;
			@Pc(281) int local281 = local277 + 1;
			@Pc(285) float local285 = arg5[local137];
			@Pc(289) float local289 = arg5[local277];
			@Pc(293) float local293 = arg5[local281];
			@Pc(297) float local297 = arg6[local137];
			@Pc(301) float local301 = arg6[local277];
			@Pc(305) float local305 = arg6[local281];
			if ((local285 - local289) * (local305 - local301) - (local297 - local301) * (local293 - local289) > 0.0F) {
				arg4.aBoolean558 = local285 < 0.0F || local289 < 0.0F || local293 < 0.0F || local285 > (float) arg4.anInt3270 || local289 > (float) arg4.anInt3270 || local293 > (float) arg4.anInt3270;
				if (arg9[local137] + arg9[local277] + arg9[local281] < 3.0F) {
					@Pc(379) int local379 = arg0 << this.anInt609 * -1495101509;
					@Pc(386) int local386 = arg1 << this.anInt609 * -1495101509;
					if ((local6.anIntArray306[local137] & 0xFFFFFF) != 0) {
						if (local6.aShortArray74[local137] == -1 || local6.aShortArray74[local277] == -1 || local6.aShortArray74[local281] == -1) {
							if (arg9[local137] + arg9[local277] + arg9[local281] > 0.0F) {
								arg4.method24361(true, true, false, local297, local301, local305, local285, local289, local293, arg7[local137], arg7[local277], arg7[local281], Class636.method32688(local6.anIntArray306[local137], arg3.anInt789 * 1046269871, arg9[local137] * 255.0F), Class636.method32688(local6.anIntArray306[local277], arg3.anInt789 * 1046269871, arg9[local277] * 255.0F), Class636.method32688(local6.anIntArray306[local281], arg3.anInt789 * 1046269871, arg9[local281] * 255.0F));
							} else {
								arg4.method24361(true, true, false, local297, local301, local305, local285, local289, local293, arg7[local137], arg7[local277], arg7[local281], local6.anIntArray306[local137], local6.anIntArray306[local277], local6.anIntArray306[local281]);
							}
						} else if (local6.aShortArray74[local137] == local6.aShortArray74[local277] && local6.aShortArray74[local137] == local6.aShortArray74[local281] && local6.aShortArray75[local137] == local6.aShortArray75[local277] && local6.aShortArray75[local137] == local6.aShortArray75[local281]) {
							arg4.method24376(true, true, false, local297, local301, local305, local285, local289, local293, arg7[local137], arg7[local277], arg7[local281], arg8[local137], arg8[local277], arg8[local281], (float) (local379 + local6.aShortArray72[local137]) / (float) local6.aShortArray75[local137], (float) (local379 + local6.aShortArray72[local277]) / (float) local6.aShortArray75[local277], (float) (local379 + local6.aShortArray72[local281]) / (float) local6.aShortArray75[local281], (float) (local386 + local6.aShortArray73[local137]) / (float) local6.aShortArray75[local137], (float) (local386 + local6.aShortArray73[local277]) / (float) local6.aShortArray75[local277], (float) (local386 + local6.aShortArray73[local281]) / (float) local6.aShortArray75[local281], local6.anIntArray306[local137], local6.anIntArray306[local277], local6.anIntArray306[local281], arg3.anInt789 * 1046269871, arg9[local137] * 255.0F, arg9[local277] * 255.0F, arg9[local281] * 255.0F, local6.aShortArray74[local137] & 0xFFFF);
						} else {
							arg4.method24379(true, true, false, local297, local301, local305, local285, local289, local293, arg7[local137], arg7[local277], arg7[local281], arg8[local137], arg8[local277], arg8[local281], (float) (local379 + local6.aShortArray72[local137]) / local263, (float) (local379 + local6.aShortArray72[local277]) / local263, (float) (local379 + local6.aShortArray72[local281]) / local263, (float) (local386 + local6.aShortArray73[local137]) / local263, (float) (local386 + local6.aShortArray73[local277]) / local263, (float) (local386 + local6.aShortArray73[local281]) / local263, local6.anIntArray306[local137], local6.anIntArray306[local277], local6.anIntArray306[local281], arg3.anInt789 * 1046269871, arg9[local137] * 255.0F, arg9[local277] * 255.0F, arg9[local281] * 255.0F, local6.aShortArray74[local137] & 0xFFFF, local263 / (float) local6.aShortArray75[local137], local6.aShortArray74[local277] & 0xFFFF, local263 / (float) local6.aShortArray75[local277], local6.aShortArray74[local281] & 0xFFFF, local263 / (float) local6.aShortArray75[local281]);
						}
					}
				} else {
					arg4.method24367(true, true, false, local297, local301, local305, local285, local289, local293, arg7[local137], arg7[local277], arg7[local281], arg3.anInt789 * 1046269871);
				}
			}
		}
	}

	@OriginalMember(owner = "client!aep", name = "bu", descriptor = "(IIZLclient!af;Lclient!ba;[F[F[F[F[FI)V", line = 1243)
	void method5559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class95 arg3, @OriginalArg(4) Class163 arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) float[] arg7, @OriginalArg(8) float[] arg8, @OriginalArg(9) float[] arg9, @OriginalArg(10) int arg10) {
		@Pc(6) Class164 local6 = this.aClass164ArrayArray1[arg0][arg1];
		if (arg10 != 0 && (arg10 & 0x2) != 0 || local6 == null) {
			return;
		}
		@Pc(137) int local137;
		for (@Pc(17) int local17 = 0; local17 < local6.aShort136; local17++) {
			@Pc(33) int local33 = local6.aShortArray72[local17] + (arg0 << this.anInt609 * -1495101509);
			@Pc(38) int local38 = local6.aShortArray76[local17];
			@Pc(50) int local50 = local6.aShortArray73[local17] + (arg1 << this.anInt609 * -1495101509);
			@Pc(71) float local71 = this.aFloat51 + this.aFloat38 * (float) local33 + this.aFloat49 * (float) local38 + this.aFloat45 * (float) local50;
			@Pc(92) float local92 = this.aFloat42 + this.aFloat39 * (float) local33 + this.aFloat50 * (float) local38 + this.aFloat46 * (float) local50;
			if (local71 < -local92) {
				return;
			}
			arg9[local17] = 0.0F;
			@Pc(109) float local109;
			if (arg2) {
				local109 = local71 - arg3.aFloat78;
				if (local109 > 0.0F) {
					local109 /= arg3.aFloat79;
					if (local109 > 1.0F) {
						local109 = 1.0F;
					}
					arg9[local17] = local109;
					local137 = (int) ((float) local6.aShortArray71[local17] * local109);
					if (local137 > 0) {
						local38 -= local137;
					}
				}
			} else if (arg3.aBoolean161) {
				local109 = local71 - arg3.aFloat78;
				if (local109 > 0.0F) {
					arg9[local17] = local109 / arg3.aFloat79;
					if (arg9[local17] > 1.0F) {
						arg9[local17] = 1.0F;
					}
				}
			}
			@Pc(194) float local194 = this.aFloat47 + this.aFloat37 * (float) local33 + this.aFloat40 * (float) local38 + this.aFloat44 * (float) local50;
			@Pc(215) float local215 = this.aFloat48 + this.aFloat52 * (float) local33 + this.aFloat41 * (float) local38 + this.aFloat43 * (float) local50;
			arg5[local17] = arg4.aFloat238 + arg4.aFloat239 * local194 / local92;
			arg6[local17] = arg4.aFloat240 + arg4.aFloat241 * local215 / local92;
			arg7[local17] = arg4.aFloat242 + arg4.aFloat243 * local71 / local92;
			arg8[local17] = local92;
		}
		@Pc(263) float local263 = (float) (this.anInt608 * 127780559);
		for (@Pc(265) int local265 = 0; local265 < local6.aShort137; local265++) {
			local137 = local265 * 3;
			@Pc(277) int local277 = local137 + 1;
			@Pc(281) int local281 = local277 + 1;
			@Pc(285) float local285 = arg5[local137];
			@Pc(289) float local289 = arg5[local277];
			@Pc(293) float local293 = arg5[local281];
			@Pc(297) float local297 = arg6[local137];
			@Pc(301) float local301 = arg6[local277];
			@Pc(305) float local305 = arg6[local281];
			if ((local285 - local289) * (local305 - local301) - (local297 - local301) * (local293 - local289) > 0.0F) {
				arg4.aBoolean558 = local285 < 0.0F || local289 < 0.0F || local293 < 0.0F || local285 > (float) arg4.anInt3270 || local289 > (float) arg4.anInt3270 || local293 > (float) arg4.anInt3270;
				if (arg9[local137] + arg9[local277] + arg9[local281] < 3.0F) {
					@Pc(379) int local379 = arg0 << this.anInt609 * -1495101509;
					@Pc(386) int local386 = arg1 << this.anInt609 * -1495101509;
					if ((local6.anIntArray306[local137] & 0xFFFFFF) != 0) {
						if (local6.aShortArray74[local137] == -1 || local6.aShortArray74[local277] == -1 || local6.aShortArray74[local281] == -1) {
							if (arg9[local137] + arg9[local277] + arg9[local281] > 0.0F) {
								arg4.method24361(true, true, false, local297, local301, local305, local285, local289, local293, arg7[local137], arg7[local277], arg7[local281], Class636.method32688(local6.anIntArray306[local137], arg3.anInt789 * 1046269871, arg9[local137] * 255.0F), Class636.method32688(local6.anIntArray306[local277], arg3.anInt789 * 1046269871, arg9[local277] * 255.0F), Class636.method32688(local6.anIntArray306[local281], arg3.anInt789 * 1046269871, arg9[local281] * 255.0F));
							} else {
								arg4.method24361(true, true, false, local297, local301, local305, local285, local289, local293, arg7[local137], arg7[local277], arg7[local281], local6.anIntArray306[local137], local6.anIntArray306[local277], local6.anIntArray306[local281]);
							}
						} else if (local6.aShortArray74[local137] == local6.aShortArray74[local277] && local6.aShortArray74[local137] == local6.aShortArray74[local281] && local6.aShortArray75[local137] == local6.aShortArray75[local277] && local6.aShortArray75[local137] == local6.aShortArray75[local281]) {
							arg4.method24376(true, true, false, local297, local301, local305, local285, local289, local293, arg7[local137], arg7[local277], arg7[local281], arg8[local137], arg8[local277], arg8[local281], (float) (local379 + local6.aShortArray72[local137]) / (float) local6.aShortArray75[local137], (float) (local379 + local6.aShortArray72[local277]) / (float) local6.aShortArray75[local277], (float) (local379 + local6.aShortArray72[local281]) / (float) local6.aShortArray75[local281], (float) (local386 + local6.aShortArray73[local137]) / (float) local6.aShortArray75[local137], (float) (local386 + local6.aShortArray73[local277]) / (float) local6.aShortArray75[local277], (float) (local386 + local6.aShortArray73[local281]) / (float) local6.aShortArray75[local281], local6.anIntArray306[local137], local6.anIntArray306[local277], local6.anIntArray306[local281], arg3.anInt789 * 1046269871, arg9[local137] * 255.0F, arg9[local277] * 255.0F, arg9[local281] * 255.0F, local6.aShortArray74[local137] & 0xFFFF);
						} else {
							arg4.method24379(true, true, false, local297, local301, local305, local285, local289, local293, arg7[local137], arg7[local277], arg7[local281], arg8[local137], arg8[local277], arg8[local281], (float) (local379 + local6.aShortArray72[local137]) / local263, (float) (local379 + local6.aShortArray72[local277]) / local263, (float) (local379 + local6.aShortArray72[local281]) / local263, (float) (local386 + local6.aShortArray73[local137]) / local263, (float) (local386 + local6.aShortArray73[local277]) / local263, (float) (local386 + local6.aShortArray73[local281]) / local263, local6.anIntArray306[local137], local6.anIntArray306[local277], local6.anIntArray306[local281], arg3.anInt789 * 1046269871, arg9[local137] * 255.0F, arg9[local277] * 255.0F, arg9[local281] * 255.0F, local6.aShortArray74[local137] & 0xFFFF, local263 / (float) local6.aShortArray75[local137], local6.aShortArray74[local277] & 0xFFFF, local263 / (float) local6.aShortArray75[local277], local6.aShortArray74[local281] & 0xFFFF, local263 / (float) local6.aShortArray75[local281]);
						}
					}
				} else {
					arg4.method24367(true, true, false, local297, local301, local305, local285, local289, local293, arg7[local137], arg7[local277], arg7[local281], arg3.anInt789 * 1046269871);
				}
			}
		}
	}

	@OriginalMember(owner = "client!aep", name = "bb", descriptor = "(I)Z", line = 1325)
	boolean method5560(@OriginalArg(0) int arg0) {
		if ((this.anInt615 & 0x8) == 0) {
			return false;
		} else if (arg0 == 4) {
			return true;
		} else if (arg0 == 8) {
			return true;
		} else {
			return arg0 == 9;
		}
	}

	@OriginalMember(owner = "client!aep", name = "bf", descriptor = "(I)Z", line = 1325)
	boolean method5561(@OriginalArg(0) int arg0) {
		if ((this.anInt615 & 0x8) == 0) {
			return false;
		} else if (arg0 == 4) {
			return true;
		} else if (arg0 == 8) {
			return true;
		} else {
			return arg0 == 9;
		}
	}

	@OriginalMember(owner = "client!aep", name = "w", descriptor = "(IIIIIII[[Z)V", line = 1333)
	@Override
	public void method5540(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean[][] arg7) {
		@Pc(4) Class95 local4 = this.aClass86_Sub2_3.method4886(Thread.currentThread());
		@Pc(7) Class163 local7 = local4.aClass163_2;
		local7.anInt3269 = 0;
		local7.aBoolean558 = true;
		this.aClass86_Sub2_3.method4867();
		if (this.aClass165ArrayArray1 != null || this.aClass164ArrayArray1 != null) {
			this.method5565(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, local4, local7, local4.aFloatArray35, local4.aFloatArray38);
		} else if (this.aClass180ArrayArray1 != null) {
			this.method5563(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, local4, local7, local4.aFloatArray35, local4.aFloatArray38);
		}
	}

	@OriginalMember(owner = "client!aep", name = "ag", descriptor = "(IIIIIII[[Z)V", line = 1333)
	@Override
	public void method5533(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean[][] arg7) {
		@Pc(4) Class95 local4 = this.aClass86_Sub2_3.method4886(Thread.currentThread());
		@Pc(7) Class163 local7 = local4.aClass163_2;
		local7.anInt3269 = 0;
		local7.aBoolean558 = true;
		this.aClass86_Sub2_3.method4867();
		if (this.aClass165ArrayArray1 != null || this.aClass164ArrayArray1 != null) {
			this.method5565(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, local4, local7, local4.aFloatArray35, local4.aFloatArray38);
		} else if (this.aClass180ArrayArray1 != null) {
			this.method5563(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, local4, local7, local4.aFloatArray35, local4.aFloatArray38);
		}
	}

	@OriginalMember(owner = "client!aep", name = "bn", descriptor = "(IIIIIII[[ZLclient!af;Lclient!ba;[F[F)V", line = 1343)
	void method5562(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean[][] arg7, @OriginalArg(8) Class95 arg8, @OriginalArg(9) Class163 arg9, @OriginalArg(10) float[] arg10, @OriginalArg(11) float[] arg11) {
		@Pc(7) int local7 = (arg6 - arg4) * arg2 / 256;
		@Pc(11) int local11 = arg2 >> 8;
		@Pc(14) boolean local14 = arg8.aBoolean162;
		this.aClass86_Sub2_3.method20230(false);
		arg9.aBoolean559 = false;
		arg9.aBoolean560 = false;
		@Pc(26) int local26 = arg0;
		@Pc(30) int local30 = arg1 + local7;
		for (@Pc(32) int local32 = arg3; local32 < arg5; local32++) {
			for (@Pc(37) int local37 = arg4; local37 < arg6; local37++) {
				if (arg7[local32 - arg3][local37 - arg4]) {
					@Pc(85) int local85;
					if (this.aClass180ArrayArray1[local32][local37] != null) {
						@Pc(64) Class180 local64 = this.aClass180ArrayArray1[local32][local37];
						if (local64.aShort147 != -1 && (local64.aByte108 & 0x2) == 0 && local64.anInt3313 == -1) {
							local85 = this.aClass86_Sub2_3.method4859(local64.aShort147 & 0xFFFF);
							arg9.method24354(true, true, false, (float) (local30 - local11), (float) (local30 - local11), (float) local30, (float) (local26 + local11), (float) local26, (float) (local26 + local11), 100.0F, 100.0F, 100.0F, (float) Class186.method24627(local85, local64.aShort148 & 0xFFFF), (float) Class186.method24627(local85, local64.aShort149 & 0xFFFF), (float) Class186.method24627(local85, local64.aShort150 & 0xFFFF));
							arg9.method24354(true, true, false, (float) local30, (float) local30, (float) (local30 - local11), (float) local26, (float) (local26 + local11), (float) local26, 100.0F, 100.0F, 100.0F, (float) Class186.method24627(local85, local64.aShort146 & 0xFFFF), (float) Class186.method24627(local85, local64.aShort150 & 0xFFFF), (float) Class186.method24627(local85, local64.aShort149 & 0xFFFF));
						} else if (local64.anInt3313 == -1) {
							arg9.method24354(true, true, false, (float) (local30 - local11), (float) (local30 - local11), (float) local30, (float) (local26 + local11), (float) local26, (float) (local26 + local11), 100.0F, 100.0F, 100.0F, (float) (local64.aShort148 & 0xFFFF), (float) (local64.aShort149 & 0xFFFF), (float) (local64.aShort150 & 0xFFFF));
							arg9.method24354(true, true, false, (float) local30, (float) local30, (float) (local30 - local11), (float) local26, (float) (local26 + local11), (float) local26, 100.0F, 100.0F, 100.0F, (float) (local64.aShort146 & 0xFFFF), (float) (local64.aShort150 & 0xFFFF), (float) (local64.aShort149 & 0xFFFF));
						} else {
							local85 = local64.anInt3313;
							arg9.method24354(true, true, false, (float) (local30 - local11), (float) (local30 - local11), (float) local30, (float) (local26 + local11), (float) local26, (float) (local26 + local11), 100.0F, 100.0F, 100.0F, (float) local85, (float) local85, (float) local85);
							arg9.method24354(true, true, false, (float) local30, (float) local30, (float) (local30 - local11), (float) local26, (float) (local26 + local11), (float) local26, 100.0F, 100.0F, 100.0F, (float) local85, (float) local85, (float) local85);
						}
					} else if (this.aClass153ArrayArray1[local32][local37] != null) {
						@Pc(355) Class153 local355 = this.aClass153ArrayArray1[local32][local37];
						for (local85 = 0; local85 < local355.aShort102; local85++) {
							arg10[local85] = local26 + local355.aShortArray53[local85] * local11 / (this.anInt608 * 127780559);
							arg11[local85] = local30 - local355.aShortArray55[local85] * local11 / (this.anInt608 * 127780559);
						}
						for (local85 = 0; local85 < local355.aShort103; local85++) {
							@Pc(408) short local408 = local355.aShortArray56[local85];
							@Pc(413) short local413 = local355.aShortArray57[local85];
							@Pc(418) short local418 = local355.aShortArray58[local85];
							@Pc(422) float local422 = arg10[local408];
							@Pc(426) float local426 = arg10[local413];
							@Pc(430) float local430 = arg10[local418];
							@Pc(434) float local434 = arg11[local408];
							@Pc(438) float local438 = arg11[local413];
							@Pc(442) float local442 = arg11[local418];
							@Pc(456) int local456;
							if (local355.anIntArray232 != null && local355.anIntArray232[local85] != -1) {
								local456 = local355.anIntArray232[local85];
								arg9.method24354(true, true, false, local434, local438, local442, local422, local426, local430, 100.0F, 100.0F, 100.0F, (float) Class186.method24627(local456, local355.aShortArray59[local408]), (float) Class186.method24627(local456, local355.aShortArray59[local413]), (float) Class186.method24627(local456, local355.aShortArray59[local418]));
							} else if (local355.aShortArray52 == null || local355.aShortArray52[local85] == -1) {
								local456 = local355.anIntArray233[local85];
								arg9.method24354(true, true, false, local434, local438, local442, local422, local426, local430, 100.0F, 100.0F, 100.0F, (float) Class186.method24627(local456, local355.aShortArray59[local408]), (float) Class186.method24627(local456, local355.aShortArray59[local413]), (float) Class186.method24627(local456, local355.aShortArray59[local418]));
							} else {
								local456 = this.aClass86_Sub2_3.method4859(local355.aShortArray52[local85] & 0xFFFF);
								arg9.method24354(true, true, false, local434, local438, local442, local422, local426, local430, 100.0F, 100.0F, 100.0F, (float) Class186.method24627(local456, local355.aShortArray59[local408]), (float) Class186.method24627(local456, local355.aShortArray59[local413]), (float) Class186.method24627(local456, local355.aShortArray59[local418]));
							}
						}
					}
				}
				local30 -= local11;
			}
			local30 = arg1 + local7;
			local26 += local11;
		}
		arg9.aBoolean559 = true;
		this.aClass86_Sub2_3.method20230(local14);
	}

	@OriginalMember(owner = "client!aep", name = "bd", descriptor = "(IIIIIII[[ZLclient!af;Lclient!ba;[F[F)V", line = 1343)
	void method5563(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean[][] arg7, @OriginalArg(8) Class95 arg8, @OriginalArg(9) Class163 arg9, @OriginalArg(10) float[] arg10, @OriginalArg(11) float[] arg11) {
		@Pc(7) int local7 = (arg6 - arg4) * arg2 / 256;
		@Pc(11) int local11 = arg2 >> 8;
		@Pc(14) boolean local14 = arg8.aBoolean162;
		this.aClass86_Sub2_3.method20230(false);
		arg9.aBoolean559 = false;
		arg9.aBoolean560 = false;
		@Pc(26) int local26 = arg0;
		@Pc(30) int local30 = arg1 + local7;
		for (@Pc(32) int local32 = arg3; local32 < arg5; local32++) {
			for (@Pc(37) int local37 = arg4; local37 < arg6; local37++) {
				if (arg7[local32 - arg3][local37 - arg4]) {
					@Pc(85) int local85;
					if (this.aClass180ArrayArray1[local32][local37] != null) {
						@Pc(64) Class180 local64 = this.aClass180ArrayArray1[local32][local37];
						if (local64.aShort147 != -1 && (local64.aByte108 & 0x2) == 0 && local64.anInt3313 == -1) {
							local85 = this.aClass86_Sub2_3.method4859(local64.aShort147 & 0xFFFF);
							arg9.method24354(true, true, false, (float) (local30 - local11), (float) (local30 - local11), (float) local30, (float) (local26 + local11), (float) local26, (float) (local26 + local11), 100.0F, 100.0F, 100.0F, (float) Class186.method24627(local85, local64.aShort148 & 0xFFFF), (float) Class186.method24627(local85, local64.aShort149 & 0xFFFF), (float) Class186.method24627(local85, local64.aShort150 & 0xFFFF));
							arg9.method24354(true, true, false, (float) local30, (float) local30, (float) (local30 - local11), (float) local26, (float) (local26 + local11), (float) local26, 100.0F, 100.0F, 100.0F, (float) Class186.method24627(local85, local64.aShort146 & 0xFFFF), (float) Class186.method24627(local85, local64.aShort150 & 0xFFFF), (float) Class186.method24627(local85, local64.aShort149 & 0xFFFF));
						} else if (local64.anInt3313 == -1) {
							arg9.method24354(true, true, false, (float) (local30 - local11), (float) (local30 - local11), (float) local30, (float) (local26 + local11), (float) local26, (float) (local26 + local11), 100.0F, 100.0F, 100.0F, (float) (local64.aShort148 & 0xFFFF), (float) (local64.aShort149 & 0xFFFF), (float) (local64.aShort150 & 0xFFFF));
							arg9.method24354(true, true, false, (float) local30, (float) local30, (float) (local30 - local11), (float) local26, (float) (local26 + local11), (float) local26, 100.0F, 100.0F, 100.0F, (float) (local64.aShort146 & 0xFFFF), (float) (local64.aShort150 & 0xFFFF), (float) (local64.aShort149 & 0xFFFF));
						} else {
							local85 = local64.anInt3313;
							arg9.method24354(true, true, false, (float) (local30 - local11), (float) (local30 - local11), (float) local30, (float) (local26 + local11), (float) local26, (float) (local26 + local11), 100.0F, 100.0F, 100.0F, (float) local85, (float) local85, (float) local85);
							arg9.method24354(true, true, false, (float) local30, (float) local30, (float) (local30 - local11), (float) local26, (float) (local26 + local11), (float) local26, 100.0F, 100.0F, 100.0F, (float) local85, (float) local85, (float) local85);
						}
					} else if (this.aClass153ArrayArray1[local32][local37] != null) {
						@Pc(355) Class153 local355 = this.aClass153ArrayArray1[local32][local37];
						for (local85 = 0; local85 < local355.aShort102; local85++) {
							arg10[local85] = local26 + local355.aShortArray53[local85] * local11 / (this.anInt608 * 127780559);
							arg11[local85] = local30 - local355.aShortArray55[local85] * local11 / (this.anInt608 * 127780559);
						}
						for (local85 = 0; local85 < local355.aShort103; local85++) {
							@Pc(408) short local408 = local355.aShortArray56[local85];
							@Pc(413) short local413 = local355.aShortArray57[local85];
							@Pc(418) short local418 = local355.aShortArray58[local85];
							@Pc(422) float local422 = arg10[local408];
							@Pc(426) float local426 = arg10[local413];
							@Pc(430) float local430 = arg10[local418];
							@Pc(434) float local434 = arg11[local408];
							@Pc(438) float local438 = arg11[local413];
							@Pc(442) float local442 = arg11[local418];
							@Pc(456) int local456;
							if (local355.anIntArray232 != null && local355.anIntArray232[local85] != -1) {
								local456 = local355.anIntArray232[local85];
								arg9.method24354(true, true, false, local434, local438, local442, local422, local426, local430, 100.0F, 100.0F, 100.0F, (float) Class186.method24627(local456, local355.aShortArray59[local408]), (float) Class186.method24627(local456, local355.aShortArray59[local413]), (float) Class186.method24627(local456, local355.aShortArray59[local418]));
							} else if (local355.aShortArray52 == null || local355.aShortArray52[local85] == -1) {
								local456 = local355.anIntArray233[local85];
								arg9.method24354(true, true, false, local434, local438, local442, local422, local426, local430, 100.0F, 100.0F, 100.0F, (float) Class186.method24627(local456, local355.aShortArray59[local408]), (float) Class186.method24627(local456, local355.aShortArray59[local413]), (float) Class186.method24627(local456, local355.aShortArray59[local418]));
							} else {
								local456 = this.aClass86_Sub2_3.method4859(local355.aShortArray52[local85] & 0xFFFF);
								arg9.method24354(true, true, false, local434, local438, local442, local422, local426, local430, 100.0F, 100.0F, 100.0F, (float) Class186.method24627(local456, local355.aShortArray59[local408]), (float) Class186.method24627(local456, local355.aShortArray59[local413]), (float) Class186.method24627(local456, local355.aShortArray59[local418]));
							}
						}
					}
				}
				local30 -= local11;
			}
			local30 = arg1 + local7;
			local26 += local11;
		}
		arg9.aBoolean559 = true;
		this.aClass86_Sub2_3.method20230(local14);
	}

	@OriginalMember(owner = "client!aep", name = "bp", descriptor = "(IIIIIII[[ZLclient!af;Lclient!ba;[F[F)V", line = 1343)
	void method5564(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean[][] arg7, @OriginalArg(8) Class95 arg8, @OriginalArg(9) Class163 arg9, @OriginalArg(10) float[] arg10, @OriginalArg(11) float[] arg11) {
		@Pc(7) int local7 = (arg6 - arg4) * arg2 / 256;
		@Pc(11) int local11 = arg2 >> 8;
		@Pc(14) boolean local14 = arg8.aBoolean162;
		this.aClass86_Sub2_3.method20230(false);
		arg9.aBoolean559 = false;
		arg9.aBoolean560 = false;
		@Pc(26) int local26 = arg0;
		@Pc(30) int local30 = arg1 + local7;
		for (@Pc(32) int local32 = arg3; local32 < arg5; local32++) {
			for (@Pc(37) int local37 = arg4; local37 < arg6; local37++) {
				if (arg7[local32 - arg3][local37 - arg4]) {
					@Pc(85) int local85;
					if (this.aClass180ArrayArray1[local32][local37] != null) {
						@Pc(64) Class180 local64 = this.aClass180ArrayArray1[local32][local37];
						if (local64.aShort147 != -1 && (local64.aByte108 & 0x2) == 0 && local64.anInt3313 == -1) {
							local85 = this.aClass86_Sub2_3.method4859(local64.aShort147 & 0xFFFF);
							arg9.method24354(true, true, false, (float) (local30 - local11), (float) (local30 - local11), (float) local30, (float) (local26 + local11), (float) local26, (float) (local26 + local11), 100.0F, 100.0F, 100.0F, (float) Class186.method24627(local85, local64.aShort148 & 0xFFFF), (float) Class186.method24627(local85, local64.aShort149 & 0xFFFF), (float) Class186.method24627(local85, local64.aShort150 & 0xFFFF));
							arg9.method24354(true, true, false, (float) local30, (float) local30, (float) (local30 - local11), (float) local26, (float) (local26 + local11), (float) local26, 100.0F, 100.0F, 100.0F, (float) Class186.method24627(local85, local64.aShort146 & 0xFFFF), (float) Class186.method24627(local85, local64.aShort150 & 0xFFFF), (float) Class186.method24627(local85, local64.aShort149 & 0xFFFF));
						} else if (local64.anInt3313 == -1) {
							arg9.method24354(true, true, false, (float) (local30 - local11), (float) (local30 - local11), (float) local30, (float) (local26 + local11), (float) local26, (float) (local26 + local11), 100.0F, 100.0F, 100.0F, (float) (local64.aShort148 & 0xFFFF), (float) (local64.aShort149 & 0xFFFF), (float) (local64.aShort150 & 0xFFFF));
							arg9.method24354(true, true, false, (float) local30, (float) local30, (float) (local30 - local11), (float) local26, (float) (local26 + local11), (float) local26, 100.0F, 100.0F, 100.0F, (float) (local64.aShort146 & 0xFFFF), (float) (local64.aShort150 & 0xFFFF), (float) (local64.aShort149 & 0xFFFF));
						} else {
							local85 = local64.anInt3313;
							arg9.method24354(true, true, false, (float) (local30 - local11), (float) (local30 - local11), (float) local30, (float) (local26 + local11), (float) local26, (float) (local26 + local11), 100.0F, 100.0F, 100.0F, (float) local85, (float) local85, (float) local85);
							arg9.method24354(true, true, false, (float) local30, (float) local30, (float) (local30 - local11), (float) local26, (float) (local26 + local11), (float) local26, 100.0F, 100.0F, 100.0F, (float) local85, (float) local85, (float) local85);
						}
					} else if (this.aClass153ArrayArray1[local32][local37] != null) {
						@Pc(355) Class153 local355 = this.aClass153ArrayArray1[local32][local37];
						for (local85 = 0; local85 < local355.aShort102; local85++) {
							arg10[local85] = local26 + local355.aShortArray53[local85] * local11 / (this.anInt608 * 127780559);
							arg11[local85] = local30 - local355.aShortArray55[local85] * local11 / (this.anInt608 * 127780559);
						}
						for (local85 = 0; local85 < local355.aShort103; local85++) {
							@Pc(408) short local408 = local355.aShortArray56[local85];
							@Pc(413) short local413 = local355.aShortArray57[local85];
							@Pc(418) short local418 = local355.aShortArray58[local85];
							@Pc(422) float local422 = arg10[local408];
							@Pc(426) float local426 = arg10[local413];
							@Pc(430) float local430 = arg10[local418];
							@Pc(434) float local434 = arg11[local408];
							@Pc(438) float local438 = arg11[local413];
							@Pc(442) float local442 = arg11[local418];
							@Pc(456) int local456;
							if (local355.anIntArray232 != null && local355.anIntArray232[local85] != -1) {
								local456 = local355.anIntArray232[local85];
								arg9.method24354(true, true, false, local434, local438, local442, local422, local426, local430, 100.0F, 100.0F, 100.0F, (float) Class186.method24627(local456, local355.aShortArray59[local408]), (float) Class186.method24627(local456, local355.aShortArray59[local413]), (float) Class186.method24627(local456, local355.aShortArray59[local418]));
							} else if (local355.aShortArray52 == null || local355.aShortArray52[local85] == -1) {
								local456 = local355.anIntArray233[local85];
								arg9.method24354(true, true, false, local434, local438, local442, local422, local426, local430, 100.0F, 100.0F, 100.0F, (float) Class186.method24627(local456, local355.aShortArray59[local408]), (float) Class186.method24627(local456, local355.aShortArray59[local413]), (float) Class186.method24627(local456, local355.aShortArray59[local418]));
							} else {
								local456 = this.aClass86_Sub2_3.method4859(local355.aShortArray52[local85] & 0xFFFF);
								arg9.method24354(true, true, false, local434, local438, local442, local422, local426, local430, 100.0F, 100.0F, 100.0F, (float) Class186.method24627(local456, local355.aShortArray59[local408]), (float) Class186.method24627(local456, local355.aShortArray59[local413]), (float) Class186.method24627(local456, local355.aShortArray59[local418]));
							}
						}
					}
				}
				local30 -= local11;
			}
			local30 = arg1 + local7;
			local26 += local11;
		}
		arg9.aBoolean559 = true;
		this.aClass86_Sub2_3.method20230(local14);
	}

	@OriginalMember(owner = "client!aep", name = "by", descriptor = "(IIIIIII[[ZLclient!af;Lclient!ba;[F[F)V", line = 1416)
	void method5565(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean[][] arg7, @OriginalArg(8) Class95 arg8, @OriginalArg(9) Class163 arg9, @OriginalArg(10) float[] arg10, @OriginalArg(11) float[] arg11) {
		@Pc(7) int local7 = (arg6 - arg4) * arg2 / 256;
		@Pc(11) int local11 = arg2 >> 8;
		@Pc(14) boolean local14 = arg8.aBoolean162;
		this.aClass86_Sub2_3.method20230(false);
		arg9.aBoolean559 = false;
		arg9.aBoolean560 = false;
		@Pc(26) int local26 = arg0;
		@Pc(30) int local30 = arg1 + local7;
		for (@Pc(32) int local32 = arg3; local32 < arg5; local32++) {
			for (@Pc(37) int local37 = arg4; local37 < arg6; local37++) {
				if (arg7[local32 - arg3][local37 - arg4]) {
					@Pc(87) int local87;
					@Pc(408) int local408;
					@Pc(412) int local412;
					@Pc(416) int local416;
					@Pc(420) float local420;
					@Pc(424) float local424;
					@Pc(428) float local428;
					@Pc(432) float local432;
					@Pc(436) float local436;
					@Pc(440) float local440;
					@Pc(465) int local465;
					if (this.aClass165ArrayArray1 == null) {
						if (this.aClass164ArrayArray1[local32][local37] != null) {
							@Pc(596) Class164 local596 = this.aClass164ArrayArray1[local32][local37];
							for (local87 = 0; local87 < local596.aShort136; local87++) {
								arg10[local87] = local26 + local596.aShortArray72[local87] * local11 / (this.anInt608 * 127780559);
								arg11[local87] = local30 - local596.aShortArray73[local87] * local11 / (this.anInt608 * 127780559);
							}
							for (local87 = 0; local87 < local596.aShort137; local87++) {
								local408 = local87 * 3;
								local412 = local408 + 1;
								local416 = local412 + 1;
								local420 = arg10[local408];
								local424 = arg10[local412];
								local428 = arg10[local416];
								local432 = arg11[local408];
								local436 = arg11[local412];
								local440 = arg11[local416];
								if (local596.anIntArray307 == null || local596.anIntArray307[local87] == 0) {
									arg9.method24361(true, true, false, local432, local436, local440, local420, local424, local428, 100.0F, 100.0F, 100.0F, local596.anIntArray306[local408], local596.anIntArray306[local412], local596.anIntArray306[local416]);
								} else {
									local465 = local596.anIntArray307[local87];
									arg9.method24361(true, true, false, local432, local436, local440, local420, local424, local428, 100.0F, 100.0F, 100.0F, local465, local465, local465);
								}
							}
						}
					} else if (this.aClass165ArrayArray1[local32][local37] != null) {
						@Pc(67) Class165 local67 = this.aClass165ArrayArray1[local32][local37];
						if (local67.aShort142 != -1 && (local67.aByte104 & 0x2) == 0 && local67.anInt3283 == 0) {
							local87 = this.aClass86_Sub2_3.method4859(local67.aShort142 & 0xFFFF);
							arg9.method24354(true, true, false, (float) (local30 - local11), (float) (local30 - local11), (float) local30, (float) (local26 + local11), (float) local26, (float) (local26 + local11), 100.0F, 100.0F, 100.0F, (float) Class186.method24627(local87, local67.anInt3282), (float) Class186.method24627(local87, local67.anInt3280), (float) Class186.method24627(local87, local67.anInt3279));
							arg9.method24354(true, true, false, (float) local30, (float) local30, (float) (local30 - local11), (float) local26, (float) (local26 + local11), (float) local26, 100.0F, 100.0F, 100.0F, (float) Class186.method24627(local87, local67.anInt3281), (float) Class186.method24627(local87, local67.anInt3279), (float) Class186.method24627(local87, local67.anInt3280));
						} else if (local67.anInt3283 == 0) {
							arg9.method24361(true, true, false, (float) (local30 - local11), (float) (local30 - local11), (float) local30, (float) (local26 + local11), (float) local26, (float) (local26 + local11), 100.0F, 100.0F, 100.0F, local67.anInt3282, local67.anInt3280, local67.anInt3279);
							arg9.method24361(true, true, false, (float) local30, (float) local30, (float) (local30 - local11), (float) local26, (float) (local26 + local11), (float) local26, 100.0F, 100.0F, 100.0F, local67.anInt3281, local67.anInt3279, local67.anInt3280);
						} else {
							local87 = local67.anInt3283;
							arg9.method24361(true, true, false, (float) (local30 - local11), (float) (local30 - local11), (float) local30, (float) (local26 + local11), (float) local26, (float) (local26 + local11), 100.0F, 100.0F, 100.0F, Class334.method27666(local87, local67.anInt3282 & 0xFF000000), Class334.method27666(local87, local67.anInt3280 & 0xFF000000), Class334.method27666(local87, local67.anInt3279 & 0xFF000000));
							arg9.method24361(true, true, false, (float) local30, (float) local30, (float) (local30 - local11), (float) local26, (float) (local26 + local11), (float) local26, 100.0F, 100.0F, 100.0F, Class334.method27666(local87, local67.anInt3281 & 0xFF000000), Class334.method27666(local87, local67.anInt3279 & 0xFF000000), Class334.method27666(local87, local67.anInt3280 & 0xFF000000));
						}
					} else if (this.aClass171ArrayArray1[local32][local37] != null) {
						@Pc(356) Class171 local356 = this.aClass171ArrayArray1[local32][local37];
						for (local87 = 0; local87 < local356.aShort143; local87++) {
							arg10[local87] = local26 + local356.aShortArray77[local87] * local11 / (this.anInt608 * 127780559);
							arg11[local87] = local30 - local356.aShortArray80[local87] * local11 / (this.anInt608 * 127780559);
						}
						for (local87 = 0; local87 < local356.aShort144; local87++) {
							local408 = local87 * 3;
							local412 = local408 + 1;
							local416 = local412 + 1;
							local420 = arg10[local408];
							local424 = arg10[local412];
							local428 = arg10[local416];
							local432 = arg11[local408];
							local436 = arg11[local412];
							local440 = arg11[local416];
							if (local356.anIntArray310 != null && local356.anIntArray310[local87] != 0 && (local356.aShortArray81 == null || local356.aShortArray81 != null && local356.aShortArray81[local87] == -1)) {
								local465 = local356.anIntArray310[local87];
								arg9.method24361(true, true, false, local432, local436, local440, local420, local424, local428, 100.0F, 100.0F, 100.0F, Class334.method27666(local465, -16777216 - (local356.anIntArray309[local408] & -16777216)), Class334.method27666(local465, -16777216 - (local356.anIntArray309[local412] & -16777216)), Class334.method27666(local465, -16777216 - (local356.anIntArray309[local416] & -16777216)));
							} else if (local356.aShortArray81 == null || local356.aShortArray81[local87] == -1) {
								arg9.method24361(true, true, false, local432, local436, local440, local420, local424, local428, 100.0F, 100.0F, 100.0F, local356.anIntArray309[local408], local356.anIntArray309[local412], local356.anIntArray309[local416]);
							} else {
								local465 = this.aClass86_Sub2_3.method4859(local356.aShortArray81[local87] & 0xFFFF);
								arg9.method24354(true, true, false, local432, local436, local440, local420, local424, local428, 100.0F, 100.0F, 100.0F, (float) local465, (float) local465, (float) local465);
							}
						}
					}
				}
				local30 -= local11;
			}
			local30 = arg1 + local7;
			local26 += local11;
		}
		arg9.aBoolean559 = true;
		this.aClass86_Sub2_3.method20230(local14);
	}

	@OriginalMember(owner = "client!aep", name = "bo", descriptor = "(IIIIIII[[ZLclient!af;Lclient!ba;[F[F)V", line = 1416)
	void method5566(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean[][] arg7, @OriginalArg(8) Class95 arg8, @OriginalArg(9) Class163 arg9, @OriginalArg(10) float[] arg10, @OriginalArg(11) float[] arg11) {
		@Pc(7) int local7 = (arg6 - arg4) * arg2 / 256;
		@Pc(11) int local11 = arg2 >> 8;
		@Pc(14) boolean local14 = arg8.aBoolean162;
		this.aClass86_Sub2_3.method20230(false);
		arg9.aBoolean559 = false;
		arg9.aBoolean560 = false;
		@Pc(26) int local26 = arg0;
		@Pc(30) int local30 = arg1 + local7;
		for (@Pc(32) int local32 = arg3; local32 < arg5; local32++) {
			for (@Pc(37) int local37 = arg4; local37 < arg6; local37++) {
				if (arg7[local32 - arg3][local37 - arg4]) {
					@Pc(87) int local87;
					@Pc(408) int local408;
					@Pc(412) int local412;
					@Pc(416) int local416;
					@Pc(420) float local420;
					@Pc(424) float local424;
					@Pc(428) float local428;
					@Pc(432) float local432;
					@Pc(436) float local436;
					@Pc(440) float local440;
					@Pc(465) int local465;
					if (this.aClass165ArrayArray1 == null) {
						if (this.aClass164ArrayArray1[local32][local37] != null) {
							@Pc(596) Class164 local596 = this.aClass164ArrayArray1[local32][local37];
							for (local87 = 0; local87 < local596.aShort136; local87++) {
								arg10[local87] = local26 + local596.aShortArray72[local87] * local11 / (this.anInt608 * 127780559);
								arg11[local87] = local30 - local596.aShortArray73[local87] * local11 / (this.anInt608 * 127780559);
							}
							for (local87 = 0; local87 < local596.aShort137; local87++) {
								local408 = local87 * 3;
								local412 = local408 + 1;
								local416 = local412 + 1;
								local420 = arg10[local408];
								local424 = arg10[local412];
								local428 = arg10[local416];
								local432 = arg11[local408];
								local436 = arg11[local412];
								local440 = arg11[local416];
								if (local596.anIntArray307 == null || local596.anIntArray307[local87] == 0) {
									arg9.method24361(true, true, false, local432, local436, local440, local420, local424, local428, 100.0F, 100.0F, 100.0F, local596.anIntArray306[local408], local596.anIntArray306[local412], local596.anIntArray306[local416]);
								} else {
									local465 = local596.anIntArray307[local87];
									arg9.method24361(true, true, false, local432, local436, local440, local420, local424, local428, 100.0F, 100.0F, 100.0F, local465, local465, local465);
								}
							}
						}
					} else if (this.aClass165ArrayArray1[local32][local37] != null) {
						@Pc(67) Class165 local67 = this.aClass165ArrayArray1[local32][local37];
						if (local67.aShort142 != -1 && (local67.aByte104 & 0x2) == 0 && local67.anInt3283 == 0) {
							local87 = this.aClass86_Sub2_3.method4859(local67.aShort142 & 0xFFFF);
							arg9.method24354(true, true, false, (float) (local30 - local11), (float) (local30 - local11), (float) local30, (float) (local26 + local11), (float) local26, (float) (local26 + local11), 100.0F, 100.0F, 100.0F, (float) Class186.method24627(local87, local67.anInt3282), (float) Class186.method24627(local87, local67.anInt3280), (float) Class186.method24627(local87, local67.anInt3279));
							arg9.method24354(true, true, false, (float) local30, (float) local30, (float) (local30 - local11), (float) local26, (float) (local26 + local11), (float) local26, 100.0F, 100.0F, 100.0F, (float) Class186.method24627(local87, local67.anInt3281), (float) Class186.method24627(local87, local67.anInt3279), (float) Class186.method24627(local87, local67.anInt3280));
						} else if (local67.anInt3283 == 0) {
							arg9.method24361(true, true, false, (float) (local30 - local11), (float) (local30 - local11), (float) local30, (float) (local26 + local11), (float) local26, (float) (local26 + local11), 100.0F, 100.0F, 100.0F, local67.anInt3282, local67.anInt3280, local67.anInt3279);
							arg9.method24361(true, true, false, (float) local30, (float) local30, (float) (local30 - local11), (float) local26, (float) (local26 + local11), (float) local26, 100.0F, 100.0F, 100.0F, local67.anInt3281, local67.anInt3279, local67.anInt3280);
						} else {
							local87 = local67.anInt3283;
							arg9.method24361(true, true, false, (float) (local30 - local11), (float) (local30 - local11), (float) local30, (float) (local26 + local11), (float) local26, (float) (local26 + local11), 100.0F, 100.0F, 100.0F, Class334.method27666(local87, local67.anInt3282 & 0xFF000000), Class334.method27666(local87, local67.anInt3280 & 0xFF000000), Class334.method27666(local87, local67.anInt3279 & 0xFF000000));
							arg9.method24361(true, true, false, (float) local30, (float) local30, (float) (local30 - local11), (float) local26, (float) (local26 + local11), (float) local26, 100.0F, 100.0F, 100.0F, Class334.method27666(local87, local67.anInt3281 & 0xFF000000), Class334.method27666(local87, local67.anInt3279 & 0xFF000000), Class334.method27666(local87, local67.anInt3280 & 0xFF000000));
						}
					} else if (this.aClass171ArrayArray1[local32][local37] != null) {
						@Pc(356) Class171 local356 = this.aClass171ArrayArray1[local32][local37];
						for (local87 = 0; local87 < local356.aShort143; local87++) {
							arg10[local87] = local26 + local356.aShortArray77[local87] * local11 / (this.anInt608 * 127780559);
							arg11[local87] = local30 - local356.aShortArray80[local87] * local11 / (this.anInt608 * 127780559);
						}
						for (local87 = 0; local87 < local356.aShort144; local87++) {
							local408 = local87 * 3;
							local412 = local408 + 1;
							local416 = local412 + 1;
							local420 = arg10[local408];
							local424 = arg10[local412];
							local428 = arg10[local416];
							local432 = arg11[local408];
							local436 = arg11[local412];
							local440 = arg11[local416];
							if (local356.anIntArray310 != null && local356.anIntArray310[local87] != 0 && (local356.aShortArray81 == null || local356.aShortArray81 != null && local356.aShortArray81[local87] == -1)) {
								local465 = local356.anIntArray310[local87];
								arg9.method24361(true, true, false, local432, local436, local440, local420, local424, local428, 100.0F, 100.0F, 100.0F, Class334.method27666(local465, -16777216 - (local356.anIntArray309[local408] & -16777216)), Class334.method27666(local465, -16777216 - (local356.anIntArray309[local412] & -16777216)), Class334.method27666(local465, -16777216 - (local356.anIntArray309[local416] & -16777216)));
							} else if (local356.aShortArray81 == null || local356.aShortArray81[local87] == -1) {
								arg9.method24361(true, true, false, local432, local436, local440, local420, local424, local428, 100.0F, 100.0F, 100.0F, local356.anIntArray309[local408], local356.anIntArray309[local412], local356.anIntArray309[local416]);
							} else {
								local465 = this.aClass86_Sub2_3.method4859(local356.aShortArray81[local87] & 0xFFFF);
								arg9.method24354(true, true, false, local432, local436, local440, local420, local424, local428, 100.0F, 100.0F, 100.0F, (float) local465, (float) local465, (float) local465);
							}
						}
					}
				}
				local30 -= local11;
			}
			local30 = arg1 + local7;
			local26 += local11;
		}
		arg9.aBoolean559 = true;
		this.aClass86_Sub2_3.method20230(local14);
	}

	@OriginalMember(owner = "client!aep", name = "bm", descriptor = "(IIIIIII[[ZLclient!af;Lclient!ba;[F[F)V", line = 1416)
	void method5567(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean[][] arg7, @OriginalArg(8) Class95 arg8, @OriginalArg(9) Class163 arg9, @OriginalArg(10) float[] arg10, @OriginalArg(11) float[] arg11) {
		@Pc(7) int local7 = (arg6 - arg4) * arg2 / 256;
		@Pc(11) int local11 = arg2 >> 8;
		@Pc(14) boolean local14 = arg8.aBoolean162;
		this.aClass86_Sub2_3.method20230(false);
		arg9.aBoolean559 = false;
		arg9.aBoolean560 = false;
		@Pc(26) int local26 = arg0;
		@Pc(30) int local30 = arg1 + local7;
		for (@Pc(32) int local32 = arg3; local32 < arg5; local32++) {
			for (@Pc(37) int local37 = arg4; local37 < arg6; local37++) {
				if (arg7[local32 - arg3][local37 - arg4]) {
					@Pc(87) int local87;
					@Pc(408) int local408;
					@Pc(412) int local412;
					@Pc(416) int local416;
					@Pc(420) float local420;
					@Pc(424) float local424;
					@Pc(428) float local428;
					@Pc(432) float local432;
					@Pc(436) float local436;
					@Pc(440) float local440;
					@Pc(465) int local465;
					if (this.aClass165ArrayArray1 == null) {
						if (this.aClass164ArrayArray1[local32][local37] != null) {
							@Pc(596) Class164 local596 = this.aClass164ArrayArray1[local32][local37];
							for (local87 = 0; local87 < local596.aShort136; local87++) {
								arg10[local87] = local26 + local596.aShortArray72[local87] * local11 / (this.anInt608 * 127780559);
								arg11[local87] = local30 - local596.aShortArray73[local87] * local11 / (this.anInt608 * 127780559);
							}
							for (local87 = 0; local87 < local596.aShort137; local87++) {
								local408 = local87 * 3;
								local412 = local408 + 1;
								local416 = local412 + 1;
								local420 = arg10[local408];
								local424 = arg10[local412];
								local428 = arg10[local416];
								local432 = arg11[local408];
								local436 = arg11[local412];
								local440 = arg11[local416];
								if (local596.anIntArray307 == null || local596.anIntArray307[local87] == 0) {
									arg9.method24361(true, true, false, local432, local436, local440, local420, local424, local428, 100.0F, 100.0F, 100.0F, local596.anIntArray306[local408], local596.anIntArray306[local412], local596.anIntArray306[local416]);
								} else {
									local465 = local596.anIntArray307[local87];
									arg9.method24361(true, true, false, local432, local436, local440, local420, local424, local428, 100.0F, 100.0F, 100.0F, local465, local465, local465);
								}
							}
						}
					} else if (this.aClass165ArrayArray1[local32][local37] != null) {
						@Pc(67) Class165 local67 = this.aClass165ArrayArray1[local32][local37];
						if (local67.aShort142 != -1 && (local67.aByte104 & 0x2) == 0 && local67.anInt3283 == 0) {
							local87 = this.aClass86_Sub2_3.method4859(local67.aShort142 & 0xFFFF);
							arg9.method24354(true, true, false, (float) (local30 - local11), (float) (local30 - local11), (float) local30, (float) (local26 + local11), (float) local26, (float) (local26 + local11), 100.0F, 100.0F, 100.0F, (float) Class186.method24627(local87, local67.anInt3282), (float) Class186.method24627(local87, local67.anInt3280), (float) Class186.method24627(local87, local67.anInt3279));
							arg9.method24354(true, true, false, (float) local30, (float) local30, (float) (local30 - local11), (float) local26, (float) (local26 + local11), (float) local26, 100.0F, 100.0F, 100.0F, (float) Class186.method24627(local87, local67.anInt3281), (float) Class186.method24627(local87, local67.anInt3279), (float) Class186.method24627(local87, local67.anInt3280));
						} else if (local67.anInt3283 == 0) {
							arg9.method24361(true, true, false, (float) (local30 - local11), (float) (local30 - local11), (float) local30, (float) (local26 + local11), (float) local26, (float) (local26 + local11), 100.0F, 100.0F, 100.0F, local67.anInt3282, local67.anInt3280, local67.anInt3279);
							arg9.method24361(true, true, false, (float) local30, (float) local30, (float) (local30 - local11), (float) local26, (float) (local26 + local11), (float) local26, 100.0F, 100.0F, 100.0F, local67.anInt3281, local67.anInt3279, local67.anInt3280);
						} else {
							local87 = local67.anInt3283;
							arg9.method24361(true, true, false, (float) (local30 - local11), (float) (local30 - local11), (float) local30, (float) (local26 + local11), (float) local26, (float) (local26 + local11), 100.0F, 100.0F, 100.0F, Class334.method27666(local87, local67.anInt3282 & 0xFF000000), Class334.method27666(local87, local67.anInt3280 & 0xFF000000), Class334.method27666(local87, local67.anInt3279 & 0xFF000000));
							arg9.method24361(true, true, false, (float) local30, (float) local30, (float) (local30 - local11), (float) local26, (float) (local26 + local11), (float) local26, 100.0F, 100.0F, 100.0F, Class334.method27666(local87, local67.anInt3281 & 0xFF000000), Class334.method27666(local87, local67.anInt3279 & 0xFF000000), Class334.method27666(local87, local67.anInt3280 & 0xFF000000));
						}
					} else if (this.aClass171ArrayArray1[local32][local37] != null) {
						@Pc(356) Class171 local356 = this.aClass171ArrayArray1[local32][local37];
						for (local87 = 0; local87 < local356.aShort143; local87++) {
							arg10[local87] = local26 + local356.aShortArray77[local87] * local11 / (this.anInt608 * 127780559);
							arg11[local87] = local30 - local356.aShortArray80[local87] * local11 / (this.anInt608 * 127780559);
						}
						for (local87 = 0; local87 < local356.aShort144; local87++) {
							local408 = local87 * 3;
							local412 = local408 + 1;
							local416 = local412 + 1;
							local420 = arg10[local408];
							local424 = arg10[local412];
							local428 = arg10[local416];
							local432 = arg11[local408];
							local436 = arg11[local412];
							local440 = arg11[local416];
							if (local356.anIntArray310 != null && local356.anIntArray310[local87] != 0 && (local356.aShortArray81 == null || local356.aShortArray81 != null && local356.aShortArray81[local87] == -1)) {
								local465 = local356.anIntArray310[local87];
								arg9.method24361(true, true, false, local432, local436, local440, local420, local424, local428, 100.0F, 100.0F, 100.0F, Class334.method27666(local465, -16777216 - (local356.anIntArray309[local408] & -16777216)), Class334.method27666(local465, -16777216 - (local356.anIntArray309[local412] & -16777216)), Class334.method27666(local465, -16777216 - (local356.anIntArray309[local416] & -16777216)));
							} else if (local356.aShortArray81 == null || local356.aShortArray81[local87] == -1) {
								arg9.method24361(true, true, false, local432, local436, local440, local420, local424, local428, 100.0F, 100.0F, 100.0F, local356.anIntArray309[local408], local356.anIntArray309[local412], local356.anIntArray309[local416]);
							} else {
								local465 = this.aClass86_Sub2_3.method4859(local356.aShortArray81[local87] & 0xFFFF);
								arg9.method24354(true, true, false, local432, local436, local440, local420, local424, local428, 100.0F, 100.0F, 100.0F, (float) local465, (float) local465, (float) local465);
							}
						}
					}
				}
				local30 -= local11;
			}
			local30 = arg1 + local7;
			local26 += local11;
		}
		arg9.aBoolean559 = true;
		this.aClass86_Sub2_3.method20230(local14);
	}

	@OriginalMember(owner = "client!aep", name = "au", descriptor = "(IILclient!arp;)Lclient!arp;", line = 1515)
	@Override
	public Class77_Sub1_Sub16 method5515(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class77_Sub1_Sub16 arg2) {
		return null;
	}

	@OriginalMember(owner = "client!aep", name = "ao", descriptor = "(IILclient!arp;)Lclient!arp;", line = 1515)
	@Override
	public Class77_Sub1_Sub16 method5541(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class77_Sub1_Sub16 arg2) {
		return null;
	}

	@OriginalMember(owner = "client!aep", name = "s", descriptor = "(IILclient!arp;)Lclient!arp;", line = 1515)
	@Override
	public Class77_Sub1_Sub16 method5539(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class77_Sub1_Sub16 arg2) {
		return null;
	}

	@OriginalMember(owner = "client!aep", name = "al", descriptor = "(IILclient!arp;)Lclient!arp;", line = 1515)
	@Override
	public Class77_Sub1_Sub16 method5534(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class77_Sub1_Sub16 arg2) {
		return null;
	}

	@OriginalMember(owner = "client!aep", name = "ak", descriptor = "(IILclient!arp;)Lclient!arp;", line = 1515)
	@Override
	public Class77_Sub1_Sub16 method5535(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class77_Sub1_Sub16 arg2) {
		return null;
	}

	@OriginalMember(owner = "client!aep", name = "ax", descriptor = "(IILclient!arp;)Lclient!arp;", line = 1515)
	@Override
	public Class77_Sub1_Sub16 method5537(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class77_Sub1_Sub16 arg2) {
		return null;
	}

	@OriginalMember(owner = "client!aep", name = "ar", descriptor = "(IILclient!arp;)Lclient!arp;", line = 1515)
	@Override
	public Class77_Sub1_Sub16 method5538(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class77_Sub1_Sub16 arg2) {
		return null;
	}

	@OriginalMember(owner = "client!aep", name = "r", descriptor = "(Lclient!arp;IIIIZ)V", line = 1518)
	@Override
	public void method5516(@OriginalArg(0) Class77_Sub1_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!aep", name = "ad", descriptor = "(Lclient!arp;IIIIZ)V", line = 1518)
	@Override
	public void method5527(@OriginalArg(0) Class77_Sub1_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!aep", name = "ac", descriptor = "(Lclient!arp;IIIIZ)V", line = 1518)
	@Override
	public void method5532(@OriginalArg(0) Class77_Sub1_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!aep", name = "av", descriptor = "(Lclient!arp;IIIIZ)V", line = 1518)
	@Override
	public void method5519(@OriginalArg(0) Class77_Sub1_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!aep", name = "at", descriptor = "(Lclient!arp;IIIIZ)V", line = 1518)
	@Override
	public void method5542(@OriginalArg(0) Class77_Sub1_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!aep", name = "ae", descriptor = "(Lclient!arp;IIIIZ)Z", line = 1521)
	@Override
	public boolean method5513(@OriginalArg(0) Class77_Sub1_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return false;
	}

	@OriginalMember(owner = "client!aep", name = "z", descriptor = "(Lclient!arp;IIIIZ)Z", line = 1521)
	@Override
	public boolean method5518(@OriginalArg(0) Class77_Sub1_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return false;
	}

	@OriginalMember(owner = "client!aep", name = "ah", descriptor = "(Lclient!arp;IIIIZ)V", line = 1524)
	@Override
	public void method5544(@OriginalArg(0) Class77_Sub1_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!aep", name = "g", descriptor = "(Lclient!arp;IIIIZ)V", line = 1524)
	@Override
	public void method5517(@OriginalArg(0) Class77_Sub1_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!aep", name = "as", descriptor = "(Lclient!arp;IIIIZ)V", line = 1524)
	@Override
	public void method5545(@OriginalArg(0) Class77_Sub1_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!aep", name = "aq", descriptor = "(Lclient!ajv;[I)V", line = 1525)
	@Override
	public void method5512(@OriginalArg(0) Class77_Sub22 arg0, @OriginalArg(1) int[] arg1) {
	}

	@OriginalMember(owner = "client!aep", name = "j", descriptor = "(Lclient!ajv;[I)V", line = 1525)
	@Override
	public void method5543(@OriginalArg(0) Class77_Sub22 arg0, @OriginalArg(1) int[] arg1) {
	}
}
