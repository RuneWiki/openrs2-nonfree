package com.jagex;

import java.util.LinkedList;
import java.util.Queue;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!alx")
public class Class147_Sub1 extends Class147 {

	@OriginalMember(owner = "client!alx", name = "w", descriptor = "Ljava/util/Queue;")
	final Queue aQueue1 = new LinkedList();

	@OriginalMember(owner = "client!alx", name = "<init>", descriptor = "()V", line = 15)
	Class147_Sub1() {
	}

	@OriginalMember(owner = "client!alx", name = "av", descriptor = "(Lclient!ark;)V", line = 18)
	void method15558(@OriginalArg(0) Class77_Sub42_Sub1 arg0) {
		this.aQueue1.add(arg0);
		if (this.aQueue1.size() > 10) {
			this.aQueue1.poll();
		}
	}

	@OriginalMember(owner = "client!alx", name = "ad", descriptor = "(Lclient!ark;B)V", line = 18)
	void method15559(@OriginalArg(0) Class77_Sub42_Sub1 arg0) {
		this.aQueue1.add(arg0);
		if (this.aQueue1.size() > 10) {
			this.aQueue1.poll();
		}
	}

	@OriginalMember(owner = "client!alx", name = "at", descriptor = "(Lclient!ark;)V", line = 18)
	void method15560(@OriginalArg(0) Class77_Sub42_Sub1 arg0) {
		this.aQueue1.add(arg0);
		if (this.aQueue1.size() > 10) {
			this.aQueue1.poll();
		}
	}

	@OriginalMember(owner = "client!alx", name = "ae", descriptor = "(Lclient!ark;)V", line = 18)
	void method15561(@OriginalArg(0) Class77_Sub42_Sub1 arg0) {
		this.aQueue1.add(arg0);
		if (this.aQueue1.size() > 10) {
			this.aQueue1.poll();
		}
	}

	@OriginalMember(owner = "client!alx", name = "t", descriptor = "(B)V", line = 23)
	@Override
	void method15642() {
		@Pc(4) Class77_Sub42_Sub1 local4 = (Class77_Sub42_Sub1) this.aQueue1.poll();
		if (local4 == null) {
			return;
		}
		@Pc(14) Class77_Sub20 local14 = Class365.method28132(Class414.aClass414_118, client.aClass82_2.aClass16_1);
		local14.aClass77_Sub39_Sub1_2.method22605(this.method15617(local4, 65535));
		local14.aClass77_Sub39_Sub1_2.method22641(local4.method22716() | local4.method22717() << 16);
		local14.aClass77_Sub39_Sub1_2.method22578(local4.method22379() << 1 | local4.method22378() & 0x1);
		client.aClass82_2.method2004(local14);
		local4.method22720();
	}

	@OriginalMember(owner = "client!alx", name = "r", descriptor = "()V", line = 23)
	@Override
	void method15632() {
		@Pc(4) Class77_Sub42_Sub1 local4 = (Class77_Sub42_Sub1) this.aQueue1.poll();
		if (local4 == null) {
			return;
		}
		@Pc(14) Class77_Sub20 local14 = Class365.method28132(Class414.aClass414_118, client.aClass82_2.aClass16_1);
		local14.aClass77_Sub39_Sub1_2.method22605(this.method15617(local4, 65535));
		local14.aClass77_Sub39_Sub1_2.method22641(local4.method22716() | local4.method22717() << 16);
		local14.aClass77_Sub39_Sub1_2.method22578(local4.method22379() << 1 | local4.method22378() & 0x1);
		client.aClass82_2.method2004(local14);
		local4.method22720();
	}

	@OriginalMember(owner = "client!alx", name = "d", descriptor = "()V", line = 23)
	@Override
	void method15631() {
		@Pc(4) Class77_Sub42_Sub1 local4 = (Class77_Sub42_Sub1) this.aQueue1.poll();
		if (local4 == null) {
			return;
		}
		@Pc(14) Class77_Sub20 local14 = Class365.method28132(Class414.aClass414_118, client.aClass82_2.aClass16_1);
		local14.aClass77_Sub39_Sub1_2.method22605(this.method15617(local4, 65535));
		local14.aClass77_Sub39_Sub1_2.method22641(local4.method22716() | local4.method22717() << 16);
		local14.aClass77_Sub39_Sub1_2.method22578(local4.method22379() << 1 | local4.method22378() & 0x1);
		client.aClass82_2.method2004(local14);
		local4.method22720();
	}

