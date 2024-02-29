package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ys")
public class Class675 implements Interface18 {

	@OriginalMember(owner = "client!ys", name = "v", descriptor = "I")
	static int anInt5802;

	@OriginalMember(owner = "client!ys", name = "ga", descriptor = "Lclient!pw;")
	public static Class478 aClass478_136;

	@OriginalMember(owner = "client!ys", name = "p", descriptor = "Lclient!kw;")
	Class368 aClass368_4;

	@OriginalMember(owner = "client!ys", name = "d", descriptor = "(Lclient!uq;IIB)V", line = 301)
	public static void method35962(@OriginalArg(0) Class135 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class665 local2 = Class566.method31372();
		Class274.method26548(arg0, arg1, arg2, local2);
	}

	@OriginalMember(owner = "client!ys", name = "aw", descriptor = "(Lclient!yf;B)V", line = 4611)
	static final void method35963(@OriginalArg(0) Class665 arg0) {
		arg0.aLongArray27[arg0.anIntArray535[arg0.anInt5786 * 662605117]] = arg0.aLongArray28[(arg0.anInt5782 -= 1091885681) * 1572578961];
	}

	@OriginalMember(owner = "client!ys", name = "aln", descriptor = "(Lclient!yf;I)V", line = 11429)
	static final void method35964(@OriginalArg(0) Class665 arg0) throws Exception_Sub2 {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		Class597.aClass107_Sub1_2.method8788(Class246.method26126(local12), true);
		client.aBoolean612 = true;
	}

	@OriginalMember(owner = "client!ys", name = "<init>", descriptor = "(Lclient!kw;)V", line = 13900)
	Class675(@OriginalArg(0) Class368 arg0) {
		this.aClass368_4 = arg0;
	}

	@OriginalMember(owner = "client!ys", name = "q", descriptor = "(Lclient!ci;B)I", line = 13905)
	@Override
	public int method35934(@OriginalArg(0) Class75 arg0) {
		@Pc(15) Integer local15 = this.aClass368_4.method28169(client.aClass670_4.anInt5791 * -1082924039 << 16 | arg0.anInt223 * -1270946121);
		return local15 == null ? (Integer) arg0.method1144() : local15;
	}

	@OriginalMember(owner = "client!ys", name = "a", descriptor = "(Lclient!ci;)I", line = 13905)
	@Override
	public int method35937(@OriginalArg(0) Class75 arg0) {
		@Pc(15) Integer local15 = this.aClass368_4.method28169(client.aClass670_4.anInt5791 * -1082924039 << 16 | arg0.anInt223 * -1270946121);
		return local15 == null ? (Integer) arg0.method1144() : local15;
	}

	@OriginalMember(owner = "client!ys", name = "m", descriptor = "(Lclient!ci;)I", line = 13905)
	@Override
	public int method35936(@OriginalArg(0) Class75 arg0) {
		@Pc(15) Integer local15 = this.aClass368_4.method28169(client.aClass670_4.anInt5791 * -1082924039 << 16 | arg0.anInt223 * -1270946121);
		return local15 == null ? (Integer) arg0.method1144() : local15;
	}

	@OriginalMember(owner = "client!ys", name = "c", descriptor = "(Lclient!ci;B)J", line = 13911)
	@Override
	public long method35950(@OriginalArg(0) Class75 arg0) {
		@Pc(15) Long local15 = this.aClass368_4.method28171(client.aClass670_4.anInt5791 * -1082924039 << 16 | arg0.anInt223 * -1270946121);
		return local15 == null ? (Long) arg0.method1144() : local15;
	}

	@OriginalMember(owner = "client!ys", name = "g", descriptor = "(Lclient!ci;)J", line = 13911)
	@Override
	public long method35954(@OriginalArg(0) Class75 arg0) {
		@Pc(15) Long local15 = this.aClass368_4.method28171(client.aClass670_4.anInt5791 * -1082924039 << 16 | arg0.anInt223 * -1270946121);
		return local15 == null ? (Long) arg0.method1144() : local15;
	}

	@OriginalMember(owner = "client!ys", name = "r", descriptor = "(Lclient!ci;)J", line = 13911)
	@Override
	public long method35956(@OriginalArg(0) Class75 arg0) {
		@Pc(15) Long local15 = this.aClass368_4.method28171(client.aClass670_4.anInt5791 * -1082924039 << 16 | arg0.anInt223 * -1270946121);
		return local15 == null ? (Long) arg0.method1144() : local15;
	}

	@OriginalMember(owner = "client!ys", name = "z", descriptor = "(Lclient!ci;)J", line = 13911)
	@Override
	public long method35955(@OriginalArg(0) Class75 arg0) {
		@Pc(15) Long local15 = this.aClass368_4.method28171(client.aClass670_4.anInt5791 * -1082924039 << 16 | arg0.anInt223 * -1270946121);
		return local15 == null ? (Long) arg0.method1144() : local15;
	}

	@OriginalMember(owner = "client!ys", name = "s", descriptor = "(Lclient!ci;)J", line = 13911)
	@Override
	public long method35952(@OriginalArg(0) Class75 arg0) {
		@Pc(15) Long local15 = this.aClass368_4.method28171(client.aClass670_4.anInt5791 * -1082924039 << 16 | arg0.anInt223 * -1270946121);
		return local15 == null ? (Long) arg0.method1144() : local15;
	}

