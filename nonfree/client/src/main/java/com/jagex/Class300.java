package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hj")
public class Class300 {

	@OriginalMember(owner = "client!hj", name = "p", descriptor = "I")
	static final int anInt4015 = 100;

	@OriginalMember(owner = "client!hj", name = "v", descriptor = "I")
	int anInt4016;

	@OriginalMember(owner = "client!hj", name = "c", descriptor = "[Lclient!arj;")
	Class77_Sub1_Sub14[] aClass77_Sub1_Sub14Array1 = new Class77_Sub1_Sub14[100];

	@OriginalMember(owner = "client!hj", name = "<init>", descriptor = "()V", line = 94)
	Class300() {
	}

	@OriginalMember(owner = "client!hj", name = "p", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILclient!ne;B)Lclient!arj;", line = 97)
	Class77_Sub1_Sub14 method27102(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(6) String arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class416 arg8) {
		@Pc(4) Class77_Sub1_Sub14 local4 = this.aClass77_Sub1_Sub14Array1[99];
		for (@Pc(9) int local9 = this.anInt4016 * 1024413145; local9 > 0; local9--) {
			if (local9 != 100) {
				this.aClass77_Sub1_Sub14Array1[local9] = this.aClass77_Sub1_Sub14Array1[local9 - 1];
			}
		}
		if (local4 == null) {
			local4 = new Class77_Sub1_Sub14(arg0, arg1, arg2, arg3, arg4, arg6, arg7, arg5, arg8);
		} else {
			local4.method24063();
			local4.method24069();
			local4.method22337(arg0, arg1, arg2, arg3, arg4, arg6, arg7, arg5, arg8);
		}
		this.aClass77_Sub1_Sub14Array1[0] = local4;
		if (this.anInt4016 * 1024413145 < 100) {
			this.anInt4016 += -1865653655;
		}
		return local4;
	}

	@OriginalMember(owner = "client!hj", name = "l", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILclient!ne;)Lclient!arj;", line = 97)
	Class77_Sub1_Sub14 method27103(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(6) String arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class416 arg8) {
		@Pc(4) Class77_Sub1_Sub14 local4 = this.aClass77_Sub1_Sub14Array1[99];
		for (@Pc(9) int local9 = this.anInt4016 * 1024413145; local9 > 0; local9--) {
			if (local9 != 100) {
				this.aClass77_Sub1_Sub14Array1[local9] = this.aClass77_Sub1_Sub14Array1[local9 - 1];
			}
		}
		if (local4 == null) {
			local4 = new Class77_Sub1_Sub14(arg0, arg1, arg2, arg3, arg4, arg6, arg7, arg5, arg8);
		} else {
			local4.method24063();
			local4.method24069();
			local4.method22337(arg0, arg1, arg2, arg3, arg4, arg6, arg7, arg5, arg8);
		}
		this.aClass77_Sub1_Sub14Array1[0] = local4;
		if (this.anInt4016 * 1024413145 < 100) {
			this.anInt4016 += -1865653655;
		}
		return local4;
	}

	@OriginalMember(owner = "client!hj", name = "y", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILclient!ne;)Lclient!arj;", line = 97)
	Class77_Sub1_Sub14 method27104(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(6) String arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class416 arg8) {
		@Pc(4) Class77_Sub1_Sub14 local4 = this.aClass77_Sub1_Sub14Array1[99];
		for (@Pc(9) int local9 = this.anInt4016 * 1024413145; local9 > 0; local9--) {
			if (local9 != 100) {
				this.aClass77_Sub1_Sub14Array1[local9] = this.aClass77_Sub1_Sub14Array1[local9 - 1];
			}
		}
		if (local4 == null) {
			local4 = new Class77_Sub1_Sub14(arg0, arg1, arg2, arg3, arg4, arg6, arg7, arg5, arg8);
		} else {
			local4.method24063();
			local4.method24069();
			local4.method22337(arg0, arg1, arg2, arg3, arg4, arg6, arg7, arg5, arg8);
		}
		this.aClass77_Sub1_Sub14Array1[0] = local4;
		if (this.anInt4016 * 1024413145 < 100) {
			this.anInt4016 += -1865653655;
		}
		return local4;
	}

