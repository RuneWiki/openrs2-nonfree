package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ur")
public class Class582 implements Interface67 {

	@OriginalMember(owner = "client!ur", name = "p", descriptor = "Lclient!abz;")
	final Class49 aClass49_3;

	@OriginalMember(owner = "client!ur", name = "c", descriptor = "Ljava/lang/String;")
	final String aString231;

	@OriginalMember(owner = "client!ur", name = "v", descriptor = "I")
	final int anInt5447;

	@OriginalMember(owner = "client!ur", name = "l", descriptor = "Ljava/lang/String;")
	final String aString232;

	@OriginalMember(owner = "client!ur", name = "y", descriptor = "(Lclient!xd;B)V", line = 13)
	public static void method31707(@OriginalArg(0) Interface73 arg0) {
		if (IcmpService_Sub1.anIcmpService_Sub1_1 == null) {
			throw new IllegalStateException("");
		}
		IcmpService_Sub1.anIcmpService_Sub1_1.aList2.add(arg0);
	}

	@OriginalMember(owner = "client!ur", name = "x", descriptor = "(Lclient!yf;I)V", line = 57)
	static void method31708(@OriginalArg(0) Class665 arg0) {
		@Pc(16) boolean local16 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307] != 0;
		Class632.method32646(local16);
	}

	@OriginalMember(owner = "client!ur", name = "<init>", descriptor = "(Lclient!abz;Ljava/lang/String;ILjava/lang/Throwable;)V", line = 87)
	Class582(@OriginalArg(0) Class49 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Throwable arg3) {
		this.aClass49_3 = arg0;
		this.aString231 = arg1;
		this.anInt5447 = arg2 * -344383463;
		this.aString232 = arg3 == null ? null : arg3.getMessage();
	}

	@OriginalMember(owner = "client!ur", name = "c", descriptor = "()V", line = 95)
	@Override
	public void method31717() {
		@Pc(5) Class77_Sub20 local5 = Class365.method28132(Class414.aClass414_3, client.aClass82_2.aClass16_1);
		@Pc(16) int local16 = (local5.aClass77_Sub39_Sub1_2.anInt3089 += -1387468933) * 31645619;
		local5.aClass77_Sub39_Sub1_2.method22403(this.aClass49_3.method36479());
		local5.aClass77_Sub39_Sub1_2.method22440(this.aString231);
		local5.aClass77_Sub39_Sub1_2.method22408(this.anInt5447 * -1993065431);
		local5.aClass77_Sub39_Sub1_2.method22440(Class508.aString220);
		if (this.aString232 == null) {
			local5.aClass77_Sub39_Sub1_2.method22403(0);
		} else {
			local5.aClass77_Sub39_Sub1_2.method22403(1);
			@Pc(54) String local54 = this.aString232;
			if (local54.length() > 100) {
				local54 = local54.substring(0, 100);
			}
			local5.aClass77_Sub39_Sub1_2.method22440(local54);
		}
		local5.aClass77_Sub39_Sub1_2.method22463(local5.aClass77_Sub39_Sub1_2.anInt3089 * 31645619 - local16);
		client.aClass82_2.method2004(local5);
	}

	@OriginalMember(owner = "client!ur", name = "l", descriptor = "()V", line = 95)
	@Override
	public void method31716() {
		@Pc(5) Class77_Sub20 local5 = Class365.method28132(Class414.aClass414_3, client.aClass82_2.aClass16_1);
		@Pc(16) int local16 = (local5.aClass77_Sub39_Sub1_2.anInt3089 += -1387468933) * 31645619;
		local5.aClass77_Sub39_Sub1_2.method22403(this.aClass49_3.method36479());
		local5.aClass77_Sub39_Sub1_2.method22440(this.aString231);
		local5.aClass77_Sub39_Sub1_2.method22408(this.anInt5447 * -1993065431);
		local5.aClass77_Sub39_Sub1_2.method22440(Class508.aString220);
		if (this.aString232 == null) {
			local5.aClass77_Sub39_Sub1_2.method22403(0);
		} else {
			local5.aClass77_Sub39_Sub1_2.method22403(1);
			@Pc(54) String local54 = this.aString232;
			if (local54.length() > 100) {
				local54 = local54.substring(0, 100);
			}
			local5.aClass77_Sub39_Sub1_2.method22440(local54);
		}
		local5.aClass77_Sub39_Sub1_2.method22463(local5.aClass77_Sub39_Sub1_2.anInt3089 * 31645619 - local16);
		client.aClass82_2.method2004(local5);
	}

	@OriginalMember(owner = "client!ur", name = "v", descriptor = "()V", line = 95)
	@Override
	public void method31718() {
		@Pc(5) Class77_Sub20 local5 = Class365.method28132(Class414.aClass414_3, client.aClass82_2.aClass16_1);
		@Pc(16) int local16 = (local5.aClass77_Sub39_Sub1_2.anInt3089 += -1387468933) * 31645619;
		local5.aClass77_Sub39_Sub1_2.method22403(this.aClass49_3.method36479());
		local5.aClass77_Sub39_Sub1_2.method22440(this.aString231);
		local5.aClass77_Sub39_Sub1_2.method22408(this.anInt5447 * -1993065431);
		local5.aClass77_Sub39_Sub1_2.method22440(Class508.aString220);
		if (this.aString232 == null) {
			local5.aClass77_Sub39_Sub1_2.method22403(0);
		} else {
			local5.aClass77_Sub39_Sub1_2.method22403(1);
			@Pc(54) String local54 = this.aString232;
			if (local54.length() > 100) {
				local54 = local54.substring(0, 100);
			}
			local5.aClass77_Sub39_Sub1_2.method22440(local54);
		}
		local5.aClass77_Sub39_Sub1_2.method22463(local5.aClass77_Sub39_Sub1_2.anInt3089 * 31645619 - local16);
		client.aClass82_2.method2004(local5);
	}

	@OriginalMember(owner = "client!ur", name = "p", descriptor = "(I)V", line = 95)
	@Override
	public void method31719() {
		@Pc(5) Class77_Sub20 local5 = Class365.method28132(Class414.aClass414_3, client.aClass82_2.aClass16_1);
		@Pc(16) int local16 = (local5.aClass77_Sub39_Sub1_2.anInt3089 += -1387468933) * 31645619;
		local5.aClass77_Sub39_Sub1_2.method22403(this.aClass49_3.method36479());
		local5.aClass77_Sub39_Sub1_2.method22440(this.aString231);
		local5.aClass77_Sub39_Sub1_2.method22408(this.anInt5447 * -1993065431);
		local5.aClass77_Sub39_Sub1_2.method22440(Class508.aString220);
		if (this.aString232 == null) {
			local5.aClass77_Sub39_Sub1_2.method22403(0);
		} else {
			local5.aClass77_Sub39_Sub1_2.method22403(1);
			@Pc(54) String local54 = this.aString232;
			if (local54.length() > 100) {
				local54 = local54.substring(0, 100);
			}
			local5.aClass77_Sub39_Sub1_2.method22440(local54);
		}
		local5.aClass77_Sub39_Sub1_2.method22463(local5.aClass77_Sub39_Sub1_2.anInt3089 * 31645619 - local16);
		client.aClass82_2.method2004(local5);
	}

	@OriginalMember(owner = "client!ur", name = "y", descriptor = "()V", line = 95)
	@Override
	public void method31720() {
		@Pc(5) Class77_Sub20 local5 = Class365.method28132(Class414.aClass414_3, client.aClass82_2.aClass16_1);
		@Pc(16) int local16 = (local5.aClass77_Sub39_Sub1_2.anInt3089 += -1387468933) * 31645619;
		local5.aClass77_Sub39_Sub1_2.method22403(this.aClass49_3.method36479());
		local5.aClass77_Sub39_Sub1_2.method22440(this.aString231);
		local5.aClass77_Sub39_Sub1_2.method22408(this.anInt5447 * -1993065431);
		local5.aClass77_Sub39_Sub1_2.method22440(Class508.aString220);
		if (this.aString232 == null) {
			local5.aClass77_Sub39_Sub1_2.method22403(0);
		} else {
			local5.aClass77_Sub39_Sub1_2.method22403(1);
			@Pc(54) String local54 = this.aString232;
			if (local54.length() > 100) {
				local54 = local54.substring(0, 100);
			}
			local5.aClass77_Sub39_Sub1_2.method22440(local54);
		}
		local5.aClass77_Sub39_Sub1_2.method22463(local5.aClass77_Sub39_Sub1_2.anInt3089 * 31645619 - local16);
		client.aClass82_2.method2004(local5);
	}

	@OriginalMember(owner = "client!ur", name = "adk", descriptor = "(Lclient!yf;I)V", line = 9801)
	static final void method31709(@OriginalArg(0) Class665 arg0) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt5781 -= 1460193483) * 1485266147];
		@Pc(19) StringBuilder local19 = new StringBuilder(local13.length());
		@Pc(21) boolean local21 = false;
		for (@Pc(23) int local23 = 0; local23 < local13.length(); local23++) {
			@Pc(31) char local31 = local13.charAt(local23);
			if (local31 == '<') {
				local21 = true;
			} else if (local31 == '>') {
				local21 = false;
			} else if (!local21) {
				local19.append(local31);
			}
		}
		arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = local19.toString();
	}

	@OriginalMember(owner = "client!ur", name = "ava", descriptor = "(Lclient!yf;B)V", line = 13107)
	static final void method31710(@OriginalArg(0) Class665 arg0) {
		if (Class155.anInt3184 * -710165623 == 1) {
			Class155.aBoolean513 = true;
		} else if (Class155.anInt3184 * -710165623 == 3) {
			Class155.aBoolean514 = true;
		}
	}
}