	@OriginalMember(owner = "client!ys", name = "l", descriptor = "(Lclient!ci;I)Ljava/lang/Object;", line = 13917)
	@Override
	public Object method35949(@OriginalArg(0) Class75 arg0) {
		if (arg0.aClass498_6 != Class498.aClass498_158) {
			throw new IllegalArgumentException("");
		}
		return this.aClass368_4.method28176(client.aClass670_4.anInt5791 * -1082924039 << 16 | arg0.anInt223 * -1270946121);
	}

	@OriginalMember(owner = "client!ys", name = "u", descriptor = "(Lclient!ci;)Ljava/lang/Object;", line = 13917)
	@Override
	public Object method35957(@OriginalArg(0) Class75 arg0) {
		if (arg0.aClass498_6 != Class498.aClass498_158) {
			throw new IllegalArgumentException("");
		}
		return this.aClass368_4.method28176(client.aClass670_4.anInt5791 * -1082924039 << 16 | arg0.anInt223 * -1270946121);
	}

	@OriginalMember(owner = "client!ys", name = "e", descriptor = "(Lclient!ci;)Ljava/lang/Object;", line = 13917)
	@Override
	public Object method35958(@OriginalArg(0) Class75 arg0) {
		if (arg0.aClass498_6 != Class498.aClass498_158) {
			throw new IllegalArgumentException("");
		}
		return this.aClass368_4.method28176(client.aClass670_4.anInt5791 * -1082924039 << 16 | arg0.anInt223 * -1270946121);
	}

	@OriginalMember(owner = "client!ys", name = "h", descriptor = "(Lclient!ji;)I", line = 13922)
	@Override
	public int method35938(@OriginalArg(0) Class343 arg0) {
		return arg0.method27799(this.method35934(arg0.aClass75_1));
	}

	@OriginalMember(owner = "client!ys", name = "ai", descriptor = "(Lclient!ji;)I", line = 13922)
	@Override
	public int method35940(@OriginalArg(0) Class343 arg0) {
		return arg0.method27799(this.method35934(arg0.aClass75_1));
	}

	@OriginalMember(owner = "client!ys", name = "ag", descriptor = "(Lclient!ji;)I", line = 13922)
	@Override
	public int method35941(@OriginalArg(0) Class343 arg0) {
		return arg0.method27799(this.method35934(arg0.aClass75_1));
	}

	@OriginalMember(owner = "client!ys", name = "aj", descriptor = "(Lclient!ji;)I", line = 13922)
	@Override
	public int method35939(@OriginalArg(0) Class343 arg0) {
		return arg0.method27799(this.method35934(arg0.aClass75_1));
	}

	@OriginalMember(owner = "client!ys", name = "x", descriptor = "(Lclient!ji;I)I", line = 13922)
	@Override
	public int method35935(@OriginalArg(0) Class343 arg0) {
		return arg0.method27799(this.method35934(arg0.aClass75_1));
	}

	@OriginalMember(owner = "client!ys", name = "p", descriptor = "(Lclient!ci;II)V", line = 13926)
	@Override
	public void method35943(@OriginalArg(0) Class75 arg0, @OriginalArg(1) int arg1) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!ys", name = "t", descriptor = "(Lclient!ci;I)V", line = 13926)
	@Override
	public void method35947(@OriginalArg(0) Class75 arg0, @OriginalArg(1) int arg1) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!ys", name = "d", descriptor = "(Lclient!ci;I)V", line = 13926)
	@Override
	public void method35951(@OriginalArg(0) Class75 arg0, @OriginalArg(1) int arg1) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!ys", name = "i", descriptor = "(Lclient!ci;J)V", line = 13930)
	@Override
	public void method35942(@OriginalArg(0) Class75 arg0, @OriginalArg(1) long arg1) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!ys", name = "v", descriptor = "(Lclient!ci;J)V", line = 13930)
	@Override
	public void method35945(@OriginalArg(0) Class75 arg0, @OriginalArg(1) long arg1) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!ys", name = "j", descriptor = "(Lclient!ci;J)V", line = 13930)
	@Override
	public void method35944(@OriginalArg(0) Class75 arg0, @OriginalArg(1) long arg1) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!ys", name = "k", descriptor = "(Lclient!ci;J)V", line = 13930)
	@Override
	public void method35953(@OriginalArg(0) Class75 arg0, @OriginalArg(1) long arg1) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!ys", name = "y", descriptor = "(Lclient!ci;Ljava/lang/Object;B)V", line = 13934)
	@Override
	public void method35946(@OriginalArg(0) Class75 arg0, @OriginalArg(1) Object arg1) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!ys", name = "f", descriptor = "(Lclient!ci;Ljava/lang/Object;)V", line = 13934)
	@Override
	public void method35959(@OriginalArg(0) Class75 arg0, @OriginalArg(1) Object arg1) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!ys", name = "b", descriptor = "(Lclient!ji;I)V", line = 13938)
	@Override
	public void method35961(@OriginalArg(0) Class343 arg0, @OriginalArg(1) int arg1) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!ys", name = "w", descriptor = "(Lclient!ji;IB)V", line = 13938)
	@Override
	public void method35948(@OriginalArg(0) Class343 arg0, @OriginalArg(1) int arg1) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!ys", name = "o", descriptor = "(Lclient!ji;I)V", line = 13938)
	@Override
	public void method35960(@OriginalArg(0) Class343 arg0, @OriginalArg(1) int arg1) {
		throw new UnsupportedOperationException();
	}
}
