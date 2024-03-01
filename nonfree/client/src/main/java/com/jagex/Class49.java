package com.jagex;

import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kt")
public class Class49 implements Interface31 {

	@OriginalMember(owner = "client!kt", name = "p", descriptor = "I")
	public final int anInt1017;

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "Lclient!kh;")
	public final Class277 aClass277_6;

	@OriginalMember(owner = "client!kt", name = "g", descriptor = "Lclient!kg;")
	public final Class276 aClass276_6;

	@OriginalMember(owner = "client!kt", name = "l", descriptor = "I")
	public final int anInt1018;

	@OriginalMember(owner = "client!kt", name = "h", descriptor = "I")
	public final int anInt1019;

	@OriginalMember(owner = "client!kt", name = "p", descriptor = "(Ljava/net/Socket;II)Lclient!qg;", line = 10)
	public static Class62 method9255(@OriginalArg(0) Socket arg0, @OriginalArg(1) int arg1) throws IOException {
		return new Class62_Sub1(arg0, arg1);
	}

	@OriginalMember(owner = "client!kt", name = "<init>", descriptor = "(ILclient!kh;Lclient!kg;II)V", line = 12)
	Class49(@OriginalArg(0) int arg0, @OriginalArg(1) Class277 arg1, @OriginalArg(2) Class276 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt1017 = arg0 * 1933394933;
		this.aClass277_6 = arg1;
		this.aClass276_6 = arg2;
		this.anInt1018 = arg3 * 344215657;
		this.anInt1019 = arg4 * -1532834079;
	}

	@OriginalMember(owner = "client!kt", name = "h", descriptor = "(Lclient!ahb;)Lclient!kt;", line = 21)
	public static Class49 method9250(@OriginalArg(0) Class3_Sub41 arg0) {
		@Pc(3) int local3 = arg0.method20375();
		@Pc(10) Class277 local10 = Class3_Sub30.method11638()[arg0.method20269()];
		@Pc(17) Class276 local17 = Class400.method27575()[arg0.method20269()];
		@Pc(21) int local21 = arg0.method20272();
		@Pc(25) int local25 = arg0.method20272();
		return new Class49(local3, local10, local17, local21, local25);
	}

	@OriginalMember(owner = "client!kt", name = "l", descriptor = "(Lclient!ahb;)Lclient!kt;", line = 21)
	public static Class49 method9251(@OriginalArg(0) Class3_Sub41 arg0) {
		@Pc(3) int local3 = arg0.method20375();
		@Pc(10) Class277 local10 = Class3_Sub30.method11638()[arg0.method20269()];
		@Pc(17) Class276 local17 = Class400.method27575()[arg0.method20269()];
		@Pc(21) int local21 = arg0.method20272();
		@Pc(25) int local25 = arg0.method20272();
		return new Class49(local3, local10, local17, local21, local25);
	}

	@OriginalMember(owner = "client!kt", name = "g", descriptor = "()Lclient!ke;", line = 30)
	@Override
	public Class274 method25539() {
		return Class274.aClass274_5;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(I)Lclient!ke;", line = 30)
	@Override
	public Class274 method25540() {
		return Class274.aClass274_5;
	}

	@OriginalMember(owner = "client!kt", name = "ph", descriptor = "(Lclient!vs;I)V", line = 6823)
	static final void method9254(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class12.method1252(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!kt", name = "zz", descriptor = "(Lclient!vs;I)V", line = 8609)
	static final void method9252(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = arg0.aClass245_4.anInt3789 * -1826008201;
	}

	@OriginalMember(owner = "client!kt", name = "aji", descriptor = "(Lclient!vs;I)V", line = 10745)
	static final void method9253(@OriginalArg(0) Class536 arg0) {
		@Pc(13) Class3_Sub32 local13 = (Class3_Sub32) arg0.anObjectArray42[(arg0.anInt5315 -= 790013775) * 996806575];
		if (Class80.aClass23_Sub1_1.method5830() != Class208.aClass208_8) {
			throw new RuntimeException();
		}
		@Pc(27) Class69_Sub4 local27 = (Class69_Sub4) Class80.aClass23_Sub1_1.method5799();
		local27.method14667(local13);
		client.aBoolean586 = true;
	}
}
