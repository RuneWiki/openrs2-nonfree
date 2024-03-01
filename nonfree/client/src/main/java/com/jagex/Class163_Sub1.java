package com.jagex;

import java.util.LinkedList;
import java.util.Queue;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!alp")
public class Class163_Sub1 extends Class163 {

	@OriginalMember(owner = "client!alp", name = "w", descriptor = "Ljava/util/Queue;")
	final Queue aQueue1 = new LinkedList();

	@OriginalMember(owner = "client!alp", name = "<init>", descriptor = "()V", line = 15)
	Class163_Sub1() {
	}

	@OriginalMember(owner = "client!alp", name = "i", descriptor = "(Lclient!asp;B)V", line = 18)
	void method14845(@OriginalArg(0) Class93_Sub23_Sub2 arg0) {
		this.aQueue1.add(arg0);
		if (this.aQueue1.size() > 10) {
			this.aQueue1.poll();
		}
	}

	@OriginalMember(owner = "client!alp", name = "ag", descriptor = "(Lclient!asp;)V", line = 18)
	void method14846(@OriginalArg(0) Class93_Sub23_Sub2 arg0) {
		this.aQueue1.add(arg0);
		if (this.aQueue1.size() > 10) {
			this.aQueue1.poll();
		}
	}

	@OriginalMember(owner = "client!alp", name = "ae", descriptor = "(Lclient!asp;)V", line = 18)
	void method14848(@OriginalArg(0) Class93_Sub23_Sub2 arg0) {
		this.aQueue1.add(arg0);
		if (this.aQueue1.size() > 10) {
			this.aQueue1.poll();
		}
	}

	@OriginalMember(owner = "client!alp", name = "t", descriptor = "(Lclient!asp;)V", line = 18)
	void method14851(@OriginalArg(0) Class93_Sub23_Sub2 arg0) {
		this.aQueue1.add(arg0);
		if (this.aQueue1.size() > 10) {
			this.aQueue1.poll();
		}
	}

	@OriginalMember(owner = "client!alp", name = "p", descriptor = "()V", line = 23)
	@Override
	void method14910() {
		@Pc(4) Class93_Sub23_Sub2 local4 = (Class93_Sub23_Sub2) this.aQueue1.poll();
		if (local4 == null) {
			return;
		}
		@Pc(14) Class93_Sub22 local14 = Class102.method2592(Class446.aClass446_8, client.aClass175_2.aClass24_2);
		local14.aClass93_Sub41_Sub2_1.method22395(local4.method22873() | local4.method22874() << 16);
		local14.aClass93_Sub41_Sub2_1.method22590(this.method14904(local4, 65535));
		local14.aClass93_Sub41_Sub2_1.method22446(local4.method22895() << 1 | local4.method22893() & 0x1);
		client.aClass175_2.method24351(local14);
		local4.method22877();
	}

	@OriginalMember(owner = "client!alp", name = "l", descriptor = "(I)V", line = 23)
	@Override
	void method14912() {
		@Pc(4) Class93_Sub23_Sub2 local4 = (Class93_Sub23_Sub2) this.aQueue1.poll();
		if (local4 == null) {
			return;
		}
		@Pc(14) Class93_Sub22 local14 = Class102.method2592(Class446.aClass446_8, client.aClass175_2.aClass24_2);
		local14.aClass93_Sub41_Sub2_1.method22395(local4.method22873() | local4.method22874() << 16);
		local14.aClass93_Sub41_Sub2_1.method22590(this.method14904(local4, 65535));
		local14.aClass93_Sub41_Sub2_1.method22446(local4.method22895() << 1 | local4.method22893() & 0x1);
		client.aClass175_2.method24351(local14);
		local4.method22877();
	}

	@OriginalMember(owner = "client!alp", name = "d", descriptor = "()V", line = 23)
	@Override
	void method14911() {
		@Pc(4) Class93_Sub23_Sub2 local4 = (Class93_Sub23_Sub2) this.aQueue1.poll();
		if (local4 == null) {
			return;
		}
		@Pc(14) Class93_Sub22 local14 = Class102.method2592(Class446.aClass446_8, client.aClass175_2.aClass24_2);
		local14.aClass93_Sub41_Sub2_1.method22395(local4.method22873() | local4.method22874() << 16);
		local14.aClass93_Sub41_Sub2_1.method22590(this.method14904(local4, 65535));
		local14.aClass93_Sub41_Sub2_1.method22446(local4.method22895() << 1 | local4.method22893() & 0x1);
		client.aClass175_2.method24351(local14);
		local4.method22877();
	}

	@OriginalMember(owner = "client!alp", name = "u", descriptor = "(I)Z", line = 34)
	@Override
	boolean method14914() {
		return !this.aQueue1.isEmpty() || this.aLong106 * -1130360274060180351L < Class305.method26796() - 2000L;
	}

	@OriginalMember(owner = "client!alp", name = "c", descriptor = "()Z", line = 34)
	@Override
	boolean method14900() {
		return !this.aQueue1.isEmpty() || this.aLong106 * -1130360274060180351L < Class305.method26796() - 2000L;
	}

	@OriginalMember(owner = "client!alp", name = "z", descriptor = "(S)Lclient!akl;", line = 38)
	@Override
	Class93_Sub22 method14909() {
		return Class102.method2592(Class446.aClass446_7, client.aClass175_2.aClass24_2);
	}

	@OriginalMember(owner = "client!alp", name = "r", descriptor = "()Lclient!akl;", line = 38)
	@Override
	Class93_Sub22 method14913() {
		return Class102.method2592(Class446.aClass446_7, client.aClass175_2.aClass24_2);
	}

	@OriginalMember(owner = "client!alp", name = "j", descriptor = "(Lclient!alw;Lclient!asp;I)V", line = 42)
	void method14847(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) Class93_Sub23_Sub2 arg1) {
		arg0.method22510(arg1.method22893());
	}

	@OriginalMember(owner = "client!alp", name = "ah", descriptor = "(Lclient!alw;Lclient!asp;)V", line = 42)
	void method14849(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) Class93_Sub23_Sub2 arg1) {
		arg0.method22510(arg1.method22893());
	}

	@OriginalMember(owner = "client!alp", name = "al", descriptor = "(Lclient!alw;Lclient!asp;)V", line = 42)
	void method14850(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) Class93_Sub23_Sub2 arg1) {
		arg0.method22510(arg1.method22893());
	}

	@OriginalMember(owner = "client!alp", name = "v", descriptor = "()I", line = 46)
	@Override
	int method14901() {
		return 1;
	}

	@OriginalMember(owner = "client!alp", name = "f", descriptor = "(I)I", line = 46)
	@Override
	int method14905() {
		return 1;
	}

	@OriginalMember(owner = "client!alp", name = "w", descriptor = "(Lclient!alw;Lclient!akm;I)V", line = 50)
	@Override
	void method14906(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) Class93_Sub23 arg1) {
		this.method14847(arg0, (Class93_Sub23_Sub2) arg1);
	}

	@OriginalMember(owner = "client!alp", name = "s", descriptor = "(Lclient!alw;Lclient!akm;)V", line = 50)
	@Override
	void method14916(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) Class93_Sub23 arg1) {
		this.method14847(arg0, (Class93_Sub23_Sub2) arg1);
	}

	@OriginalMember(owner = "client!alp", name = "o", descriptor = "(Lclient!alw;Lclient!akm;)V", line = 50)
	@Override
	void method14915(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) Class93_Sub23 arg1) {
		this.method14847(arg0, (Class93_Sub23_Sub2) arg1);
	}
}
