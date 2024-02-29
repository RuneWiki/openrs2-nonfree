package com.jagex;

import java.util.Queue;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aqq")
public class Class77_Sub3_Sub2 extends Class77_Sub3 {

	@OriginalMember(owner = "client!aqq", name = "s", descriptor = "Ljava/lang/String;")
	static String aString96;

	@OriginalMember(owner = "client!aqq", name = "w", descriptor = "B")
	byte aByte80;

	@OriginalMember(owner = "client!aqq", name = "y", descriptor = "B")
	byte aByte81;

	@OriginalMember(owner = "client!aqq", name = "l", descriptor = "Ljava/lang/String;")
	String aString97;

	// $FF: synthetic field
	@OriginalMember(owner = "client!aqq", name = "this$0", descriptor = "Lclient!kv;")
	final Class367 this$0;

	@OriginalMember(owner = "client!aqq", name = "w", descriptor = "(B)V", line = 103)
	public static void method21692() {
		@Pc(2) Queue local2 = Class640.aQueue3;
		synchronized (Class640.aQueue3) {
			while (true) {
				@Pc(7) Class77_Sub42_Sub1 local7 = (Class77_Sub42_Sub1) Class640.aQueue3.poll();
				if (local7 == null) {
					return;
				}
				local7.method22720();
			}
		}
	}

	@OriginalMember(owner = "client!aqq", name = "<init>", descriptor = "(Lclient!kv;)V", line = 154)
	Class77_Sub3_Sub2(@OriginalArg(0) Class367 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!aqq", name = "p", descriptor = "(Lclient!akv;I)V", line = 157)
	@Override
	void method21806(@OriginalArg(0) Class77_Sub39 arg0) {
		this.aString97 = arg0.method22520();
		if (this.aString97 != null) {
			arg0.method22478();
			this.aByte81 = arg0.method22481();
			this.aByte80 = arg0.method22481();
		}
	}

	@OriginalMember(owner = "client!aqq", name = "v", descriptor = "(Lclient!akv;)V", line = 157)
	@Override
	void method21808(@OriginalArg(0) Class77_Sub39 arg0) {
		this.aString97 = arg0.method22520();
		if (this.aString97 != null) {
			arg0.method22478();
			this.aByte81 = arg0.method22481();
			this.aByte80 = arg0.method22481();
		}
	}

	@OriginalMember(owner = "client!aqq", name = "y", descriptor = "(Lclient!ajy;)V", line = 166)
	@Override
	void method21807(@OriginalArg(0) Class77_Sub25 arg0) {
		arg0.aString49 = this.aString97;
		if (this.aString97 != null) {
			arg0.aByte57 = this.aByte81;
			arg0.aByte56 = this.aByte80;
		}
	}

	@OriginalMember(owner = "client!aqq", name = "c", descriptor = "(Lclient!ajy;I)V", line = 166)
	@Override
	void method21805(@OriginalArg(0) Class77_Sub25 arg0) {
		arg0.aString49 = this.aString97;
		if (this.aString97 != null) {
			arg0.aByte57 = this.aByte81;
			arg0.aByte56 = this.aByte80;
		}
	}

	@OriginalMember(owner = "client!aqq", name = "l", descriptor = "(Lclient!ajy;)V", line = 166)
	@Override
	void method21809(@OriginalArg(0) Class77_Sub25 arg0) {
		arg0.aString49 = this.aString97;
		if (this.aString97 != null) {
			arg0.aByte57 = this.aByte81;
			arg0.aByte56 = this.aByte80;
		}
	}
}
