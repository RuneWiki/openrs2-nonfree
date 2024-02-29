package com.jagex;

import java.util.LinkedList;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rm")
public class Class514 implements Runnable {

	@OriginalMember(owner = "client!rm", name = "bg", descriptor = "Ljava/lang/String;")
	static String aString224;

	@OriginalMember(owner = "client!rm", name = "fa", descriptor = "Lclient!pw;")
	public static Class478 aClass478_127;

	@OriginalMember(owner = "client!rm", name = "rm", descriptor = "I")
	static int anInt5109;

	@OriginalMember(owner = "client!rm", name = "p", descriptor = "Z")
	volatile boolean aBoolean778 = false;

	@OriginalMember(owner = "client!rm", name = "c", descriptor = "Ljava/util/LinkedList;")
	LinkedList aLinkedList3 = new LinkedList();

	@OriginalMember(owner = "client!rm", name = "v", descriptor = "Lclient!rq;")
	Class517 aClass517_2 = new Class517(true);

	@OriginalMember(owner = "client!rm", name = "p", descriptor = "(Lclient!anu;I)V", line = 13)
	public void method30346(@OriginalArg(0) Class35_Sub12 arg0) {
		this.aClass517_2.method30461(arg0);
	}

	@OriginalMember(owner = "client!rm", name = "q", descriptor = "(Lclient!anu;)V", line = 13)
	public void method30347(@OriginalArg(0) Class35_Sub12 arg0) {
		this.aClass517_2.method30461(arg0);
	}

	@OriginalMember(owner = "client!rm", name = "x", descriptor = "(Lclient!ro;)V", line = 17)
	public void method30348(@OriginalArg(0) Class516 arg0) {
		@Pc(3) LinkedList local3 = this.aLinkedList3;
		synchronized (this.aLinkedList3) {
			this.aLinkedList3.add(arg0);
			this.aLinkedList3.notify();
		}
	}

	@OriginalMember(owner = "client!rm", name = "d", descriptor = "(Lclient!ro;)V", line = 17)
	public void method30349(@OriginalArg(0) Class516 arg0) {
		@Pc(3) LinkedList local3 = this.aLinkedList3;
		synchronized (this.aLinkedList3) {
			this.aLinkedList3.add(arg0);
			this.aLinkedList3.notify();
		}
	}

	@OriginalMember(owner = "client!rm", name = "s", descriptor = "(Lclient!ro;)V", line = 17)
	public void method30350(@OriginalArg(0) Class516 arg0) {
		@Pc(3) LinkedList local3 = this.aLinkedList3;
		synchronized (this.aLinkedList3) {
			this.aLinkedList3.add(arg0);
			this.aLinkedList3.notify();
		}
	}

	@OriginalMember(owner = "client!rm", name = "c", descriptor = "(Lclient!ro;I)V", line = 17)
	public void method30351(@OriginalArg(0) Class516 arg0) {
		@Pc(3) LinkedList local3 = this.aLinkedList3;
		synchronized (this.aLinkedList3) {
			this.aLinkedList3.add(arg0);
			this.aLinkedList3.notify();
		}
	}

	@OriginalMember(owner = "client!rm", name = "v", descriptor = "(B)Z", line = 24)
	public boolean method30352() {
		return this.aBoolean778;
	}

	@OriginalMember(owner = "client!rm", name = "z", descriptor = "()Z", line = 24)
	public boolean method30353() {
		return this.aBoolean778;
	}

	@OriginalMember(owner = "client!rm", name = "j", descriptor = "()Lclient!rq;", line = 28)
	public Class517 method30354() {
		return this.aClass517_2;
	}

	@OriginalMember(owner = "client!rm", name = "l", descriptor = "(B)Lclient!rq;", line = 28)
	public Class517 method30355() {
		return this.aClass517_2;
	}

	@OriginalMember(owner = "client!rm", name = "y", descriptor = "(Lclient!rq;I)V", line = 32)
	void method30356(@OriginalArg(0) Class517 arg0) {
		this.aClass517_2 = arg0;
	}

	@OriginalMember(owner = "client!rm", name = "i", descriptor = "(Lclient!rq;)V", line = 32)
	void method30357(@OriginalArg(0) Class517 arg0) {
		this.aClass517_2 = arg0;
	}

	@OriginalMember(owner = "client!rm", name = "g", descriptor = "()V", line = 37)
	public void method30358() {
		while (true) {
			this.method30360();
		}
	}

	@OriginalMember(owner = "client!rm", name = "r", descriptor = "()V", line = 37)
	public void method30359() {
		while (true) {
			this.method30360();
		}
	}

	@OriginalMember(owner = "client!rm", name = "run", descriptor = "()V", line = 37)
	@Override
	public void run() {
		while (true) {
			this.method30360();
		}
	}

	@OriginalMember(owner = "client!rm", name = "w", descriptor = "(B)V", line = 42)
	void method30360() {
		@Pc(1) Class516 local1 = null;
		@Pc(5) LinkedList local5 = this.aLinkedList3;
		synchronized (this.aLinkedList3) {
			try {
				this.aLinkedList3.wait();
			} catch (@Pc(11) InterruptedException local11) {
			}
			local1 = (Class516) this.aLinkedList3.pollFirst();
		}
		try {
			if (local1 != null) {
				this.aBoolean778 = true;
				this.method30363(local1);
			}
		} catch (@Pc(39) Exception local39) {
		} finally {
			this.aBoolean778 = false;
		}
	}

