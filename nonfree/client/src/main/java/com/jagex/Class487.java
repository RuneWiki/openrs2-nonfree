package com.jagex;

import java.net.Socket;
import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tp")
public class Class487 implements Iterator {

	@OriginalMember(owner = "client!tp", name = "et", descriptor = "Ljava/net/Socket;")
	static Socket aSocket2;

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "I")
	int anInt5184;

	@OriginalMember(owner = "client!tp", name = "p", descriptor = "[Lclient!tw;")
	Class492[] aClass492Array1;

	@OriginalMember(owner = "client!tp", name = "<init>", descriptor = "([Lclient!tw;)V", line = 66)
	Class487(@OriginalArg(0) Class492[] arg0) {
		this.aClass492Array1 = arg0;
	}

	@OriginalMember(owner = "client!tp", name = "hasNext", descriptor = "()Z", line = 71)
	@Override
	public boolean hasNext() {
		return this.anInt5184 * -1861361159 < this.aClass492Array1.length;
	}

	@OriginalMember(owner = "client!tp", name = "x", descriptor = "()Z", line = 71)
	public boolean method29188() {
		return this.anInt5184 * -1861361159 < this.aClass492Array1.length;
	}

	@OriginalMember(owner = "client!tp", name = "next", descriptor = "()Ljava/lang/Object;", line = 75)
	@Override
	public Object next() {
		return this.aClass492Array1[(this.anInt5184 += -687665079) * -1861361159 - 1];
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "()Ljava/lang/Object;", line = 75)
	public Object method29183() {
		return this.aClass492Array1[(this.anInt5184 += -687665079) * -1861361159 - 1];
	}

	@OriginalMember(owner = "client!tp", name = "p", descriptor = "()Ljava/lang/Object;", line = 75)
	public Object method29184() {
		return this.aClass492Array1[(this.anInt5184 += -687665079) * -1861361159 - 1];
	}

	@OriginalMember(owner = "client!tp", name = "g", descriptor = "()Ljava/lang/Object;", line = 75)
	public Object method29185() {
		return this.aClass492Array1[(this.anInt5184 += -687665079) * -1861361159 - 1];
	}

	@OriginalMember(owner = "client!tp", name = "l", descriptor = "()Ljava/lang/Object;", line = 75)
	public Object method29186() {
		return this.aClass492Array1[(this.anInt5184 += -687665079) * -1861361159 - 1];
	}

	@OriginalMember(owner = "client!tp", name = "remove", descriptor = "()V", line = 79)
	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!tp", name = "h", descriptor = "()V", line = 79)
	public void method29187() {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!tp", name = "rc", descriptor = "(Lclient!vs;B)V", line = 7222)
	static final void method29190(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		Class282.method25443(local11, arg0);
	}

	@OriginalMember(owner = "client!tp", name = "lf", descriptor = "(Ljava/lang/String;II)V", line = 11346)
	public static final void method29191(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Class82 local2 = Class406.method27657();
		@Pc(8) Class3_Sub23 local8 = Class269.method25284(Class311.aClass311_50, local2.aClass577_2);
		local8.aClass3_Sub41_Sub1_1.method20250(Class43_Sub2.method8763(arg0) + 1);
		local8.aClass3_Sub41_Sub1_1.method20301(arg1);
		local8.aClass3_Sub41_Sub1_1.method20260(arg0);
		local2.method21601(local8);
	}

	@OriginalMember(owner = "client!tp", name = "anz", descriptor = "(Lclient!vs;I)V", line = 11515)
	static final void method29192(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class510.aClass3_Sub45_37.aClass60_Sub1_1.method12641();
	}

	@OriginalMember(owner = "client!tp", name = "atv", descriptor = "(Lclient!vs;I)V", line = 12410)
	static final void method29189(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class510.aClass3_Sub45_37.aClass60_Sub31_1.method14599(local12);
	}
}
