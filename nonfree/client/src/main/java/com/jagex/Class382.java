package com.jagex;

import jaclib.ping.Ping;
import java.net.InetAddress;
import java.net.UnknownHostException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!p")
public class Class382 implements Runnable {

	@OriginalMember(owner = "client!p", name = "a", descriptor = "Ljava/net/InetAddress;")
	InetAddress anInetAddress2;

	@OriginalMember(owner = "client!p", name = "p", descriptor = "Ljava/lang/String;")
	String aString214;

	@OriginalMember(owner = "client!p", name = "g", descriptor = "J")
	volatile long aLong270 = 4549285972462212123L;

	@OriginalMember(owner = "client!p", name = "l", descriptor = "Z")
	volatile boolean aBoolean743 = true;

	@OriginalMember(owner = "client!p", name = "<init>", descriptor = "()V", line = 14)
	Class382() {
	}

	@OriginalMember(owner = "client!p", name = "p", descriptor = "(Lclient!ny;Lclient!ny;IS)V", line = 16)
	public static void method27323(@OriginalArg(0) Class359 arg0, @OriginalArg(1) Class359 arg1) {
		Class3_Sub1_Sub17.aClass359_30 = arg0;
		Class238.aClass359_49 = arg1;
	}

	@OriginalMember(owner = "client!p", name = "h", descriptor = "(Ljava/lang/String;)V", line = 17)
	void method27310(@OriginalArg(0) String arg0) {
		this.aString214 = arg0;
		this.anInetAddress2 = null;
		this.aLong270 = 4549285972462212123L;
		if (this.aString214 != null) {
			try {
				this.anInetAddress2 = InetAddress.getByName(this.aString214);
			} catch (@Pc(18) UnknownHostException local18) {
			}
		}
	}

	@OriginalMember(owner = "client!p", name = "p", descriptor = "(Ljava/lang/String;B)V", line = 17)
	void method27314(@OriginalArg(0) String arg0) {
		this.aString214 = arg0;
		this.anInetAddress2 = null;
		this.aLong270 = 4549285972462212123L;
		if (this.aString214 != null) {
			try {
				this.anInetAddress2 = InetAddress.getByName(this.aString214);
			} catch (@Pc(18) UnknownHostException local18) {
			}
		}
	}

	@OriginalMember(owner = "client!p", name = "y", descriptor = "()J", line = 29)
	long method27306() {
		return this.aLong270 * -801772653929080339L;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(I)J", line = 29)
	long method27307() {
		return this.aLong270 * -801772653929080339L;
	}

	@OriginalMember(owner = "client!p", name = "s", descriptor = "()J", line = 29)
	long method27312() {
		return this.aLong270 * -801772653929080339L;
	}

	@OriginalMember(owner = "client!p", name = "u", descriptor = "()J", line = 29)
	long method27313() {
		return this.aLong270 * -801772653929080339L;
	}

	@OriginalMember(owner = "client!p", name = "x", descriptor = "()J", line = 29)
	long method27319() {
		return this.aLong270 * -801772653929080339L;
	}

	@OriginalMember(owner = "client!p", name = "g", descriptor = "(B)V", line = 33)
	void method27308() {
		this.aBoolean743 = false;
	}

	@OriginalMember(owner = "client!p", name = "z", descriptor = "()V", line = 33)
	void method27309() {
		this.aBoolean743 = false;
	}

	@OriginalMember(owner = "client!p", name = "c", descriptor = "()V", line = 33)
	void method27315() {
		this.aBoolean743 = false;
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "()V", line = 33)
	void method27316() {
		this.aBoolean743 = false;
	}

	@OriginalMember(owner = "client!p", name = "run", descriptor = "()V", line = 37)
	@Override
	public void run() {
		while (this.aBoolean743) {
			this.method27305();
		}
	}

	@OriginalMember(owner = "client!p", name = "j", descriptor = "()V", line = 37)
	public void method27317() {
		while (this.aBoolean743) {
			this.method27305();
		}
	}

	@OriginalMember(owner = "client!p", name = "n", descriptor = "()V", line = 37)
	public void method27318() {
		while (this.aBoolean743) {
			this.method27305();
		}
	}

	@OriginalMember(owner = "client!p", name = "l", descriptor = "(B)V", line = 41)
	void method27305() {
		if (this.anInetAddress2 != null) {
			try {
				@Pc(7) byte[] local7 = this.anInetAddress2.getAddress();
				this.aLong270 = (long) Ping.p(local7[0], local7[1], local7[2], local7[3], 10000L) * -4549285972462212123L;
			} catch (@Pc(28) Throwable local28) {
			}
		}
		Class60_Sub11.method13407(1000L);
	}

	@OriginalMember(owner = "client!p", name = "e", descriptor = "()V", line = 41)
	void method27311() {
		if (this.anInetAddress2 != null) {
			try {
				@Pc(7) byte[] local7 = this.anInetAddress2.getAddress();
				this.aLong270 = (long) Ping.p(local7[0], local7[1], local7[2], local7[3], 10000L) * -4549285972462212123L;
			} catch (@Pc(28) Throwable local28) {
			}
		}
		Class60_Sub11.method13407(1000L);
	}

	@OriginalMember(owner = "client!p", name = "i", descriptor = "(Lclient!vs;I)V", line = 118)
	static void method27322(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[arg0.anInt5319 * 960738381 - 1] = Class239.aClass505_1.method29516(arg0.anIntArray496[arg0.anInt5319 * 960738381 - 1]).method29473(Class424.aClass165_1) ? 1 : 0;
	}

	@OriginalMember(owner = "client!p", name = "os", descriptor = "(Lclient!vs;B)V", line = 6672)
	static final void method27320(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class131.method22901(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!p", name = "agi", descriptor = "(Lclient!vs;B)V", line = 10006)
	static final void method27321(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(15) Class3_Sub1_Sub4 local15 = Class557.method32815();
		if (local15 != null) {
			@Pc(35) boolean local35 = local15.method18896(local12 >> 28 & 0x3, local12 >> 14 & 0x3FFF, local12 & 0x3FFF, Class525.anIntArray492);
			if (local35) {
				Class505.method29521(Class525.anIntArray492[1], Class525.anIntArray492[2]);
			}
		}
	}
}
