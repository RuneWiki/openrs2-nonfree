package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dy")
public class Class237 {

	@OriginalMember(owner = "client!dy", name = "e", descriptor = "I")
	public int anInt3817;

	@OriginalMember(owner = "client!dy", name = "n", descriptor = "I")
	public int anInt3815;

	@OriginalMember(owner = "client!dy", name = "m", descriptor = "I")
	public int anInt3819;

	@OriginalMember(owner = "client!dy", name = "k", descriptor = "I")
	int anInt3816;

	@OriginalMember(owner = "client!dy", name = "f", descriptor = "I")
	public int anInt3818;

	@OriginalMember(owner = "client!dy", name = "w", descriptor = "I")
	public int anInt3820;

	@OriginalMember(owner = "client!dy", name = "l", descriptor = "I")
	public int anInt3821;

	@OriginalMember(owner = "client!dy", name = "<init>", descriptor = "()V", line = 12)
	public Class237() {
	}

	@OriginalMember(owner = "client!dy", name = "<init>", descriptor = "(IIIIIII)V", line = 14)
	public Class237(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt3817 = arg0 * -938620053;
		this.anInt3815 = arg1 * -192371369;
		this.anInt3819 = arg2 * -316775901;
		this.anInt3816 = arg3 * 1476702379;
		this.anInt3818 = arg4 * -699093173;
		this.anInt3820 = arg5 * -913672293;
		this.anInt3821 = arg6 * 152514549;
	}

	@OriginalMember(owner = "client!dy", name = "m", descriptor = "(Lclient!dy;)Z", line = 25)
	public boolean method25767(@OriginalArg(0) Class237 arg0) {
		return this.anInt3817 * -1393096381 == arg0.anInt3817 * -1393096381 && this.anInt3815 * -2052057497 == arg0.anInt3815 * -2052057497 && arg0.anInt3819 * -94478965 == this.anInt3819 * -94478965 && this.anInt3816 * 2074200579 == arg0.anInt3816 * 2074200579 && this.anInt3818 * -8330653 == arg0.anInt3818 * -8330653 && arg0.anInt3820 * 1342314131 == this.anInt3820 * 1342314131 && arg0.anInt3821 * 1290585181 == this.anInt3821 * 1290585181;
	}

	@OriginalMember(owner = "client!dy", name = "n", descriptor = "(Lclient!dy;)Z", line = 25)
	public boolean method25768(@OriginalArg(0) Class237 arg0) {
		return this.anInt3817 * -1393096381 == arg0.anInt3817 * -1393096381 && this.anInt3815 * -2052057497 == arg0.anInt3815 * -2052057497 && arg0.anInt3819 * -94478965 == this.anInt3819 * -94478965 && this.anInt3816 * 2074200579 == arg0.anInt3816 * 2074200579 && this.anInt3818 * -8330653 == arg0.anInt3818 * -8330653 && arg0.anInt3820 * 1342314131 == this.anInt3820 * 1342314131 && arg0.anInt3821 * 1290585181 == this.anInt3821 * 1290585181;
	}

	@OriginalMember(owner = "client!dy", name = "e", descriptor = "(Lclient!dy;I)Z", line = 25)
	public boolean method25769(@OriginalArg(0) Class237 arg0) {
		return this.anInt3817 * -1393096381 == arg0.anInt3817 * -1393096381 && this.anInt3815 * -2052057497 == arg0.anInt3815 * -2052057497 && arg0.anInt3819 * -94478965 == this.anInt3819 * -94478965 && this.anInt3816 * 2074200579 == arg0.anInt3816 * 2074200579 && this.anInt3818 * -8330653 == arg0.anInt3818 * -8330653 && arg0.anInt3820 * 1342314131 == this.anInt3820 * 1342314131 && arg0.anInt3821 * 1290585181 == this.anInt3821 * 1290585181;
	}