	@OriginalMember(owner = "client!rm", name = "u", descriptor = "()V", line = 42)
	void method30361() {
		@Pc(1) Class516 local1 = null;
		@Pc(5) LinkedList local5 = this.aLinkedList3;
		synchronized (this.aLinkedList3) {
			try {
				this.aLinkedList3.wait();
			} catch (@Pc(11) InterruptedException local11) {
			}
			local1 = (Class516) this.aLinkedList3.pollFirst();
		}
		try {
			if (local1 != null) {
				this.aBoolean778 = true;
				this.method30363(local1);
			}
		} catch (@Pc(39) Exception local39) {
		} finally {
			this.aBoolean778 = false;
		}
	}

	@OriginalMember(owner = "client!rm", name = "k", descriptor = "()V", line = 42)
	void method30362() {
		@Pc(1) Class516 local1 = null;
		@Pc(5) LinkedList local5 = this.aLinkedList3;
		synchronized (this.aLinkedList3) {
			try {
				this.aLinkedList3.wait();
			} catch (@Pc(11) InterruptedException local11) {
			}
			local1 = (Class516) this.aLinkedList3.pollFirst();
		}
		try {
			if (local1 != null) {
				this.aBoolean778 = true;
				this.method30363(local1);
			}
		} catch (@Pc(39) Exception local39) {
		} finally {
			this.aBoolean778 = false;
		}
	}

	@OriginalMember(owner = "client!rm", name = "t", descriptor = "(Lclient!ro;I)V", line = 63)
	void method30363(@OriginalArg(0) Class516 arg0) {
		if (Class505.aClass505_7 == arg0.aClass505_9) {
			this.aClass517_2.method30486();
		} else {
			this.aClass517_2.method30488(arg0);
		}
		for (@Pc(18) boolean local18 = this.aClass517_2.method30531(); !local18; local18 = this.aClass517_2.method30531()) {
		}
		this.aClass517_2.method30473();
		client.aClass517_1.method30473();
	}

	@OriginalMember(owner = "client!rm", name = "f", descriptor = "(Lclient!ro;)V", line = 63)
	void method30364(@OriginalArg(0) Class516 arg0) {
		if (Class505.aClass505_7 == arg0.aClass505_9) {
			this.aClass517_2.method30486();
		} else {
			this.aClass517_2.method30488(arg0);
		}
		for (@Pc(18) boolean local18 = this.aClass517_2.method30531(); !local18; local18 = this.aClass517_2.method30531()) {
		}
		this.aClass517_2.method30473();
		client.aClass517_1.method30473();
	}

	@OriginalMember(owner = "client!rm", name = "e", descriptor = "(Lclient!ro;)V", line = 63)
	void method30365(@OriginalArg(0) Class516 arg0) {
		if (Class505.aClass505_7 == arg0.aClass505_9) {
			this.aClass517_2.method30486();
		} else {
			this.aClass517_2.method30488(arg0);
		}
		for (@Pc(18) boolean local18 = this.aClass517_2.method30531(); !local18; local18 = this.aClass517_2.method30531()) {
		}
		this.aClass517_2.method30473();
		client.aClass517_1.method30473();
	}

	@OriginalMember(owner = "client!rm", name = "o", descriptor = "(Lclient!ro;)V", line = 63)
	void method30366(@OriginalArg(0) Class516 arg0) {
		if (Class505.aClass505_7 == arg0.aClass505_9) {
			this.aClass517_2.method30486();
		} else {
			this.aClass517_2.method30488(arg0);
		}
		for (@Pc(18) boolean local18 = this.aClass517_2.method30531(); !local18; local18 = this.aClass517_2.method30531()) {
		}
		this.aClass517_2.method30473();
		client.aClass517_1.method30473();
	}

	@OriginalMember(owner = "client!rm", name = "n", descriptor = "(II)V", line = 147)
	public static void method30367(@OriginalArg(0) int arg0) {
		@Pc(4) Class77_Sub1_Sub6 local4 = Class456.method29469(13, (long) arg0);
		local4.method21544();
	}

	@OriginalMember(owner = "client!rm", name = "gx", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;I)V", line = 5696)
	static final void method30368(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		arg0.anInt3888 = -428332182;
		arg0.aClass328_2 = null;
		arg0.anInt3889 = arg2.anIntArray536[(arg2.anInt5784 -= 308999563) * 2088438307] * 931070365;
		if (arg0.anInt3927 * 1365669833 == -1 && !arg1.aBoolean662) {
			Class623.method32473(arg0.anInt3863 * -1278450723);
		}
	}

	@OriginalMember(owner = "client!rm", name = "aca", descriptor = "(Lclient!yf;I)V", line = 9568)
	static final void method30369(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local13 | local23;
	}

	@OriginalMember(owner = "client!rm", name = "aec", descriptor = "(Lclient!yf;I)V", line = 9930)
	static final void method30370(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(18) Class18 local18 = (Class18) Class537.aClass35_Sub7_1.method18319(local12);
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local18.anInt61 * -1988624023;
	}
}
