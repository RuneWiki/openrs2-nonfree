package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hp")
public class Class306 {

	@OriginalMember(owner = "client!hp", name = "p", descriptor = "Ljava/lang/String;")
	public String aString193;

	@OriginalMember(owner = "client!hp", name = "c", descriptor = "Ljava/lang/String;")
	public String aString194;

	@OriginalMember(owner = "client!hp", name = "<init>", descriptor = "()V", line = 84)
	Class306() {
	}

	@OriginalMember(owner = "client!hp", name = "v", descriptor = "(Lclient!hc;)V", line = 87)
	void method27244(@OriginalArg(0) Class294 arg0) {
		this.aString193 = arg0.method27025();
		this.aString194 = arg0.method27025();
	}

	@OriginalMember(owner = "client!hp", name = "p", descriptor = "(Lclient!hc;S)V", line = 87)
	void method27245(@OriginalArg(0) Class294 arg0) {
		this.aString193 = arg0.method27025();
		this.aString194 = arg0.method27025();
	}

	@OriginalMember(owner = "client!hp", name = "c", descriptor = "(Lclient!hc;)V", line = 87)
	void method27246(@OriginalArg(0) Class294 arg0) {
		this.aString193 = arg0.method27025();
		this.aString194 = arg0.method27025();
	}

	@OriginalMember(owner = "client!hp", name = "bg", descriptor = "(Lclient!apo;ZI)V", line = 1426)
	static void method27247(@OriginalArg(0) Class104_Sub1_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		if (Class683.anInt5826 * 324852453 >= 407) {
			return;
		}
		@Pc(8) Class333 local8 = arg0.aClass333_1;
		@Pc(11) String local11 = arg0.aString67;
		if (local8.anIntArray437 != null) {
			local8 = local8.method27642(Class55.aClass124_1, Class55.aClass124_1);
			if (local8 == null) {
				return;
			}
			local11 = local8.aString202;
		}
		if (!local8.aBoolean714) {
			return;
		}
		if (arg0.anInt2754 * 1691897137 != 0) {
			@Pc(49) String local49 = client.aClass670_4 == Class670.aClass670_6 ? Class44.aClass44_137.method713(Class128.aClass667_3) : Class44.aClass44_135.method713(Class128.aClass667_3);
			local11 = local11 + Class320.method27453(arg0.anInt2754 * 1691897137, Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.anInt2904 * 1423663301) + Class184.aString134 + local49 + arg0.anInt2754 * 1691897137 + Class184.aString132;
		}
		if (client.aBoolean619 && !arg1) {
			@Pc(97) Class67 local97 = (Class67) (Class121_Sub1.anInt1207 * 410979031 == -1 ? null : Class77_Sub13_Sub12.aClass35_Sub22_1.method18319(Class121_Sub1.anInt1207 * 410979031));
			if ((Class96_Sub15.anInt893 * 460977285 & 0x2) != 0 && (local97 == null || local8.method27635(Class121_Sub1.anInt1207 * 410979031, local97.anInt198 * 263946597) != local97.anInt198 * 263946597)) {
				Class155.method23634(client.aString160, client.aString161 + " " + Class184.aString136 + " " + Class192.method25433(16776960) + local11, Class130.anInt1407 * -731032933, 8, -1, (long) (arg0.anInt2867 * 1126388985), 0, 0, true, false, (long) (arg0.anInt2867 * 1126388985), false);
			}
		}
		if (arg1) {
			return;
		}
		@Pc(167) String[] local167 = local8.aStringArray29;
		@Pc(169) boolean local169 = false;
		if (client.aBoolean621) {
			local167 = Class96.method19909(local167);
		}
		if (local167 == null) {
			return;
		}
		@Pc(182) int local182;
		for (local182 = local167.length - 1; local182 >= 0; local182--) {
			if (local167[local182] != null && (arg0.anInt2764 * -1134759455 & 0x1 << local182) == 0) {
				@Pc(203) short local203 = client.aShortArray87[local182];
				@Pc(207) int local207 = client.anInt3473 * 2068410197;
				@Pc(212) int local212 = local8.method27658(local182);
				if (local212 != -1) {
					local207 = local212;
				}
				@Pc(226) boolean local226 = local167[local182].equalsIgnoreCase(Class44.aClass44_130.method713(Class128.aClass667_3));
				@Pc(235) boolean local235 = local167[local182].equalsIgnoreCase(Class44.aClass44_129.method713(Class128.aClass667_3));
				if (local226 || local235) {
					if (local169) {
						continue;
					}
					switch(client.aClass632_2.anInt5707 * 294429925) {
						case 0:
							if (local226) {
								continue;
							}
							break;
						case 1:
							local169 = true;
							continue;
						case 2:
						case 3:
							if (local8.aByte137 == 1) {
								local169 = true;
								continue;
							}
					}
					if (local226) {
						local207 = local8.anInt4104 * 235545833;
					}
				}
				Class155.method23634(local167[local182], Class192.method25433(16776960) + local11, local207, local203, -1, (long) (arg0.anInt2867 * 1126388985), 0, 0, true, false, (long) (arg0.anInt2867 * 1126388985), false);
			}
		}
		if (!local169) {
			return;
		}
		for (local182 = 0; local182 < local167.length; local182++) {
			if (local167[local182] != null && (arg0.anInt2764 * -1134759455 & 0x1 << local182) == 0) {
				@Pc(334) boolean local334 = local167[local182].equalsIgnoreCase(Class44.aClass44_130.method713(Class128.aClass667_3));
				@Pc(343) boolean local343 = local167[local182].equalsIgnoreCase(Class44.aClass44_129.method713(Class128.aClass667_3));
				if (local334 || local343) {
					@Pc(351) short local351 = client.aShortArray87[local182];
					@Pc(355) int local355 = client.anInt3473 * 2068410197;
					@Pc(360) int local360 = local8.method27658(local182);
					if (local360 != -1) {
						local355 = local360;
					}
					if (Class632.aClass632_6 == client.aClass632_2 || Class632.aClass632_3 == client.aClass632_2 && arg0.anInt2754 * 1691897137 > Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.anInt2904 * 1423663301) {
						local351 = (short) (local351 + 2000);
					}
					if (local334) {
						local355 = local8.anInt4104 * 235545833;
					}
					Class155.method23634(local167[local182], Class192.method25433(16776960) + local11, local355, local351, -1, (long) (arg0.anInt2867 * 1126388985), 0, 0, true, false, (long) (arg0.anInt2867 * 1126388985), false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!hp", name = "le", descriptor = "(Lclient!yf;B)V", line = 6668)
	static final void method27248(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class505.method30260(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!hp", name = "aaa", descriptor = "(Lclient!yf;I)V", line = 9209)
	static final void method27249(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = client.aClass243_1.method26048();
	}

	@OriginalMember(owner = "client!hp", name = "ayh", descriptor = "(Lclient!yf;I)V", line = 13647)
	static final void method27250(@OriginalArg(0) Class665 arg0) {
		Class537.method30857();
	}
}