	@OriginalMember(owner = "client!dy", name = "m", descriptor = "(Ljava/lang/String;II)V", line = 64)
	public static void method25778(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Class50.aClass28_2 == null) {
			Class50.aClass28_2 = new Class28();
		}
		Class50.aClass28_2.aString4 = arg0;
		Class50.aClass28_2.anInt101 = (arg1 + 1099) * 470002905;
		Class50.aClass28_2.anInt100 = Class250.method25956(Class280.aClass693_1, Class703.aClass703_2, Class50.aClass28_2.anInt101 * 2142901097) * -1138615973;
		Class50.aClass28_2.anInt99 = Class654.method32719(Class280.aClass693_1, Class703.aClass703_2, Class50.aClass28_2.anInt101 * 2142901097) * 702279345;
	}

	@OriginalMember(owner = "client!dy", name = "x", descriptor = "(Lclient!do;Lclient!aaq;Lclient!aaq;I)V", line = 192)
	public static final void method25772(@OriginalArg(0) Class109 arg0, @OriginalArg(1) Class19 arg1, @OriginalArg(2) Class19 arg2) {
		if (!arg1.method23578() || !arg2.method23578()) {
			return;
		}
		@Pc(10) Class263 local10 = arg1.aClass263_5;
		@Pc(13) Class263 local13 = arg2.aClass263_5;
		if (local10.anIntArray364 == null) {
			if (local10.method26188()) {
				if (local13.anIntArray364 != null) {
					arg0.method6843(arg1.aClass17_5.aClass93_Sub1_Sub5_1, arg1.anInt3216 * 1550739371, arg2.aClass23_10.aClass93_Sub1_Sub10_2, arg2.aClass23_10.anInt72 * -1424564205, arg2.aClass23_10.aClass93_Sub1_Sub10_1, arg2.aClass23_10.anInt73 * -278335347, arg2.anInt3216 * 1550739371, local13.anIntArray369[arg2.anInt3223 * -1046590071], local10.aClass268_1 == null ? null : local10.aClass268_1.aBooleanArray23, local10.aBoolean671 | local13.aBoolean671);
				} else if (local13.method26188()) {
					arg0.method6816(arg1.aClass17_5.aClass93_Sub1_Sub5_1, arg1.anInt3216 * 1550739371, arg2.aClass17_5.aClass93_Sub1_Sub5_1, arg2.anInt3216 * 1550739371, local10.aClass268_1 == null ? null : local10.aClass268_1.aBooleanArray23, local10.aBoolean671);
				}
			}
		} else if (local13.anIntArray364 != null) {
			arg0.method6831(arg1.aClass23_10.aClass93_Sub1_Sub10_2, arg1.aClass23_10.anInt72 * -1424564205, arg1.aClass23_10.aClass93_Sub1_Sub10_1, arg1.aClass23_10.anInt73 * -278335347, arg1.anInt3216 * 1550739371, local10.anIntArray369[arg1.anInt3223 * -1046590071], arg2.aClass23_10.aClass93_Sub1_Sub10_2, arg2.aClass23_10.anInt72 * -1424564205, arg2.aClass23_10.aClass93_Sub1_Sub10_1, arg2.aClass23_10.anInt73 * -278335347, arg2.anInt3216 * 1550739371, local13.anIntArray369[arg2.anInt3223 * -1046590071], local10.aClass268_1 == null ? null : local10.aClass268_1.aBooleanArray23, local10.aBoolean671 | local13.aBoolean671);
		} else if (local13.method26188()) {
			arg0.method6844(arg1.aClass23_10.aClass93_Sub1_Sub10_2, arg1.aClass23_10.anInt72 * -1424564205, arg1.aClass23_10.aClass93_Sub1_Sub10_1, arg1.aClass23_10.anInt73 * -278335347, arg1.anInt3216 * 1550739371, local10.anIntArray369[arg1.anInt3223 * -1046590071], arg2.aClass17_5.aClass93_Sub1_Sub5_1, arg2.anInt3216 * 1550739371, local10.aClass268_1 == null ? null : local10.aClass268_1.aBooleanArray23, local10.aBoolean671 | local13.aBoolean671);
		}
	}

	@OriginalMember(owner = "client!dy", name = "hd", descriptor = "(IIIIZI)V", line = 4428)
	static final void method25777(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (client.aClass532_1.method30459() == null) {
			Class694.aClass104_14.method20600(arg0, arg1, arg2, arg3, -16777216);
			return;
		}
		@Pc(16) Class472 local16 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method24229().aClass472_61;
		@Pc(18) boolean local18 = false;
		if (client.anInt3463 * 1819062465 == 3) {
			if ((int) local16.aFloat317 < 0 || (int) local16.aFloat317 >= client.aClass532_1.method30444() * 512 || (int) local16.aFloat319 < 0 || (int) local16.aFloat319 >= client.aClass532_1.method30474() * 512) {
				local18 = true;
			}
			if (Class429.anInt4781 * -1453926679 == 3 && !Class65.aClass123_Sub1_2.method8987()) {
				local18 = true;
			}
		} else if (!client.aBoolean613) {
			local18 = true;
		}
		if (local18) {
			Class694.aClass104_14.method20600(arg0, arg1, arg2, arg3, -16777216);
			return;
		}
		client.anInt3495 += -1386163559;
		if (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3 != null && (int) local16.aFloat317 - (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method19997() - 1) * 256 >> 9 == Class172.anInt3179 * -820036969 && (int) local16.aFloat319 - (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method19997() - 1) * 256 >> 9 == Class172.anInt3174 * -1293607373) {
			Class172.anInt3179 = -2004084007;
			Class172.anInt3174 = 246739717;
			Class723.method36943();
		}
		Class559.method31129();
		if (!arg4) {
			Class387.method28245();
		}
		Class293.method26589();
		@Pc(135) int local135;
		for (local135 = 0; local135 < client.aClass567Array1.length; local135++) {
			if (client.aClass567Array1[local135] != null && !client.aClass567Array1[local135].method31265() && client.aClass567Array1[local135].method31266(Class694.aClass104_14)) {
				client.aClass567Array1[local135].method31270(client.aClass532_1.method30459());
			}
		}
		Class710.method36799(arg0, arg1, arg2, arg3, true);
		@Pc(177) int local177 = client.anInt3432 * 706492895;
		@Pc(181) int local181 = client.anInt3568 * 1300190535;
		@Pc(185) int local185 = client.anInt3569 * -1968459517;
		@Pc(189) int local189 = client.anInt3570 * -1469130191;
		Class497.method30132(local177, local181);
		@Pc(240) int local240;
		if (Class429.anInt4781 * -1453926679 == 2) {
			local135 = (int) client.aFloat256;
			if (client.anInt3443 * 182292977 >> 8 > local135) {
				local135 = client.anInt3443 * 182292977 >> 8;
			}
			if (client.aBooleanArray21[4] && client.anIntArray329[4] + 128 > local135) {
				local135 = client.anIntArray329[4] + 128;
			}
			local240 = client.anInt3461 * 1018036723 + (int) client.aFloat253 & 0x3FFF;
			Class716.method36876(Class72.anInt241 * -1022856553, Class305.method26801((int) local16.aFloat317, (int) local16.aFloat319, Class512.anInt5209 * 1177442423) - client.anInt3484 * 1974760385, Class441.anInt4886 * -953396699, local135, local240, (local135 >> 3) * 3 + 600 << 2, local189);
		} else if (Class429.anInt4781 * -1453926679 == 4) {
			local135 = (int) client.aFloat256;
			if (client.anInt3443 * 182292977 >> 8 > local135) {
				local135 = client.anInt3443 * 182292977 >> 8;
			}
			if (client.aBooleanArray21[4] && client.anIntArray329[4] + 128 > local135) {
				local135 = client.anIntArray329[4] + 128;
			}
			local240 = (int) client.aFloat253 & 0x3FFF;
			Class716.method36876(Class72.anInt241 * -1022856553, Class305.method26801(client.anInt3481 * -1195894597, client.anInt3482 * 1196621895, Class512.anInt5209 * 1177442423) - client.anInt3484 * 1974760385, Class441.anInt4886 * -953396699, local135, local240, (local135 >> 3) * 3 + 600 << 2, local189);
		} else if (Class429.anInt4781 * -1453926679 == 1) {
			Class688.method36521(local189);
		}
		local135 = Class163.anInt2002 * -1331168249;
		local240 = Class130_Sub2.anInt1117 * 1055108289;
		@Pc(375) int local375 = Class270.anInt3884 * 466086187;
		@Pc(379) int local379 = Class620.anInt5644 * 607613741;
		@Pc(383) int local383 = Class24.anInt82 * -20667523;
		@Pc(427) int local427;
		for (@Pc(385) int local385 = 0; local385 < 5; local385++) {
			if (client.aBooleanArray21[local385]) {
				local427 = (int) (Math.random() * (double) (client.anIntArray328[local385] * 2 + 1) - (double) client.anIntArray328[local385] + Math.sin((double) client.anIntArray330[local385] / 100.0D * (double) client.anIntArray318[local385]) * (double) client.anIntArray329[local385]);
				if (local385 == 0) {
					Class163.anInt2002 += (local427 << 2) * 1636217271;
				}
				if (local385 == 1) {
					Class130_Sub2.anInt1117 += (local427 << 2) * 1820517185;
				}
				if (local385 == 2) {
					Class270.anInt3884 += (local427 << 2) * -967471741;
				}
				if (local385 == 3) {
					Class24.anInt82 = (Class24.anInt82 * -20667523 + local427 & 0x3FFF) * 1056124373;
				}
				if (local385 == 4) {
					Class620.anInt5644 += local427 * -1151839067;
					if (Class620.anInt5644 * 607613741 < 1024) {
						Class620.anInt5644 = 1632801792;
					} else if (Class620.anInt5644 * 607613741 > 3072) {
						Class620.anInt5644 = 603438080;
					}
				}
			}
		}
		if (Class163.anInt2002 * -1331168249 < 0) {
			Class163.anInt2002 = 0;
		}
		if (Class163.anInt2002 * -1331168249 > (client.aClass532_1.method30459().anInt5443 * -200159665 << 9) - 1) {
			Class163.anInt2002 = ((client.aClass532_1.method30459().anInt5443 * -200159665 << 9) - 1) * 1636217271;
		}
		if (Class270.anInt3884 * 466086187 < 0) {
			Class270.anInt3884 = 0;
		}
		if (Class270.anInt3884 * 466086187 > (client.aClass532_1.method30459().anInt5444 * -1943751559 << 9) - 1) {
			Class270.anInt3884 = ((client.aClass532_1.method30459().anInt5444 * -1943751559 << 9) - 1) * -967471741;
		}
		if (Class51.aClass93_Sub36_1.aClass166_Sub15_2.method15673() == 2) {
			Class129_Sub1.method9403();
		} else if (Class51.aClass93_Sub36_1.aClass166_Sub15_2.method15673() == 3) {
			Class248.method25930();
		}
		Class694.aClass104_14.method20463(local177, local181, local185, local189);
		Class694.aClass104_14.method20469(true);
		Class694.aClass104_14.method20467(local177, local181, local185 + local177, local181 + local189);
		@Pc(606) Class672 local606 = client.aClass532_1.method30532().method32966();
		local427 = local606.method33057();
		@Pc(614) Class368 local614 = new Class368();
		@Pc(618) Class611 local618 = client.aClass532_1.method30443();
		if (Class253.method25995()) {
			Class1.aClass123_Sub1_1.method8950(local614, client.aClass470_51, client.aClass489_95, local618.anInt5623 * 270611681 << 9, local618.anInt5624 * -1994307635 << 9);
		} else if (Class429.anInt4781 * -1453926679 == 3) {
			Class65.aClass123_Sub1_2.method8950(local614, client.aClass470_51, client.aClass489_95, local618.anInt5623 * 270611681 << 9, local618.anInt5624 * -1994307635 << 9);
		} else {
			client.aClass470_51.method29385((float) -(Class163.anInt2002 * -1331168249), (float) -(Class130_Sub2.anInt1117 * 1055108289), (float) -(Class270.anInt3884 * 466086187));
			client.aClass470_51.method29379(0.0F, -1.0F, 0.0F, Class464.method29282(-(Class24.anInt82 * -20667523) & 0x3FFF));
			client.aClass470_51.method29379(-1.0F, 0.0F, 0.0F, Class464.method29282(-(Class620.anInt5644 * 607613741) & 0x3FFF));
			client.aClass470_51.method29379(0.0F, 0.0F, -1.0F, Class464.method29282(-(Class348.anInt4199 * -602770317) & 0x3FFF));
			Class69.method1228(client.aClass489_95, (float) (local185 / 2), (float) (local189 / 2), (float) (client.anInt3571 * -1609686929 << 1), (float) (client.anInt3571 * -1609686929 << 1), local185, local189);
		}
		Class694.aClass104_14.method20516(client.aClass470_51);
		Class694.aClass104_14.method20519(client.aClass489_95);
		@Pc(785) int local785;
		if (local606.method33058() == null) {
			Class694.aClass104_14.method20774(3, local427);
		} else {
			Class694.aClass104_14.method20521(1.0F);
			Class694.aClass104_14.method20522(16777215, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
			if (Class429.anInt4781 * -1453926679 == 3) {
				@Pc(777) int local777 = (int) ((double) Class65.aClass123_Sub1_2.method8961() * 2607.5945876176133D);
				local785 = (int) ((double) Class65.aClass123_Sub1_2.method8962() * 2607.5945876176133D);
				local606.method33058().method31162(Class694.aClass104_14, Class121.anInt1003 * 353504223 << 3, local177, local181, local185, local189, local777, local785, 0, local427, true, false);
			} else {
				local606.method33058().method31162(Class694.aClass104_14, Class121.anInt1003 * 353504223 << 3, local177, local181, local185, local189, Class620.anInt5644 * 607613741, Class24.anInt82 * -20667523, Class348.anInt4199 * -602770317, local427, true, false);
			}
			Class694.aClass104_14.method20501();
		}
		Class694.aClass104_14.method20469(false);
		Class426.method28751(client.aClass470_51, client.aClass489_95, local185, local189);
		client.aClass532_1.method30532().method32987(client.aClass532_1);
		local785 = Class51.aClass93_Sub36_1.aClass166_Sub15_2.method15673();
		@Pc(869) byte local869;
		if (local785 == 2) {
			local869 = (byte) (client.anInt3495 * 1815175593);
		} else if (local785 == 3) {
			local869 = (byte) (client.aBoolean637 ? 1 : -1);
		} else {
			local869 = 1;
		}
		if (Class253.method25995() || Class429.anInt4781 * -1453926679 == 3) {
			client.aClass532_1.method30459().method31574(client.anInt3485, local614.anInt4586 * -1774271657, local614.anInt4587 * -754001767, local614.anInt4588 * 1179660263, client.aClass532_1.method30458(), client.anIntArray327, client.anIntArray312, client.anIntArray313, client.anIntArray314, client.anIntArray302, Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100 + 1, local869, (int) local16.aFloat317 >> 9, (int) local16.aFloat319 >> 9, Class51.aClass93_Sub36_1.aClass166_Sub25_1.method15887() == 0, true, 0, true);
		} else {
			client.aClass532_1.method30459().method31574(client.anInt3485, Class163.anInt2002 * -1331168249, Class130_Sub2.anInt1117 * 1055108289, Class270.anInt3884 * 466086187, client.aClass532_1.method30458(), client.anIntArray327, client.anIntArray312, client.anIntArray313, client.anIntArray314, client.anIntArray302, Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100 + 1, local869, (int) local16.aFloat317 >> 9, (int) local16.aFloat319 >> 9, Class51.aClass93_Sub36_1.aClass166_Sub25_1.method15887() == 0, true, 0, true);
		}
		client.anInt3494 += -22139677;
		if (!Class694.aClass104_14.method20533() && client.anInt3435 * -849002901 == 18) {
			Class558.method31109(local177, local181, local185, local189);
		}
		client.aClass532_1.method30459().method31452();
		Class163.anInt2002 = local135 * 1636217271;
		Class130_Sub2.anInt1117 = local240 * 1820517185;
		Class270.anInt3884 = local375 * -967471741;
		Class620.anInt5644 = local379 * -1151839067;
		Class24.anInt82 = local383 * 1056124373;
		if (client.aBoolean630 && Class520.aClass144_3.method11155() == 0) {
			client.aBoolean630 = false;
		}
		if (client.aBoolean630) {
			Class694.aClass104_14.method20600(local177, local181, local185, local189, -16777216);
			Class95.method1801(Class74.aClass74_99.method1259(Class106.aClass717_8), false, Class694.aClass104_14, Class82.aClass106_1, Class348.aClass5_14);
		}
		Class69.method1228(client.aClass489_95, (float) (local177 + local185 / 2), (float) (local181 + local189 / 2), (float) (client.anInt3571 * -1609686929 << 1), (float) (client.anInt3571 * -1609686929 << 1), local185, local189);
		Class694.aClass104_14.method20519(client.aClass489_95);
		Class663.method32870(client.aClass489_95);
	}

	@OriginalMember(owner = "client!dy", name = "dq", descriptor = "(Lclient!yf;I)V", line = 5533)
	static final void method25770(@OriginalArg(0) Class681 arg0) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class644.method32600(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!dy", name = "dh", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;S)V", line = 5637)
	static final void method25771(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2) {
		arg2.anInt5891 -= 463840436;
		arg0.anInt4013 = arg2.anIntArray519[arg2.anInt5891 * -1497248091] * 1504879997;
		arg0.anInt4019 = arg2.anIntArray519[arg2.anInt5891 * -1497248091 + 1] * -1608734411;
		arg0.anInt3987 = arg2.anIntArray519[arg2.anInt5891 * -1497248091 + 2] * -1532105369;
		arg0.anInt3974 = arg2.anIntArray519[arg2.anInt5891 * -1497248091 + 3] * 1866450021;
		Class354.method27696(arg0);
	}

	@OriginalMember(owner = "client!dy", name = "jg", descriptor = "(Lclient!hq;Lclient!hf;B)V", line = 10863)
	public static void method25776(@OriginalArg(0) Class320 arg0, @OriginalArg(1) Class312 arg1) {
		@Pc(4) Class312 local4 = Class431.method28779(arg0, arg1);
		@Pc(11) int local11;
		@Pc(15) int local15;
		if (local4 == null) {
			local11 = client.anInt3408 * -1378711501;
			local15 = client.anInt3416 * 2091353777;
		} else {
			local11 = local4.anInt3981 * 1215292027;
			local15 = local4.anInt3982 * -1490598249;
		}
		Class550.method31031(arg1, local11, local15, false);
		Class32_Sub3.method16695(arg1, local11, local15);
	}

	@OriginalMember(owner = "client!dy", name = "aky", descriptor = "(Lclient!yf;I)V", line = 11683)
	static final void method25774(@OriginalArg(0) Class681 arg0) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(15) Class93_Sub1_Sub20 local15 = Class93_Sub12.method13454();
		if (local15 == null) {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = -1;
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = -1;
			return;
		}
		@Pc(31) boolean local31 = local15.method23180(local12 >> 14 & 0x3FFF, local12 & 0x3FFF, Class687.anIntArray525);
		if (local31) {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class687.anIntArray525[1];
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class687.anIntArray525[2];
		} else {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = -1;
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = -1;
		}
	}

	@OriginalMember(owner = "client!dy", name = "aub", descriptor = "(Lclient!yf;B)V", line = 13421)
	static final void method25773(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class51.aClass93_Sub36_1.aClass166_Sub38_1.method16321();
	}

	@OriginalMember(owner = "client!dy", name = "azi", descriptor = "(Lclient!yf;B)V", line = 14197)
	static final void method25775(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class51.aClass93_Sub36_1.aClass166_Sub31_1.method16109() ? 1 : 0;
	}
}
