package com.jagex;

import java.util.LinkedList;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ry")
public class Class541 implements Runnable {

	@OriginalMember(owner = "client!ry", name = "e", descriptor = "Z")
	volatile boolean aBoolean803 = false;

	@OriginalMember(owner = "client!ry", name = "n", descriptor = "Ljava/util/LinkedList;")
	LinkedList aLinkedList3 = new LinkedList();

	@OriginalMember(owner = "client!ry", name = "m", descriptor = "Lclient!rl;")
	Class532 aClass532_2 = new Class532(true);

	@OriginalMember(owner = "client!ry", name = "e", descriptor = "(Lclient!aop;I)V", line = 13)
	public void method30902(@OriginalArg(0) Class32_Sub14 arg0) {
		this.aClass532_2.method30449(arg0);
	}

	@OriginalMember(owner = "client!ry", name = "u", descriptor = "(Lclient!aop;)V", line = 13)
	public void method30914(@OriginalArg(0) Class32_Sub14 arg0) {
		this.aClass532_2.method30449(arg0);
	}

	@OriginalMember(owner = "client!ry", name = "z", descriptor = "(Lclient!aop;)V", line = 13)
	public void method30915(@OriginalArg(0) Class32_Sub14 arg0) {
		this.aClass532_2.method30449(arg0);
	}

	@OriginalMember(owner = "client!ry", name = "d", descriptor = "(Lclient!rt;)V", line = 17)
	public void method30903(@OriginalArg(0) Class537 arg0) {
		@Pc(3) LinkedList local3 = this.aLinkedList3;
		synchronized (this.aLinkedList3) {
			this.aLinkedList3.add(arg0);
			this.aLinkedList3.notify();
		}
	}

	@OriginalMember(owner = "client!ry", name = "n", descriptor = "(Lclient!rt;B)V", line = 17)
	public void method30908(@OriginalArg(0) Class537 arg0) {
		@Pc(3) LinkedList local3 = this.aLinkedList3;
		synchronized (this.aLinkedList3) {
			this.aLinkedList3.add(arg0);
			this.aLinkedList3.notify();
		}
	}

	@OriginalMember(owner = "client!ry", name = "p", descriptor = "(Lclient!rt;)V", line = 17)
	public void method30909(@OriginalArg(0) Class537 arg0) {
		@Pc(3) LinkedList local3 = this.aLinkedList3;
		synchronized (this.aLinkedList3) {
			this.aLinkedList3.add(arg0);
			this.aLinkedList3.notify();
		}
	}

	@OriginalMember(owner = "client!ry", name = "s", descriptor = "(Lclient!rt;)V", line = 17)
	public void method30918(@OriginalArg(0) Class537 arg0) {
		@Pc(3) LinkedList local3 = this.aLinkedList3;
		synchronized (this.aLinkedList3) {
			this.aLinkedList3.add(arg0);
			this.aLinkedList3.notify();
		}
	}

	@OriginalMember(owner = "client!ry", name = "y", descriptor = "(Lclient!rt;)V", line = 17)
	public void method30919(@OriginalArg(0) Class537 arg0) {
		@Pc(3) LinkedList local3 = this.aLinkedList3;
		synchronized (this.aLinkedList3) {
			this.aLinkedList3.add(arg0);
			this.aLinkedList3.notify();
		}
	}

	@OriginalMember(owner = "client!ry", name = "m", descriptor = "(I)Z", line = 24)
	public boolean method30904() {
		return this.aBoolean803;
	}

	@OriginalMember(owner = "client!ry", name = "q", descriptor = "()Z", line = 24)
	public boolean method30920() {
		return this.aBoolean803;
	}

	@OriginalMember(owner = "client!ry", name = "x", descriptor = "()Z", line = 24)
	public boolean method30921() {
		return this.aBoolean803;
	}

	@OriginalMember(owner = "client!ry", name = "b", descriptor = "()Z", line = 24)
	public boolean method30922() {
		return this.aBoolean803;
	}

	@OriginalMember(owner = "client!ry", name = "k", descriptor = "(I)Lclient!rl;", line = 28)
	public Class532 method30905() {
		return this.aClass532_2;
	}

	@OriginalMember(owner = "client!ry", name = "a", descriptor = "()Lclient!rl;", line = 28)
	public Class532 method30912() {
		return this.aClass532_2;
	}

	@OriginalMember(owner = "client!ry", name = "h", descriptor = "()Lclient!rl;", line = 28)
	public Class532 method30923() {
		return this.aClass532_2;
	}

	@OriginalMember(owner = "client!ry", name = "f", descriptor = "(Lclient!rl;I)V", line = 32)
	void method30906(@OriginalArg(0) Class532 arg0) {
		this.aClass532_2 = arg0;
	}

	@OriginalMember(owner = "client!ry", name = "g", descriptor = "(Lclient!rl;)V", line = 32)
	void method30924(@OriginalArg(0) Class532 arg0) {
		this.aClass532_2 = arg0;
	}

