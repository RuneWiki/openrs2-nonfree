package com.jagex;

import java.net.InetAddress;
import java.net.UnknownHostException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!k")
public class Class355 implements Runnable {

	@OriginalMember(owner = "client!k", name = "by", descriptor = "Lclient!cy;")
	public static Class83 aClass83_28;

	@OriginalMember(owner = "client!k", name = "c", descriptor = "Ljava/lang/String;")
	volatile String aString208;

	@OriginalMember(owner = "client!k", name = "p", descriptor = "Ljava/net/InetAddress;")
	InetAddress anInetAddress1;

	@OriginalMember(owner = "client!k", name = "<init>", descriptor = "(I)V", line = 10)
	Class355(@OriginalArg(0) int arg0) throws UnknownHostException {
		this.anInetAddress1 = InetAddress.getByAddress(new byte[] { (byte) (arg0 >> 24 & 0xFF), (byte) (arg0 >> 16 & 0xFF), (byte) (arg0 >> 8 & 0xFF), (byte) (arg0 & 0xFF) });
	}

	@OriginalMember(owner = "client!k", name = "p", descriptor = "(B)Ljava/lang/String;", line = 15)
	public String method27957() {
		return this.aString208;
	}

	@OriginalMember(owner = "client!k", name = "c", descriptor = "()Ljava/lang/String;", line = 15)
	public String method27958() {
		return this.aString208;
	}

	@OriginalMember(owner = "client!k", name = "g", descriptor = "()V", line = 19)
	public void method27959() {
		this.aString208 = this.anInetAddress1.getHostName();
	}

	@OriginalMember(owner = "client!k", name = "run", descriptor = "()V", line = 19)
	@Override
	public void run() {
		this.aString208 = this.anInetAddress1.getHostName();
	}

	@OriginalMember(owner = "client!k", name = "r", descriptor = "()V", line = 19)
	public void method27960() {
		this.aString208 = this.anInetAddress1.getHostName();
	}

	@OriginalMember(owner = "client!k", name = "d", descriptor = "(III)V", line = 390)
	static void method27961(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!Class617.aClass629_1.aBoolean846) {
			if (Class683.anInt5826 * 324852453 == 1) {
				return;
			}
			if (Class661.aBoolean856 && Class683.anInt5826 * 324852453 == 2 && Class98.aClass77_Sub1_Sub7_2.aString92.equals(Class44.aClass44_176.method713(Class128.aClass667_3))) {
				return;
			}
		}
		@Pc(27) Class17 local27 = Class197.method25473();
		@Pc(35) int local35 = local27.method297(Class44.aClass44_9.method713(Class128.aClass667_3));
		@Pc(72) int local72;
		@Pc(50) int local50;
		if (Class683.aBoolean862) {
			for (@Pc(94) Class77_Sub1_Sub11 local94 = (Class77_Sub1_Sub11) Class683.aClass691_17.method36335(); local94 != null; local94 = (Class77_Sub1_Sub11) Class683.aClass691_17.method36340()) {
				if (local94.anInt3023 * -475442105 == 1) {
					local50 = Class102.method7918((Class77_Sub1_Sub7) local94.aClass691_11.aClass77_Sub1_66.aClass77_Sub1_62, local27);
				} else {
					local50 = Class135_Sub1.method13726(local94, local27);
				}
				if (local50 > local35) {
					local35 = local50;
				}
			}
			local35 += 8;
			local72 = Class683.anInt5819 * -238165825 * Class683.anInt5840 * 1965634793 + 21;
			Class100_Sub1.anInt946 = (-238165825 * Class683.anInt5819 * 1965634793 * Class683.anInt5840 + (Class683.aBoolean863 ? 26 : 22)) * -441332209;
		} else {
			for (@Pc(42) Class77_Sub1_Sub7 local42 = (Class77_Sub1_Sub7) Class683.aClass695_55.method36395(); local42 != null; local42 = (Class77_Sub1_Sub7) Class683.aClass695_55.method36406()) {
				local50 = Class102.method7918(local42, local27);
				if (local50 > local35) {
					local35 = local50;
				}
			}
			local35 += 8;
			local72 = Class683.anInt5826 * 324852453 * -238165825 * Class683.anInt5819 + 21;
			Class100_Sub1.anInt946 = ((Class683.aBoolean863 ? 26 : 22) + Class683.anInt5826 * 324852453 * Class683.anInt5819 * -238165825) * -441332209;
		}
		local35 += 10;
		@Pc(163) int local163 = arg0 - local35 / 2;
		if (local163 + local35 > Class149_Sub4.anInt2368 * 1771907305) {
			local163 = Class149_Sub4.anInt2368 * 1771907305 - local35;
		}
		if (local163 < 0) {
			local163 = 0;
		}
		local50 = arg1;
		if (arg1 + local72 > Class19.anInt108 * -1091172141) {
			local50 = Class19.anInt108 * -1091172141 - local72;
		}
		if (local50 < 0) {
			local50 = 0;
		}
		Class624.anInt5644 = local163 * 358840571;
		Class683.anInt5836 = local50 * -1495881517;
		Class639.anInt5719 = local35 * 1989742113;
		Class683.anInt5837 = (int) (Math.random() * 24.0D) * -894020657;
		Class683.aBoolean861 = true;
	}

	@OriginalMember(owner = "client!k", name = "bf", descriptor = "(Lclient!gm;Lclient!yf;I)V", line = 4726)
	static final void method27962(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class665 arg1) {
		if (client.method25376(arg0).method13645() && client.aClass277_5 == null) {
			Class131.method23063(arg0.anInt3863 * -1278450723, arg0.anInt3927 * 1365669833);
			client.aClass277_5 = Class60.method884(arg0.anInt3863 * -1278450723, arg0.anInt3927 * 1365669833);
			Class461.method29531(client.aClass277_5);
		}
	}

	@OriginalMember(owner = "client!k", name = "em", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;B)V", line = 5314)
	static final void method27963(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		arg0.aBoolean678 = arg2.anIntArray536[(arg2.anInt5784 -= 308999563) * 2088438307] == 1;
		Class461.method29531(arg0);
	}
}
