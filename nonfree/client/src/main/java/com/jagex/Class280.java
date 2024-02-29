package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gp")
public final class Class280 {

	@OriginalMember(owner = "client!gp", name = "c", descriptor = "J")
	static long aLong253;

	@OriginalMember(owner = "client!gp", name = "p", descriptor = "J")
	static long aLong254;

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "[Z")
	static boolean[] aBooleanArray22;

	@OriginalMember(owner = "client!gp", name = "<init>", descriptor = "()V", line = 7)
	Class280() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!gp", name = "v", descriptor = "()J", line = 14)
	public static final synchronized long method26666() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (local1 < aLong254 * -536277033560500329L) {
			aLong253 += (aLong254 * -536277033560500329L - local1) * 8691332853634456933L;
		}
		aLong254 = local1 * -5933900784112052185L;
		return aLong253 * 5696952574407707757L + local1;
	}

	@OriginalMember(owner = "client!gp", name = "p", descriptor = "(B)J", line = 14)
	public static final synchronized long method26667() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (local1 < aLong254 * -536277033560500329L) {
			aLong253 += (aLong254 * -536277033560500329L - local1) * 8691332853634456933L;
		}
		aLong254 = local1 * -5933900784112052185L;
		return aLong253 * 5696952574407707757L + local1;
	}

	@OriginalMember(owner = "client!gp", name = "c", descriptor = "()J", line = 14)
	public static final synchronized long method26668() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (local1 < aLong254 * -536277033560500329L) {
			aLong253 += (aLong254 * -536277033560500329L - local1) * 8691332853634456933L;
		}
		aLong254 = local1 * -5933900784112052185L;
		return aLong253 * 5696952574407707757L + local1;
	}

	@OriginalMember(owner = "client!gp", name = "t", descriptor = "()J", line = 14)
	public static final synchronized long method26669() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (local1 < aLong254 * -536277033560500329L) {
			aLong253 += (aLong254 * -536277033560500329L - local1) * 8691332853634456933L;
		}
		aLong254 = local1 * -5933900784112052185L;
		return aLong253 * 5696952574407707757L + local1;
	}

	@OriginalMember(owner = "client!gp", name = "l", descriptor = "()J", line = 14)
	public static final synchronized long method26670() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (local1 < aLong254 * -536277033560500329L) {
			aLong253 += (aLong254 * -536277033560500329L - local1) * 8691332853634456933L;
		}
		aLong254 = local1 * -5933900784112052185L;
		return aLong253 * 5696952574407707757L + local1;
	}

	@OriginalMember(owner = "client!gp", name = "y", descriptor = "()J", line = 14)
	public static final synchronized long method26671() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (local1 < aLong254 * -536277033560500329L) {
			aLong253 += (aLong254 * -536277033560500329L - local1) * 8691332853634456933L;
		}
		aLong254 = local1 * -5933900784112052185L;
		return aLong253 * 5696952574407707757L + local1;
	}

	@OriginalMember(owner = "client!gp", name = "w", descriptor = "()J", line = 14)
	public static final synchronized long method26672() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (local1 < aLong254 * -536277033560500329L) {
			aLong253 += (aLong254 * -536277033560500329L - local1) * 8691332853634456933L;
		}
		aLong254 = local1 * -5933900784112052185L;
		return aLong253 * 5696952574407707757L + local1;
	}

	@OriginalMember(owner = "client!gp", name = "eg", descriptor = "(IB)Z", line = 1740)
	public static boolean method26673(@OriginalArg(0) int arg0) {
		return arg0 == 15 || arg0 == 10 || arg0 == 13 || arg0 == 12 || arg0 == 18 || arg0 == 19 || arg0 == 0;
	}

	@OriginalMember(owner = "client!gp", name = "agu", descriptor = "(Lclient!yf;B)V", line = 10528)
	static final void method26674(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		if (local23 == -1) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = -1;
		} else {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class615.aClass465_1.method29551(local13).method22836((char) local23);
		}
	}
}
