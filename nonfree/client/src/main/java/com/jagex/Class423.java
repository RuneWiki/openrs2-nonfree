package com.jagex;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public class Class423 implements Runnable {

	@OriginalMember(owner = "client!r", name = "e", descriptor = "Lclient!aml;")
	static Class3_Sub1_Sub7 aClass3_Sub1_Sub7_5;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "Z")
	volatile boolean aBoolean758;

	@OriginalMember(owner = "client!r", name = "g", descriptor = "Ljava/util/Queue;")
	Queue aQueue2 = new LinkedList();

	@OriginalMember(owner = "client!r", name = "p", descriptor = "Ljava/lang/Thread;")
	final Thread aThread11 = new Thread(this);

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "()V", line = 16)
	Class423() {
		this.aThread11.setPriority(1);
		this.aThread11.start();
	}

	@OriginalMember(owner = "client!r", name = "j", descriptor = "()V", line = 23)
	public void method27877() {
		while (!this.aBoolean758) {
			try {
				@Pc(11) Class75 local11;
				synchronized (this) {
					local11 = (Class75) this.aQueue2.poll();
					if (local11 == null) {
						try {
							this.wait();
						} catch (@Pc(18) InterruptedException local18) {
						}
						continue;
					}
				}
				try {
					@Pc(33) URLConnection local33 = local11.anURL1.openConnection();
					local33.setConnectTimeout(30000);
					@Pc(39) int local39 = local33.getContentLength();
					if (local39 >= 0) {
						@Pc(44) byte[] local44 = new byte[local39];
						(new DataInputStream(local33.getInputStream())).readFully(local44);
						local11.aByteArray48 = local44;
					}
					local11.aBoolean480 = true;
				} catch (@Pc(59) IOException local59) {
					local11.aBoolean480 = true;
				}
			} catch (@Pc(64) Exception local64) {
				Class27_Sub1.method7214(null, local64);
			}
		}
	}

	@OriginalMember(owner = "client!r", name = "run", descriptor = "()V", line = 23)
	@Override
	public void run() {
		while (!this.aBoolean758) {
			try {
				@Pc(11) Class75 local11;
				synchronized (this) {
					local11 = (Class75) this.aQueue2.poll();
					if (local11 == null) {
						try {
							this.wait();
						} catch (@Pc(18) InterruptedException local18) {
						}
						continue;
					}
				}
				try {
					@Pc(33) URLConnection local33 = local11.anURL1.openConnection();
					local33.setConnectTimeout(30000);
					@Pc(39) int local39 = local33.getContentLength();
					if (local39 >= 0) {
						@Pc(44) byte[] local44 = new byte[local39];
						(new DataInputStream(local33.getInputStream())).readFully(local44);
						local11.aByteArray48 = local44;
					}
					local11.aBoolean480 = true;
				} catch (@Pc(59) IOException local59) {
					local11.aBoolean480 = true;
				}
			} catch (@Pc(64) Exception local64) {
				Class27_Sub1.method7214(null, local64);
			}
		}
	}

	@OriginalMember(owner = "client!r", name = "n", descriptor = "()V", line = 23)
	public void method27880() {
		while (!this.aBoolean758) {
			try {
				@Pc(11) Class75 local11;
				synchronized (this) {
					local11 = (Class75) this.aQueue2.poll();
					if (local11 == null) {
						try {
							this.wait();
						} catch (@Pc(18) InterruptedException local18) {
						}
						continue;
					}
				}
				try {
					@Pc(33) URLConnection local33 = local11.anURL1.openConnection();
					local33.setConnectTimeout(30000);
					@Pc(39) int local39 = local33.getContentLength();
					if (local39 >= 0) {
						@Pc(44) byte[] local44 = new byte[local39];
						(new DataInputStream(local33.getInputStream())).readFully(local44);
						local11.aByteArray48 = local44;
					}
					local11.aBoolean480 = true;
				} catch (@Pc(59) IOException local59) {
					local11.aBoolean480 = true;
				}
			} catch (@Pc(64) Exception local64) {
				Class27_Sub1.method7214(null, local64);
			}
		}
	}

	@OriginalMember(owner = "client!r", name = "p", descriptor = "(Ljava/net/URL;B)Lclient!an;", line = 58)
	Class75 method27878(@OriginalArg(0) URL arg0) {
		@Pc(4) Class75 local4 = new Class75(arg0);
		synchronized (this) {
			this.aQueue2.add(local4);
			this.notify();
			return local4;
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(B)V", line = 67)
	void method27879() {
		this.aBoolean758 = true;
		try {
			synchronized (this) {
				this.notify();
			}
			this.aThread11.join();
		} catch (@Pc(21) InterruptedException local21) {
		}
	}

	@OriginalMember(owner = "client!r", name = "g", descriptor = "()V", line = 67)
	void method27881() {
		this.aBoolean758 = true;
		try {
			synchronized (this) {
				this.notify();
			}
			this.aThread11.join();
		} catch (@Pc(21) InterruptedException local21) {
		}
	}

	@OriginalMember(owner = "client!r", name = "u", descriptor = "(I)V", line = 131)
	static void method27883() {
		Class418.aClass14_11 = null;
		Class454.aClass14_12 = null;
		Class568.aClass14_13 = null;
		Class331.aClass6Array12 = null;
		Class542.aClass6Array15 = null;
		Class68.aClass6Array5 = null;
		Class145.aClass6Array11 = null;
		Class486.aClass6Array14 = null;
		Class19_Sub1.aClass6Array10 = null;
		Class568.aClass6_36 = null;
		Class19_Sub1.aClass6_23 = null;
		Class16.aClass6Array3 = null;
	}

	@OriginalMember(owner = "client!r", name = "vs", descriptor = "(Lclient!vs;B)V", line = 7896)
	static final void method27882(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 312124549;
	}
}
