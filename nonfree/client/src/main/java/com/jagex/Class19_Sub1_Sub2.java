package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!akx")
public class Class19_Sub1_Sub2 extends Class19_Sub1 {

	@OriginalMember(owner = "client!akx", name = "g", descriptor = "Lclient!bp;")
	Class98 aClass98_1;

	@OriginalMember(owner = "client!akx", name = "l", descriptor = "Lclient!ar;")
	Class78 aClass78_1;

	@OriginalMember(owner = "client!akx", name = "h", descriptor = "I")
	int anInt2535 = 0;

	@OriginalMember(owner = "client!akx", name = "x", descriptor = "I")
	int anInt2534 = 0;

	@OriginalMember(owner = "client!akx", name = "a", descriptor = "Lclient!abl;")
	Class21_Sub1 aClass21_Sub1_12;

	@OriginalMember(owner = "client!akx", name = "<init>", descriptor = "(Lclient!abl;)V", line = 12)
	Class19_Sub1_Sub2(@OriginalArg(0) Class21_Sub1 arg0) {
		this.aClass21_Sub1_12 = arg0;
	}

	@OriginalMember(owner = "client!akx", name = "p", descriptor = "()I", line = 17)
	@Override
	public int method21390() {
		return this.anInt2535 * 1041648245;
	}

	@OriginalMember(owner = "client!akx", name = "d", descriptor = "()I", line = 17)
	@Override
	public int method21405() {
		return this.anInt2535 * 1041648245;
	}

	@OriginalMember(owner = "client!akx", name = "q", descriptor = "()I", line = 17)
	@Override
	public int method21389() {
		return this.anInt2535 * 1041648245;
	}

	@OriginalMember(owner = "client!akx", name = "s", descriptor = "()I", line = 21)
	@Override
	public int method21404() {
		return this.anInt2534 * -215908259;
	}

	@OriginalMember(owner = "client!akx", name = "a", descriptor = "()I", line = 21)
	@Override
	public int method21391() {
		return this.anInt2534 * -215908259;
	}

	@OriginalMember(owner = "client!akx", name = "x", descriptor = "()I", line = 21)
	@Override
	public int method21394() {
		return this.anInt2534 * -215908259;
	}

	@OriginalMember(owner = "client!akx", name = "v", descriptor = "(ILclient!da;)V", line = 25)
	@Override
	public void method20882(@OriginalArg(0) int arg0, @OriginalArg(1) Interface10 arg1) {
		if (arg0 != 0) {
			throw new RuntimeException();
		}
		@Pc(9) Class78 local9 = (Class78) arg1;
		if (this.aClass98_1 != null && local9 != null && (local9.anInt2909 * -282044701 != this.aClass98_1.anInt2956 * -1241204433 || this.aClass98_1.anInt2955 * -1189074085 != local9.anInt2910 * -1706224413)) {
			throw new RuntimeException();
		}
		this.aClass78_1 = local9;
		if (local9 != null) {
			this.anInt2535 = local9.anInt2909 * -2111536905;
			this.anInt2534 = local9.anInt2910 * 1438160447;
		} else if (this.aClass98_1 == null) {
			this.anInt2535 = 0;
			this.anInt2534 = 0;
		}
		if (this.aClass21_Sub1_12.method17037() == this) {
			this.method21393();
		}
	}

	@OriginalMember(owner = "client!akx", name = "i", descriptor = "(ILclient!da;)V", line = 25)
	@Override
	public void method20891(@OriginalArg(0) int arg0, @OriginalArg(1) Interface10 arg1) {
		if (arg0 != 0) {
			throw new RuntimeException();
		}
		@Pc(9) Class78 local9 = (Class78) arg1;
		if (this.aClass98_1 != null && local9 != null && (local9.anInt2909 * -282044701 != this.aClass98_1.anInt2956 * -1241204433 || this.aClass98_1.anInt2955 * -1189074085 != local9.anInt2910 * -1706224413)) {
			throw new RuntimeException();
		}
		this.aClass78_1 = local9;
		if (local9 != null) {
			this.anInt2535 = local9.anInt2909 * -2111536905;
			this.anInt2534 = local9.anInt2910 * 1438160447;
		} else if (this.aClass98_1 == null) {
			this.anInt2535 = 0;
			this.anInt2534 = 0;
		}
		if (this.aClass21_Sub1_12.method17037() == this) {
			this.method21393();
		}
	}

