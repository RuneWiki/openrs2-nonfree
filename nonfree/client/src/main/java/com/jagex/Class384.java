package com.jagex;

import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pb")
public class Class384 {

	@OriginalMember(owner = "client!pb", name = "h", descriptor = "I")
	public int anInt4715;

	@OriginalMember(owner = "client!pb", name = "g", descriptor = "I")
	public int anInt4717;

	@OriginalMember(owner = "client!pb", name = "l", descriptor = "I")
	public int anInt4718;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
	public int anInt4716 = -1212547221;

	@OriginalMember(owner = "client!pb", name = "p", descriptor = "Lclient!wi;")
	public final Class71 aClass71_7;

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(Lclient!act;)V", line = 12)
	Class384(@OriginalArg(0) Class26_Sub1_Sub1_Sub1 arg0) {
		this.aClass71_7 = new Class71_Sub3(arg0, false);
	}

	@OriginalMember(owner = "client!pb", name = "p", descriptor = "(I)Lclient!aht;", line = 38)
	static Class3_Sub45 method27331() {
		@Pc(1) Class592 local1 = null;
		@Pc(7) Class3_Sub45 local7 = new Class3_Sub45(client.aClass543_2, 0);
		try {
			local1 = Class348.method26559("", client.aClass543_2.aString236, false);
			@Pc(20) byte[] local20 = new byte[(int) local1.method33340()];
			@Pc(36) int local36;
			for (@Pc(22) int local22 = 0; local22 < local20.length; local22 += local36) {
				local36 = local1.method33341(local20, local22, local20.length - local22);
				if (local36 == -1) {
					throw new IOException();
				}
			}
			local7 = new Class3_Sub45(new Class3_Sub41(local20), client.aClass543_2, 0);
		} catch (@Pc(60) Exception local60) {
		}
		try {
			if (local1 != null) {
				local1.method33339();
			}
		} catch (@Pc(68) Exception local68) {
		}
		return local7;
	}

	@OriginalMember(owner = "client!pb", name = "asl", descriptor = "(Lclient!vs;B)V", line = 12210)
	static final void method27330(@OriginalArg(0) Class536 arg0) {
		Class280.method25423();
		Class412.method27705();
		client.aClass370_1.method26968();
		Class26_Sub1_Sub1_Sub1.method16728();
		client.aBoolean573 = false;
	}
}
