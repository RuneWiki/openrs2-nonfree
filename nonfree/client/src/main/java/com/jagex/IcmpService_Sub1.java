package com.jagex;

import jaclib.ping.IcmpService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!alt")
public class IcmpService_Sub1 extends IcmpService {

	@OriginalMember(owner = "client!alt", name = "p", descriptor = "Lclient!alt;")
	static volatile IcmpService_Sub1 anIcmpService_Sub1_1;

	@OriginalMember(owner = "client!alt", name = "c", descriptor = "Ljava/util/List;")
	final List aList2 = new ArrayList();

	@OriginalMember(owner = "client!alt", name = "<init>", descriptor = "()V", line = 10)
	IcmpService_Sub1() {
	}

	@OriginalMember(owner = "client!alt", name = "q", descriptor = "(Lclient!xd;)V", line = 13)
	public static void method15414(@OriginalArg(0) Interface73 arg0) {
		if (anIcmpService_Sub1_1 == null) {
			throw new IllegalStateException("");
		}
		anIcmpService_Sub1_1.aList2.add(arg0);
	}

	@OriginalMember(owner = "client!alt", name = "x", descriptor = "()V", line = 41)
	public static void method15415() {
		if (anIcmpService_Sub1_1 == null) {
			return;
		}
		try {
			anIcmpService_Sub1_1.quit();
		} catch (@Pc(7) Throwable local7) {
		}
		anIcmpService_Sub1_1 = null;
	}

	@OriginalMember(owner = "client!alt", name = "d", descriptor = "()V", line = 41)
	public static void method15416() {
		if (anIcmpService_Sub1_1 == null) {
			return;
		}
		try {
			anIcmpService_Sub1_1.quit();
		} catch (@Pc(7) Throwable local7) {
		}
		anIcmpService_Sub1_1 = null;
	}

	@OriginalMember(owner = "client!alt", name = "s", descriptor = "()V", line = 41)
	public static void method15417() {
		if (anIcmpService_Sub1_1 == null) {
			return;
		}
		try {
			anIcmpService_Sub1_1.quit();
		} catch (@Pc(7) Throwable local7) {
		}
		anIcmpService_Sub1_1 = null;
	}

	@OriginalMember(owner = "client!alt", name = "p", descriptor = "(I)V", line = 51)
	@Override
	protected void p(@OriginalArg(0) int arg0) {
		@Pc(3) Iterator local3 = this.aList2.iterator();
		while (local3.hasNext()) {
			@Pc(10) Interface73 local10 = (Interface73) local3.next();
			local10.method32824(arg0 == 0);
		}
	}

	@OriginalMember(owner = "client!alt", name = "notify", descriptor = "(I)V", line = 51)
	@Override
	protected void notify(@OriginalArg(0) int arg0) {
		@Pc(3) Iterator local3 = this.aList2.iterator();
		while (local3.hasNext()) {
			@Pc(10) Interface73 local10 = (Interface73) local3.next();
			local10.method32824(arg0 == 0);
		}
	}

	@OriginalMember(owner = "client!alt", name = "c", descriptor = "(I)V", line = 51)
	@Override
	protected void c(@OriginalArg(0) int arg0) {
		@Pc(3) Iterator local3 = this.aList2.iterator();
		while (local3.hasNext()) {
			@Pc(10) Interface73 local10 = (Interface73) local3.next();
			local10.method32824(arg0 == 0);
		}
	}

	@OriginalMember(owner = "client!alt", name = "notify", descriptor = "(III)V", line = 61)
	@Override
	protected void notify(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Iterator local3 = this.aList2.iterator();
		while (local3.hasNext()) {
			@Pc(10) Interface73 local10 = (Interface73) local3.next();
			local10.method32819(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!alt", name = "l", descriptor = "(III)V", line = 61)
	@Override
	protected void l(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Iterator local3 = this.aList2.iterator();
		while (local3.hasNext()) {
			@Pc(10) Interface73 local10 = (Interface73) local3.next();
			local10.method32819(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!alt", name = "v", descriptor = "(III)V", line = 61)
	@Override
	protected void v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Iterator local3 = this.aList2.iterator();
		while (local3.hasNext()) {
			@Pc(10) Interface73 local10 = (Interface73) local3.next();
			local10.method32819(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!alt", name = "ji", descriptor = "(Lclient!gm;Lclient!yf;B)V", line = 6308)
	static final void method15418(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class665 arg1) {
		@Pc(1) byte local1 = 10;
		@Pc(14) int local14 = arg1.anIntArray536[(arg1.anInt5784 -= 308999563) * 2088438307];
		Class567.method31383(arg0, local1, local14, arg1);
	}

	@OriginalMember(owner = "client!alt", name = "atj", descriptor = "(Lclient!yf;I)V", line = 12939)
	static final void method15419(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = client.aBoolean619 ? 1 : 0;
	}
}
