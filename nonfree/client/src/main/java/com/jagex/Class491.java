package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tv")
public class Class491 {

	@OriginalMember(owner = "client!tv", name = "fp", descriptor = "Lclient!ny;")
	public static Class359 aClass359_91;

	@OriginalMember(owner = "client!tv", name = "n", descriptor = "I")
	int anInt5199;

	@OriginalMember(owner = "client!tv", name = "c", descriptor = "I")
	int anInt5201;

	@OriginalMember(owner = "client!tv", name = "e", descriptor = "I")
	int anInt5202;

	@OriginalMember(owner = "client!tv", name = "z", descriptor = "I")
	int anInt5203;

	@OriginalMember(owner = "client!tv", name = "j", descriptor = "I")
	int anInt5204;

	@OriginalMember(owner = "client!tv", name = "x", descriptor = "I")
	int anInt5205;

	@OriginalMember(owner = "client!tv", name = "r", descriptor = "I")
	int anInt5206;

	@OriginalMember(owner = "client!tv", name = "d", descriptor = "I")
	int anInt5207;

	@OriginalMember(owner = "client!tv", name = "l", descriptor = "I")
	int anInt5200 = 0;

	@OriginalMember(owner = "client!tv", name = "u", descriptor = "Z")
	boolean aBoolean807 = false;

	@OriginalMember(owner = "client!tv", name = "y", descriptor = "Lclient!td;")
	Class476 aClass476_1 = new Class476();

	@OriginalMember(owner = "client!tv", name = "b", descriptor = "Lclient!td;")
	Class476 aClass476_2 = new Class476();

	@OriginalMember(owner = "client!tv", name = "q", descriptor = "Z")
	boolean aBoolean808 = false;

	@OriginalMember(owner = "client!tv", name = "m", descriptor = "Z")
	boolean aBoolean809 = false;

	@OriginalMember(owner = "client!tv", name = "p", descriptor = "Lclient!dt;")
	final Class135 aClass135_2;

	@OriginalMember(owner = "client!tv", name = "g", descriptor = "Lclient!tf;")
	final Class478 aClass478_8;

