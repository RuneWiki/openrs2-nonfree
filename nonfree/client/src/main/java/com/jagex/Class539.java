package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!so")
public class Class539 implements Interface18 {

	@OriginalMember(owner = "client!so", name = "iq", descriptor = "Lclient!ady;")
	public static Class80_Sub1_Sub2 aClass80_Sub1_Sub2_6;

	@OriginalMember(owner = "client!so", name = "p", descriptor = "Lclient!agh;")
	Class104_Sub1_Sub1_Sub1 aClass104_Sub1_Sub1_Sub1_3;

	@OriginalMember(owner = "client!so", name = "k", descriptor = "(I)V", line = 240)
	static void method30908() {
		Class574.aBoolean804 = false;
		Class574.anIntArray501 = null;
		Class574.anIntArray502 = null;
		Class574.aLinkedList6.clear();
		Class574.aLinkedList7.clear();
		Class284.aClass86_9.method20077();
	}

	@OriginalMember(owner = "client!so", name = "<init>", descriptor = "(Lclient!agh;)V", line = 731)
	Class539(@OriginalArg(0) Class104_Sub1_Sub1_Sub1 arg0) {
		this.aClass104_Sub1_Sub1_Sub1_3 = arg0;
	}

	@OriginalMember(owner = "client!so", name = "q", descriptor = "(Lclient!ci;B)I", line = 736)
	@Override
	public int method35934(@OriginalArg(0) Class75 arg0) {
		return this.aClass104_Sub1_Sub1_Sub1_3.anInterface3_5.method131(arg0.anInt223 * -1270946121);
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(Lclient!ci;)I", line = 736)
	@Override
	public int method35937(@OriginalArg(0) Class75 arg0) {
		return this.aClass104_Sub1_Sub1_Sub1_3.anInterface3_5.method131(arg0.anInt223 * -1270946121);
	}

	@OriginalMember(owner = "client!so", name = "m", descriptor = "(Lclient!ci;)I", line = 736)
	@Override
	public int method35936(@OriginalArg(0) Class75 arg0) {
		return this.aClass104_Sub1_Sub1_Sub1_3.anInterface3_5.method131(arg0.anInt223 * -1270946121);
	}

	@OriginalMember(owner = "client!so", name = "r", descriptor = "(Lclient!ci;)J", line = 740)
	@Override
	public long method35956(@OriginalArg(0) Class75 arg0) {
		return this.aClass104_Sub1_Sub1_Sub1_3.anInterface3_5.method125(arg0.anInt223 * -1270946121);
	}

	@OriginalMember(owner = "client!so", name = "c", descriptor = "(Lclient!ci;B)J", line = 740)
	@Override
	public long method35950(@OriginalArg(0) Class75 arg0) {
		return this.aClass104_Sub1_Sub1_Sub1_3.anInterface3_5.method125(arg0.anInt223 * -1270946121);
	}

	@OriginalMember(owner = "client!so", name = "g", descriptor = "(Lclient!ci;)J", line = 740)
	@Override
	public long method35954(@OriginalArg(0) Class75 arg0) {
		return this.aClass104_Sub1_Sub1_Sub1_3.anInterface3_5.method125(arg0.anInt223 * -1270946121);
	}

	@OriginalMember(owner = "client!so", name = "z", descriptor = "(Lclient!ci;)J", line = 740)
	@Override
	public long method35955(@OriginalArg(0) Class75 arg0) {
		return this.aClass104_Sub1_Sub1_Sub1_3.anInterface3_5.method125(arg0.anInt223 * -1270946121);
	}

	@OriginalMember(owner = "client!so", name = "s", descriptor = "(Lclient!ci;)J", line = 740)
	@Override
	public long method35952(@OriginalArg(0) Class75 arg0) {
		return this.aClass104_Sub1_Sub1_Sub1_3.anInterface3_5.method125(arg0.anInt223 * -1270946121);
	}

	@OriginalMember(owner = "client!so", name = "l", descriptor = "(Lclient!ci;I)Ljava/lang/Object;", line = 744)
	@Override
	public Object method35949(@OriginalArg(0) Class75 arg0) {
		return this.aClass104_Sub1_Sub1_Sub1_3.anInterface3_5.method144(arg0.anInt223 * -1270946121);
	}

	@OriginalMember(owner = "client!so", name = "u", descriptor = "(Lclient!ci;)Ljava/lang/Object;", line = 744)
	@Override
	public Object method35957(@OriginalArg(0) Class75 arg0) {
		return this.aClass104_Sub1_Sub1_Sub1_3.anInterface3_5.method144(arg0.anInt223 * -1270946121);
	}

	@OriginalMember(owner = "client!so", name = "e", descriptor = "(Lclient!ci;)Ljava/lang/Object;", line = 744)
	@Override
	public Object method35958(@OriginalArg(0) Class75 arg0) {
		return this.aClass104_Sub1_Sub1_Sub1_3.anInterface3_5.method144(arg0.anInt223 * -1270946121);
	}

	@OriginalMember(owner = "client!so", name = "aj", descriptor = "(Lclient!ji;)I", line = 748)
	@Override
	public int method35939(@OriginalArg(0) Class343 arg0) {
		return arg0.method27799(this.method35934(arg0.aClass75_1));
	}

	@OriginalMember(owner = "client!so", name = "h", descriptor = "(Lclient!ji;)I", line = 748)
	@Override
	public int method35938(@OriginalArg(0) Class343 arg0) {
		return arg0.method27799(this.method35934(arg0.aClass75_1));
	}

	@OriginalMember(owner = "client!so", name = "ai", descriptor = "(Lclient!ji;)I", line = 748)
	@Override
	public int method35940(@OriginalArg(0) Class343 arg0) {
		return arg0.method27799(this.method35934(arg0.aClass75_1));
	}

	@OriginalMember(owner = "client!so", name = "ag", descriptor = "(Lclient!ji;)I", line = 748)
	@Override
	public int method35941(@OriginalArg(0) Class343 arg0) {
		return arg0.method27799(this.method35934(arg0.aClass75_1));
	}

	@OriginalMember(owner = "client!so", name = "x", descriptor = "(Lclient!ji;I)I", line = 748)
	@Override
	public int method35935(@OriginalArg(0) Class343 arg0) {
		return arg0.method27799(this.method35934(arg0.aClass75_1));
	}

	@OriginalMember(owner = "client!so", name = "p", descriptor = "(Lclient!ci;II)V", line = 752)
	@Override
	public void method35943(@OriginalArg(0) Class75 arg0, @OriginalArg(1) int arg1) {
		this.aClass104_Sub1_Sub1_Sub1_3.anInterface3_5.method127(arg0.anInt223 * -1270946121, arg1);
	}

	@OriginalMember(owner = "client!so", name = "t", descriptor = "(Lclient!ci;I)V", line = 752)
	@Override
	public void method35947(@OriginalArg(0) Class75 arg0, @OriginalArg(1) int arg1) {
		this.aClass104_Sub1_Sub1_Sub1_3.anInterface3_5.method127(arg0.anInt223 * -1270946121, arg1);
	}

	@OriginalMember(owner = "client!so", name = "d", descriptor = "(Lclient!ci;I)V", line = 752)
	@Override
	public void method35951(@OriginalArg(0) Class75 arg0, @OriginalArg(1) int arg1) {
		this.aClass104_Sub1_Sub1_Sub1_3.anInterface3_5.method127(arg0.anInt223 * -1270946121, arg1);
	}

	@OriginalMember(owner = "client!so", name = "v", descriptor = "(Lclient!ci;J)V", line = 756)
	@Override
	public void method35945(@OriginalArg(0) Class75 arg0, @OriginalArg(1) long arg1) {
		this.aClass104_Sub1_Sub1_Sub1_3.anInterface3_5.method126(arg0.anInt223 * -1270946121, arg1);
	}

	@OriginalMember(owner = "client!so", name = "i", descriptor = "(Lclient!ci;J)V", line = 756)
	@Override
	public void method35942(@OriginalArg(0) Class75 arg0, @OriginalArg(1) long arg1) {
		this.aClass104_Sub1_Sub1_Sub1_3.anInterface3_5.method126(arg0.anInt223 * -1270946121, arg1);
	}

	@OriginalMember(owner = "client!so", name = "j", descriptor = "(Lclient!ci;J)V", line = 756)
	@Override
	public void method35944(@OriginalArg(0) Class75 arg0, @OriginalArg(1) long arg1) {
		this.aClass104_Sub1_Sub1_Sub1_3.anInterface3_5.method126(arg0.anInt223 * -1270946121, arg1);
	}

	@OriginalMember(owner = "client!so", name = "k", descriptor = "(Lclient!ci;J)V", line = 756)
	@Override
	public void method35953(@OriginalArg(0) Class75 arg0, @OriginalArg(1) long arg1) {
		this.aClass104_Sub1_Sub1_Sub1_3.anInterface3_5.method126(arg0.anInt223 * -1270946121, arg1);
	}

	@OriginalMember(owner = "client!so", name = "y", descriptor = "(Lclient!ci;Ljava/lang/Object;B)V", line = 760)
	@Override
	public void method35946(@OriginalArg(0) Class75 arg0, @OriginalArg(1) Object arg1) {
		this.aClass104_Sub1_Sub1_Sub1_3.anInterface3_5.method128(arg0.anInt223 * -1270946121, arg1);
	}

	@OriginalMember(owner = "client!so", name = "f", descriptor = "(Lclient!ci;Ljava/lang/Object;)V", line = 760)
	@Override
	public void method35959(@OriginalArg(0) Class75 arg0, @OriginalArg(1) Object arg1) {
		this.aClass104_Sub1_Sub1_Sub1_3.anInterface3_5.method128(arg0.anInt223 * -1270946121, arg1);
	}

	@OriginalMember(owner = "client!so", name = "b", descriptor = "(Lclient!ji;I)V", line = 764)
	@Override
	public void method35961(@OriginalArg(0) Class343 arg0, @OriginalArg(1) int arg1) throws Exception_Sub6 {
		this.method35943(arg0.aClass75_1, arg0.method27803(this.method35934(arg0.aClass75_1), arg1));
	}

	@OriginalMember(owner = "client!so", name = "w", descriptor = "(Lclient!ji;IB)V", line = 764)
	@Override
	public void method35948(@OriginalArg(0) Class343 arg0, @OriginalArg(1) int arg1) throws Exception_Sub6 {
		this.method35943(arg0.aClass75_1, arg0.method27803(this.method35934(arg0.aClass75_1), arg1));
	}

	@OriginalMember(owner = "client!so", name = "o", descriptor = "(Lclient!ji;I)V", line = 764)
	@Override
	public void method35960(@OriginalArg(0) Class343 arg0, @OriginalArg(1) int arg1) throws Exception_Sub6 {
		this.method35943(arg0.aClass75_1, arg0.method27803(this.method35934(arg0.aClass75_1), arg1));
	}

	@OriginalMember(owner = "client!so", name = "ak", descriptor = "(B)Z", line = 1133)
	static boolean method30909() {
		if (client.anInt3390 * -1850530127 == 15) {
			return !Class231.method25828() && !Class323.method27471();
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!so", name = "sl", descriptor = "(Lclient!yf;I)V", line = 7888)
	static final void method30910(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local16.anInt3946 * -1513459333;
	}

	@OriginalMember(owner = "client!so", name = "acs", descriptor = "(Lclient!yf;I)V", line = 9624)
	static final void method30911(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 926998689;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		@Pc(33) int local33 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 2];
		@Pc(37) int local37 = 31 - local33;
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local13 << local37 >>> local37 + local23;
	}

	@OriginalMember(owner = "client!so", name = "adp", descriptor = "(Lclient!yf;I)V", line = 9747)
	static final void method30912(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5781 -= -1374580330;
		@Pc(14) String local14 = (String) arg0.anObjectArray45[arg0.anInt5781 * 1485266147];
		@Pc(25) String local25 = (String) arg0.anObjectArray45[arg0.anInt5781 * 1485266147 + 1];
		if (arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307] == 1) {
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = local14;
		} else {
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = local25;
		}
	}
}