	@OriginalMember(owner = "client!akx", name = "o", descriptor = "(ILclient!da;)V", line = 25)
	@Override
	public void method20887(@OriginalArg(0) int arg0, @OriginalArg(1) Interface10 arg1) {
		if (arg0 != 0) {
			throw new RuntimeException();
		}
		@Pc(9) Class78 local9 = (Class78) arg1;
		if (this.aClass98_1 != null && local9 != null && (local9.anInt2909 * -282044701 != this.aClass98_1.anInt2956 * -1241204433 || this.aClass98_1.anInt2955 * -1189074085 != local9.anInt2910 * -1706224413)) {
			throw new RuntimeException();
		}
		this.aClass78_1 = local9;
		if (local9 != null) {
			this.anInt2535 = local9.anInt2909 * -2111536905;
			this.anInt2534 = local9.anInt2910 * 1438160447;
		} else if (this.aClass98_1 == null) {
			this.anInt2535 = 0;
			this.anInt2534 = 0;
		}
		if (this.aClass21_Sub1_12.method17037() == this) {
			this.method21393();
		}
	}

	@OriginalMember(owner = "client!akx", name = "f", descriptor = "(ILclient!da;)V", line = 25)
	@Override
	public void method20886(@OriginalArg(0) int arg0, @OriginalArg(1) Interface10 arg1) {
		if (arg0 != 0) {
			throw new RuntimeException();
		}
		@Pc(9) Class78 local9 = (Class78) arg1;
		if (this.aClass98_1 != null && local9 != null && (local9.anInt2909 * -282044701 != this.aClass98_1.anInt2956 * -1241204433 || this.aClass98_1.anInt2955 * -1189074085 != local9.anInt2910 * -1706224413)) {
			throw new RuntimeException();
		}
		this.aClass78_1 = local9;
		if (local9 != null) {
			this.anInt2535 = local9.anInt2909 * -2111536905;
			this.anInt2534 = local9.anInt2910 * 1438160447;
		} else if (this.aClass98_1 == null) {
			this.anInt2535 = 0;
			this.anInt2534 = 0;
		}
		if (this.aClass21_Sub1_12.method17037() == this) {
			this.method21393();
		}
	}

	@OriginalMember(owner = "client!akx", name = "k", descriptor = "(ILclient!da;)V", line = 25)
	@Override
	public void method20881(@OriginalArg(0) int arg0, @OriginalArg(1) Interface10 arg1) {
		if (arg0 != 0) {
			throw new RuntimeException();
		}
		@Pc(9) Class78 local9 = (Class78) arg1;
		if (this.aClass98_1 != null && local9 != null && (local9.anInt2909 * -282044701 != this.aClass98_1.anInt2956 * -1241204433 || this.aClass98_1.anInt2955 * -1189074085 != local9.anInt2910 * -1706224413)) {
			throw new RuntimeException();
		}
		this.aClass78_1 = local9;
		if (local9 != null) {
			this.anInt2535 = local9.anInt2909 * -2111536905;
			this.anInt2534 = local9.anInt2910 * 1438160447;
		} else if (this.aClass98_1 == null) {
			this.anInt2535 = 0;
			this.anInt2534 = 0;
		}
		if (this.aClass21_Sub1_12.method17037() == this) {
			this.method21393();
		}
	}

	@OriginalMember(owner = "client!akx", name = "m", descriptor = "(Lclient!dr;)V", line = 41)
	@Override
	public void method20880(@OriginalArg(0) Interface13 arg0) {
		@Pc(2) Class98 local2 = (Class98) arg0;
		if (this.aClass78_1 != null && local2 != null && (local2.anInt2956 * -1241204433 != this.aClass78_1.anInt2909 * -282044701 || local2.anInt2955 * -1189074085 != this.aClass78_1.anInt2910 * -1706224413)) {
			throw new RuntimeException();
		}
		this.aClass98_1 = local2;
		if (local2 != null) {
			this.anInt2535 = local2.anInt2956 * 1839798419;
			this.anInt2534 = local2.anInt2955 * -1154089193;
		} else if (this.aClass78_1 == null) {
			this.anInt2535 = 0;
			this.anInt2534 = 0;
		}
		if (this.aClass21_Sub1_12.method17037() == this) {
			this.method21393();
		}
	}