	@OriginalMember(owner = "client!ry", name = "run", descriptor = "()V", line = 37)
	@Override
	public void run() {
		while (true) {
			this.method30916();
		}
	}

	@OriginalMember(owner = "client!ry", name = "c", descriptor = "()V", line = 37)
	public void method30910() {
		while (true) {
			this.method30916();
		}
	}

	@OriginalMember(owner = "client!ry", name = "v", descriptor = "()V", line = 37)
	public void method30911() {
		while (true) {
			this.method30916();
		}
	}

	@OriginalMember(owner = "client!ry", name = "o", descriptor = "()V", line = 37)
	public void method30913() {
		while (true) {
			this.method30916();
		}
	}

	@OriginalMember(owner = "client!ry", name = "r", descriptor = "()V", line = 37)
	public void method30928() {
		while (true) {
			this.method30916();
		}
	}

	@OriginalMember(owner = "client!ry", name = "w", descriptor = "(I)V", line = 42)
	void method30916() {
		@Pc(5) LinkedList local5 = this.aLinkedList3;
		@Pc(16) Class537 local16;
		synchronized (this.aLinkedList3) {
			try {
				this.aLinkedList3.wait();
			} catch (@Pc(11) InterruptedException local11) {
			}
			local16 = (Class537) this.aLinkedList3.pollFirst();
		}
		try {
			if (local16 != null) {
				this.aBoolean803 = true;
				this.method30917(local16);
			}
		} catch (@Pc(39) Exception local39) {
		} finally {
			this.aBoolean803 = false;
		}
	}

	@OriginalMember(owner = "client!ry", name = "i", descriptor = "()V", line = 42)
	void method30925() {
		@Pc(5) LinkedList local5 = this.aLinkedList3;
		@Pc(16) Class537 local16;
		synchronized (this.aLinkedList3) {
			try {
				this.aLinkedList3.wait();
			} catch (@Pc(11) InterruptedException local11) {
			}
			local16 = (Class537) this.aLinkedList3.pollFirst();
		}
		try {
			if (local16 != null) {
				this.aBoolean803 = true;
				this.method30917(local16);
			}
		} catch (@Pc(39) Exception local39) {
		} finally {
			this.aBoolean803 = false;
		}
	}

	@OriginalMember(owner = "client!ry", name = "ae", descriptor = "(Lclient!rt;)V", line = 63)
	void method30907(@OriginalArg(0) Class537 arg0) {
		if (arg0.aClass526_11 == Class526.aClass526_7) {
			this.aClass532_2.method30469();
		} else {
			this.aClass532_2.method30465(arg0);
		}
		for (@Pc(18) boolean local18 = this.aClass532_2.method30439(); !local18; local18 = this.aClass532_2.method30439()) {
		}
		this.aClass532_2.method30445();
		client.aClass532_1.method30445();
	}

	@OriginalMember(owner = "client!ry", name = "l", descriptor = "(Lclient!rt;I)V", line = 63)
	void method30917(@OriginalArg(0) Class537 arg0) {
		if (arg0.aClass526_11 == Class526.aClass526_7) {
			this.aClass532_2.method30469();
		} else {
			this.aClass532_2.method30465(arg0);
		}
		for (@Pc(18) boolean local18 = this.aClass532_2.method30439(); !local18; local18 = this.aClass532_2.method30439()) {
		}
		this.aClass532_2.method30445();
		client.aClass532_1.method30445();
	}

	@OriginalMember(owner = "client!ry", name = "j", descriptor = "(Lclient!rt;)V", line = 63)
	void method30926(@OriginalArg(0) Class537 arg0) {
		if (arg0.aClass526_11 == Class526.aClass526_7) {
			this.aClass532_2.method30469();
		} else {
			this.aClass532_2.method30465(arg0);
		}
		for (@Pc(18) boolean local18 = this.aClass532_2.method30439(); !local18; local18 = this.aClass532_2.method30439()) {
		}
		this.aClass532_2.method30445();
		client.aClass532_1.method30445();
	}

	@OriginalMember(owner = "client!ry", name = "t", descriptor = "(Lclient!rt;)V", line = 63)
	void method30927(@OriginalArg(0) Class537 arg0) {
		if (arg0.aClass526_11 == Class526.aClass526_7) {
			this.aClass532_2.method30469();
		} else {
			this.aClass532_2.method30465(arg0);
		}
		for (@Pc(18) boolean local18 = this.aClass532_2.method30439(); !local18; local18 = this.aClass532_2.method30439()) {
		}
		this.aClass532_2.method30445();
		client.aClass532_1.method30445();
	}

	@OriginalMember(owner = "client!ry", name = "fn", descriptor = "(Lclient!yf;I)V", line = 5905)
	static final void method30929(@OriginalArg(0) Class681 arg0) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class583.method31424(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!ry", name = "acc", descriptor = "(Lclient!yf;B)V", line = 9994)
	static final void method30930(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = arg0.aClass386_3.aByte151;
	}
}
