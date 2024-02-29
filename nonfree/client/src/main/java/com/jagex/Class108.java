package com.jagex;

import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!it")
public abstract class Class108 implements Interface5 {

	@OriginalMember(owner = "client!it", name = "aw", descriptor = "I")
	public static int anInt1050;

	@OriginalMember(owner = "client!it", name = "xi", descriptor = "Ljava/util/Iterator;")
	static Iterator anIterator2;

	@OriginalMember(owner = "client!it", name = "e", descriptor = "Lclient!eo;")
	static Interface24 anInterface24_11;

	@OriginalMember(owner = "client!it", name = "w", descriptor = "I")
	int anInt1049;

	@OriginalMember(owner = "client!it", name = "l", descriptor = "Lclient!er;")
	final Class232 aClass232_15 = new Class232(50);

	@OriginalMember(owner = "client!it", name = "y", descriptor = "Lclient!er;")
	final Class232 aClass232_14 = new Class232(5);

	@OriginalMember(owner = "client!it", name = "c", descriptor = "Z")
	boolean aBoolean195;

	@OriginalMember(owner = "client!it", name = "v", descriptor = "Lclient!pw;")
	final Class478 aClass478_32;

	@OriginalMember(owner = "client!it", name = "p", descriptor = "Lclient!ym;")
	final Class670 aClass670_2;

	@OriginalMember(owner = "client!it", name = "t", descriptor = "[Ljava/lang/String;")
	final String[] aStringArray15;

	@OriginalMember(owner = "client!it", name = "p", descriptor = "(I)V", line = 30)
	static void method9021() {
		Class319.aClass232_76.method25850();
	}