	@OriginalMember(owner = "client!hj", name = "t", descriptor = "(I)Lclient!arj;", line = 114)
	Class77_Sub1_Sub14 method27105(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < this.anInt4016 * 1024413145 ? this.aClass77_Sub1_Sub14Array1[arg0] : null;
	}

	@OriginalMember(owner = "client!hj", name = "c", descriptor = "(II)Lclient!arj;", line = 114)
	Class77_Sub1_Sub14 method27106(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < this.anInt4016 * 1024413145 ? this.aClass77_Sub1_Sub14Array1[arg0] : null;
	}

	@OriginalMember(owner = "client!hj", name = "w", descriptor = "(I)Lclient!arj;", line = 114)
	Class77_Sub1_Sub14 method27107(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < this.anInt4016 * 1024413145 ? this.aClass77_Sub1_Sub14Array1[arg0] : null;
	}

	@OriginalMember(owner = "client!hj", name = "q", descriptor = "(I)Lclient!arj;", line = 114)
	Class77_Sub1_Sub14 method27108(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < this.anInt4016 * 1024413145 ? this.aClass77_Sub1_Sub14Array1[arg0] : null;
	}

	@OriginalMember(owner = "client!hj", name = "v", descriptor = "(I)I", line = 119)
	int method27109() {
		return this.anInt4016 * 1024413145;
	}

	@OriginalMember(owner = "client!hj", name = "x", descriptor = "()I", line = 119)
	int method27110() {
		return this.anInt4016 * 1024413145;
	}

	@OriginalMember(owner = "client!hj", name = "d", descriptor = "()I", line = 119)
	int method27111() {
		return this.anInt4016 * 1024413145;
	}

	@OriginalMember(owner = "client!hj", name = "r", descriptor = "(Lclient!alh;Lclient!alh;IZI)I", line = 149)
	static int method27112(@OriginalArg(0) Class145_Sub1 arg0, @OriginalArg(1) Class145_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		if (arg2 == 1) {
			local7 = arg0.anInt2059 * 2098404975;
			local12 = arg1.anInt2059 * 2098404975;
			if (!arg3) {
				if (local7 == -1) {
					local7 = 2001;
				}
				if (local12 == -1) {
					local12 = 2001;
				}
			}
			return local7 - local12;
		} else if (arg2 == 2) {
			return Class336.method27673(arg0.method15087(), arg1.method15087(), Class128.aClass667_3);
		} else if (arg2 == 3) {
			if (arg0.aString61.equals("-")) {
				if (arg1.aString61.equals("-")) {
					return 0;
				} else if (arg3) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg1.aString61.equals("-")) {
				return arg3 ? 1 : -1;
			} else {
				return Class336.method27673(arg0.aString61, arg1.aString61, Class128.aClass667_3);
			}
		} else if (arg2 == 4) {
			return arg0.method15074() ? (arg1.method15074() ? 0 : 1) : (arg1.method15074() ? -1 : 0);
		} else if (arg2 == 5) {
			return arg0.method15070() ? (arg1.method15070() ? 0 : 1) : (arg1.method15070() ? -1 : 0);
		} else if (arg2 == 6) {
			return arg0.method15072() ? (arg1.method15072() ? 0 : 1) : (arg1.method15072() ? -1 : 0);
		} else if (arg2 == 7) {
			return arg0.method15067() ? (arg1.method15067() ? 0 : 1) : (arg1.method15067() ? -1 : 0);
		} else if (arg2 == 8) {
			local7 = arg0.anInt2066 * -663639827;
			local12 = arg1.anInt2066 * -663639827;
			if (arg3) {
				if (local7 == 1000) {
					local7 = -1;
				}
				if (local12 == 1000) {
					local12 = -1;
				}
			} else {
				if (local7 == -1) {
					local7 = 1000;
				}
				if (local12 == -1) {
					local12 = 1000;
				}
			}
			return local7 - local12;
		} else {
			return arg0.anInt2068 * 539448607 - arg1.anInt2068 * 539448607;
		}
	}

	@OriginalMember(owner = "client!hj", name = "ia", descriptor = "(Lclient!yf;I)V", line = 6070)
	static final void method27113(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class143_Sub26.method15881(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!hj", name = "ahc", descriptor = "(Lclient!yf;I)V", line = 10615)
	static final void method27114(@OriginalArg(0) Class665 arg0) {
		throw new RuntimeException("");
	}
}