	@OriginalMember(owner = "client!alx", name = "s", descriptor = "()V", line = 23)
	@Override
	void method15627() {
		@Pc(4) Class77_Sub42_Sub1 local4 = (Class77_Sub42_Sub1) this.aQueue1.poll();
		if (local4 == null) {
			return;
		}
		@Pc(14) Class77_Sub20 local14 = Class365.method28132(Class414.aClass414_118, client.aClass82_2.aClass16_1);
		local14.aClass77_Sub39_Sub1_2.method22605(this.method15617(local4, 65535));
		local14.aClass77_Sub39_Sub1_2.method22641(local4.method22716() | local4.method22717() << 16);
		local14.aClass77_Sub39_Sub1_2.method22578(local4.method22379() << 1 | local4.method22378() & 0x1);
		client.aClass82_2.method2004(local14);
		local4.method22720();
	}

	@OriginalMember(owner = "client!alx", name = "q", descriptor = "(B)Z", line = 34)
	@Override
	boolean method15629() {
		return !this.aQueue1.isEmpty() || this.aLong110 * 1164426520149525653L < Class280.method26667() - 2000L;
	}

	@OriginalMember(owner = "client!alx", name = "g", descriptor = "()Z", line = 34)
	@Override
	boolean method15633() {
		return !this.aQueue1.isEmpty() || this.aLong110 * 1164426520149525653L < Class280.method26667() - 2000L;
	}

	@OriginalMember(owner = "client!alx", name = "j", descriptor = "()Lclient!ajt;", line = 38)
	@Override
	Class77_Sub20 method15635() {
		return Class365.method28132(Class414.aClass414_71, client.aClass82_2.aClass16_1);
	}

	@OriginalMember(owner = "client!alx", name = "z", descriptor = "()Lclient!ajt;", line = 38)
	@Override
	Class77_Sub20 method15634() {
		return Class365.method28132(Class414.aClass414_71, client.aClass82_2.aClass16_1);
	}

	@OriginalMember(owner = "client!alx", name = "i", descriptor = "()Lclient!ajt;", line = 38)
	@Override
	Class77_Sub20 method15636() {
		return Class365.method28132(Class414.aClass414_71, client.aClass82_2.aClass16_1);
	}

	@OriginalMember(owner = "client!alx", name = "x", descriptor = "(I)Lclient!ajt;", line = 38)
	@Override
	Class77_Sub20 method15643() {
		return Class365.method28132(Class414.aClass414_71, client.aClass82_2.aClass16_1);
	}

	@OriginalMember(owner = "client!alx", name = "ac", descriptor = "(Lclient!akv;Lclient!ark;S)V", line = 42)
	void method15562(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) Class77_Sub42_Sub1 arg1) {
		arg0.method22403(arg1.method22378());
	}

	@OriginalMember(owner = "client!alx", name = "ah", descriptor = "(Lclient!akv;Lclient!ark;)V", line = 42)
	void method15563(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) Class77_Sub42_Sub1 arg1) {
		arg0.method22403(arg1.method22378());
	}

	@OriginalMember(owner = "client!alx", name = "k", descriptor = "()I", line = 46)
	@Override
	int method15630() {
		return 1;
	}

	@OriginalMember(owner = "client!alx", name = "y", descriptor = "(I)I", line = 46)
	@Override
	int method15641() {
		return 1;
	}

	@OriginalMember(owner = "client!alx", name = "u", descriptor = "()I", line = 46)
	@Override
	int method15637() {
		return 1;
	}

	@OriginalMember(owner = "client!alx", name = "e", descriptor = "()I", line = 46)
	@Override
	int method15638() {
		return 1;
	}

	@OriginalMember(owner = "client!alx", name = "w", descriptor = "(Lclient!akv;Lclient!akz;B)V", line = 50)
	@Override
	void method15628(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) Class77_Sub42 arg1) {
		this.method15562(arg0, (Class77_Sub42_Sub1) arg1);
	}

	@OriginalMember(owner = "client!alx", name = "f", descriptor = "(Lclient!akv;Lclient!akz;)V", line = 50)
	@Override
	void method15639(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) Class77_Sub42 arg1) {
		this.method15562(arg0, (Class77_Sub42_Sub1) arg1);
	}

	@OriginalMember(owner = "client!alx", name = "o", descriptor = "(Lclient!akv;Lclient!akz;)V", line = 50)
	@Override
	void method15640(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) Class77_Sub42 arg1) {
		this.method15562(arg0, (Class77_Sub42_Sub1) arg1);
	}
}
