package com.jagex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ll")
public class Class379 {

	@OriginalMember(owner = "client!ll", name = "gt", descriptor = "Lclient!pw;")
	public static Class478 aClass478_110;

	@OriginalMember(owner = "client!ll", name = "ih", descriptor = "Lclient!ta;")
	static Class139 aClass139_3;

	@OriginalMember(owner = "client!ll", name = "p", descriptor = "Ljava/util/Map;")
	Map aMap18 = new HashMap();

	@OriginalMember(owner = "client!ll", name = "c", descriptor = "Lclient!lj;")
	Class117 aClass117_1;

	@OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(Lclient!lj;)V", line = 10)
	public Class379(@OriginalArg(0) Class117 arg0) {
		this.aClass117_1 = arg0;
	}

	@OriginalMember(owner = "client!ll", name = "y", descriptor = "()V", line = 15)
	public void method28299() {
		@Pc(4) Iterator local4 = this.aMap18.values().iterator();
		while (local4.hasNext()) {
			@Pc(11) Class399 local11 = (Class399) local4.next();
			local11.method28464();
		}
	}

	@OriginalMember(owner = "client!ll", name = "l", descriptor = "()V", line = 15)
	public void method28300() {
		@Pc(4) Iterator local4 = this.aMap18.values().iterator();
		while (local4.hasNext()) {
			@Pc(11) Class399 local11 = (Class399) local4.next();
			local11.method28464();
		}
	}

	@OriginalMember(owner = "client!ll", name = "p", descriptor = "(B)V", line = 15)
	public void method28301() {
		@Pc(4) Iterator local4 = this.aMap18.values().iterator();
		while (local4.hasNext()) {
			@Pc(11) Class399 local11 = (Class399) local4.next();
			local11.method28464();
		}
	}

	@OriginalMember(owner = "client!ll", name = "w", descriptor = "()V", line = 15)
	public void method28302() {
		@Pc(4) Iterator local4 = this.aMap18.values().iterator();
		while (local4.hasNext()) {
			@Pc(11) Class399 local11 = (Class399) local4.next();
			local11.method28464();
		}
	}

	@OriginalMember(owner = "client!ll", name = "p", descriptor = "(Lclient!pw;Ljava/lang/String;ZB)Lclient!sc;", line = 18)
	public static Class529 method28303(@OriginalArg(0) Class478 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		@Pc(4) int local4 = arg0.method29764(arg1);
		if (local4 == -1) {
			return new Class529(0);
		}
		@Pc(18) byte[] local18 = arg0.method29725(local4, 1);
		if (local18 == null) {
			return new Class529(0);
		}
		@Pc(30) Class77_Sub39 local30 = new Class77_Sub39(local18);
		@Pc(34) int local34 = local30.method22483();
		@Pc(39) Class529 local39 = new Class529(local34);
		@Pc(41) int local41 = 0;
		while (true) {
			while (local41 < local39.anInt5170 * -942354647) {
				@Pc(51) int local51 = local30.method22500();
				@Pc(55) int local55 = local30.method22483();
				@Pc(59) int local59 = local30.method22478();
				if (!arg2 && local59 == 1) {
					local39.anInt5170 -= -1704772327;
				} else {
					local39.anIntArray481[local41] = local51;
					local39.anIntArray480[local41] = local55;
					local41++;
				}
			}
			return local39;
		}
	}

	@OriginalMember(owner = "client!ll", name = "c", descriptor = "(IIFLclient!li;B)Lclient!mh;", line = 22)
	public Class399 method28304(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Interface41 arg3) {
		if (this.method28306(arg0) != null) {
			return null;
		}
		@Pc(8) Class399 local8 = null;
		if (arg1 != -1) {
			local8 = this.method28306(arg1);
		}
		@Pc(22) Object local22 = this.aClass117_1.method10875(local8);
		@Pc(32) Class399 local32 = new Class399(arg0, arg2, local22, this, arg3, local8);
		this.aMap18.put(arg0, local32);
		return local32;
	}

	@OriginalMember(owner = "client!ll", name = "t", descriptor = "(IIFLclient!li;)Lclient!mh;", line = 22)
	public Class399 method28305(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Interface41 arg3) {
		if (this.method28306(arg0) != null) {
			return null;
		}
		@Pc(8) Class399 local8 = null;
		if (arg1 != -1) {
			local8 = this.method28306(arg1);
		}
		@Pc(22) Object local22 = this.aClass117_1.method10875(local8);
		@Pc(32) Class399 local32 = new Class399(arg0, arg2, local22, this, arg3, local8);
		this.aMap18.put(arg0, local32);
		return local32;
	}

	@OriginalMember(owner = "client!ll", name = "v", descriptor = "(II)Lclient!mh;", line = 34)
	public Class399 method28306(@OriginalArg(0) int arg0) {
		return (Class399) this.aMap18.get(arg0);
	}

