package app;

import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("jagexappletviewer!app/n")
final class Class15 implements Runnable {

	@OriginalMember(owner = "jagexappletviewer!app/n", name = "a", descriptor = "Ljava/lang/String;")
	private String aString5 = null;

	@OriginalMember(owner = "jagexappletviewer!app/n", name = "b", descriptor = "Ljava/lang/String;")
	private String aString6 = null;

	@OriginalMember(owner = "jagexappletviewer!app/n", name = "c", descriptor = "Ljagexappletviewer!app/n;")
	private static Class15 aClass15_1 = null;

	@OriginalMember(owner = "jagexappletviewer!app/n", name = "a", descriptor = "(I)V")
	static final void method36(@OriginalArg(0) int arg0) {
		if (aClass15_1 != null) {
			return;
		}
		aClass15_1 = new Class15();
		@Pc(12) Thread local12 = new Thread(aClass15_1);
		local12.setPriority(10);
		local12.setDaemon(true);
		if (arg0 < 55) {
			aClass15_1 = null;
		}
		local12.start();
	}

	@OriginalMember(owner = "jagexappletviewer!app/n", name = "run", descriptor = "()V")
	public final void run() {
		while (true) {
			@Pc(3) String local3 = null;
			@Pc(5) String local5 = null;
			synchronized (this) {
				while (this.aString6 == null) {
					try {
						this.wait();
					} catch (@Pc(32) InterruptedException local32) {
					}
				}
				local5 = this.aString6;
				local3 = this.aString5;
				this.aString5 = null;
				this.aString6 = null;
			}
			try {
				if (local3 != null && local3.equals("_top") && (local5.endsWith("MAGICQUIT") || local5.indexOf("/quit.ws") != -1 || local5.indexOf(".ws") == -1 && local5.endsWith("/"))) {
					appletviewer.method22(0);
				}
				if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
					try {
						Desktop.getDesktop().browse(new URI(local5));
						continue;
					} catch (@Pc(97) Exception local97) {
					}
				}
				if (!appletviewer.aBoolean2) {
					throw new Exception("Not windows");
				}
				if (!local5.startsWith("http://") && !local5.startsWith("https://")) {
					throw new Exception();
				}
				@Pc(123) String local123 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
				for (@Pc(125) int local125 = 0; local125 < local5.length(); local125++) {
					if (local123.indexOf(local5.charAt(local125)) == -1) {
						throw new Exception();
					}
				}
				Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local5 + "\"");
			} catch (@Pc(161) Exception local161) {
				try {
					new WindowAdapter_Sub1(local5);
				} catch (@Pc(168) Exception local168) {
				}
			}
		}
	}

	@OriginalMember(owner = "jagexappletviewer!app/n", name = "showurl", descriptor = "(Ljava/lang/String;Ljava/lang/String;)V")
	public static final void showurl(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		@Pc(2) Class15 local2 = aClass15_1;
		synchronized (aClass15_1) {
			aClass15_1.aString6 = arg0;
			aClass15_1.aString5 = arg1;
			aClass15_1.notify();
		}
	}

	@OriginalMember(owner = "jagexappletviewer!app/n", name = "<init>", descriptor = "()V")
	public Class15() {
	}
}
