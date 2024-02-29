package com.jagex;

import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ww")
class Class633 implements Iterator {

	@OriginalMember(owner = "client!ww", name = "lm", descriptor = "I")
	public static int anInt5710;

	@OriginalMember(owner = "client!ww", name = "p", descriptor = "I")
	int anInt5709;

	// $FF: synthetic field
	@OriginalMember(owner = "client!ww", name = "this$0", descriptor = "Lclient!ady;")
	final Class80_Sub1_Sub2 this$0;

	@OriginalMember(owner = "client!ww", name = "<init>", descriptor = "(Lclient!ady;)V", line = 60)
	Class633(@OriginalArg(0) Class80_Sub1_Sub2 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!ww", name = "hasNext", descriptor = "()Z", line = 64)
	@Override
	public boolean hasNext() {
		return this.anInt5709 * -1905894635 < this.this$0.method18318();
	}

	@OriginalMember(owner = "client!ww", name = "p", descriptor = "()Z", line = 64)
	public boolean method32652() {
		return this.anInt5709 * -1905894635 < this.this$0.method18318();
	}

	@OriginalMember(owner = "client!ww", name = "v", descriptor = "()Z", line = 64)
	public boolean method32653() {
		return this.anInt5709 * -1905894635 < this.this$0.method18318();
	}

	@OriginalMember(owner = "client!ww", name = "l", descriptor = "()Z", line = 64)
	public boolean method32654() {
		return this.anInt5709 * -1905894635 < this.this$0.method18318();
	}

	@OriginalMember(owner = "client!ww", name = "c", descriptor = "()Z", line = 64)
	public boolean method32655() {
		return this.anInt5709 * -1905894635 < this.this$0.method18318();
	}

	@OriginalMember(owner = "client!ww", name = "w", descriptor = "()Ljava/lang/Object;", line = 68)
	public Object method32656() {
		@Pc(11) int local11 = (this.anInt5709 += 1921915965) * -1905894635 - 1;
		@Pc(19) Class75_Sub1 local19 = (Class75_Sub1) this.this$0.aClass232_7.method25835((long) local11);
		return local19 == null ? this.this$0.method1959(local11) : local19;
	}

	@OriginalMember(owner = "client!ww", name = "next", descriptor = "()Ljava/lang/Object;", line = 68)
	@Override
	public Object next() {
		@Pc(11) int local11 = (this.anInt5709 += 1921915965) * -1905894635 - 1;
		@Pc(19) Class75_Sub1 local19 = (Class75_Sub1) this.this$0.aClass232_7.method25835((long) local11);
		return local19 == null ? this.this$0.method1959(local11) : local19;
	}

	@OriginalMember(owner = "client!ww", name = "y", descriptor = "()Ljava/lang/Object;", line = 68)
	public Object method32657() {
		@Pc(11) int local11 = (this.anInt5709 += 1921915965) * -1905894635 - 1;
		@Pc(19) Class75_Sub1 local19 = (Class75_Sub1) this.this$0.aClass232_7.method25835((long) local11);
		return local19 == null ? this.this$0.method1959(local11) : local19;
	}

	@OriginalMember(owner = "client!ww", name = "l", descriptor = "(Lclient!tk;Lclient!dx;I)V", line = 74)
	public static void method32658(@OriginalArg(0) Class556 arg0, @OriginalArg(1) Class86 arg1) {
		@Pc(2) Iterator local2 = Class622.aList24.iterator();
		while (local2.hasNext()) {
			@Pc(9) Class626 local9 = (Class626) local2.next();
			if (local9.aBoolean843) {
				local9.method32531(arg0, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!ww", name = "t", descriptor = "()V", line = 75)
	public void method32659() {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!ww", name = "remove", descriptor = "()V", line = 75)
	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!ww", name = "q", descriptor = "()V", line = 75)
	public void method32660() {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!ww", name = "ef", descriptor = "(Lclient!yf;I)V", line = 5300)
	static final void method32661(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class157.method24297(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!ww", name = "uu", descriptor = "(Lclient!yf;I)V", line = 8222)
	static final void method32662(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 1544997815;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		@Pc(33) int local33 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 2];
		@Pc(43) int local43 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 3];
		@Pc(53) int local53 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 4];
		Class94_Sub4.aClass261_1.method26335(Class239.aClass239_9, local13, local23, local43, Class220.aClass220_8.method25727(), Class235.aClass235_2, 0.0F, 0.0F, null, 0, local53, local33);
	}

	@OriginalMember(owner = "client!ww", name = "vg", descriptor = "(Lclient!yf;I)V", line = 8464)
	static final void method32663(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class22.method421(local13, local23, true);
	}
}
