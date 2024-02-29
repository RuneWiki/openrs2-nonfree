package com.jagex;

import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public abstract class Class101 implements Interface31 {

	@OriginalMember(owner = "client!jb", name = "u", descriptor = "[[[S")
	public static short[][][] aShortArrayArrayArray9;

	@OriginalMember(owner = "client!jb", name = "l", descriptor = "Lclient!dj;")
	Class94 aClass94_6;

	@OriginalMember(owner = "client!jb", name = "y", descriptor = "I")
	int anInt2863;

	@OriginalMember(owner = "client!jb", name = "w", descriptor = "J")
	long aLong124;

	@OriginalMember(owner = "client!jb", name = "p", descriptor = "Lclient!pw;")
	final Class478 aClass478_81;

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "Lclient!pw;")
	final Class478 aClass478_80;

	@OriginalMember(owner = "client!jb", name = "v", descriptor = "Lclient!mq;")
	final Class118 aClass118_5;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lclient!pw;Lclient!pw;Lclient!mq;)V", line = 19)
	Class101(@OriginalArg(0) Class478 arg0, @OriginalArg(1) Class478 arg1, @OriginalArg(2) Class118 arg2) {
		this.aClass478_81 = arg0;
		this.aClass478_80 = arg1;
		this.aClass118_5 = arg2;
	}

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "(ZB)V", line = 26)
	@Override
	public void method27921(@OriginalArg(0) boolean arg0) {
		@Pc(19) int local19 = this.aClass118_5.aClass410_8.method28569(this.aClass118_5.anInt2922 * -1607607997, client.anInt3394 * -321474631) + this.aClass118_5.anInt2926 * -2127596367;
		@Pc(39) int local39 = this.aClass118_5.aClass402_8.method28502(this.aClass118_5.anInt2923 * -228886179, client.anInt3464 * 43072843) + this.aClass118_5.anInt2920 * -1055236307;
		this.method20890(arg0, local19, local39);
		this.method20891(arg0, local19, local39);
		@Pc(55) String local55 = Class307.aClass327_1.method27562();
		if (Class280.method26667() - this.aLong124 * -7109297695834388303L > 10000L) {
			local55 = local55 + " (" + Class307.aClass327_1.method27567().anInt4077 * -1262216053 + ")";
		}
		this.aClass94_6.method7612(local55, local19 + this.aClass118_5.anInt2922 * -1607607997 / 2, this.aClass118_5.anInt2924 * -81046249 + 4 + local39 + this.aClass118_5.anInt2923 * -228886179 / 2, this.aClass118_5.anInt2921 * 1210620409, -1);
	}

	@OriginalMember(owner = "client!jb", name = "l", descriptor = "(Z)V", line = 26)
	@Override
	public void method27918(@OriginalArg(0) boolean arg0) {
		@Pc(19) int local19 = this.aClass118_5.aClass410_8.method28569(this.aClass118_5.anInt2922 * -1607607997, client.anInt3394 * -321474631) + this.aClass118_5.anInt2926 * -2127596367;
		@Pc(39) int local39 = this.aClass118_5.aClass402_8.method28502(this.aClass118_5.anInt2923 * -228886179, client.anInt3464 * 43072843) + this.aClass118_5.anInt2920 * -1055236307;
		this.method20890(arg0, local19, local39);
		this.method20891(arg0, local19, local39);
		@Pc(55) String local55 = Class307.aClass327_1.method27562();
		if (Class280.method26667() - this.aLong124 * -7109297695834388303L > 10000L) {
			local55 = local55 + " (" + Class307.aClass327_1.method27567().anInt4077 * -1262216053 + ")";
		}
		this.aClass94_6.method7612(local55, local19 + this.aClass118_5.anInt2922 * -1607607997 / 2, this.aClass118_5.anInt2924 * -81046249 + 4 + local39 + this.aClass118_5.anInt2923 * -228886179 / 2, this.aClass118_5.anInt2921 * 1210620409, -1);
	}

	@OriginalMember(owner = "client!jb", name = "y", descriptor = "()V", line = 36)
	@Override
	public void method27919() {
		@Pc(10) Class17 local10 = Class21.method418(this.aClass478_80, this.aClass118_5.anInt2925 * -120853723, Class367.aClass415_1);
		this.aClass94_6 = Class284.aClass86_9.method20111(local10, Class210.method25600(this.aClass478_81, this.aClass118_5.anInt2925 * -120853723), true);
	}

	@OriginalMember(owner = "client!jb", name = "p", descriptor = "(S)V", line = 36)
	@Override
	public void method27917() {
		@Pc(10) Class17 local10 = Class21.method418(this.aClass478_80, this.aClass118_5.anInt2925 * -120853723, Class367.aClass415_1);
		this.aClass94_6 = Class284.aClass86_9.method20111(local10, Class210.method25600(this.aClass478_81, this.aClass118_5.anInt2925 * -120853723), true);
	}

	@OriginalMember(owner = "client!jb", name = "x", descriptor = "()Z", line = 41)
	@Override
	public boolean method27923() {
		@Pc(1) boolean local1 = true;
		if (!this.aClass478_81.method29730(this.aClass118_5.anInt2925 * -120853723)) {
			local1 = false;
		}
		if (!this.aClass478_80.method29730(this.aClass118_5.anInt2925 * -120853723)) {
			local1 = false;
		}
		return local1;
	}

	@OriginalMember(owner = "client!jb", name = "t", descriptor = "()Z", line = 41)
	@Override
	public boolean method27924() {
		@Pc(1) boolean local1 = true;
		if (!this.aClass478_81.method29730(this.aClass118_5.anInt2925 * -120853723)) {
			local1 = false;
		}
		if (!this.aClass478_80.method29730(this.aClass118_5.anInt2925 * -120853723)) {
			local1 = false;
		}
		return local1;
	}

	@OriginalMember(owner = "client!jb", name = "q", descriptor = "()Z", line = 41)
	@Override
	public boolean method27916() {
		@Pc(1) boolean local1 = true;
		if (!this.aClass478_81.method29730(this.aClass118_5.anInt2925 * -120853723)) {
			local1 = false;
		}
		if (!this.aClass478_80.method29730(this.aClass118_5.anInt2925 * -120853723)) {
			local1 = false;
		}
		return local1;
	}

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "()Z", line = 41)
	@Override
	public boolean method27922() {
		@Pc(1) boolean local1 = true;
		if (!this.aClass478_81.method29730(this.aClass118_5.anInt2925 * -120853723)) {
			local1 = false;
		}
		if (!this.aClass478_80.method29730(this.aClass118_5.anInt2925 * -120853723)) {
			local1 = false;
		}
		return local1;
	}

	@OriginalMember(owner = "client!jb", name = "v", descriptor = "(I)Z", line = 41)
	@Override
	public boolean method27915() {
		@Pc(1) boolean local1 = true;
		if (!this.aClass478_81.method29730(this.aClass118_5.anInt2925 * -120853723)) {
			local1 = false;
		}
		if (!this.aClass478_80.method29730(this.aClass118_5.anInt2925 * -120853723)) {
			local1 = false;
		}
		return local1;
	}

	@OriginalMember(owner = "client!jb", name = "w", descriptor = "()Z", line = 41)
	@Override
	public boolean method27920() {
		@Pc(1) boolean local1 = true;
		if (!this.aClass478_81.method29730(this.aClass118_5.anInt2925 * -120853723)) {
			local1 = false;
		}
		if (!this.aClass478_80.method29730(this.aClass118_5.anInt2925 * -120853723)) {
			local1 = false;
		}
		return local1;
	}

	@OriginalMember(owner = "client!jb", name = "g", descriptor = "(B)I", line = 51)
	int method20884() {
		@Pc(3) int local3 = Class307.aClass327_1.method27559();
		@Pc(7) int local7 = local3 * 100;
		if (this.anInt2863 * 2118526551 == local3 && local3 != 0) {
			@Pc(20) int local20 = Class307.aClass327_1.method27557();
			if (local20 > local3) {
				@Pc(32) long local32 = this.aLong124 * -7109297695834388303L - Class307.aClass327_1.method27566();
				if (local32 > 0L) {
					@Pc(48) long local48 = local32 * 10000L / (long) local3 * (long) (local20 - local3);
					@Pc(58) long local58 = (Class280.method26667() - this.aLong124 * -7109297695834388303L) * 10000L;
					if (local58 < local48) {
						local7 = (int) (local58 * 100L * (long) (local20 - local3) / local48 + (long) (local3 * 100));
					} else {
						local7 = local20 * 100;
					}
				}
			}
		} else {
			this.anInt2863 = local3 * 1713644903;
			this.aLong124 = Class280.method26667() * 8000396240611147857L;
		}
		return local7;
	}

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "()I", line = 51)
	int method20885() {
		@Pc(3) int local3 = Class307.aClass327_1.method27559();
		@Pc(7) int local7 = local3 * 100;
		if (this.anInt2863 * 2118526551 == local3 && local3 != 0) {
			@Pc(20) int local20 = Class307.aClass327_1.method27557();
			if (local20 > local3) {
				@Pc(32) long local32 = this.aLong124 * -7109297695834388303L - Class307.aClass327_1.method27566();
				if (local32 > 0L) {
					@Pc(48) long local48 = local32 * 10000L / (long) local3 * (long) (local20 - local3);
					@Pc(58) long local58 = (Class280.method26667() - this.aLong124 * -7109297695834388303L) * 10000L;
					if (local58 < local48) {
						local7 = (int) (local58 * 100L * (long) (local20 - local3) / local48 + (long) (local3 * 100));
					} else {
						local7 = local20 * 100;
					}
				}
			}
		} else {
			this.anInt2863 = local3 * 1713644903;
			this.aLong124 = Class280.method26667() * 8000396240611147857L;
		}
		return local7;
	}

	@OriginalMember(owner = "client!jb", name = "f", descriptor = "()I", line = 51)
	int method20886() {
		@Pc(3) int local3 = Class307.aClass327_1.method27559();
		@Pc(7) int local7 = local3 * 100;
		if (this.anInt2863 * 2118526551 == local3 && local3 != 0) {
			@Pc(20) int local20 = Class307.aClass327_1.method27557();
			if (local20 > local3) {
				@Pc(32) long local32 = this.aLong124 * -7109297695834388303L - Class307.aClass327_1.method27566();
				if (local32 > 0L) {
					@Pc(48) long local48 = local32 * 10000L / (long) local3 * (long) (local20 - local3);
					@Pc(58) long local58 = (Class280.method26667() - this.aLong124 * -7109297695834388303L) * 10000L;
					if (local58 < local48) {
						local7 = (int) (local58 * 100L * (long) (local20 - local3) / local48 + (long) (local3 * 100));
					} else {
						local7 = local20 * 100;
					}
				}
			}
		} else {
			this.anInt2863 = local3 * 1713644903;
			this.aLong124 = Class280.method26667() * 8000396240611147857L;
		}
		return local7;
	}

	@OriginalMember(owner = "client!jb", name = "jh", descriptor = "(Lclient!ae;I)Z", line = 6348)
	static final boolean method20887(@OriginalArg(0) Class82 arg0) {
		try {
			return Class197.method25474(arg0);
		} catch (@Pc(4) IOException local4) {
			if (client.anInt3390 * -1850530127 == 7) {
				arg0.method2016();
				return false;
			} else {
				Class520.method30572();
				return true;
			}
		} catch (@Pc(19) Exception local19) {
			@Pc(23) Class595 local23 = client.aClass517_1.method30409();
			@Pc(98) String local98 = (arg0.aClass418_1 == null ? -1 : arg0.aClass418_1.anInt4722 * -1228959953) + Class184.aString133 + (arg0.aClass418_3 == null ? -1 : arg0.aClass418_3.anInt4722 * -1228959953) + Class184.aString133 + (arg0.aClass418_2 == null ? -1 : arg0.aClass418_2.anInt4722 * -1228959953) + " " + arg0.anInt327 * -1013636781 + Class184.aString133 + (local23.anInt5504 * -424199969 + Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.anIntArray274[0]) + Class184.aString133 + (local23.anInt5506 * -1166289421 + Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.anIntArray275[0]) + " ";
			for (@Pc(100) int local100 = 0; local100 < arg0.anInt327 * -1013636781 && local100 < 50; local100++) {
				local98 = local98 + arg0.aClass77_Sub39_Sub1_1.aByteArray53[local100] + Class184.aString133;
			}
			Class293.method27014(local98, local19);
			Class619.method32395(false);
			return true;
		}
	}

	@OriginalMember(owner = "client!jb", name = "np", descriptor = "(Lclient!yf;I)V", line = 6996)
	static final void method20888(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class131.method23062(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!jb", name = "j", descriptor = "(ZII)V")
	abstract void method20889(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!jb", name = "s", descriptor = "(ZIIS)V")
	abstract void method20890(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!jb", name = "r", descriptor = "(ZIIB)V")
	abstract void method20891(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!jb", name = "u", descriptor = "(ZII)V")
	abstract void method20892(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!jb", name = "z", descriptor = "(ZII)V")
	abstract void method20893(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!jb", name = "i", descriptor = "(ZII)V")
	abstract void method20894(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!jb", name = "k", descriptor = "(ZII)V")
	abstract void method20895(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);
}
