package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xr")
public class Class652 implements Interface12 {

	@OriginalMember(owner = "client!xr", name = "l", descriptor = "I")
	public int anInt5752;

	@OriginalMember(owner = "client!xr", name = "c", descriptor = "I")
	int anInt5753;

	@OriginalMember(owner = "client!xr", name = "v", descriptor = "I")
	public int anInt5754;

	@OriginalMember(owner = "client!xr", name = "p", descriptor = "Lclient!xu;")
	final Class148 aClass148_1;

	@OriginalMember(owner = "client!xr", name = "<init>", descriptor = "(ILclient!xu;)V", line = 16)
	Class652(@OriginalArg(0) int arg0, @OriginalArg(1) Class148 arg1) {
		this.aClass148_1 = arg1;
	}

	@OriginalMember(owner = "client!xr", name = "p", descriptor = "(Lclient!akv;B)V", line = 22)
	@Override
	public void method36031(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method32964(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!xr", name = "v", descriptor = "(Lclient!akv;)V", line = 22)
	@Override
	public void method36032(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method32964(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!xr", name = "y", descriptor = "(Lclient!akv;)V", line = 22)
	@Override
	public void method36033(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method32964(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!xr", name = "l", descriptor = "(Lclient!akv;)V", line = 22)
	@Override
	public void method36030(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method32964(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!xr", name = "q", descriptor = "(Lclient!akv;IB)V", line = 29)
	void method32964(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt5753 = arg0.method22549() * -225755655;
		} else if (arg1 == 2) {
			this.anInt5754 = arg0.method22478() * -1505855131;
			this.anInt5752 = arg0.method22478() * -246792169;
		}
	}

	@OriginalMember(owner = "client!xr", name = "s", descriptor = "(Lclient!akv;I)V", line = 29)
	void method32965(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt5753 = arg0.method22549() * -225755655;
		} else if (arg1 == 2) {
			this.anInt5754 = arg0.method22478() * -1505855131;
			this.anInt5752 = arg0.method22478() * -246792169;
		}
	}

	@OriginalMember(owner = "client!xr", name = "d", descriptor = "(Lclient!akv;I)V", line = 29)
	void method32966(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt5753 = arg0.method22549() * -225755655;
		} else if (arg1 == 2) {
			this.anInt5754 = arg0.method22478() * -1505855131;
			this.anInt5752 = arg0.method22478() * -246792169;
		}
	}

	@OriginalMember(owner = "client!xr", name = "x", descriptor = "(B)Lclient!dg;", line = 38)
	public synchronized Class89 method32967() {
		@Pc(10) Class89 local10 = (Class89) this.aClass148_1.aClass232_38.method25835((long) (this.anInt5753 * 797635657));
		if (local10 != null) {
			return local10;
		}
		local10 = Class210.method25593(this.aClass148_1.aClass478_50, this.anInt5753 * 797635657, 0);
		if (local10 != null) {
			this.aClass148_1.aClass232_38.method25844(local10, (long) (this.anInt5753 * 797635657));
		}
		return local10;
	}

	@OriginalMember(owner = "client!xr", name = "r", descriptor = "()Lclient!dg;", line = 38)
	public synchronized Class89 method32968() {
		@Pc(10) Class89 local10 = (Class89) this.aClass148_1.aClass232_38.method25835((long) (this.anInt5753 * 797635657));
		if (local10 != null) {
			return local10;
		}
		local10 = Class210.method25593(this.aClass148_1.aClass478_50, this.anInt5753 * 797635657, 0);
		if (local10 != null) {
			this.aClass148_1.aClass232_38.method25844(local10, (long) (this.anInt5753 * 797635657));
		}
		return local10;
	}

	@OriginalMember(owner = "client!xr", name = "g", descriptor = "()Lclient!dg;", line = 38)
	public synchronized Class89 method32969() {
		@Pc(10) Class89 local10 = (Class89) this.aClass148_1.aClass232_38.method25835((long) (this.anInt5753 * 797635657));
		if (local10 != null) {
			return local10;
		}
		local10 = Class210.method25593(this.aClass148_1.aClass478_50, this.anInt5753 * 797635657, 0);
		if (local10 != null) {
			this.aClass148_1.aClass232_38.method25844(local10, (long) (this.anInt5753 * 797635657));
		}
		return local10;
	}

	@OriginalMember(owner = "client!xr", name = "p", descriptor = "(I)[Lclient!acr;", line = 40)
	static Class65[] method32970() {
		return new Class65[] { Class65.aClass65_22, Class65.aClass65_24, Class65.aClass65_7, Class65.aClass65_3, Class65.aClass65_25, Class65.aClass65_11, Class65.aClass65_10, Class65.aClass65_6, Class65.aClass65_21, Class65.aClass65_29, Class65.aClass65_8, Class65.aClass65_5, Class65.aClass65_9, Class65.aClass65_16, Class65.aClass65_12, Class65.aClass65_23, Class65.aClass65_15, Class65.aClass65_20, Class65.aClass65_18, Class65.aClass65_19, Class65.aClass65_4, Class65.aClass65_1, Class65.aClass65_28, Class65.aClass65_30, Class65.aClass65_2, Class65.aClass65_13, Class65.aClass65_26, Class65.aClass65_31, Class65.aClass65_14, Class65.aClass65_27, Class65.aClass65_17 };
	}

	@OriginalMember(owner = "client!xr", name = "t", descriptor = "()V", line = 45)
	@Override
	public void method36036() {
	}

	@OriginalMember(owner = "client!xr", name = "w", descriptor = "()V", line = 45)
	@Override
	public void method36035() {
	}

	@OriginalMember(owner = "client!xr", name = "c", descriptor = "(I)V", line = 45)
	@Override
	public void method36034() {
	}

	@OriginalMember(owner = "client!xr", name = "y", descriptor = "(Ljava/lang/String;I)V", line = 73)
	public static void method32971(@OriginalArg(0) String arg0) {
		if (client.anInt3390 * -1850530127 != 18) {
			return;
		}
		@Pc(11) Class77_Sub20 local11 = Class365.method28132(Class414.aClass414_53, client.aClass82_1.aClass16_1);
		local11.aClass77_Sub39_Sub1_2.method22403(0);
		@Pc(22) int local22 = local11.aClass77_Sub39_Sub1_2.anInt3089 * 31645619;
		local11.aClass77_Sub39_Sub1_2.method22440(arg0);
		local11.aClass77_Sub39_Sub1_2.anInt3089 += -1122347939;
		local11.aClass77_Sub39_Sub1_2.method22567(Class314.anIntArray432, local22, local11.aClass77_Sub39_Sub1_2.anInt3089 * 31645619);
		local11.aClass77_Sub39_Sub1_2.method22463(local11.aClass77_Sub39_Sub1_2.anInt3089 * 31645619 - local22);
		client.aClass82_1.method2004(local11);
		Class298.aClass694_1 = Class694.aClass694_3;
	}

	@OriginalMember(owner = "client!xr", name = "l", descriptor = "(B)V", line = 99)
	static void method32972() {
		if (Class656.anIntArray532 != null) {
			return;
		}
		Class656.anIntArray532 = new int[65536];
		Class656.anIntArray531 = new int[65536];
		@Pc(11) double local11 = 0.7D;
		for (@Pc(13) int local13 = 0; local13 < 65536; local13++) {
			@Pc(27) double local27 = (double) (local13 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(38) double local38 = (double) (local13 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(45) double local45 = (double) (local13 & 0x7F) / 128.0D;
			@Pc(47) double local47 = local45;
			@Pc(49) double local49 = local45;
			@Pc(51) double local51 = local45;
			if (local38 != 0.0D) {
				@Pc(65) double local65;
				if (local45 < 0.5D) {
					local65 = local45 * (local38 + 1.0D);
				} else {
					local65 = local38 + local45 - local45 * local38;
				}
				@Pc(80) double local80 = local45 * 2.0D - local65;
				@Pc(84) double local84 = local27 + 0.3333333333333333D;
				if (local84 > 1.0D) {
					local84--;
				}
				@Pc(98) double local98 = local27 - 0.3333333333333333D;
				if (local98 < 0.0D) {
					local98++;
				}
				if (local84 * 6.0D < 1.0D) {
					local47 = (local65 - local80) * 6.0D * local84 + local80;
				} else if (local84 * 2.0D < 1.0D) {
					local47 = local65;
				} else if (local84 * 3.0D < 2.0D) {
					local47 = (0.6666666666666666D - local84) * 6.0D * (local65 - local80) + local80;
				} else {
					local47 = local80;
				}
				if (local27 * 6.0D < 1.0D) {
					local49 = local80 + local27 * (local65 - local80) * 6.0D;
				} else if (local27 * 2.0D < 1.0D) {
					local49 = local65;
				} else if (local27 * 3.0D < 2.0D) {
					local49 = (0.6666666666666666D - local27) * (local65 - local80) * 6.0D + local80;
				} else {
					local49 = local80;
				}
				if (local98 * 6.0D < 1.0D) {
					local51 = local98 * (local65 - local80) * 6.0D + local80;
				} else if (local98 * 2.0D < 1.0D) {
					local51 = local65;
				} else if (local98 * 3.0D < 2.0D) {
					local51 = (0.6666666666666666D - local98) * (local65 - local80) * 6.0D + local80;
				} else {
					local51 = local80;
				}
			}
			local47 = Math.pow(local47, local11);
			local49 = Math.pow(local49, local11);
			local51 = Math.pow(local51, local11);
			@Pc(264) int local264 = (int) (local47 * 256.0D);
			@Pc(269) int local269 = (int) (local49 * 256.0D);
			@Pc(274) int local274 = (int) (local51 * 256.0D);
			@Pc(284) int local284 = local274 + (local269 << 8) + (local264 << 16);
			Class656.anIntArray532[local13] = local284 & 0xFFFFFF;
			@Pc(300) int local300 = (local274 << 16) + (local269 << 8) + local264;
			Class656.anIntArray531[local13] = local300;
		}
	}

	@OriginalMember(owner = "client!xr", name = "ii", descriptor = "(BB)V", line = 4624)
	static final void method32973(@OriginalArg(0) byte arg0) {
		@Pc(3) byte[][][] local3 = client.aClass517_1.method30454();
		if (local3 == null) {
			local3 = new byte[4][client.aClass517_1.method30411()][client.aClass517_1.method30417()];
			client.aClass517_1.method30458(local3);
		}
		for (@Pc(21) int local21 = 0; local21 < 4; local21++) {
			for (@Pc(26) int local26 = 0; local26 < client.aClass517_1.method30411(); local26++) {
				for (@Pc(33) int local33 = 0; local33 < client.aClass517_1.method30417(); local33++) {
					local3[local21][local26][local33] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!xr", name = "fy", descriptor = "(Lclient!yf;I)V", line = 5543)
	static final void method32974(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class656.method33035(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!xr", name = "apq", descriptor = "(Lclient!yf;B)V", line = 12205)
	static final void method32975(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		if (local12 < 0 || local12 > 1) {
			local12 = 0;
		}
		Class205.method25565(local12 == 1);
	}
}