	@OriginalMember(owner = "client!akx", name = "at", descriptor = "(Lclient!dr;)V", line = 41)
	@Override
	public void method20888(@OriginalArg(0) Interface13 arg0) {
		@Pc(2) Class98 local2 = (Class98) arg0;
		if (this.aClass78_1 != null && local2 != null && (local2.anInt2956 * -1241204433 != this.aClass78_1.anInt2909 * -282044701 || local2.anInt2955 * -1189074085 != this.aClass78_1.anInt2910 * -1706224413)) {
			throw new RuntimeException();
		}
		this.aClass98_1 = local2;
		if (local2 != null) {
			this.anInt2535 = local2.anInt2956 * 1839798419;
			this.anInt2534 = local2.anInt2955 * -1154089193;
		} else if (this.aClass78_1 == null) {
			this.anInt2535 = 0;
			this.anInt2534 = 0;
		}
		if (this.aClass21_Sub1_12.method17037() == this) {
			this.method21393();
		}
	}

	@OriginalMember(owner = "client!akx", name = "t", descriptor = "()Z", line = 56)
	@Override
	public boolean method20883() {
		return true;
	}

	@OriginalMember(owner = "client!akx", name = "af", descriptor = "()Z", line = 56)
	@Override
	public boolean method20889() {
		return true;
	}

	@OriginalMember(owner = "client!akx", name = "l", descriptor = "()Z", line = 60)
	@Override
	boolean method21393() {
		this.aClass21_Sub1_12.method3212(this.anInt2535 * 1041648245, this.anInt2534 * -215908259, this.aClass78_1 == null ? null : this.aClass78_1.anIntArray275, this.aClass98_1 == null ? null : this.aClass98_1.aFloatArray91);
		return true;
	}

	@OriginalMember(owner = "client!akx", name = "u", descriptor = "()Z", line = 60)
	@Override
	boolean method21396() {
		this.aClass21_Sub1_12.method3212(this.anInt2535 * 1041648245, this.anInt2534 * -215908259, this.aClass78_1 == null ? null : this.aClass78_1.anIntArray275, this.aClass98_1 == null ? null : this.aClass98_1.aFloatArray91);
		return true;
	}

	@OriginalMember(owner = "client!akx", name = "y", descriptor = "()Z", line = 60)
	@Override
	boolean method21397() {
		this.aClass21_Sub1_12.method3212(this.anInt2535 * 1041648245, this.anInt2534 * -215908259, this.aClass78_1 == null ? null : this.aClass78_1.anIntArray275, this.aClass98_1 == null ? null : this.aClass98_1.aFloatArray91);
		return true;
	}

	@OriginalMember(owner = "client!akx", name = "h", descriptor = "()Z", line = 65)
	@Override
	boolean method21400() {
		return true;
	}

	@OriginalMember(owner = "client!akx", name = "b", descriptor = "()Z", line = 65)
	@Override
	boolean method21403() {
		return true;
	}

	@OriginalMember(owner = "client!akx", name = "c", descriptor = "()Z", line = 65)
	@Override
	boolean method21399() {
		return true;
	}

	@OriginalMember(owner = "client!akx", name = "z", descriptor = "()Z", line = 65)
	@Override
	boolean method21398() {
		return true;
	}

	@OriginalMember(owner = "client!akx", name = "j", descriptor = "()Z", line = 65)
	@Override
	boolean method21401() {
		return true;
	}

	@OriginalMember(owner = "client!akx", name = "w", descriptor = "(IIIIIIZZ)V", line = 69)
	@Override
	public void method20884(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7) {
		@Pc(1) int[] local1 = null;
		@Pc(3) int[] local3 = null;
		@Pc(5) float[] local5 = null;
		@Pc(7) float[] local7 = null;
		if (arg6 && this.aClass78_1 != null) {
			local1 = this.aClass78_1.anIntArray275;
			local3 = this.aClass21_Sub1_12.anIntArray39;
		}
		if (arg7 && this.aClass98_1 != null) {
			local5 = this.aClass98_1.aFloatArray91;
			local7 = this.aClass21_Sub1_12.aFloatArray21;
		}
		Class354.method26627(this.anInt2535 * 1041648245, this.aClass21_Sub1_12.anInt287 * -355627019, local1, local3, local5, local7, arg0, arg1, arg4, arg5, arg2, arg3);
	}

	@OriginalMember(owner = "client!akx", name = "ak", descriptor = "(IIIIIIZZ)V", line = 69)
	@Override
	public void method20890(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7) {
		@Pc(1) int[] local1 = null;
		@Pc(3) int[] local3 = null;
		@Pc(5) float[] local5 = null;
		@Pc(7) float[] local7 = null;
		if (arg6 && this.aClass78_1 != null) {
			local1 = this.aClass78_1.anIntArray275;
			local3 = this.aClass21_Sub1_12.anIntArray39;
		}
		if (arg7 && this.aClass98_1 != null) {
			local5 = this.aClass98_1.aFloatArray91;
			local7 = this.aClass21_Sub1_12.aFloatArray21;
		}
		Class354.method26627(this.anInt2535 * 1041648245, this.aClass21_Sub1_12.anInt287 * -355627019, local1, local3, local5, local7, arg0, arg1, arg4, arg5, arg2, arg3);
	}

