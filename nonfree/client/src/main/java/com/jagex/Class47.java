package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pg")
public abstract class Class47 {

	@OriginalMember(owner = "client!pg", name = "tf", descriptor = "I")
	public static int anInt1011;

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "()V", line = 6)
	Class47() {
	}

	@OriginalMember(owner = "client!pg", name = "n", descriptor = "()Lclient!pg;", line = 11)
	public static Class47 method9228() {
		try {
			return new Class47_Sub2();
		} catch (@Pc(4) Throwable local4) {
			return new Class47_Sub1();
		}
	}

	@OriginalMember(owner = "client!pg", name = "j", descriptor = "()Lclient!pg;", line = 11)
	public static Class47 method9231() {
		try {
			return new Class47_Sub2();
		} catch (@Pc(4) Throwable local4) {
			return new Class47_Sub1();
		}
	}

	@OriginalMember(owner = "client!pg", name = "e", descriptor = "()Lclient!pg;", line = 11)
	public static Class47 method9235() {
		try {
			return new Class47_Sub2();
		} catch (@Pc(4) Throwable local4) {
			return new Class47_Sub1();
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(J)I", line = 19)
	final int method9222(@OriginalArg(0) long arg0) {
		@Pc(3) long local3 = this.method9224();
		if (local3 > 0L) {
			Class60_Sub11.method13407(local3);
		}
		return this.method9223(arg0);
	}

	@OriginalMember(owner = "client!pg", name = "d", descriptor = "(J)I", line = 19)
	final int method9227(@OriginalArg(0) long arg0) {
		@Pc(3) long local3 = this.method9224();
		if (local3 > 0L) {
			Class60_Sub11.method13407(local3);
		}
		return this.method9223(arg0);
	}

	@OriginalMember(owner = "client!pg", name = "r", descriptor = "(J)I", line = 19)
	final int method9236(@OriginalArg(0) long arg0) {
		@Pc(3) long local3 = this.method9224();
		if (local3 > 0L) {
			Class60_Sub11.method13407(local3);
		}
		return this.method9223(arg0);
	}

	@OriginalMember(owner = "client!pg", name = "x", descriptor = "(Lclient!ym;Ljava/lang/String;ILjava/lang/Throwable;I)V", line = 40)
	public static void method9237(@OriginalArg(0) Class603 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Throwable arg3) {
		Class293.method25561(new Class430(arg0, arg1, arg2, arg3));
	}

	@OriginalMember(owner = "client!pg", name = "g", descriptor = "(I)V")
	abstract void method9221();

	@OriginalMember(owner = "client!pg", name = "h", descriptor = "(J)I")
	abstract int method9223(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!pg", name = "l", descriptor = "(I)J")
	abstract long method9224();

	@OriginalMember(owner = "client!pg", name = "u", descriptor = "()V")
	abstract void method9225();

	@OriginalMember(owner = "client!pg", name = "x", descriptor = "(S)J")
	abstract long method9226();

	@OriginalMember(owner = "client!pg", name = "y", descriptor = "()J")
	abstract long method9229();

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(J)I")
	abstract int method9230(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!pg", name = "z", descriptor = "()J")
	abstract long method9232();

	@OriginalMember(owner = "client!pg", name = "s", descriptor = "()V")
	abstract void method9233();

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "()J")
	abstract long method9234();
}
