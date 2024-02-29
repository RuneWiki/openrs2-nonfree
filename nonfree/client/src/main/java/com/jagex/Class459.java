package com.jagex;

import jaclib.ping.Ping;
import java.net.InetAddress;
import java.net.UnknownHostException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!p")
public class Class459 implements Runnable {

	@OriginalMember(owner = "client!p", name = "p", descriptor = "Ljava/lang/String;")
	String aString215;

	@OriginalMember(owner = "client!p", name = "c", descriptor = "Ljava/net/InetAddress;")
	InetAddress anInetAddress2;

	@OriginalMember(owner = "client!p", name = "v", descriptor = "J")
	volatile long aLong276 = 7672106161660382005L;

	@OriginalMember(owner = "client!p", name = "l", descriptor = "Z")
	volatile boolean aBoolean752 = true;

	@OriginalMember(owner = "client!p", name = "<init>", descriptor = "()V", line = 14)
	Class459() {
	}

	@OriginalMember(owner = "client!p", name = "p", descriptor = "(Ljava/lang/String;B)V", line = 17)
	void method29501(@OriginalArg(0) String arg0) {
		this.aString215 = arg0;
		this.anInetAddress2 = null;
		this.aLong276 = 7672106161660382005L;
		if (this.aString215 != null) {
			try {
				this.anInetAddress2 = InetAddress.getByName(this.aString215);
			} catch (@Pc(18) UnknownHostException local18) {
			}
		}
	}

	@OriginalMember(owner = "client!p", name = "y", descriptor = "(Ljava/lang/String;)V", line = 17)
	void method29502(@OriginalArg(0) String arg0) {
		this.aString215 = arg0;
		this.anInetAddress2 = null;
		this.aLong276 = 7672106161660382005L;
		if (this.aString215 != null) {
			try {
				this.anInetAddress2 = InetAddress.getByName(this.aString215);
			} catch (@Pc(18) UnknownHostException local18) {
			}
		}
	}

	@OriginalMember(owner = "client!p", name = "w", descriptor = "(Ljava/lang/String;)V", line = 17)
	void method29503(@OriginalArg(0) String arg0) {
		this.aString215 = arg0;
		this.anInetAddress2 = null;
		this.aLong276 = 7672106161660382005L;
		if (this.aString215 != null) {
			try {
				this.anInetAddress2 = InetAddress.getByName(this.aString215);
			} catch (@Pc(18) UnknownHostException local18) {
			}
		}
	}

	@OriginalMember(owner = "client!p", name = "p", descriptor = "(II)Lclient!hy;", line = 17)
	public static Class312 method29504(@OriginalArg(0) int arg0) {
		if (arg0 == Class312.aClass312_2.anInt4062 * -1821981511) {
			return Class312.aClass312_2;
		} else if (Class312.aClass312_3.anInt4062 * -1821981511 == arg0) {
			return Class312.aClass312_3;
		} else if (arg0 == Class312.aClass312_4.anInt4062 * -1821981511) {
			return Class312.aClass312_4;
		} else if (arg0 == Class312.aClass312_5.anInt4062 * -1821981511) {
			return Class312.aClass312_5;
		} else if (Class312.aClass312_6.anInt4062 * -1821981511 == arg0) {
			return Class312.aClass312_6;
		} else if (Class312.aClass312_7.anInt4062 * -1821981511 == arg0) {
			return Class312.aClass312_7;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!p", name = "c", descriptor = "(ZZI)V", line = 26)
	public static void method29505(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (arg0) {
			Class656.anInt5766 -= 194044063;
			if (Class656.anInt5766 * -477611169 == 0) {
				Class424.anIntArray462 = null;
			}
		}
		if (arg1) {
			Class656.anInt5767 -= 555410307;
			if (Class656.anInt5767 * -68828373 == 0) {
				Class656.anIntArray532 = null;
			}
		}
	}

	@OriginalMember(owner = "client!p", name = "c", descriptor = "(B)J", line = 29)
	long method29506() {
		return this.aLong276 * -2314207964387602205L;
	}

	@OriginalMember(owner = "client!p", name = "t", descriptor = "()J", line = 29)
	long method29507() {
		return this.aLong276 * -2314207964387602205L;
	}

	@OriginalMember(owner = "client!p", name = "q", descriptor = "()J", line = 29)
	long method29508() {
		return this.aLong276 * -2314207964387602205L;
	}

	@OriginalMember(owner = "client!p", name = "x", descriptor = "()J", line = 29)
	long method29509() {
		return this.aLong276 * -2314207964387602205L;
	}

	@OriginalMember(owner = "client!p", name = "d", descriptor = "()V", line = 33)
	void method29510() {
		this.aBoolean752 = false;
	}

	@OriginalMember(owner = "client!p", name = "s", descriptor = "()V", line = 33)
	void method29511() {
		this.aBoolean752 = false;
	}

	@OriginalMember(owner = "client!p", name = "v", descriptor = "(I)V", line = 33)
	void method29512() {
		this.aBoolean752 = false;
	}

	@OriginalMember(owner = "client!p", name = "run", descriptor = "()V", line = 37)
	@Override
	public void run() {
		while (this.aBoolean752) {
			this.method29515();
		}
	}

	@OriginalMember(owner = "client!p", name = "g", descriptor = "()V", line = 37)
	public void method29513() {
		while (this.aBoolean752) {
			this.method29515();
		}
	}

	@OriginalMember(owner = "client!p", name = "r", descriptor = "()V", line = 37)
	public void method29514() {
		while (this.aBoolean752) {
			this.method29515();
		}
	}

	@OriginalMember(owner = "client!p", name = "l", descriptor = "(I)V", line = 41)
	void method29515() {
		if (this.anInetAddress2 != null) {
			try {
				@Pc(7) byte[] local7 = this.anInetAddress2.getAddress();
				this.aLong276 = (long) Ping.p(local7[0], local7[1], local7[2], local7[3], 10000L) * -7672106161660382005L;
			} catch (@Pc(28) Throwable local28) {
			}
		}
		Class281.method26679(1000L);
	}

	@OriginalMember(owner = "client!p", name = "j", descriptor = "()V", line = 41)
	void method29516() {
		if (this.anInetAddress2 != null) {
			try {
				@Pc(7) byte[] local7 = this.anInetAddress2.getAddress();
				this.aLong276 = (long) Ping.p(local7[0], local7[1], local7[2], local7[3], 10000L) * -7672106161660382005L;
			} catch (@Pc(28) Throwable local28) {
			}
		}
		Class281.method26679(1000L);
	}

	@OriginalMember(owner = "client!p", name = "z", descriptor = "()V", line = 41)
	void method29517() {
		if (this.anInetAddress2 != null) {
			try {
				@Pc(7) byte[] local7 = this.anInetAddress2.getAddress();
				this.aLong276 = (long) Ping.p(local7[0], local7[1], local7[2], local7[3], 10000L) * -7672106161660382005L;
			} catch (@Pc(28) Throwable local28) {
			}
		}
		Class281.method26679(1000L);
	}

	@OriginalMember(owner = "client!p", name = "iw", descriptor = "(Lclient!yf;B)V", line = 5997)
	static final void method29518(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class25.method457(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!p", name = "axi", descriptor = "(Lclient!yf;B)V", line = 13375)
	static final void method29519(@OriginalArg(0) Class665 arg0) {
		@Pc(4) Class532 local4 = arg0.aClass104_Sub1_Sub1_Sub1_4.method21143();
		if (local4 == null) {
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = "";
		} else {
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = local4.method30744();
		}
	}
}
