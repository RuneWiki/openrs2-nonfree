package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fm")
public final class Class176 {

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "J")
	static long aLong238;

	@OriginalMember(owner = "client!fm", name = "p", descriptor = "J")
	static long aLong239;

	@OriginalMember(owner = "client!fm", name = "<init>", descriptor = "()V", line = 7)
	Class176() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!fm", name = "p", descriptor = "(Lclient!ahb;I)Lclient!ko;", line = 13)
	public static Class283 method23417(@OriginalArg(0) Class3_Sub41 arg0) {
		@Pc(3) Class283 local3 = new Class283();
		local3.anInt4351 = arg0.method20271() * -1424853715;
		local3.aClass3_Sub1_Sub13_1 = Class622.aClass580_2.method33211(local3.anInt4351 * 189047461);
		return local3;
	}

	@OriginalMember(owner = "client!fm", name = "p", descriptor = "(B)J", line = 14)
	public static final synchronized long method23413() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (local1 < aLong239 * 5596224372674805233L) {
			aLong238 += (aLong239 * 5596224372674805233L - local1) * 1153836383329659667L;
		}
		aLong239 = local1 * -9110524796576656623L;
		return aLong238 * -883547357241190629L + local1;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "()J", line = 14)
	public static final synchronized long method23414() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (local1 < aLong239 * 5596224372674805233L) {
			aLong238 += (aLong239 * 5596224372674805233L - local1) * 1153836383329659667L;
		}
		aLong239 = local1 * -9110524796576656623L;
		return aLong238 * -883547357241190629L + local1;
	}

	@OriginalMember(owner = "client!fm", name = "g", descriptor = "()J", line = 14)
	public static final synchronized long method23415() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (local1 < aLong239 * 5596224372674805233L) {
			aLong238 += (aLong239 * 5596224372674805233L - local1) * 1153836383329659667L;
		}
		aLong239 = local1 * -9110524796576656623L;
		return aLong238 * -883547357241190629L + local1;
	}

	@OriginalMember(owner = "client!fm", name = "l", descriptor = "()J", line = 14)
	public static final synchronized long method23416() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (local1 < aLong239 * 5596224372674805233L) {
			aLong238 += (aLong239 * 5596224372674805233L - local1) * 1153836383329659667L;
		}
		aLong239 = local1 * -9110524796576656623L;
		return aLong238 * -883547357241190629L + local1;
	}
}