	@OriginalMember(owner = "client!tv", name = "s", descriptor = "J")
	long aLong282;

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "Lclient!kb;")
	Class271 aClass271_1;

	@OriginalMember(owner = "client!tv", name = "h", descriptor = "Lclient!wq;")
	Class559 aClass559_9;

	@OriginalMember(owner = "client!tv", name = "g", descriptor = "(Lclient!ahb;I)Ljava/lang/String;", line = 26)
	public static String method29258(@OriginalArg(0) Class3_Sub41 arg0) {
		return Class164.method23305(arg0, 32767);
	}

	@OriginalMember(owner = "client!tv", name = "<init>", descriptor = "(Lclient!de;Lclient!dt;Lclient!tf;J)V", line = 31)
	Class491(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class135 arg1, @OriginalArg(2) Class478 arg2, @OriginalArg(3) long arg3) {
		this.aClass135_2 = arg1;
		this.aClass478_8 = arg2;
		this.aLong282 = arg3 * -7162217158905232037L;
		this.aClass271_1 = this.aClass135_2.method22912();
		if (!arg0.method17032() && this.aClass271_1.anInt4282 * -1199913633 != -1) {
			this.aClass271_1 = Class298.method25629(this.aClass271_1.anInt4282 * -1199913633);
		}
		this.aClass559_9 = new Class559();
		this.anInt5200 = (int) ((double) (this.anInt5200 * 365089689) + Math.random() * 64.0D) * -202977111;
		this.method29247();
		this.aClass476_2.anInt5125 = this.aClass476_1.anInt5125;
		this.aClass476_2.anInt5131 = this.aClass476_1.anInt5131;
		this.aClass476_2.anInt5124 = this.aClass476_1.anInt5124;
		this.aClass476_2.anInt5127 = this.aClass476_1.anInt5127;
		this.aClass476_2.anInt5126 = this.aClass476_1.anInt5126;
		this.aClass476_2.anInt5132 = this.aClass476_1.anInt5132;
		this.aClass476_2.anInt5128 = this.aClass476_1.anInt5128;
		this.aClass476_2.anInt5129 = this.aClass476_1.anInt5129;
		this.aClass476_2.anInt5130 = this.aClass476_1.anInt5130;
	}

	@OriginalMember(owner = "client!tv", name = "p", descriptor = "(I)V", line = 52)
	void method29247() {
		this.aClass476_1.anInt5125 = this.aClass135_2.anInt3391 * -1147629753;
		this.aClass476_1.anInt5131 = this.aClass135_2.anInt3390 * -141432223;
		this.aClass476_1.anInt5124 = this.aClass135_2.anInt3385 * -2041791135;
		this.aClass476_1.anInt5127 = this.aClass135_2.anInt3392 * -56835949;
		this.aClass476_1.anInt5126 = this.aClass135_2.anInt3384 * -1575964651;
		this.aClass476_1.anInt5132 = this.aClass135_2.anInt3394 * 121261097;
		this.aClass476_1.anInt5128 = this.aClass135_2.anInt3395 * 12251759;
		this.aClass476_1.anInt5129 = this.aClass135_2.anInt3396 * 1633228511;
		this.aClass476_1.anInt5130 = this.aClass135_2.anInt3397 * -1486359969;
		if (this.aClass476_1.anInt5125 * 504086253 == this.aClass476_1.anInt5127 * 1773066433 && this.aClass476_1.anInt5128 * -1402011207 == this.aClass476_1.anInt5127 * 1773066433 && this.aClass476_1.anInt5126 * 548022605 == this.aClass476_1.anInt5131 * 1198295669 && this.aClass476_1.anInt5129 * 690353245 == this.aClass476_1.anInt5126 * 548022605 && this.aClass476_1.anInt5124 * -1494714659 == this.aClass476_1.anInt5132 * -1906774035 && this.aClass476_1.anInt5130 * 1126365971 == this.aClass476_1.anInt5132 * -1906774035) {
			this.aBoolean808 = true;
		} else if (this.aBoolean808) {
			this.aBoolean808 = false;
			this.aClass476_2.anInt5125 = this.aClass476_1.anInt5125;
			this.aClass476_2.anInt5131 = this.aClass476_1.anInt5131;
			this.aClass476_2.anInt5124 = this.aClass476_1.anInt5124;
			this.aClass476_2.anInt5127 = this.aClass476_1.anInt5127;
			this.aClass476_2.anInt5126 = this.aClass476_1.anInt5126;
			this.aClass476_2.anInt5132 = this.aClass476_1.anInt5132;
			this.aClass476_2.anInt5128 = this.aClass476_1.anInt5128;
			this.aClass476_2.anInt5129 = this.aClass476_1.anInt5129;
			this.aClass476_2.anInt5130 = this.aClass476_1.anInt5130;
		}
	}

	@OriginalMember(owner = "client!tv", name = "l", descriptor = "()V", line = 52)
	void method29249() {
		this.aClass476_1.anInt5125 = this.aClass135_2.anInt3391 * -1147629753;
		this.aClass476_1.anInt5131 = this.aClass135_2.anInt3390 * -141432223;
		this.aClass476_1.anInt5124 = this.aClass135_2.anInt3385 * -2041791135;
		this.aClass476_1.anInt5127 = this.aClass135_2.anInt3392 * -56835949;
		this.aClass476_1.anInt5126 = this.aClass135_2.anInt3384 * -1575964651;
		this.aClass476_1.anInt5132 = this.aClass135_2.anInt3394 * 121261097;
		this.aClass476_1.anInt5128 = this.aClass135_2.anInt3395 * 12251759;
		this.aClass476_1.anInt5129 = this.aClass135_2.anInt3396 * 1633228511;
		this.aClass476_1.anInt5130 = this.aClass135_2.anInt3397 * -1486359969;
		if (this.aClass476_1.anInt5125 * 504086253 == this.aClass476_1.anInt5127 * 1773066433 && this.aClass476_1.anInt5128 * -1402011207 == this.aClass476_1.anInt5127 * 1773066433 && this.aClass476_1.anInt5126 * 548022605 == this.aClass476_1.anInt5131 * 1198295669 && this.aClass476_1.anInt5129 * 690353245 == this.aClass476_1.anInt5126 * 548022605 && this.aClass476_1.anInt5124 * -1494714659 == this.aClass476_1.anInt5132 * -1906774035 && this.aClass476_1.anInt5130 * 1126365971 == this.aClass476_1.anInt5132 * -1906774035) {
			this.aBoolean808 = true;
		} else if (this.aBoolean808) {
			this.aBoolean808 = false;
			this.aClass476_2.anInt5125 = this.aClass476_1.anInt5125;
			this.aClass476_2.anInt5131 = this.aClass476_1.anInt5131;
			this.aClass476_2.anInt5124 = this.aClass476_1.anInt5124;
			this.aClass476_2.anInt5127 = this.aClass476_1.anInt5127;
			this.aClass476_2.anInt5126 = this.aClass476_1.anInt5126;
			this.aClass476_2.anInt5132 = this.aClass476_1.anInt5132;
			this.aClass476_2.anInt5128 = this.aClass476_1.anInt5128;
			this.aClass476_2.anInt5129 = this.aClass476_1.anInt5129;
			this.aClass476_2.anInt5130 = this.aClass476_1.anInt5130;
		}
	}

	@OriginalMember(owner = "client!tv", name = "h", descriptor = "(Lclient!de;JIZ)V", line = 79)
	void method29250(@OriginalArg(0) Class21 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(50) int local50;
		if (this.aBoolean807) {
			arg3 = false;
		} else if (Class482.anInt5158 * 1631733361 < this.aClass271_1.anInt4265 * 1354700845) {
			arg3 = false;
		} else if (Class482.anInt5155 * 788032913 > Class126.anIntArray325[Class482.anInt5158 * 1631733361]) {
			arg3 = false;
		} else if (this.aBoolean808) {
			arg3 = false;
		} else if (this.aClass271_1.anInt4275 * 1520111489 != -1) {
			local50 = (int) (arg1 - this.aLong282 * -5391650153592413485L);
			if (this.aClass271_1.aBoolean698 || local50 <= this.aClass271_1.anInt4275 * 1520111489) {
				local50 %= this.aClass271_1.anInt4275 * 1520111489;
			} else {
				arg3 = false;
			}
			if (!this.aClass271_1.aBoolean704 && local50 < this.aClass271_1.anInt4263 * 1554730097) {
				arg3 = false;
			}
			if (this.aClass271_1.aBoolean704 && local50 >= this.aClass271_1.anInt4263 * 1554730097) {
				arg3 = false;
			}
		}
		this.anInt5205 = 0;
		for (@Pc(107) Class53_Sub1_Sub1_Sub1 local107 = (Class53_Sub1_Sub1_Sub1) this.aClass559_9.method32822(); local107 != null; local107 = (Class53_Sub1_Sub1_Sub1) this.aClass559_9.method32837()) {
			local107.method20623(arg1, arg2);
			this.anInt5205 += -1014289813;
		}
		if (arg3) {
			local50 = (this.aClass476_1.anInt5128 * -1402011207 + this.aClass476_1.anInt5127 * 1773066433 + this.aClass476_1.anInt5125 * 504086253) / 3;
			@Pc(168) int local168 = (this.aClass476_1.anInt5129 * 690353245 + this.aClass476_1.anInt5126 * 548022605 + this.aClass476_1.anInt5131 * 1198295669) / 3;
			@Pc(188) int local188 = (this.aClass476_1.anInt5130 * 1126365971 + this.aClass476_1.anInt5132 * -1906774035 + this.aClass476_1.anInt5124 * -1494714659) / 3;
			@Pc(242) int local242;
			@Pc(254) int local254;
			@Pc(266) int local266;
			@Pc(278) int local278;
			@Pc(290) int local290;
			@Pc(302) int local302;
			@Pc(435) int local435;
			@Pc(492) int local492;
			@Pc(523) int local523;
			if (this.aClass476_1.anInt5122 * 1174425445 != local50 || local168 != this.aClass476_1.anInt5123 * -138846813 || this.aClass476_1.anInt5133 * -1339547639 != local188 || !this.aBoolean809) {
				this.aClass476_1.anInt5122 = local50 * 1678723693;
				this.aClass476_1.anInt5123 = local168 * -17908213;
				this.aClass476_1.anInt5133 = local188 * -1473941959;
				local242 = this.aClass476_1.anInt5127 * 1773066433 - this.aClass476_1.anInt5125 * 504086253;
				local254 = this.aClass476_1.anInt5126 * 548022605 - this.aClass476_1.anInt5131 * 1198295669;
				local266 = this.aClass476_1.anInt5132 * -1906774035 - this.aClass476_1.anInt5124 * -1494714659;
				local278 = this.aClass476_1.anInt5128 * -1402011207 - this.aClass476_1.anInt5125 * 504086253;
				local290 = this.aClass476_1.anInt5129 * 690353245 - this.aClass476_1.anInt5131 * 1198295669;
				local302 = this.aClass476_1.anInt5130 * 1126365971 - this.aClass476_1.anInt5124 * -1494714659;
				this.anInt5201 = (local302 * local254 - local266 * local290) * -521452579;
				this.anInt5203 = (local278 * local266 - local302 * local242) * 842152255;
				this.anInt5204 = (local242 * local290 - local278 * local254) * 1398697647;
				while (true) {
					if (this.anInt5201 * -1290785675 <= 32767 && this.anInt5203 * -628345153 <= 32767 && this.anInt5204 * 1016571983 <= 32767 && this.anInt5201 * -1290785675 >= -32767 && this.anInt5203 * -628345153 >= -32767 && this.anInt5204 * 1016571983 >= -32767) {
						local435 = (int) Math.sqrt((double) (this.anInt5204 * 1016571983 * 1016571983 * this.anInt5204 + this.anInt5201 * -1290785675 * -1290785675 * this.anInt5201 + this.anInt5203 * -628345153 * -628345153 * this.anInt5203));
						if (local435 <= 0) {
							local435 = 1;
						}
						this.anInt5201 = this.anInt5201 * 1663718283 / local435 * -521452579;
						this.anInt5203 = this.anInt5203 * 1087588673 / local435 * 842152255;
						this.anInt5204 = this.anInt5204 * -1752180815 / local435 * 1398697647;
						if (this.aClass271_1.aShort165 > 0 || this.aClass271_1.aShort167 > 0) {
							local492 = (int) (Math.atan2((double) (this.anInt5204 * 1016571983), (double) (this.anInt5201 * -1290785675)) * 2607.5945876176133D);
							local523 = (int) (Math.atan2((double) (this.anInt5203 * -628345153), Math.sqrt((double) (this.anInt5204 * 1016571983 * this.anInt5204 * 1016571983 + this.anInt5201 * -1290785675 * this.anInt5201 * -1290785675))) * 2607.5945876176133D);
							this.anInt5202 = (this.aClass271_1.aShort165 - this.aClass271_1.aShort168) * 528535419;
							this.anInt5199 = (this.aClass271_1.aShort168 + local492 - (-864372813 * this.anInt5202 >> 1)) * -984707973;
							this.anInt5207 = (this.aClass271_1.aShort167 - this.aClass271_1.aShort166) * -1304889255;
							this.anInt5206 = (local523 + this.aClass271_1.aShort166 - (this.anInt5207 * 960942057 >> 1)) * 1416129459;
						}
						this.aBoolean809 = true;
						break;
					}
					this.anInt5201 = (this.anInt5201 * -1290785675 >> 1) * -521452579;
					this.anInt5203 = (this.anInt5203 * -628345153 >> 1) * 842152255;
					this.anInt5204 = (this.anInt5204 * 1016571983 >> 1) * 1398697647;
				}
			}
			this.anInt5200 += (int) ((double) arg2 * ((double) (this.aClass271_1.anInt4256 * -1359475921) + Math.random() * (double) (this.aClass271_1.anInt4248 * -1304230513 - this.aClass271_1.anInt4256 * -1359475921))) * -202977111;
			if (this.anInt5200 * 365089689 > 63) {
				local242 = this.anInt5200 * 365089689 >> 6;
				this.anInt5200 = (this.anInt5200 * 365089689 & 0x3F) * -202977111;
				local254 = (arg2 << 8) / local242;
				local302 = 0;
				local435 = 0;
				while (local435 < local242) {
					@Pc(696) int local696;
					@Pc(704) int local704;
					@Pc(708) int local708;
					if (this.aClass271_1.aShort165 <= 0 && this.aClass271_1.aShort167 <= 0) {
						local266 = this.anInt5201 * -1290785675;
						local278 = this.anInt5203 * -628345153;
						local290 = this.anInt5204 * 1016571983;
					} else {
						local492 = this.anInt5199 * 335508147 + (int) ((double) (this.anInt5202 * -864372813) * Math.random());
						local492 &= 0x3FFF;
						local523 = Class317.anIntArray419[local492];
						@Pc(682) int local682 = Class317.anIntArray420[local492];
						local696 = this.anInt5206 * 301349755 + (int) ((double) (this.anInt5207 * 960942057) * Math.random());
						@Pc(700) int local700 = local696 & 0x1FFF;
						local704 = Class317.anIntArray419[local700];
						local708 = Class317.anIntArray420[local700];
						@Pc(710) byte local710 = 13;
						local266 = local682 * local704 >> local710;
						local278 = (local708 << 1) * -1;
						local290 = local704 * local523 >> local710;
					}
					@Pc(747) float local747 = (float) Math.random();
					@Pc(750) float local750 = (float) Math.random();
					if (local750 + local747 > 1.0F) {
						local747 = 1.0F - local747;
						local750 = 1.0F - local750;
					}
					@Pc(770) float local770 = 1.0F - (local747 + local750);
					local696 = (int) (local770 * (float) (this.aClass476_1.anInt5128 * -1402011207) + local747 * (float) (this.aClass476_1.anInt5125 * 504086253) + local750 * (float) (this.aClass476_1.anInt5127 * 1773066433));
					local704 = (int) (local747 * (float) (this.aClass476_1.anInt5131 * 1198295669) + local750 * (float) (this.aClass476_1.anInt5126 * 548022605) + (float) (this.aClass476_1.anInt5129 * 690353245) * local770);
					local708 = (int) (local747 * (float) (this.aClass476_1.anInt5124 * -1494714659) + local750 * (float) (this.aClass476_1.anInt5132 * -1906774035) + (float) (this.aClass476_1.anInt5130 * 1126365971) * local770);
					@Pc(876) int local876 = this.aClass271_1.anInt4239 * 328257939 + (int) (Math.random() * (double) (this.aClass271_1.anInt4240 * 1591639829 - this.aClass271_1.anInt4239 * 328257939));
					@Pc(898) int local898 = this.aClass271_1.anInt4254 * 480912651 + (int) (Math.random() * (double) (this.aClass271_1.anInt4255 * 813336659 - this.aClass271_1.anInt4254 * 480912651));
					@Pc(920) int local920 = this.aClass271_1.anInt4245 * 356385735 + (int) (Math.random() * (double) (this.aClass271_1.anInt4246 * -814184731 - this.aClass271_1.anInt4245 * 356385735));
					@Pc(926) int local926 = this.aClass271_1.anInt4267 * -99619573;
					if (this.aClass271_1.anInt4293 * -2127353257 != 0) {
						if (this.aClass271_1.anInt4269 * 1118026997 == 0) {
							local926 += (int) (Math.random() * (double) (this.aClass271_1.anInt4293 * -2127353257 + 1));
						} else {
							local926 += (int) (Math.random() * (double) (this.aClass271_1.anInt4269 * 1118026997 + 1)) * (this.aClass271_1.anInt4293 * -2127353257 / (this.aClass271_1.anInt4269 * 1118026997));
						}
					}
					@Pc(985) int local985 = this.aClass271_1.anInt4270 * -73330349;
					if (this.aClass271_1.anInt4279 * -1333302961 != 0) {
						local985 += (int) (Math.random() * (double) (this.aClass271_1.anInt4279 * -1333302961 + 1));
					}
					@Pc(1086) int local1086;
					if (this.aClass271_1.aBoolean696) {
						@Pc(1012) double local1012 = Math.random();
						local1086 = (int) ((double) (this.aClass271_1.anInt4277 * 1786594969) * local1012 + (double) (this.aClass271_1.anInt4238 * 2031897185)) << 16 | (int) ((double) (this.aClass271_1.anInt4278 * 822918283) + local1012 * (double) (this.aClass271_1.anInt4280 * -254525811)) << 8 | (int) (local1012 * (double) (this.aClass271_1.anInt4294 * 1492646953) + (double) (this.aClass271_1.anInt4281 * -2056991333)) | (int) ((double) (this.aClass271_1.anInt4283 * -1174111573) + Math.random() * (double) (this.aClass271_1.anInt4272 * -1760991329)) << 24;
					} else {
						local1086 = (int) ((double) (this.aClass271_1.anInt4238 * 2031897185) + Math.random() * (double) (this.aClass271_1.anInt4277 * 1786594969)) << 16 | (int) ((double) (this.aClass271_1.anInt4278 * 822918283) + Math.random() * (double) (this.aClass271_1.anInt4280 * -254525811)) << 8 | (int) ((double) (this.aClass271_1.anInt4281 * -2056991333) + Math.random() * (double) (this.aClass271_1.anInt4294 * 1492646953)) | (int) ((double) (this.aClass271_1.anInt4283 * -1174111573) + Math.random() * (double) (this.aClass271_1.anInt4272 * -1760991329)) << 24;
					}
					@Pc(1167) int local1167 = this.aClass271_1.anInt4253 * 1747452479;
					if (!arg0.method17032() && !this.aClass271_1.aBoolean703) {
						local1167 = -1;
					}
					@Pc(1189) Class53_Sub1_Sub1_Sub1 local1189;
					if (Class482.anInt5152 * -1498324259 == Class482.anInt5151 * -2077757551) {
						local1189 = new Class53_Sub1_Sub1_Sub1(this, local696, local704, local708, local266, local278, local290, local876, local898, local1086, local920, local926, local985, local1167, this.aClass271_1.aBoolean699, this.aClass271_1.aBoolean700);
					} else {
						local1189 = Class482.aClass53_Sub1_Sub1_Sub1Array2[Class482.anInt5151 * -2077757551];
						Class482.anInt5151 = (Class482.anInt5151 * -2077757551 + 1 & 0x3FF) * 201109873;
						local1189.method20633(this, local696, local704, local708, local266, local278, local290, local876, local898, local1086, local920, local926, local985, local1167, this.aClass271_1.aBoolean699, this.aClass271_1.aBoolean700);
					}
					if (local302 > 256) {
						local1189.method20623(arg1, local302 >> 8);
					}
					this.anInt5205 += -1014289813;
					local435++;
					local302 += local254;
				}
			}
		}
		if (!this.aClass476_1.method28794(this.aClass476_2)) {
			@Pc(1277) Class476 local1277 = this.aClass476_2;
			this.aClass476_2 = this.aClass476_1;
			this.aClass476_1 = local1277;
			this.aClass476_1.anInt5125 = this.aClass135_2.anInt3391 * -1147629753;
			this.aClass476_1.anInt5131 = this.aClass135_2.anInt3390 * -141432223;
			this.aClass476_1.anInt5124 = this.aClass135_2.anInt3385 * -2041791135;
			this.aClass476_1.anInt5127 = this.aClass135_2.anInt3392 * -56835949;
			this.aClass476_1.anInt5126 = this.aClass135_2.anInt3384 * -1575964651;
			this.aClass476_1.anInt5132 = this.aClass135_2.anInt3394 * 121261097;
			this.aClass476_1.anInt5128 = this.aClass135_2.anInt3395 * 12251759;
			this.aClass476_1.anInt5129 = this.aClass135_2.anInt3396 * 1633228511;
			this.aClass476_1.anInt5130 = this.aClass135_2.anInt3397 * -1486359969;
			this.aClass476_1.anInt5122 = this.aClass476_2.anInt5122;
			this.aClass476_1.anInt5123 = this.aClass476_2.anInt5123;
			this.aClass476_1.anInt5133 = this.aClass476_2.anInt5133;
		}
		Class482.anInt5153 += this.anInt5205 * -1251196887;
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(Lclient!de;JIZI)V", line = 79)
	void method29251(@OriginalArg(0) Class21 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(50) int local50;
		if (this.aBoolean807) {
			arg3 = false;
		} else if (Class482.anInt5158 * 1631733361 < this.aClass271_1.anInt4265 * 1354700845) {
			arg3 = false;
		} else if (Class482.anInt5155 * 788032913 > Class126.anIntArray325[Class482.anInt5158 * 1631733361]) {
			arg3 = false;
		} else if (this.aBoolean808) {
			arg3 = false;
		} else if (this.aClass271_1.anInt4275 * 1520111489 != -1) {
			local50 = (int) (arg1 - this.aLong282 * -5391650153592413485L);
			if (this.aClass271_1.aBoolean698 || local50 <= this.aClass271_1.anInt4275 * 1520111489) {
				local50 %= this.aClass271_1.anInt4275 * 1520111489;
			} else {
				arg3 = false;
			}
			if (!this.aClass271_1.aBoolean704 && local50 < this.aClass271_1.anInt4263 * 1554730097) {
				arg3 = false;
			}
			if (this.aClass271_1.aBoolean704 && local50 >= this.aClass271_1.anInt4263 * 1554730097) {
				arg3 = false;
			}
		}
		this.anInt5205 = 0;
		for (@Pc(107) Class53_Sub1_Sub1_Sub1 local107 = (Class53_Sub1_Sub1_Sub1) this.aClass559_9.method32822(); local107 != null; local107 = (Class53_Sub1_Sub1_Sub1) this.aClass559_9.method32837()) {
			local107.method20623(arg1, arg2);
			this.anInt5205 += -1014289813;
		}
		if (arg3) {
			local50 = (this.aClass476_1.anInt5128 * -1402011207 + this.aClass476_1.anInt5127 * 1773066433 + this.aClass476_1.anInt5125 * 504086253) / 3;
			@Pc(168) int local168 = (this.aClass476_1.anInt5129 * 690353245 + this.aClass476_1.anInt5126 * 548022605 + this.aClass476_1.anInt5131 * 1198295669) / 3;
			@Pc(188) int local188 = (this.aClass476_1.anInt5130 * 1126365971 + this.aClass476_1.anInt5132 * -1906774035 + this.aClass476_1.anInt5124 * -1494714659) / 3;
			@Pc(242) int local242;
			@Pc(254) int local254;
			@Pc(266) int local266;
			@Pc(278) int local278;
			@Pc(290) int local290;
			@Pc(302) int local302;
			@Pc(435) int local435;
			@Pc(492) int local492;
			@Pc(523) int local523;
			if (this.aClass476_1.anInt5122 * 1174425445 != local50 || local168 != this.aClass476_1.anInt5123 * -138846813 || this.aClass476_1.anInt5133 * -1339547639 != local188 || !this.aBoolean809) {
				this.aClass476_1.anInt5122 = local50 * 1678723693;
				this.aClass476_1.anInt5123 = local168 * -17908213;
				this.aClass476_1.anInt5133 = local188 * -1473941959;
				local242 = this.aClass476_1.anInt5127 * 1773066433 - this.aClass476_1.anInt5125 * 504086253;
				local254 = this.aClass476_1.anInt5126 * 548022605 - this.aClass476_1.anInt5131 * 1198295669;
				local266 = this.aClass476_1.anInt5132 * -1906774035 - this.aClass476_1.anInt5124 * -1494714659;
				local278 = this.aClass476_1.anInt5128 * -1402011207 - this.aClass476_1.anInt5125 * 504086253;
				local290 = this.aClass476_1.anInt5129 * 690353245 - this.aClass476_1.anInt5131 * 1198295669;
				local302 = this.aClass476_1.anInt5130 * 1126365971 - this.aClass476_1.anInt5124 * -1494714659;
				this.anInt5201 = (local302 * local254 - local266 * local290) * -521452579;
				this.anInt5203 = (local278 * local266 - local302 * local242) * 842152255;
				this.anInt5204 = (local242 * local290 - local278 * local254) * 1398697647;
				while (true) {
					if (this.anInt5201 * -1290785675 <= 32767 && this.anInt5203 * -628345153 <= 32767 && this.anInt5204 * 1016571983 <= 32767 && this.anInt5201 * -1290785675 >= -32767 && this.anInt5203 * -628345153 >= -32767 && this.anInt5204 * 1016571983 >= -32767) {
						local435 = (int) Math.sqrt((double) (this.anInt5204 * 1016571983 * 1016571983 * this.anInt5204 + this.anInt5201 * -1290785675 * -1290785675 * this.anInt5201 + this.anInt5203 * -628345153 * -628345153 * this.anInt5203));
						if (local435 <= 0) {
							local435 = 1;
						}
						this.anInt5201 = this.anInt5201 * 1663718283 / local435 * -521452579;
						this.anInt5203 = this.anInt5203 * 1087588673 / local435 * 842152255;
						this.anInt5204 = this.anInt5204 * -1752180815 / local435 * 1398697647;
						if (this.aClass271_1.aShort165 > 0 || this.aClass271_1.aShort167 > 0) {
							local492 = (int) (Math.atan2((double) (this.anInt5204 * 1016571983), (double) (this.anInt5201 * -1290785675)) * 2607.5945876176133D);
							local523 = (int) (Math.atan2((double) (this.anInt5203 * -628345153), Math.sqrt((double) (this.anInt5204 * 1016571983 * this.anInt5204 * 1016571983 + this.anInt5201 * -1290785675 * this.anInt5201 * -1290785675))) * 2607.5945876176133D);
							this.anInt5202 = (this.aClass271_1.aShort165 - this.aClass271_1.aShort168) * 528535419;
							this.anInt5199 = (this.aClass271_1.aShort168 + local492 - (-864372813 * this.anInt5202 >> 1)) * -984707973;
							this.anInt5207 = (this.aClass271_1.aShort167 - this.aClass271_1.aShort166) * -1304889255;
							this.anInt5206 = (local523 + this.aClass271_1.aShort166 - (this.anInt5207 * 960942057 >> 1)) * 1416129459;
						}
						this.aBoolean809 = true;
						break;
					}
					this.anInt5201 = (this.anInt5201 * -1290785675 >> 1) * -521452579;
					this.anInt5203 = (this.anInt5203 * -628345153 >> 1) * 842152255;
					this.anInt5204 = (this.anInt5204 * 1016571983 >> 1) * 1398697647;
				}
			}
			this.anInt5200 += (int) ((double) arg2 * ((double) (this.aClass271_1.anInt4256 * -1359475921) + Math.random() * (double) (this.aClass271_1.anInt4248 * -1304230513 - this.aClass271_1.anInt4256 * -1359475921))) * -202977111;
			if (this.anInt5200 * 365089689 > 63) {
				local242 = this.anInt5200 * 365089689 >> 6;
				this.anInt5200 = (this.anInt5200 * 365089689 & 0x3F) * -202977111;
				local254 = (arg2 << 8) / local242;
				local302 = 0;
				local435 = 0;
				while (local435 < local242) {
					@Pc(696) int local696;
					@Pc(704) int local704;
					@Pc(708) int local708;
					if (this.aClass271_1.aShort165 <= 0 && this.aClass271_1.aShort167 <= 0) {
						local266 = this.anInt5201 * -1290785675;
						local278 = this.anInt5203 * -628345153;
						local290 = this.anInt5204 * 1016571983;
					} else {
						local492 = this.anInt5199 * 335508147 + (int) ((double) (this.anInt5202 * -864372813) * Math.random());
						local492 &= 0x3FFF;
						local523 = Class317.anIntArray419[local492];
						@Pc(682) int local682 = Class317.anIntArray420[local492];
						local696 = this.anInt5206 * 301349755 + (int) ((double) (this.anInt5207 * 960942057) * Math.random());
						@Pc(700) int local700 = local696 & 0x1FFF;
						local704 = Class317.anIntArray419[local700];
						local708 = Class317.anIntArray420[local700];
						@Pc(710) byte local710 = 13;
						local266 = local682 * local704 >> local710;
						local278 = (local708 << 1) * -1;
						local290 = local704 * local523 >> local710;
					}
					@Pc(747) float local747 = (float) Math.random();
					@Pc(750) float local750 = (float) Math.random();
					if (local750 + local747 > 1.0F) {
						local747 = 1.0F - local747;
						local750 = 1.0F - local750;
					}
					@Pc(770) float local770 = 1.0F - (local747 + local750);
					local696 = (int) (local770 * (float) (this.aClass476_1.anInt5128 * -1402011207) + local747 * (float) (this.aClass476_1.anInt5125 * 504086253) + local750 * (float) (this.aClass476_1.anInt5127 * 1773066433));
					local704 = (int) (local747 * (float) (this.aClass476_1.anInt5131 * 1198295669) + local750 * (float) (this.aClass476_1.anInt5126 * 548022605) + (float) (this.aClass476_1.anInt5129 * 690353245) * local770);
					local708 = (int) (local747 * (float) (this.aClass476_1.anInt5124 * -1494714659) + local750 * (float) (this.aClass476_1.anInt5132 * -1906774035) + (float) (this.aClass476_1.anInt5130 * 1126365971) * local770);
					@Pc(876) int local876 = this.aClass271_1.anInt4239 * 328257939 + (int) (Math.random() * (double) (this.aClass271_1.anInt4240 * 1591639829 - this.aClass271_1.anInt4239 * 328257939));
					@Pc(898) int local898 = this.aClass271_1.anInt4254 * 480912651 + (int) (Math.random() * (double) (this.aClass271_1.anInt4255 * 813336659 - this.aClass271_1.anInt4254 * 480912651));
					@Pc(920) int local920 = this.aClass271_1.anInt4245 * 356385735 + (int) (Math.random() * (double) (this.aClass271_1.anInt4246 * -814184731 - this.aClass271_1.anInt4245 * 356385735));
					@Pc(926) int local926 = this.aClass271_1.anInt4267 * -99619573;
					if (this.aClass271_1.anInt4293 * -2127353257 != 0) {
						if (this.aClass271_1.anInt4269 * 1118026997 == 0) {
							local926 += (int) (Math.random() * (double) (this.aClass271_1.anInt4293 * -2127353257 + 1));
						} else {
							local926 += (int) (Math.random() * (double) (this.aClass271_1.anInt4269 * 1118026997 + 1)) * (this.aClass271_1.anInt4293 * -2127353257 / (this.aClass271_1.anInt4269 * 1118026997));
						}
					}
					@Pc(985) int local985 = this.aClass271_1.anInt4270 * -73330349;
					if (this.aClass271_1.anInt4279 * -1333302961 != 0) {
						local985 += (int) (Math.random() * (double) (this.aClass271_1.anInt4279 * -1333302961 + 1));
					}
					@Pc(1086) int local1086;
					if (this.aClass271_1.aBoolean696) {
						@Pc(1012) double local1012 = Math.random();
						local1086 = (int) ((double) (this.aClass271_1.anInt4277 * 1786594969) * local1012 + (double) (this.aClass271_1.anInt4238 * 2031897185)) << 16 | (int) ((double) (this.aClass271_1.anInt4278 * 822918283) + local1012 * (double) (this.aClass271_1.anInt4280 * -254525811)) << 8 | (int) (local1012 * (double) (this.aClass271_1.anInt4294 * 1492646953) + (double) (this.aClass271_1.anInt4281 * -2056991333)) | (int) ((double) (this.aClass271_1.anInt4283 * -1174111573) + Math.random() * (double) (this.aClass271_1.anInt4272 * -1760991329)) << 24;
					} else {
						local1086 = (int) ((double) (this.aClass271_1.anInt4238 * 2031897185) + Math.random() * (double) (this.aClass271_1.anInt4277 * 1786594969)) << 16 | (int) ((double) (this.aClass271_1.anInt4278 * 822918283) + Math.random() * (double) (this.aClass271_1.anInt4280 * -254525811)) << 8 | (int) ((double) (this.aClass271_1.anInt4281 * -2056991333) + Math.random() * (double) (this.aClass271_1.anInt4294 * 1492646953)) | (int) ((double) (this.aClass271_1.anInt4283 * -1174111573) + Math.random() * (double) (this.aClass271_1.anInt4272 * -1760991329)) << 24;
					}
					@Pc(1167) int local1167 = this.aClass271_1.anInt4253 * 1747452479;
					if (!arg0.method17032() && !this.aClass271_1.aBoolean703) {
						local1167 = -1;
					}
					@Pc(1189) Class53_Sub1_Sub1_Sub1 local1189;
					if (Class482.anInt5152 * -1498324259 == Class482.anInt5151 * -2077757551) {
						local1189 = new Class53_Sub1_Sub1_Sub1(this, local696, local704, local708, local266, local278, local290, local876, local898, local1086, local920, local926, local985, local1167, this.aClass271_1.aBoolean699, this.aClass271_1.aBoolean700);
					} else {
						local1189 = Class482.aClass53_Sub1_Sub1_Sub1Array2[Class482.anInt5151 * -2077757551];
						Class482.anInt5151 = (Class482.anInt5151 * -2077757551 + 1 & 0x3FF) * 201109873;
						local1189.method20633(this, local696, local704, local708, local266, local278, local290, local876, local898, local1086, local920, local926, local985, local1167, this.aClass271_1.aBoolean699, this.aClass271_1.aBoolean700);
					}
					if (local302 > 256) {
						local1189.method20623(arg1, local302 >> 8);
					}
					this.anInt5205 += -1014289813;
					local435++;
					local302 += local254;
				}
			}
		}
		if (!this.aClass476_1.method28794(this.aClass476_2)) {
			@Pc(1277) Class476 local1277 = this.aClass476_2;
			this.aClass476_2 = this.aClass476_1;
			this.aClass476_1 = local1277;
			this.aClass476_1.anInt5125 = this.aClass135_2.anInt3391 * -1147629753;
			this.aClass476_1.anInt5131 = this.aClass135_2.anInt3390 * -141432223;
			this.aClass476_1.anInt5124 = this.aClass135_2.anInt3385 * -2041791135;
			this.aClass476_1.anInt5127 = this.aClass135_2.anInt3392 * -56835949;
			this.aClass476_1.anInt5126 = this.aClass135_2.anInt3384 * -1575964651;
			this.aClass476_1.anInt5132 = this.aClass135_2.anInt3394 * 121261097;
			this.aClass476_1.anInt5128 = this.aClass135_2.anInt3395 * 12251759;
			this.aClass476_1.anInt5129 = this.aClass135_2.anInt3396 * 1633228511;
			this.aClass476_1.anInt5130 = this.aClass135_2.anInt3397 * -1486359969;
			this.aClass476_1.anInt5122 = this.aClass476_2.anInt5122;
			this.aClass476_1.anInt5123 = this.aClass476_2.anInt5123;
			this.aClass476_1.anInt5133 = this.aClass476_2.anInt5133;
		}
		Class482.anInt5153 += this.anInt5205 * -1251196887;
	}

	@OriginalMember(owner = "client!tv", name = "x", descriptor = "(Lclient!rp;Lclient!de;J)V", line = 227)
	void method29246(@OriginalArg(0) Class438 arg0, @OriginalArg(1) Class21 arg1, @OriginalArg(2) long arg2) {
		for (@Pc(5) Class53_Sub1_Sub1_Sub1 local5 = (Class53_Sub1_Sub1_Sub1) this.aClass559_9.method32822(); local5 != null; local5 = (Class53_Sub1_Sub1_Sub1) this.aClass559_9.method32837()) {
			local5.method20632(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!tv", name = "g", descriptor = "(Lclient!rp;Lclient!de;J)V", line = 227)
	void method29248(@OriginalArg(0) Class438 arg0, @OriginalArg(1) Class21 arg1, @OriginalArg(2) long arg2) {
		for (@Pc(5) Class53_Sub1_Sub1_Sub1 local5 = (Class53_Sub1_Sub1_Sub1) this.aClass559_9.method32822(); local5 != null; local5 = (Class53_Sub1_Sub1_Sub1) this.aClass559_9.method32837()) {
			local5.method20632(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!tv", name = "s", descriptor = "(Lclient!rp;Lclient!de;J)V", line = 227)
	void method29252(@OriginalArg(0) Class438 arg0, @OriginalArg(1) Class21 arg1, @OriginalArg(2) long arg2) {
		for (@Pc(5) Class53_Sub1_Sub1_Sub1 local5 = (Class53_Sub1_Sub1_Sub1) this.aClass559_9.method32822(); local5 != null; local5 = (Class53_Sub1_Sub1_Sub1) this.aClass559_9.method32837()) {
			local5.method20632(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!tv", name = "h", descriptor = "(IIILclient!su;I)V", line = 240)
	public static void method29256(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class467 arg3) {
		for (@Pc(4) Class3_Sub20 local4 = (Class3_Sub20) Class3_Sub20.aClass553_19.method32768(); local4 != null; local4 = (Class3_Sub20) Class3_Sub20.aClass553_19.method32709()) {
			if (local4.anInt1273 * -1591342007 == arg0 && arg1 << 9 == local4.anInt1267 * 369723815 && local4.anInt1277 * 313866263 == arg2 << 9 && arg3.anInt5092 * 1978606771 == local4.aClass467_1.anInt5092 * 1978606771) {
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

	@OriginalMember(owner = "client!tv", name = "gv", descriptor = "(B)V", line = 3031)
	static final void method29254() {
		for (@Pc(5) int local5 = Class424.aClass165_1.aClass460_1.method28566(true); local5 != -1; local5 = Class424.aClass165_1.aClass460_1.method28566(false)) {
			Class256.method25225(local5);
			client.anIntArray311[(client.anInt3141 += 92526907) * -1196058637 - 1 & 0x1F] = local5;
		}
		for (@Pc(35) Class3_Sub1_Sub11 local35 = Class523.method29833(); local35 != null; local35 = Class523.method29833()) {
			@Pc(42) int local42 = local35.method19182();
			@Pc(46) long local46 = local35.method19156();
			@Pc(55) Class11 local55;
			if (local42 == 1) {
				local55 = Class500.aClass70_Sub1_Sub2_12.method14717((int) local46);
				Class302.aClass10_Sub1_1.method32389(local55, local35.anInt2693 * -2097539857);
				client.anIntArray321[(client.anInt3112 += -1829591599) * 611570481 - 1 & 0x1F] = (int) local46;
			} else if (local42 == 2) {
				local55 = Class500.aClass70_Sub1_Sub2_12.method14717((int) local46);
				Class302.aClass10_Sub1_1.method32391(local55, local35.aString114);
				client.anIntArray322[(client.anInt3033 += -1652581033) * -229335449 - 1 & 0x1F] = (int) local46;
			} else {
				@Pc(118) Class178 local118;
				if (local42 == 3) {
					local118 = Class375.method27235((int) local46);
					if (!local35.aString114.equals(local118.aString169)) {
						local118.aString169 = local35.aString114;
						Class223.method24442(local118);
					}
				} else if (local42 == 23) {
					local118 = Class375.method27235((int) local46);
					if (local118.aBoolean646 != (local35.anInt2693 * -2097539857 == 1)) {
						local118.aBoolean646 = local35.anInt2693 * -2097539857 == 1;
						Class223.method24442(local118);
					}
				} else {
					@Pc(180) int local180;
					@Pc(185) int local185;
					@Pc(190) int local190;
					if (local42 == 4) {
						local118 = Class375.method27235((int) local46);
						local180 = local35.anInt2693 * -2097539857;
						local185 = local35.anInt2695 * -9618245;
						local190 = local35.anInt2676 * -2060554761;
						if (local118.anInt3513 * -2138884745 != local180 || local118.anInt3514 * -472903775 != local185 || local190 != local118.anInt3493 * 501117109) {
							local118.anInt3513 = local180 * 557855815;
							local118.anInt3514 = local185 * 1702990945;
							local118.anInt3493 = local190 * -1649738339;
							local118.aClass584_2 = null;
							Class223.method24442(local118);
						}
					} else if (local42 == 5) {
						local118 = Class375.method27235((int) local46);
						if (local118.anInt3572 * 381674943 != local35.anInt2693 * -2097539857) {
							if (-2097539857 * local35.anInt2693 == -1) {
								local118.aClass71_6 = null;
							} else {
								if (local118.aClass71_6 == null) {
									local118.aClass71_6 = new Class71_Sub2();
								}
								local118.aClass71_6.method20038(local35.anInt2693 * -2097539857);
							}
							local118.anInt3572 = local35.anInt2693 * -1967555375;
							Class223.method24442(local118);
						}
					} else if (local42 == 6) {
						@Pc(292) int local292 = local35.anInt2693 * -2097539857;
						local180 = local292 >> 10 & 0x1F;
						local185 = local292 >> 5 & 0x1F;
						local190 = local292 & 0x1F;
						@Pc(320) int local320 = (local190 << 3) + (local180 << 19) + (local185 << 11);
						@Pc(325) Class178 local325 = Class375.method27235((int) local46);
						if (local325.anInt3506 * 225266731 != local320) {
							local325.anInt3506 = local320 * 245699203;
							Class223.method24442(local325);
						}
					} else if (local42 == 7) {
						local118 = Class375.method27235((int) local46);
						@Pc(358) boolean local358 = local35.anInt2693 * -2097539857 == 1;
						if (local118.aBoolean628 != local358) {
							local118.aBoolean628 = local358;
							Class223.method24442(local118);
						}
					} else if (local42 == 8) {
						local118 = Class375.method27235((int) local46);
						if (local35.anInt2693 * -2097539857 != local118.anInt3518 * 351958085 || local35.anInt2695 * -9618245 != local118.anInt3519 * 492943859 || local118.anInt3523 * 260568357 != local35.anInt2676 * -2060554761) {
							local118.anInt3518 = local35.anInt2693 * -1190712925;
							local118.anInt3519 = local35.anInt2695 * 10918937;
							local118.anInt3523 = local35.anInt2676 * 2029666795;
							if (local118.anInt3559 * 1976441867 != -1) {
								if (local118.anInt3524 * -1898374355 > 0) {
									local118.anInt3523 = local118.anInt3523 * -251747168 / (local118.anInt3524 * -1898374355) * -1002365267;
								} else if (local118.anInt3495 * 1566866781 > 0) {
									local118.anInt3523 = local118.anInt3523 * -251747168 / (local118.anInt3495 * 1566866781) * -1002365267;
								}
							}
							Class223.method24442(local118);
						}
					} else if (local42 == 9) {
						local118 = Class375.method27235((int) local46);
						if (local118.anInt3559 * 1976441867 != local35.anInt2693 * -2097539857 || local118.anInt3563 * -1429853457 != local35.anInt2695 * -9618245) {
							local118.anInt3559 = local35.anInt2693 * 1769919789;
							local118.anInt3563 = local35.anInt2695 * 649345781;
							Class223.method24442(local118);
						}
					} else if (local42 == 10) {
						local118 = Class375.method27235((int) local46);
						if (local35.anInt2693 * -2097539857 != local118.anInt3561 * -1625983971 || local35.anInt2695 * -9618245 != local118.anInt3517 * -1321366055 || local35.anInt2676 * -2060554761 != local118.anInt3520 * 1884512825) {
							local118.anInt3561 = local35.anInt2693 * -1775204485;
							local118.anInt3517 = local35.anInt2695 * -176374093;
							local118.anInt3520 = local35.anInt2676 * -1645440593;
							Class223.method24442(local118);
						}
					} else if (local42 == 11) {
						local118 = Class375.method27235((int) local46);
						local118.aByte124 = 0;
						local118.anInt3497 = (local118.anInt3494 = -1009120897 * local35.anInt2693) * -1640730797;
						local118.aByte127 = 0;
						local118.anInt3510 = (local118.anInt3543 = local35.anInt2695 * -421706165) * -579839101;
						Class223.method24442(local118);
					} else if (local42 == 12) {
						local118 = Class375.method27235((int) local46);
						local180 = local35.anInt2693 * -2097539857;
						if (local118 != null && local118.anInt3492 * -107621169 == 0) {
							if (local180 > local118.anInt3505 * 247707339 - local118.anInt3499 * -751005789) {
								local180 = local118.anInt3505 * 247707339 - local118.anInt3499 * -751005789;
							}
							if (local180 < 0) {
								local180 = 0;
							}
							if (local118.anInt3557 * 1648318741 != local180) {
								local118.anInt3557 = local180 * -288477635;
								Class223.method24442(local118);
							}
						}
					} else if (local42 == 13) {
						local118 = Class375.method27235((int) local46);
						local118.anInt3509 = local35.anInt2693 * 897184223;
					} else if (local42 == 14) {
						Class2.aBoolean4 = true;
						Class2.anInt5 = local35.anInt2693 * 2092384455;
						Class2.anInt2 = local35.anInt2695 * -1292406155;
					} else if (local42 == 15) {
						local118 = Class375.method27235((int) local46);
						local118.anInt3539 = local35.anInt2693 * 1191524011;
					} else if (local42 == 21) {
						local118 = Class375.method27235((int) local46);
						local118.aBoolean645 = local35.anInt2693 * -2097539857 == 1;
					} else if (local42 == 22) {
						local118 = Class375.method27235((int) local46);
						local118.aBoolean627 = local35.anInt2693 * -2097539857 == 1;
					} else if (local42 == 16) {
						local118 = Class375.method27235((int) local46);
						local118.anInt3476 = local35.anInt2693 * -238481977;
					} else if (local42 == 17) {
						local118 = Class375.method27235((int) local46);
						local180 = (int) (local46 >> 32);
						local118.method23446(local180, (short) (local35.anInt2693 * -2097539857), (short) (local35.anInt2695 * -9618245));
					} else if (local42 == 20) {
						local118 = Class375.method27235((int) local46);
						local180 = (int) (local46 >> 32);
						local118.method23463(local180, (short) (local35.anInt2693 * -2097539857), (short) (local35.anInt2695 * -9618245));
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tv", name = "vo", descriptor = "(Lclient!vs;I)V", line = 7904)
	static final void method29253(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 624249098;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class229.method24532(local13, local23, true);
	}

	@OriginalMember(owner = "client!tv", name = "agf", descriptor = "(Lclient!vs;B)V", line = 10128)
	static final void method29257(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class58_Sub1.aBoolean319 ? 1 : 0;
	}

	@OriginalMember(owner = "client!tv", name = "ki", descriptor = "([Lclient!fo;Lclient!fo;ZI)V", line = 10235)
	static void method29255(@OriginalArg(0) Class178[] arg0, @OriginalArg(1) Class178 arg1, @OriginalArg(2) boolean arg2) {
		@Pc(14) int local14 = arg1.anInt3554 * -1920517457 == 0 ? arg1.anInt3498 * -1494060731 : arg1.anInt3554 * -1920517457;
		@Pc(29) int local29 = arg1.anInt3505 * 247707339 == 0 ? arg1.anInt3499 * -751005789 : arg1.anInt3505 * 247707339;
		Class68.method14036(arg0, arg1.anInt3570 * 954808515, local14, local29, arg2);
		if (arg1.aClass178Array6 != null) {
			Class68.method14036(arg1.aClass178Array6, arg1.anInt3570 * 954808515, local14, local29, arg2);
		}
		@Pc(62) Class3_Sub42 local62 = (Class3_Sub42) client.aClass581_22.method33217((long) (arg1.anInt3570 * 954808515));
		if (local62 != null) {
			Class338.method26415(local62.anInt2796 * 1705574607, local14, local29, arg2);
		}
		if (client.aClass178_12 != arg1) {
			return;
		}
		@Pc(80) int local80 = Class52.anInt1127 * 701602229;
		@Pc(82) int[] local82 = Class52.anIntArray167;
		@Pc(84) int local84;
		for (local84 = 0; local84 < local80; local84++) {
			@Pc(93) Class26_Sub1_Sub1_Sub1_Sub2 local93 = client.aClass26_Sub1_Sub1_Sub1_Sub2Array1[local82[local84]];
			if (local93 != null) {
				local93.method16642(local14, local29, arg2);
			}
		}
		for (local84 = 0; local84 < client.anInt3163 * 1758488217; local84++) {
			@Pc(115) int local115 = client.anIntArray303[local84];
			@Pc(121) Class3_Sub29 local121 = (Class3_Sub29) client.aClass581_21.method33217((long) local115);
			if (local121 != null) {
				((Class26_Sub1_Sub1_Sub1) local121.anObject2).method16642(local14, local29, arg2);
			}
		}
	}
}
