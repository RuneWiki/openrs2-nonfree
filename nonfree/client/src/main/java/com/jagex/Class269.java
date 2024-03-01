package com.jagex;

import java.awt.Container;
import java.awt.Frame;
import java.io.File;
import javax.swing.JFileChooser;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!k")
public class Class269 implements Runnable {

	@OriginalMember(owner = "client!k", name = "y", descriptor = "I")
	static int anInt4213;

	@OriginalMember(owner = "client!k", name = "cr", descriptor = "Lclient!wk;")
	static Class553 aClass553_55;

	@OriginalMember(owner = "client!k", name = "g", descriptor = "Ljava/io/File;")
	File aFile2 = null;

	@OriginalMember(owner = "client!k", name = "l", descriptor = "Z")
	boolean aBoolean694 = false;

	@OriginalMember(owner = "client!k", name = "p", descriptor = "Ljava/lang/String;")
	String aString194;

	@OriginalMember(owner = "client!k", name = "a", descriptor = "Z")
	boolean aBoolean693;

	@OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Ljava/lang/String;Z)V", line = 16)
	public Class269(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		this.aString194 = arg0;
		this.aBoolean693 = arg1;
		(new Thread(this)).start();
	}

	@OriginalMember(owner = "client!k", name = "j", descriptor = "()V", line = 23)
	public void method25275() {
		@Pc(2) Container local2 = Class3_Sub45.method13019();
		@Pc(4) Frame local4 = null;
		if (Class212.aFrame2 == null) {
			while (local2 != null) {
				if (local2 instanceof Frame) {
					local4 = (Frame) local2;
					break;
				}
				local2 = local2.getParent();
			}
		} else {
			local4 = Class212.aFrame2;
		}
		if (local4 == null) {
			throw new RuntimeException("");
		}
		@Pc(35) JFileChooser local35 = new JFileChooser("");
		local35.setDialogTitle(this.aString194);
		local35.setFileFilter(new FileFilter_Sub1(this, this));
		local35.setFileSelectionMode(1);
		local35.setAcceptAllFileFilterUsed(false);
		@Pc(56) int local56 = local35.showOpenDialog(local4);
		if (local56 == 0) {
			this.aFile2 = local35.getSelectedFile();
		}
		this.aBoolean694 = true;
	}

	@OriginalMember(owner = "client!k", name = "run", descriptor = "()V", line = 23)
	@Override
	public void run() {
		@Pc(2) Container local2 = Class3_Sub45.method13019();
		@Pc(4) Frame local4 = null;
		if (Class212.aFrame2 == null) {
			while (local2 != null) {
				if (local2 instanceof Frame) {
					local4 = (Frame) local2;
					break;
				}
				local2 = local2.getParent();
			}
		} else {
			local4 = Class212.aFrame2;
		}
		if (local4 == null) {
			throw new RuntimeException("");
		}
		@Pc(35) JFileChooser local35 = new JFileChooser("");
		local35.setDialogTitle(this.aString194);
		local35.setFileFilter(new FileFilter_Sub1(this, this));
		local35.setFileSelectionMode(1);
		local35.setAcceptAllFileFilterUsed(false);
		@Pc(56) int local56 = local35.showOpenDialog(local4);
		if (local56 == 0) {
			this.aFile2 = local35.getSelectedFile();
		}
		this.aBoolean694 = true;
	}

	@OriginalMember(owner = "client!k", name = "n", descriptor = "()V", line = 23)
	public void method25278() {
		@Pc(2) Container local2 = Class3_Sub45.method13019();
		@Pc(4) Frame local4 = null;
		if (Class212.aFrame2 == null) {
			while (local2 != null) {
				if (local2 instanceof Frame) {
					local4 = (Frame) local2;
					break;
				}
				local2 = local2.getParent();
			}
		} else {
			local4 = Class212.aFrame2;
		}
		if (local4 == null) {
			throw new RuntimeException("");
		}
		@Pc(35) JFileChooser local35 = new JFileChooser("");
		local35.setDialogTitle(this.aString194);
		local35.setFileFilter(new FileFilter_Sub1(this, this));
		local35.setFileSelectionMode(1);
		local35.setAcceptAllFileFilterUsed(false);
		@Pc(56) int local56 = local35.showOpenDialog(local4);
		if (local56 == 0) {
			this.aFile2 = local35.getSelectedFile();
		}
		this.aBoolean694 = true;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Lclient!lx;Lclient!xj;I)Lclient!agh;", line = 24)
	public static Class3_Sub23 method25284(@OriginalArg(0) Class311 arg0, @OriginalArg(1) Class577 arg1) {
		@Pc(2) Class3_Sub23 local2 = Class378.method27248();
		local2.aClass311_1 = arg0;
		local2.anInt1296 = arg0.anInt4529 * 361714675;
		if (local2.anInt1296 * 1177540123 == -1) {
			local2.aClass3_Sub41_Sub1_1 = new Class3_Sub41_Sub1(260);
		} else if (local2.anInt1296 * 1177540123 == -2) {
			local2.aClass3_Sub41_Sub1_1 = new Class3_Sub41_Sub1(10000);
		} else if (local2.anInt1296 * 1177540123 <= 18) {
			local2.aClass3_Sub41_Sub1_1 = new Class3_Sub41_Sub1(20);
		} else if (local2.anInt1296 * 1177540123 <= 98) {
			local2.aClass3_Sub41_Sub1_1 = new Class3_Sub41_Sub1(100);
		} else {
			local2.aClass3_Sub41_Sub1_1 = new Class3_Sub41_Sub1(260);
		}
		local2.aClass3_Sub41_Sub1_1.method19823(arg1);
		local2.aClass3_Sub41_Sub1_1.method19821(local2.aClass311_1.anInt4528 * -1934986723);
		local2.anInt1295 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!k", name = "p", descriptor = "(Lclient!ahb;I)Lclient!kv;", line = 29)
	static Class44 method25286(@OriginalArg(0) Class3_Sub41 arg0) {
		@Pc(6) Class277 local6 = Class3_Sub30.method11638()[arg0.method20269()];
		@Pc(13) Class276 local13 = Class400.method27575()[arg0.method20269()];
		@Pc(17) int local17 = arg0.method20272();
		@Pc(21) int local21 = arg0.method20272();
		@Pc(25) int local25 = arg0.method20271();
		@Pc(29) int local29 = arg0.method20271();
		@Pc(33) int local33 = arg0.method20272();
		@Pc(37) int local37 = arg0.method20375();
		@Pc(41) int local41 = arg0.method20275();
		return new Class44(local6, local13, local17, local21, local25, local29, local33, local37, local41);
	}

	@OriginalMember(owner = "client!k", name = "p", descriptor = "(B)Ljava/io/File;", line = 47)
	public File method25272() {
		return this.aFile2;
	}

	@OriginalMember(owner = "client!k", name = "l", descriptor = "()Ljava/io/File;", line = 47)
	public File method25276() {
		return this.aFile2;
	}

	@OriginalMember(owner = "client!k", name = "h", descriptor = "()Ljava/io/File;", line = 47)
	public File method25277() {
		return this.aFile2;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(I)Z", line = 51)
	public boolean method25273() {
		return this.aBoolean694;
	}

	@OriginalMember(owner = "client!k", name = "s", descriptor = "()Z", line = 51)
	public boolean method25274() {
		return this.aBoolean694;
	}

	@OriginalMember(owner = "client!k", name = "x", descriptor = "()Z", line = 51)
	public boolean method25279() {
		return this.aBoolean694;
	}

	@OriginalMember(owner = "client!k", name = "u", descriptor = "()Z", line = 55)
	boolean method25270() {
		return this.aBoolean693;
	}

	@OriginalMember(owner = "client!k", name = "g", descriptor = "(I)Z", line = 55)
	boolean method25271() {
		return this.aBoolean693;
	}

	@OriginalMember(owner = "client!k", name = "y", descriptor = "()Z", line = 55)
	boolean method25280() {
		return this.aBoolean693;
	}

	@OriginalMember(owner = "client!k", name = "b", descriptor = "()Z", line = 55)
	boolean method25281() {
		return this.aBoolean693;
	}

	@OriginalMember(owner = "client!k", name = "c", descriptor = "()Z", line = 55)
	boolean method25282() {
		return this.aBoolean693;
	}

	@OriginalMember(owner = "client!k", name = "z", descriptor = "()Z", line = 55)
	boolean method25283() {
		return this.aBoolean693;
	}

	@OriginalMember(owner = "client!k", name = "c", descriptor = "(II)I", line = 78)
	public static int method25285(@OriginalArg(0) int arg0) {
		@Pc(5) Class3_Sub1_Sub18 local5 = (Class3_Sub1_Sub18) Class196.aClass581_27.method33217((long) arg0);
		if (local5 == null) {
			return -1;
		} else if (Class196.aClass546_14.aClass3_Sub1_62 == local5.aClass3_Sub1_66) {
			return -1;
		} else {
			return ((Class3_Sub1_Sub18) local5.aClass3_Sub1_66).anInt2704 * 178210753;
		}
	}
}