	@OriginalMember(owner = "client!it", name = "t", descriptor = "(III)Z", line = 58)
	public static boolean method9022(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Class637.aClass117_6 == null || Class637.aClass117_6.method10880() == null) {
			return false;
		} else if (arg1 == arg0) {
			return true;
		} else {
			@Pc(19) Class399 local19 = Class637.aClass117_6.method10880().method28306(arg0);
			@Pc(26) Class399 local26 = Class637.aClass117_6.method10880().method28306(arg1);
			@Pc(28) Class399 local28 = local19;
			do {
				if (local28 == null) {
					local28 = local26;
					do {
						if (local28 == null) {
							return false;
						}
						local28 = local28.method28474();
						if (local28 == local19) {
							return true;
						}
					} while (local26 != local28);
					return false;
				}
				local28 = local28.method28474();
				if (local26 == local28) {
					return true;
				}
			} while (local19 != local28);
			return false;
		}
	}

	@OriginalMember(owner = "client!it", name = "bf", descriptor = "(IIB)B", line = 79)
	static byte method9023(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Class593.aClass593_6.anInt5501 * 847393323 == arg0) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!it", name = "<init>", descriptor = "(ZLclient!pw;Lclient!yi;Lclient!ym;)V", line = 704)
	Class108(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class478 arg1, @OriginalArg(2) Class667 arg2, @OriginalArg(3) Class670 arg3) {
		this.aBoolean195 = arg0;
		this.aClass478_32 = arg1;
		this.aClass670_2 = arg3;
		if (Class670.aClass670_5 == this.aClass670_2) {
			this.aStringArray15 = new String[] { null, null, null, null, null, Class44.aClass44_129.method713(arg2) };
		} else {
			this.aStringArray15 = new String[] { null, null, null, null, null, null };
		}
	}

	@OriginalMember(owner = "client!it", name = "p", descriptor = "(ZI)V", line = 713)
	void method9024(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean195 != arg0) {
			this.aBoolean195 = arg0;
			this.method9030();
		}
	}

	@OriginalMember(owner = "client!it", name = "w", descriptor = "(Z)V", line = 713)
	void method9025(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean195 != arg0) {
			this.aBoolean195 = arg0;
			this.method9030();
		}
	}

	@OriginalMember(owner = "client!it", name = "c", descriptor = "(IB)V", line = 719)
	void method9026(@OriginalArg(0) int arg0) {
		this.anInt1049 = arg0 * -880237489;
		@Pc(8) Class232 local8 = this.aClass232_15;
		synchronized (this.aClass232_15) {
			this.aClass232_15.method25850();
		}
		local8 = this.aClass232_14;
		synchronized (this.aClass232_14) {
			this.aClass232_14.method25850();
		}
	}

	@OriginalMember(owner = "client!it", name = "t", descriptor = "(I)V", line = 719)
	void method9027(@OriginalArg(0) int arg0) {
		this.anInt1049 = arg0 * -880237489;
		@Pc(8) Class232 local8 = this.aClass232_15;
		synchronized (this.aClass232_15) {
			this.aClass232_15.method25850();
		}
		local8 = this.aClass232_14;
		synchronized (this.aClass232_14) {
			this.aClass232_14.method25850();
		}
	}

	@OriginalMember(owner = "client!it", name = "q", descriptor = "(I)V", line = 719)
	void method9028(@OriginalArg(0) int arg0) {
		this.anInt1049 = arg0 * -880237489;
		@Pc(8) Class232 local8 = this.aClass232_15;
		synchronized (this.aClass232_15) {
			this.aClass232_15.method25850();
		}
		local8 = this.aClass232_14;
		synchronized (this.aClass232_14) {
			this.aClass232_14.method25850();
		}
	}

	@OriginalMember(owner = "client!it", name = "x", descriptor = "()V", line = 729)
	void method9029() {
		@Pc(3) Class232 local3 = this.aClass232_15;
		synchronized (this.aClass232_15) {
			this.aClass232_15.method25850();
		}
		local3 = this.aClass232_14;
		synchronized (this.aClass232_14) {
			this.aClass232_14.method25850();
		}
	}

	@OriginalMember(owner = "client!it", name = "v", descriptor = "(I)V", line = 729)
	void method9030() {
		@Pc(3) Class232 local3 = this.aClass232_15;
		synchronized (this.aClass232_15) {
			this.aClass232_15.method25850();
		}
		local3 = this.aClass232_14;
		synchronized (this.aClass232_14) {
			this.aClass232_14.method25850();
		}
	}

	@OriginalMember(owner = "client!it", name = "f", descriptor = "(I)V", line = 738)
	void method9031(@OriginalArg(0) int arg0) {
		@Pc(3) Class232 local3 = this.aClass232_15;
		synchronized (this.aClass232_15) {
			this.aClass232_15.method25847(arg0);
		}
		local3 = this.aClass232_14;
		synchronized (this.aClass232_14) {
			this.aClass232_14.method25847(arg0);
		}
	}

	@OriginalMember(owner = "client!it", name = "u", descriptor = "(I)V", line = 738)
	void method9032(@OriginalArg(0) int arg0) {
		@Pc(3) Class232 local3 = this.aClass232_15;
		synchronized (this.aClass232_15) {
			this.aClass232_15.method25847(arg0);
		}
		local3 = this.aClass232_14;
		synchronized (this.aClass232_14) {
			this.aClass232_14.method25847(arg0);
		}
	}

	@OriginalMember(owner = "client!it", name = "l", descriptor = "(IB)V", line = 738)
	void method9033(@OriginalArg(0) int arg0) {
		@Pc(3) Class232 local3 = this.aClass232_15;
		synchronized (this.aClass232_15) {
			this.aClass232_15.method25847(arg0);
		}
		local3 = this.aClass232_14;
		synchronized (this.aClass232_14) {
			this.aClass232_14.method25847(arg0);
		}
	}

	@OriginalMember(owner = "client!it", name = "e", descriptor = "(I)V", line = 738)
	void method9034(@OriginalArg(0) int arg0) {
		@Pc(3) Class232 local3 = this.aClass232_15;
		synchronized (this.aClass232_15) {
			this.aClass232_15.method25847(arg0);
		}
		local3 = this.aClass232_14;
		synchronized (this.aClass232_14) {
			this.aClass232_14.method25847(arg0);
		}
	}

	@OriginalMember(owner = "client!it", name = "k", descriptor = "(I)V", line = 738)
	void method9035(@OriginalArg(0) int arg0) {
		@Pc(3) Class232 local3 = this.aClass232_15;
		synchronized (this.aClass232_15) {
			this.aClass232_15.method25847(arg0);
		}
		local3 = this.aClass232_14;
		synchronized (this.aClass232_14) {
			this.aClass232_14.method25847(arg0);
		}
	}

	@OriginalMember(owner = "client!it", name = "y", descriptor = "(I)V", line = 747)
	void method9036() {
		@Pc(3) Class232 local3 = this.aClass232_15;
		synchronized (this.aClass232_15) {
			this.aClass232_15.method25857();
		}
		local3 = this.aClass232_14;
		synchronized (this.aClass232_14) {
			this.aClass232_14.method25857();
		}
	}

	@OriginalMember(owner = "client!it", name = "b", descriptor = "()V", line = 747)
	void method9037() {
		@Pc(3) Class232 local3 = this.aClass232_15;
		synchronized (this.aClass232_15) {
			this.aClass232_15.method25857();
		}
		local3 = this.aClass232_14;
		synchronized (this.aClass232_14) {
			this.aClass232_14.method25857();
		}
	}

	@OriginalMember(owner = "client!it", name = "o", descriptor = "()V", line = 747)
	void method9038() {
		@Pc(3) Class232 local3 = this.aClass232_15;
		synchronized (this.aClass232_15) {
			this.aClass232_15.method25857();
		}
		local3 = this.aClass232_14;
		synchronized (this.aClass232_14) {
			this.aClass232_14.method25857();
		}
	}

	@OriginalMember(owner = "client!it", name = "eh", descriptor = "(II)V", line = 840)
	static void method9039(@OriginalArg(0) int arg0) {
		Class349.anInt4496 = arg0 * 980626489;
		Class136_Sub1.anInt1704 = -2017528667;
		Class136_Sub1.anInt1704 = -2017528667;
		Class608.method32139();
	}

	@OriginalMember(owner = "client!it", name = "hy", descriptor = "(Lclient!agh;B)V", line = 4090)
	static final void method9040(@OriginalArg(0) Class104_Sub1_Sub1_Sub1 arg0) {
		if (arg0.anIntArray276 == null && arg0.anIntArray267 == null) {
			return;
		}
		@Pc(10) boolean local10 = true;
		@Pc(14) Class595 local14 = client.aClass517_1.method30409();
		for (@Pc(16) int local16 = 0; local16 < arg0.anIntArray276.length; local16++) {
			@Pc(23) int local23 = -1;
			if (arg0.anIntArray276 != null) {
				local23 = arg0.anIntArray276[local16];
			}
			if (local23 != -1) {
				local10 = false;
				@Pc(47) boolean local47 = false;
				@Pc(49) boolean local49 = false;
				@Pc(53) Class447 local53 = arg0.method24085().aClass447_61;
				@Pc(62) int local62;
				@Pc(85) int local85;
				@Pc(100) int local100;
				if ((local23 & -1073741824) == -1073741824) {
					local62 = local23 & 0xFFFFFFF;
					@Pc(66) int local66 = local62 >> 14;
					@Pc(70) int local70 = local62 & 0x3FFF;
					local85 = (int) local53.aFloat277 - ((local66 - local14.anInt5504 * -424199969) * 512 + 256);
					local100 = (int) local53.aFloat278 - ((local70 - local14.anInt5506 * -1166289421) * 512 + 256);
				} else {
					@Pc(121) Class447 local121;
					if ((local23 & 0x8000) == 0) {
						@Pc(152) Class77_Sub6 local152 = (Class77_Sub6) client.aClass12_22.method173((long) local23);
						if (local152 == null) {
							arg0.method21075(local16, -1);
							continue;
						}
						@Pc(159) Class104_Sub1_Sub1_Sub1_Sub1 local159 = (Class104_Sub1_Sub1_Sub1_Sub1) local152.anObject5;
						local121 = local159.method24085().aClass447_61;
						local85 = (int) local53.aFloat277 - (int) local121.aFloat277;
						local100 = (int) local53.aFloat278 - (int) local121.aFloat278;
					} else {
						local62 = local23 & 0x7FFF;
						@Pc(114) Class104_Sub1_Sub1_Sub1_Sub2 local114 = client.aClass104_Sub1_Sub1_Sub1_Sub2Array1[local62];
						if (local114 == null) {
							arg0.method21075(local16, -1);
							continue;
						}
						local121 = local114.method24085().aClass447_61;
						local85 = (int) local53.aFloat277 - (int) local121.aFloat277;
						local100 = (int) local53.aFloat278 - (int) local121.aFloat278;
					}
				}
				if (local85 != 0 || local100 != 0) {
					arg0.method21075(local16, (int) (Math.atan2((double) local85, (double) local100) * 2607.5945876176133D) & 0x3FFF);
				}
			} else if (!arg0.method21075(local16, -1)) {
				local10 = false;
			}
		}
		if (local10) {
			arg0.anIntArray276 = null;
			arg0.anIntArray267 = null;
		}
	}

	@OriginalMember(owner = "client!it", name = "zp", descriptor = "(Lclient!yf;I)V", line = 9092)
	static final void method9041(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = client.aClass243_1 == null ? 0 : 1;
	}
}
