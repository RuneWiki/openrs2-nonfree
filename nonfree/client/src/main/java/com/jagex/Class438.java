package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oe")
public class Class438 {

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "Ljava/lang/Object;")
	public Object anObject19;

	@OriginalMember(owner = "client!oe", name = "p", descriptor = "I")
	public final int anInt4927;

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(I)V", line = 7)
	public Class438(@OriginalArg(0) int arg0) {
		this.anInt4927 = arg0 * -1694682679;
	}

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(ILjava/lang/Object;)V", line = 11)
	public Class438(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1) {
		this.anInt4927 = arg0 * -1694682679;
		this.anObject19 = arg1;
	}

	@OriginalMember(owner = "client!oe", name = "p", descriptor = "(I)[Lclient!ze;", line = 11)
	static Class687[] method28912() {
		return new Class687[] { Class687.aClass687_2, Class687.aClass687_4, Class687.aClass687_3 };
	}

	@OriginalMember(owner = "client!oe", name = "hf", descriptor = "(Ljava/lang/Object;)Z", line = 17)
	public boolean method28913(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class438)) {
			return false;
		}
		@Pc(7) Class438 local7 = (Class438) arg0;
		if (local7.anObject19 == null && this.anObject19 != null) {
			return false;
		} else if (this.anObject19 == null && local7.anObject19 != null) {
			return false;
		} else {
			return this.anInt4927 * -608978823 == local7.anInt4927 * -608978823 && local7.anObject19.equals(this.anObject19);
		}
	}

	@OriginalMember(owner = "client!oe", name = "equals", descriptor = "(Ljava/lang/Object;)Z", line = 17)
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class438)) {
			return false;
		}
		@Pc(7) Class438 local7 = (Class438) arg0;
		if (local7.anObject19 == null && this.anObject19 != null) {
			return false;
		} else if (this.anObject19 == null && local7.anObject19 != null) {
			return false;
		} else {
			return this.anInt4927 * -608978823 == local7.anInt4927 * -608978823 && local7.anObject19.equals(this.anObject19);
		}
	}

	@OriginalMember(owner = "client!oe", name = "hi", descriptor = "(Ljava/lang/Object;)Z", line = 17)
	public boolean method28914(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class438)) {
			return false;
		}
		@Pc(7) Class438 local7 = (Class438) arg0;
		if (local7.anObject19 == null && this.anObject19 != null) {
			return false;
		} else if (this.anObject19 == null && local7.anObject19 != null) {
			return false;
		} else {
			return this.anInt4927 * -608978823 == local7.anInt4927 * -608978823 && local7.anObject19.equals(this.anObject19);
		}
	}

	@OriginalMember(owner = "client!oe", name = "ha", descriptor = "(Ljava/lang/Object;)Z", line = 17)
	public boolean method28915(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class438)) {
			return false;
		}
		@Pc(7) Class438 local7 = (Class438) arg0;
		if (local7.anObject19 == null && this.anObject19 != null) {
			return false;
		} else if (this.anObject19 == null && local7.anObject19 != null) {
			return false;
		} else {
			return this.anInt4927 * -608978823 == local7.anInt4927 * -608978823 && local7.anObject19.equals(this.anObject19);
		}
	}

	@OriginalMember(owner = "client!oe", name = "hn", descriptor = "(Ljava/lang/Object;)Z", line = 17)
	public boolean method28916(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class438)) {
			return false;
		}
		@Pc(7) Class438 local7 = (Class438) arg0;
		if (local7.anObject19 == null && this.anObject19 != null) {
			return false;
		} else if (this.anObject19 == null && local7.anObject19 != null) {
			return false;
		} else {
			return this.anInt4927 * -608978823 == local7.anInt4927 * -608978823 && local7.anObject19.equals(this.anObject19);
		}
	}

	@OriginalMember(owner = "client!oe", name = "v", descriptor = "(Lclient!uq;IIS)Lclient!arb;", line = 37)
	static Class77_Sub1_Sub9 method28917(@OriginalArg(0) Class135 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = arg0.anInt1577 * -1610379455 | arg1 << 10;
		@Pc(16) Class77_Sub1_Sub9 local16 = (Class77_Sub1_Sub9) Class657.aClass229_1.method25813((long) local8 << 16);
		if (local16 != null) {
			return local16;
		}
		@Pc(29) byte[] local29 = Class322.aClass478_95.method29745(Class322.aClass478_95.method29767(local8));
		if (local29 == null) {
			local8 = arg0.anInt1577 * -1610379455 | arg2 + 65536 << 10;
			local16 = (Class77_Sub1_Sub9) Class657.aClass229_1.method25813((long) local8 << 16);
			if (local16 != null) {
				return local16;
			}
			local29 = Class322.aClass478_95.method29745(Class322.aClass478_95.method29767(local8));
			if (local29 == null) {
				local8 = arg0.anInt1577 * -1610379455 | 0x3FFFC00;
				local16 = (Class77_Sub1_Sub9) Class657.aClass229_1.method25813((long) local8 << 16);
				if (local16 != null) {
					return local16;
				}
				local29 = Class322.aClass478_95.method29745(Class322.aClass478_95.method29767(local8));
				if (local29 == null) {
					return null;
				} else if (local29.length <= 1) {
					return null;
				} else {
					try {
						local16 = Class305.method27240(local29);
					} catch (@Pc(187) Exception local187) {
						throw new RuntimeException(local187.getMessage() + " " + local8);
					}
					local16.aClass135_45 = arg0;
					Class657.aClass229_1.method25815(local16, (long) local8 << 16);
					return local16;
				}
			} else if (local29.length <= 1) {
				return null;
			} else {
				try {
					local16 = Class305.method27240(local29);
				} catch (@Pc(118) Exception local118) {
					throw new RuntimeException(local118.getMessage() + " " + local8);
				}
				local16.aClass135_45 = arg0;
				Class657.aClass229_1.method25815(local16, (long) local8 << 16);
				return local16;
			}
		} else if (local29.length <= 1) {
			return null;
		} else {
			try {
				local16 = Class305.method27240(local29);
			} catch (@Pc(44) Exception local44) {
				throw new RuntimeException(local44.getMessage() + " " + local8);
			}
			local16.aClass135_45 = arg0;
			Class657.aClass229_1.method25815(local16, (long) local8 << 16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!oe", name = "s", descriptor = "(Lclient!sy;I)Z", line = 339)
	static boolean method28918(@OriginalArg(0) Interface61 arg0) {
		@Pc(9) Class599 local9 = (Class599) client.aClass517_1.method30444().method18319(arg0.method13060());
		if (local9.anInt5512 * 350336715 == -1) {
			return true;
		} else {
			@Pc(26) Class63 local26 = (Class63) Class118_Sub1.aClass35_Sub18_4.method18319(local9.anInt5512 * 350336715);
			return local26.anInt193 * 138454787 == -1 ? true : local26.method924();
		}
	}

	@OriginalMember(owner = "client!oe", name = "cu", descriptor = "(Lclient!yf;I)V", line = 4946)
	static final void method28919(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class57.method862(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!oe", name = "cq", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;I)V", line = 4979)
	static final void method28920(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		arg0.anInt3884 = arg2.anIntArray536[(arg2.anInt5784 -= 308999563) * 2088438307] * -1802351777;
		Class461.method29531(arg0);
	}

	@OriginalMember(owner = "client!oe", name = "gj", descriptor = "(Lclient!yf;B)V", line = 5581)
	static final void method28921(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class616.method32365(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!oe", name = "adh", descriptor = "(Lclient!yf;I)V", line = 9835)
	static final void method28922(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Character.toUpperCase((char) local12);
	}

	@OriginalMember(owner = "client!oe", name = "ahm", descriptor = "(Lclient!yf;I)V", line = 10763)
	static final void method28923(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(15) Class77_Sub1_Sub8 local15 = Class261.method26362();
		if (local15 != null) {
			@Pc(36) boolean local36 = local15.method21866(local12 >> 28 & 0x3, local12 >> 14 & 0x3FFF, local12 & 0x3FFF, Class674.anIntArray538);
			if (local36) {
				Class77_Sub2.method21792(Class674.anIntArray538[1], Class674.anIntArray538[2]);
			}
		}
	}

	@OriginalMember(owner = "client!oe", name = "all", descriptor = "(Lclient!yf;B)V", line = 11638)
	static final void method28924(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		Class597.aClass107_Sub1_2.method8853(local12);
	}

	@OriginalMember(owner = "client!oe", name = "ano", descriptor = "(Lclient!yf;B)V", line = 11906)
	static final void method28925(@OriginalArg(0) Class665 arg0) {
		Class143_Sub11.method15309();
	}
}
