package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!act")
public class Class67 implements Interface12, Interface6 {

	@OriginalMember(owner = "client!act", name = "w", descriptor = "I")
	static int anInt199;

	@OriginalMember(owner = "client!act", name = "g", descriptor = "Lclient!dg;")
	static Class89 aClass89_1;

	@OriginalMember(owner = "client!act", name = "p", descriptor = "Lclient!qu;")
	Class498 aClass498_3;

	@OriginalMember(owner = "client!act", name = "c", descriptor = "I")
	public int anInt198;

	@OriginalMember(owner = "client!act", name = "v", descriptor = "Ljava/lang/String;")
	public String aString13;

	@OriginalMember(owner = "client!act", name = "l", descriptor = "Z")
	public boolean aBoolean19 = true;

	@OriginalMember(owner = "client!act", name = "<init>", descriptor = "()V", line = 17)
	Class67() {
	}

	@OriginalMember(owner = "client!act", name = "p", descriptor = "(Lclient!akv;B)V", line = 21)
	@Override
	public void method36031(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method966(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!act", name = "y", descriptor = "(Lclient!akv;)V", line = 21)
	@Override
	public void method36033(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method966(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!act", name = "l", descriptor = "(Lclient!akv;)V", line = 21)
	@Override
	public void method36030(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method966(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!act", name = "v", descriptor = "(Lclient!akv;)V", line = 21)
	@Override
	public void method36032(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method966(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!act", name = "r", descriptor = "(Lclient!akv;I)V", line = 28)
	void method965(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			@Pc(8) char local8 = Class125_Sub2.method12705(arg0.method22481());
			this.aClass498_3 = Class498.method30196(local8);
		} else if (arg1 == 2) {
			this.anInt198 = arg0.method22500() * 1880606829;
		} else if (arg1 == 4) {
			this.aBoolean19 = false;
		} else if (arg1 == 5) {
			this.aString13 = arg0.method22523();
		} else if (arg1 == 101) {
			this.aClass498_3 = (Class498) Class457.method29479(Class498.method30187(), arg0.method22537());
		}
	}

	@OriginalMember(owner = "client!act", name = "q", descriptor = "(Lclient!akv;II)V", line = 28)
	void method966(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			@Pc(8) char local8 = Class125_Sub2.method12705(arg0.method22481());
			this.aClass498_3 = Class498.method30196(local8);
		} else if (arg1 == 2) {
			this.anInt198 = arg0.method22500() * 1880606829;
		} else if (arg1 == 4) {
			this.aBoolean19 = false;
		} else if (arg1 == 5) {
			this.aString13 = arg0.method22523();
		} else if (arg1 == 101) {
			this.aClass498_3 = (Class498) Class457.method29479(Class498.method30187(), arg0.method22537());
		}
	}

	@OriginalMember(owner = "client!act", name = "s", descriptor = "(Lclient!akv;I)V", line = 28)
	void method967(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			@Pc(8) char local8 = Class125_Sub2.method12705(arg0.method22481());
			this.aClass498_3 = Class498.method30196(local8);
		} else if (arg1 == 2) {
			this.anInt198 = arg0.method22500() * 1880606829;
		} else if (arg1 == 4) {
			this.aBoolean19 = false;
		} else if (arg1 == 5) {
			this.aString13 = arg0.method22523();
		} else if (arg1 == 101) {
			this.aClass498_3 = (Class498) Class457.method29479(Class498.method30187(), arg0.method22537());
		}
	}

	@OriginalMember(owner = "client!act", name = "d", descriptor = "(I)Z", line = 42)
	public boolean method968() {
		return Class498.aClass498_158 == this.aClass498_3;
	}

	@OriginalMember(owner = "client!act", name = "j", descriptor = "()Z", line = 42)
	public boolean method969() {
		return Class498.aClass498_158 == this.aClass498_3;
	}

	@OriginalMember(owner = "client!act", name = "c", descriptor = "(I)V", line = 45)
	@Override
	public void method36034() {
	}

	@OriginalMember(owner = "client!act", name = "w", descriptor = "()V", line = 45)
	@Override
	public void method36035() {
	}

	@OriginalMember(owner = "client!act", name = "t", descriptor = "()V", line = 45)
	@Override
	public void method36036() {
	}

	@OriginalMember(owner = "client!act", name = "x", descriptor = "(II)V", line = 46)
	@Override
	public void method32874(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!act", name = "g", descriptor = "(I)V", line = 46)
	@Override
	public void method32873(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!act", name = "z", descriptor = "(I)V", line = 46)
	@Override
	public void method32872(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!act", name = "x", descriptor = "(II)I", line = 63)
	public static int method970(@OriginalArg(0) int arg0) {
		@Pc(5) Class300 local5 = (Class300) Class304.aMap17.get(arg0);
		return local5 == null ? 0 : local5.method27109();
	}

	@OriginalMember(owner = "client!act", name = "qa", descriptor = "(Lclient!yf;I)V", line = 7598)
	static final void method971(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(24) int local24 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(25) int local25 = local24 - 1;
		if (local11.aStringArray25 == null || local25 >= local11.aStringArray25.length || local11.aStringArray25[local25] == null) {
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = "";
		} else {
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = local11.aStringArray25[local25];
		}
	}

	@OriginalMember(owner = "client!act", name = "zm", descriptor = "(Lclient!yf;B)V", line = 9152)
	static final void method972(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = client.aClass243_1.method26054(local12).method25992() ? 1 : 0;
	}

	@OriginalMember(owner = "client!act", name = "aba", descriptor = "(Lclient!yf;I)V", line = 9429)
	static final void method973(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		@Pc(31) int local31 = client.aClass497ArrayArray1[local23][local13].method30169();
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local31 == 0 ? 1 : 0;
	}

	@OriginalMember(owner = "client!act", name = "mw", descriptor = "(IZI)V", line = 12065)
	public static final void method974(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (Class574.aClass77_Sub25_2 == null || (arg0 < 0 || arg0 >= Class574.aClass77_Sub25_2.anInt1550 * -1406046755)) {
			return;
		}
		@Pc(17) Class358 local17 = Class574.aClass77_Sub25_2.aClass358Array1[arg0];
		@Pc(20) Class82 local20 = Class230.method25826();
		@Pc(26) Class77_Sub20 local26 = Class365.method28132(Class414.aClass414_90, local20.aClass16_1);
		local26.aClass77_Sub39_Sub1_2.method22403(Class664.method33107(local17.aString209) + 3);
		local26.aClass77_Sub39_Sub1_2.method22408(arg0);
		local26.aClass77_Sub39_Sub1_2.method22403(arg1 ? 1 : 0);
		local26.aClass77_Sub39_Sub1_2.method22440(local17.aString209);
		local20.method2004(local26);
	}
}
