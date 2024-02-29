package com.jagex;

import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wn")
public class Class624 implements Iterator {

	@OriginalMember(owner = "client!wn", name = "h", descriptor = "I")
	static int anInt5644;

	@OriginalMember(owner = "client!wn", name = "c", descriptor = "I")
	int anInt5643;

	@OriginalMember(owner = "client!wn", name = "p", descriptor = "[Lclient!wt;")
	Class630[] aClass630Array2;

	@OriginalMember(owner = "client!wn", name = "p", descriptor = "(JII)Ljava/lang/String;", line = 30)
	public static String method32475(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		Class694.method36377(arg0);
		@Pc(5) int local5 = Class61.aCalendar2.get(5);
		@Pc(9) int local9 = Class61.aCalendar2.get(2);
		@Pc(13) int local13 = Class61.aCalendar2.get(1);
		return arg1 == 3 ? Class63.method923(arg0, arg1) : Integer.toString(local5 / 10) + local5 % 10 + "-" + Class61.aStringArrayArray1[arg1][local9] + "-" + local13;
	}

	@OriginalMember(owner = "client!wn", name = "<init>", descriptor = "([Lclient!wt;)V", line = 91)
	Class624(@OriginalArg(0) Class630[] arg0) {
		this.aClass630Array2 = arg0;
	}

	@OriginalMember(owner = "client!wn", name = "p", descriptor = "()Z", line = 96)
	public boolean method32476() {
		return this.anInt5643 * -298092353 < this.aClass630Array2.length;
	}

	@OriginalMember(owner = "client!wn", name = "hasNext", descriptor = "()Z", line = 96)
	@Override
	public boolean hasNext() {
		return this.anInt5643 * -298092353 < this.aClass630Array2.length;
	}

	@OriginalMember(owner = "client!wn", name = "c", descriptor = "()Z", line = 96)
	public boolean method32477() {
		return this.anInt5643 * -298092353 < this.aClass630Array2.length;
	}

	@OriginalMember(owner = "client!wn", name = "v", descriptor = "()Z", line = 96)
	public boolean method32478() {
		return this.anInt5643 * -298092353 < this.aClass630Array2.length;
	}

	@OriginalMember(owner = "client!wn", name = "l", descriptor = "()Z", line = 96)
	public boolean method32479() {
		return this.anInt5643 * -298092353 < this.aClass630Array2.length;
	}

	@OriginalMember(owner = "client!wn", name = "next", descriptor = "()Ljava/lang/Object;", line = 100)
	@Override
	public Object next() {
		return this.aClass630Array2[(this.anInt5643 += -1268517057) * -298092353 - 1];
	}

	@OriginalMember(owner = "client!wn", name = "y", descriptor = "()Ljava/lang/Object;", line = 100)
	public Object method32480() {
		return this.aClass630Array2[(this.anInt5643 += -1268517057) * -298092353 - 1];
	}

	@OriginalMember(owner = "client!wn", name = "w", descriptor = "()Ljava/lang/Object;", line = 100)
	public Object method32481() {
		return this.aClass630Array2[(this.anInt5643 += -1268517057) * -298092353 - 1];
	}

	@OriginalMember(owner = "client!wn", name = "remove", descriptor = "()V", line = 104)
	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!wn", name = "t", descriptor = "()V", line = 104)
	public void method32482() {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!wn", name = "q", descriptor = "()V", line = 104)
	public void method32483() {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!wn", name = "acr", descriptor = "(Lclient!yf;I)V", line = 9662)
	static final void method32484(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = ~local12;
	}
}