	@OriginalMember(owner = "client!akx", name = "aa", descriptor = "(IIIIIIZZ)V", line = 69)
	@Override
	public void method20885(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7) {
		@Pc(1) int[] local1 = null;
		@Pc(3) int[] local3 = null;
		@Pc(5) float[] local5 = null;
		@Pc(7) float[] local7 = null;
		if (arg6 && this.aClass78_1 != null) {
			local1 = this.aClass78_1.anIntArray275;
			local3 = this.aClass21_Sub1_12.anIntArray39;
		}
		if (arg7 && this.aClass98_1 != null) {
			local5 = this.aClass98_1.aFloatArray91;
			local7 = this.aClass21_Sub1_12.aFloatArray21;
		}
		Class354.method26627(this.anInt2535 * 1041648245, this.aClass21_Sub1_12.anInt287 * -355627019, local1, local3, local5, local7, arg0, arg1, arg4, arg5, arg2, arg3);
	}

	@OriginalMember(owner = "client!akx", name = "an", descriptor = "(II[I[I[F[FIIIIII)V", line = 85)
	static void method17910(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		@Pc(5) int local5 = arg0 * arg7 + arg6;
		@Pc(11) int local11 = arg8 + arg1 * arg9;
		@Pc(15) int local15 = arg0 - arg10;
		@Pc(19) int local19 = arg1 - arg10;
		@Pc(23) int local23;
		@Pc(30) int local30;
		if (arg2 == null) {
			for (local23 = 0; local23 < arg11; local23++) {
				local30 = arg10 + local5;
				while (local5 < local30) {
					arg5[local11++] = arg4[local5++];
				}
				local5 += local15;
				local11 += local19;
			}
		} else if (arg4 == null) {
			for (local23 = 0; local23 < arg11; local23++) {
				local30 = local5 + arg10;
				while (local5 < local30) {
					arg3[local11++] = arg2[local5++];
				}
				local5 += local15;
				local11 += local19;
			}
		} else {
			for (local23 = 0; local23 < arg11; local23++) {
				local30 = arg10 + local5;
				while (local5 < local30) {
					arg3[local11] = arg2[local5];
					arg5[local11++] = arg4[local5++];
				}
				local5 += local15;
				local11 += local19;
			}
		}
	}

	@OriginalMember(owner = "client!akx", name = "aj", descriptor = "(II[I[I[F[FIIIIII)V", line = 85)
	static void method17911(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		@Pc(5) int local5 = arg0 * arg7 + arg6;
		@Pc(11) int local11 = arg8 + arg1 * arg9;
		@Pc(15) int local15 = arg0 - arg10;
		@Pc(19) int local19 = arg1 - arg10;
		@Pc(23) int local23;
		@Pc(30) int local30;
		if (arg2 == null) {
			for (local23 = 0; local23 < arg11; local23++) {
				local30 = arg10 + local5;
				while (local5 < local30) {
					arg5[local11++] = arg4[local5++];
				}
				local5 += local15;
				local11 += local19;
			}
		} else if (arg4 == null) {
			for (local23 = 0; local23 < arg11; local23++) {
				local30 = local5 + arg10;
				while (local5 < local30) {
					arg3[local11++] = arg2[local5++];
				}
				local5 += local15;
				local11 += local19;
			}
		} else {
			for (local23 = 0; local23 < arg11; local23++) {
				local30 = arg10 + local5;
				while (local5 < local30) {
					arg3[local11] = arg2[local5];
					arg5[local11++] = arg4[local5++];
				}
				local5 += local15;
				local11 += local19;
			}
		}
	}

	@OriginalMember(owner = "client!akx", name = "r", descriptor = "()V", line = 122)
	@Override
	public void method21395() {
	}

	@OriginalMember(owner = "client!akx", name = "g", descriptor = "()V", line = 122)
	@Override
	public void method21392() {
	}

	@OriginalMember(owner = "client!akx", name = "n", descriptor = "()V", line = 122)
	@Override
	public void method21402() {
	}

	@OriginalMember(owner = "client!akx", name = "e", descriptor = "()V", line = 122)
	@Override
	public void method21406() {
	}
}
