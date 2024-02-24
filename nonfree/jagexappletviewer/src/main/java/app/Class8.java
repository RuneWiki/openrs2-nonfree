package app;

import java.applet.Applet;
import java.applet.AppletContext;
import java.applet.AppletStub;
import java.applet.AudioClip;
import java.awt.Image;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.InvalidParameterException;
import java.util.Enumeration;
import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("jagexappletviewer!app/ea")
final class Class8 implements AppletStub, AppletContext {

	@OriginalMember(owner = "jagexappletviewer!app/ea", name = "getApplet", descriptor = "(Ljava/lang/String;)Ljava/applet/Applet;")
	public final Applet getApplet(@OriginalArg(0) String arg0) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "jagexappletviewer!app/ea", name = "getStreamKeys", descriptor = "()Ljava/util/Iterator;")
	public final Iterator getStreamKeys() {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "jagexappletviewer!app/ea", name = "getAudioClip", descriptor = "(Ljava/net/URL;)Ljava/applet/AudioClip;")
	public final AudioClip getAudioClip(@OriginalArg(0) URL arg0) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "jagexappletviewer!app/ea", name = "getStream", descriptor = "(Ljava/lang/String;)Ljava/io/InputStream;")
	public final InputStream getStream(@OriginalArg(0) String arg0) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "jagexappletviewer!app/ea", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	public final URL getCodeBase() {
		try {
			return new URL(appletviewer.method15("codebase", -21747));
		} catch (@Pc(7) MalformedURLException local7) {
			throw new InvalidParameterException();
		}
	}

	@OriginalMember(owner = "jagexappletviewer!app/ea", name = "showDocument", descriptor = "(Ljava/net/URL;Ljava/lang/String;)V")
	public final void showDocument(@OriginalArg(0) URL arg0, @OriginalArg(1) String arg1) {
		Class15.showurl(arg0.toString(), arg1);
	}

	@OriginalMember(owner = "jagexappletviewer!app/ea", name = "isActive", descriptor = "()Z")
	public final boolean isActive() {
		return true;
	}

	@OriginalMember(owner = "jagexappletviewer!app/ea", name = "getApplets", descriptor = "()Ljava/util/Enumeration;")
	public final Enumeration getApplets() {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "jagexappletviewer!app/ea", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	public final URL getDocumentBase() {
		try {
			return new URL(appletviewer.method15("codebase", -21747));
		} catch (@Pc(7) MalformedURLException local7) {
			throw new InvalidParameterException();
		}
	}

	@OriginalMember(owner = "jagexappletviewer!app/ea", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	public final String getParameter(@OriginalArg(0) String arg0) {
		return appletviewer.method21(arg0, (byte) 98);
	}

	@OriginalMember(owner = "jagexappletviewer!app/ea", name = "getImage", descriptor = "(Ljava/net/URL;)Ljava/awt/Image;")
	public final Image getImage(@OriginalArg(0) URL arg0) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "jagexappletviewer!app/ea", name = "showStatus", descriptor = "(Ljava/lang/String;)V")
	public final void showStatus(@OriginalArg(0) String arg0) {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "jagexappletviewer!app/ea", name = "<init>", descriptor = "()V")
	public Class8() {
	}

	@OriginalMember(owner = "jagexappletviewer!app/ea", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	public final AppletContext getAppletContext() {
		return this;
	}

	@OriginalMember(owner = "jagexappletviewer!app/ea", name = "appletResize", descriptor = "(II)V")
	public final void appletResize(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "jagexappletviewer!app/ea", name = "showDocument", descriptor = "(Ljava/net/URL;)V")
	public final void showDocument(@OriginalArg(0) URL arg0) {
		Class15.showurl(arg0.toString(), null);
	}

	@OriginalMember(owner = "jagexappletviewer!app/ea", name = "setStream", descriptor = "(Ljava/lang/String;Ljava/io/InputStream;)V")
	public final void setStream(@OriginalArg(0) String arg0, @OriginalArg(1) InputStream arg1) throws IOException {
		throw new UnsupportedOperationException();
	}
}
