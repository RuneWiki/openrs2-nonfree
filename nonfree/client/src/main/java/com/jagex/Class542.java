package com.jagex;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!st")
public class Class542 {

	@OriginalMember(owner = "client!st", name = "p", descriptor = "I")
	static final int anInt5210 = 5;

	@OriginalMember(owner = "client!st", name = "ax", descriptor = "[I")
	static int[] anIntArray484;

	@OriginalMember(owner = "client!st", name = "c", descriptor = "Lclient!sb;")
	static Class528 aClass528_1;

	static {
		new Class546();
		aClass528_1 = new Class528();
	}

	@OriginalMember(owner = "client!st", name = "<init>", descriptor = "()V", line = 15)
	Class542() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!st", name = "l", descriptor = "(Lclient!akv;I)[B", line = 20)
	public static byte[] method30938(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) throws IOException {
		@Pc(5) ByteArrayInputStream local5 = new ByteArrayInputStream(arg0.aByteArray53);
		local5.skip((long) (arg0.anInt3089 * 31645619));
		return Class82.method1997(local5, arg1);
	}

	@OriginalMember(owner = "client!st", name = "y", descriptor = "(Lclient!akv;I)[B", line = 20)
	public static byte[] method30939(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) throws IOException {
		@Pc(5) ByteArrayInputStream local5 = new ByteArrayInputStream(arg0.aByteArray53);
		local5.skip((long) (arg0.anInt3089 * 31645619));
		return Class82.method1997(local5, arg1);
	}

	@OriginalMember(owner = "client!st", name = "v", descriptor = "(Lclient!akv;I)[B", line = 20)
	public static byte[] method30940(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) throws IOException {
		@Pc(5) ByteArrayInputStream local5 = new ByteArrayInputStream(arg0.aByteArray53);
		local5.skip((long) (arg0.anInt3089 * 31645619));
		return Class82.method1997(local5, arg1);
	}

	@OriginalMember(owner = "client!st", name = "w", descriptor = "(Ljava/io/InputStream;I)[B", line = 26)
	static byte[] method30941(@OriginalArg(0) InputStream arg0, @OriginalArg(1) int arg1) throws IOException {
		@Pc(2) byte[] local2 = new byte[5];
		if (arg0.read(local2, 0, 5) != 5) {
			throw new IOException("2");
		}
		@Pc(19) ByteArrayOutputStream local19 = new ByteArrayOutputStream(arg1);
		@Pc(22) Class528 local22 = aClass528_1;
		synchronized (aClass528_1) {
			if (!aClass528_1.method30701(local2)) {
				throw new IOException("3");
			}
			aClass528_1.method30698(arg0, local19, (long) arg1);
		}
		local19.flush();
		return local19.toByteArray();
	}

	@OriginalMember(owner = "client!st", name = "t", descriptor = "(Ljava/io/InputStream;I)[B", line = 26)
	static byte[] method30942(@OriginalArg(0) InputStream arg0, @OriginalArg(1) int arg1) throws IOException {
		@Pc(2) byte[] local2 = new byte[5];
		if (arg0.read(local2, 0, 5) != 5) {
			throw new IOException("2");
		}
		@Pc(19) ByteArrayOutputStream local19 = new ByteArrayOutputStream(arg1);
		@Pc(22) Class528 local22 = aClass528_1;
		synchronized (aClass528_1) {
			if (!aClass528_1.method30701(local2)) {
				throw new IOException("3");
			}
			aClass528_1.method30698(arg0, local19, (long) arg1);
		}
		local19.flush();
		return local19.toByteArray();
	}

	@OriginalMember(owner = "client!st", name = "v", descriptor = "(B)V", line = 60)
	public static void method30943() {
		Class640.aClass147_Sub2_1.method15610();
		Class640.aClass147_Sub1_1.method15610();
		Class640.aLong303 = 2887650411480147785L;
		Class640.aBoolean852 = true;
	}

	@OriginalMember(owner = "client!st", name = "fh", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;I)V", line = 5510)
	static final void method30944(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		arg2.anInt5784 -= 617999126;
		arg0.anInt3929 = arg2.anIntArray536[arg2.anInt5784 * 2088438307] * 341739281;
		arg0.anInt3894 = arg2.anIntArray536[arg2.anInt5784 * 2088438307 + 1] * 252151357;
		Class461.method29531(arg0);
	}

	@OriginalMember(owner = "client!st", name = "sv", descriptor = "(Lclient!yf;I)V", line = 7852)
	static final void method30945(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local16.anInt3880 * 2142374941;
	}

	@OriginalMember(owner = "client!st", name = "ul", descriptor = "(Lclient!yf;B)V", line = 8192)
	static final void method30946(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 926998689;
		Class94_Sub4.aClass261_1.method26354(arg0.anIntArray536[arg0.anInt5784 * 2088438307], arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1]);
	}

	@OriginalMember(owner = "client!st", name = "vx", descriptor = "(Lclient!yf;I)V", line = 8438)
	static final void method30947(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(28) boolean local28 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1] == 1;
		arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = Class580.method31679(local13, local28);
	}

	@OriginalMember(owner = "client!st", name = "za", descriptor = "(Lclient!yf;I)V", line = 9058)
	static final void method30948(@OriginalArg(0) Class665 arg0) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt5781 -= 1460193483) * 1485266147];
		Class639.method32726(local13, true);
	}

	@OriginalMember(owner = "client!st", name = "aku", descriptor = "(Lclient!yf;S)V", line = 11331)
	static final void method30949(@OriginalArg(0) Class665 arg0) {
		if (Class11.anInt36 * -891094135 == 3) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = (int) ((double) Class597.aClass107_Sub1_2.method8899() * 2607.5945876176133D) >> 3;
		} else {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = (int) client.aFloat247 >> 3;
		}
	}
}