	@OriginalMember(owner = "client!ll", name = "q", descriptor = "(I)Lclient!mh;", line = 34)
	public Class399 method28307(@OriginalArg(0) int arg0) {
		return (Class399) this.aMap18.get(arg0);
	}

	@OriginalMember(owner = "client!ll", name = "r", descriptor = "(Lclient!dx;IIIIIIII)V", line = 347)
	static void method28308(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(3) Class556 local3 = client.aClass517_1.method30435();
		@Pc(11) Interface61 local11 = (Interface61) local3.method31179(arg1, arg2, arg3);
		@Pc(24) Class599 local24;
		@Pc(30) int local30;
		@Pc(34) int local34;
		@Pc(50) int local50;
		if (local11 != null) {
			local24 = (Class599) client.aClass517_1.method30444().method18319(local11.method13060());
			local30 = local11.method13058() & 0x3;
			local34 = local11.method13057();
			if (local24.anInt5512 * 350336715 == -1) {
				local50 = arg6;
				if (local24.anInt5518 * -2134171963 > 0) {
					local50 = arg7;
				}
				if (local34 == Class593.aClass593_24.anInt5501 * 847393323 || local34 == Class593.aClass593_2.anInt5501 * 847393323) {
					if (local30 == 0) {
						arg0.method19998(arg4, arg5, 4, local50);
					} else if (local30 == 1) {
						arg0.method19994(arg4, arg5, 4, local50);
					} else if (local30 == 2) {
						arg0.method19998(arg4 + 3, arg5, 4, local50);
					} else if (local30 == 3) {
						arg0.method19994(arg4, arg5 + 3, 4, local50);
					}
				}
				if (local34 == Class593.aClass593_5.anInt5501 * 847393323) {
					if (local30 == 0) {
						arg0.method19986(arg4, arg5, 1, 1, local50);
					} else if (local30 == 1) {
						arg0.method19986(arg4 + 3, arg5, 1, 1, local50);
					} else if (local30 == 2) {
						arg0.method19986(arg4 + 3, arg5 + 3, 1, 1, local50);
					} else if (local30 == 3) {
						arg0.method19986(arg4, arg5 + 3, 1, 1, local50);
					}
				}
				if (local34 == Class593.aClass593_2.anInt5501 * 847393323) {
					if (local30 == 0) {
						arg0.method19994(arg4, arg5, 4, local50);
					} else if (local30 == 1) {
						arg0.method19998(arg4 + 3, arg5, 4, local50);
					} else if (local30 == 2) {
						arg0.method19994(arg4, arg5 + 3, 4, local50);
					} else if (local30 == 3) {
						arg0.method19998(arg4, arg5, 4, local50);
					}
				}
			} else {
				Class262.method26384(arg0, local24, local30, arg4, arg5);
			}
		}
		local11 = (Interface61) local3.method31191(arg1, arg2, arg3, client.anInterface63_1);
		if (local11 != null) {
			local24 = (Class599) client.aClass517_1.method30444().method18319(local11.method13060());
			local30 = local11.method13058() & 0x3;
			local34 = local11.method13057();
			if (local24.anInt5512 * 350336715 != -1) {
				Class262.method26384(arg0, local24, local30, arg4, arg5);
			} else if (local34 == Class593.aClass593_6.anInt5501 * 847393323) {
				local50 = -1118482;
				if (local24.anInt5518 * -2134171963 > 0) {
					local50 = -1179648;
				}
				if (local30 == 0 || local30 == 2) {
					arg0.method20004(arg4, arg5 + 3, arg4 + 3, arg5, local50);
				} else {
					arg0.method20004(arg4, arg5, arg4 + 3, arg5 + 3, local50);
				}
			}
		}
		local11 = (Interface61) local3.method31195(arg1, arg2, arg3);
		if (local11 == null) {
			return;
		}
		local24 = (Class599) client.aClass517_1.method30444().method18319(local11.method13060());
		local30 = local11.method13058() & 0x3;
		if (local24.anInt5512 * 350336715 != -1) {
			Class262.method26384(arg0, local24, local30, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!ll", name = "nh", descriptor = "(Lclient!yf;I)V", line = 6968)
	static final void method28309(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class106_Sub2.method8984(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!ll", name = "aqn", descriptor = "(Lclient!yf;B)V", line = 12395)
	static final void method28310(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class35_Sub6.aClass77_Sub35_45.aClass143_Sub39_1.method16183() == 1 ? 1 : 0;
	}

	@OriginalMember(owner = "client!ll", name = "auq", descriptor = "(Lclient!yf;I)V", line = 13030)
	static final void method28311(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class96_Sub3.anInt810 * 1757658941;
	}
}
