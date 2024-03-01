package com.jagex;

import jaclib.ping.IcmpService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ahh")
public class IcmpService_Sub1 extends IcmpService {

	@OriginalMember(owner = "client!ahh", name = "p", descriptor = "Lclient!ahh;")
	static volatile IcmpService_Sub1 anIcmpService_Sub1_1;

	@OriginalMember(owner = "client!ahh", name = "a", descriptor = "Ljava/util/List;")
	final List aList2 = new ArrayList();

	@OriginalMember(owner = "client!ahh", name = "<init>", descriptor = "()V", line = 10)
	IcmpService_Sub1() {
	}

	@OriginalMember(owner = "client!ahh", name = "u", descriptor = "(Lclient!ud;)V", line = 13)
	public static void method12645(@OriginalArg(0) Interface54 arg0) {
		if (anIcmpService_Sub1_1 == null) {
			throw new IllegalStateException("");
		}
		anIcmpService_Sub1_1.aList2.add(arg0);
	}

	@OriginalMember(owner = "client!ahh", name = "y", descriptor = "()Z", line = 19)
	public static boolean method12646() {
		try {
			if (!available()) {
				return false;
			}
		} catch (@Pc(5) Throwable local5) {
			return false;
		}
		if (anIcmpService_Sub1_1 != null) {
			throw new IllegalStateException("");
		}
		anIcmpService_Sub1_1 = new IcmpService_Sub1();
		@Pc(26) Thread local26 = new Thread(new Class504());
		local26.setDaemon(true);
		local26.start();
		return true;
	}

	@OriginalMember(owner = "client!ahh", name = "b", descriptor = "()Z", line = 19)
	public static boolean method12647() {
		try {
			if (!available()) {
				return false;
			}
		} catch (@Pc(5) Throwable local5) {
			return false;
		}
		if (anIcmpService_Sub1_1 != null) {
			throw new IllegalStateException("");
		}
		anIcmpService_Sub1_1 = new IcmpService_Sub1();
		@Pc(26) Thread local26 = new Thread(new Class504());
		local26.setDaemon(true);
		local26.start();
		return true;
	}

	@OriginalMember(owner = "client!ahh", name = "c", descriptor = "()Z", line = 19)
	public static boolean method12648() {
		try {
			if (!available()) {
				return false;
			}
		} catch (@Pc(5) Throwable local5) {
			return false;
		}
		if (anIcmpService_Sub1_1 != null) {
			throw new IllegalStateException("");
		}
		anIcmpService_Sub1_1 = new IcmpService_Sub1();
		@Pc(26) Thread local26 = new Thread(new Class504());
		local26.setDaemon(true);
		local26.start();
		return true;
	}

	@OriginalMember(owner = "client!ahh", name = "z", descriptor = "()V", line = 41)
	public static void method12649() {
		if (anIcmpService_Sub1_1 == null) {
			return;
		}
		try {
			anIcmpService_Sub1_1.quit();
		} catch (@Pc(7) Throwable local7) {
		}
		anIcmpService_Sub1_1 = null;
	}

	@OriginalMember(owner = "client!ahh", name = "notify", descriptor = "(I)V", line = 51)
	@Override
	protected void notify(@OriginalArg(0) int arg0) {
		@Pc(3) Iterator local3 = this.aList2.iterator();
		while (local3.hasNext()) {
			@Pc(10) Interface54 local10 = (Interface54) local3.next();
			local10.method29355(arg0 == 0);
		}
	}

	@OriginalMember(owner = "client!ahh", name = "p", descriptor = "(I)V", line = 51)
	@Override
	protected void p(@OriginalArg(0) int arg0) {
		@Pc(3) Iterator local3 = this.aList2.iterator();
		while (local3.hasNext()) {
			@Pc(10) Interface54 local10 = (Interface54) local3.next();
			local10.method29355(arg0 == 0);
		}
	}

	@OriginalMember(owner = "client!ahh", name = "a", descriptor = "(I)V", line = 51)
	@Override
	protected void a(@OriginalArg(0) int arg0) {
		@Pc(3) Iterator local3 = this.aList2.iterator();
		while (local3.hasNext()) {
			@Pc(10) Interface54 local10 = (Interface54) local3.next();
			local10.method29355(arg0 == 0);
		}
	}

	@OriginalMember(owner = "client!ahh", name = "g", descriptor = "(I)V", line = 51)
	@Override
	protected void g(@OriginalArg(0) int arg0) {
		@Pc(3) Iterator local3 = this.aList2.iterator();
		while (local3.hasNext()) {
			@Pc(10) Interface54 local10 = (Interface54) local3.next();
			local10.method29355(arg0 == 0);
		}
	}

	@OriginalMember(owner = "client!ahh", name = "notify", descriptor = "(III)V", line = 61)
	@Override
	protected void notify(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Iterator local3 = this.aList2.iterator();
		while (local3.hasNext()) {
			@Pc(10) Interface54 local10 = (Interface54) local3.next();
			local10.method29357(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!ahh", name = "l", descriptor = "(III)V", line = 61)
	@Override
	protected void l(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Iterator local3 = this.aList2.iterator();
		while (local3.hasNext()) {
			@Pc(10) Interface54 local10 = (Interface54) local3.next();
			local10.method29357(arg0, arg1, arg2);
		}
	}
}
