package jaggl;

import java.awt.Canvas;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jaggl/OpenGL")
public final class OpenGL {

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "b", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable b = new Hashtable();

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "a", descriptor = "Ljava/lang/Thread;")
	private Thread a;

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "peer", descriptor = "J")
	private long peer;

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "c", descriptor = "Ljava/util/Hashtable;")
	private Hashtable c;

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glUniform4fARB", descriptor = "(IFFFF)V")
	public static native void glUniform4fARB(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glGetString", descriptor = "(I)Ljava/lang/String;")
	public static native String glGetString(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glClearDepth", descriptor = "(F)V")
	public static native void glClearDepth(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glLightModelfv", descriptor = "(I[FI)V")
	public static native void glLightModelfv(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glEnd", descriptor = "()V")
	public static native void glEnd();

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glDepthFunc", descriptor = "(I)V")
	public static native void glDepthFunc(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glPopMatrix", descriptor = "()V")
	public static native void glPopMatrix();

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glRasterPos2i", descriptor = "(II)V")
	public static native void glRasterPos2i(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glTexEnvfv", descriptor = "(II[FI)V")
	public static native void glTexEnvfv(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glTexGenfv", descriptor = "(II[FI)V")
	public static native void glTexGenfv(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glColor4ub", descriptor = "(BBBB)V")
	public static native void glColor4ub(@OriginalArg(0) byte arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) byte arg3);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glClearColor", descriptor = "(FFFF)V")
	public static native void glClearColor(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glColorMask", descriptor = "(ZZZZ)V")
	public static native void glColorMask(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glTexSubImage2Di", descriptor = "(IIIIIIII[II)V")
	public static native void glTexSubImage2Di(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int arg9);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glDeleteObjectARB", descriptor = "(J)V")
	public static native void glDeleteObjectARB(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glPixelZoom", descriptor = "(FF)V")
	private static native void glPixelZoom(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glPushAttrib", descriptor = "(I)V")
	public static native void glPushAttrib(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glGetIntegerv", descriptor = "(I[II)V")
	public static native void glGetIntegerv(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glBufferDataARBa", descriptor = "(IIJI)V")
	public static native void glBufferDataARBa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glUniform1iARB", descriptor = "(II)V")
	public static native void glUniform1iARB(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glViewport", descriptor = "(IIII)V")
	public static native void glViewport(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glDeleteTextures", descriptor = "(I[II)V")
	public static native void glDeleteTextures(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glProgramLocalParameter4fvARB", descriptor = "(II[FI)V")
	public static native void glProgramLocalParameter4fvARB(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glCreateProgramObjectARB", descriptor = "()J")
	public static native long glCreateProgramObjectARB();

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glTexCoord2f", descriptor = "(FF)V")
	public static native void glTexCoord2f(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glGetProgramivARB", descriptor = "(II[II)V")
	private static native void glGetProgramivARB(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glGenBuffersARB", descriptor = "(I[II)V")
	public static native void glGenBuffersARB(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glFramebufferTexture2DEXT", descriptor = "(IIIII)V")
	public static native void glFramebufferTexture2DEXT(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glLoadMatrixf", descriptor = "([FI)V")
	public static native void glLoadMatrixf(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glDeleteProgramARB", descriptor = "(I)V")
	public static native void glDeleteProgramARB(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glUseProgramObjectARB", descriptor = "(J)V")
	public static native void glUseProgramObjectARB(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glGenFramebuffersEXT", descriptor = "(I[II)V")
	public static native void glGenFramebuffersEXT(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glMultiTexCoord2i", descriptor = "(III)V")
	private static native void glMultiTexCoord2i(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glPointSize", descriptor = "(F)V")
	public static native void glPointSize(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glDrawBuffersARB", descriptor = "(I[II)V")
	private static native void glDrawBuffersARB(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glDeleteBuffersARB", descriptor = "(I[II)V")
	public static native void glDeleteBuffersARB(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glDisableClientState", descriptor = "(I)V")
	public static native void glDisableClientState(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glFlush", descriptor = "()V")
	public static native void glFlush();

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glColor4f", descriptor = "(FFFF)V")
	private static native void glColor4f(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glMultiTexCoord3i", descriptor = "(IIII)V")
	public static native void glMultiTexCoord3i(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glBlendFunc", descriptor = "(II)V")
	public static native void glBlendFunc(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glCallList", descriptor = "(I)V")
	public static native void glCallList(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glDeleteFramebuffersEXT", descriptor = "(I[II)V")
	public static native void glDeleteFramebuffersEXT(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glNormal3f", descriptor = "(FFF)V")
	public static native void glNormal3f(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glTexParameteri", descriptor = "(III)V")
	public static native void glTexParameteri(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glDeleteLists", descriptor = "(II)V")
	public static native void glDeleteLists(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glEnable", descriptor = "(I)V")
	public static native void glEnable(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glCompileShaderARB", descriptor = "(J)V")
	public static native void glCompileShaderARB(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glAttachObjectARB", descriptor = "(JJ)V")
	public static native void glAttachObjectARB(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glBufferSubDataARBub", descriptor = "(III[BI)V")
	public static native void glBufferSubDataARBub(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glReadPixelsub", descriptor = "(IIIIII[BI)V")
	private static native void glReadPixelsub(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glDrawArrays", descriptor = "(III)V")
	public static native void glDrawArrays(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glPixelTransferf", descriptor = "(IF)V")
	public static native void glPixelTransferf(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glHint", descriptor = "(II)V")
	public static native void glHint(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glUniform1fARB", descriptor = "(IF)V")
	public static native void glUniform1fARB(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glMultMatrixf", descriptor = "([FI)V")
	public static native void glMultMatrixf(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glTexSubImage2Df", descriptor = "(IIIIIIII[FI)V")
	public static native void glTexSubImage2Df(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) float[] arg8, @OriginalArg(9) int arg9);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glBindRenderbufferEXT", descriptor = "(II)V")
	public static native void glBindRenderbufferEXT(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glVertexPointer", descriptor = "(IIIJ)V")
	public static native void glVertexPointer(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glGetError", descriptor = "()I")
	private static native int glGetError();

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glGenProgramARB", descriptor = "()I")
	public static native int glGenProgramARB();

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glLinkProgramARB", descriptor = "(J)V")
	public static native void glLinkProgramARB(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glCheckFramebufferStatusEXT", descriptor = "(I)I")
	public static native int glCheckFramebufferStatusEXT(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glMapBufferARB", descriptor = "(II)J")
	public static native long glMapBufferARB(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glFrustum", descriptor = "(DDDDDD)V")
	private static native void glFrustum(@OriginalArg(0) double arg0, @OriginalArg(1) double arg1, @OriginalArg(2) double arg2, @OriginalArg(3) double arg3, @OriginalArg(4) double arg4, @OriginalArg(5) double arg5);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glBindFramebufferEXT", descriptor = "(II)V")
	public static native void glBindFramebufferEXT(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glCopyTexImage2D", descriptor = "(IIIIIIII)V")
	public static native void glCopyTexImage2D(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glOrtho", descriptor = "(DDDDDD)V")
	public static native void glOrtho(@OriginalArg(0) double arg0, @OriginalArg(1) double arg1, @OriginalArg(2) double arg2, @OriginalArg(3) double arg3, @OriginalArg(4) double arg4, @OriginalArg(5) double arg5);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glBufferDataARBub", descriptor = "(II[BII)V")
	public static native void glBufferDataARBub(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glTranslatef", descriptor = "(FFF)V")
	public static native void glTranslatef(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glTexCoord3i", descriptor = "(III)V")
	public static native void glTexCoord3i(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glPixelStorei", descriptor = "(II)V")
	public static native void glPixelStorei(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glDisable", descriptor = "(I)V")
	public static native void glDisable(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glScalef", descriptor = "(FFF)V")
	public static native void glScalef(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glTexCoord3f", descriptor = "(FFF)V")
	public static native void glTexCoord3f(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glLightf", descriptor = "(IIF)V")
	public static native void glLightf(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glClientActiveTexture", descriptor = "(I)V")
	private static native void glClientActiveTexture(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glCopyTexSubImage2D", descriptor = "(IIIIIIII)V")
	public static native void glCopyTexSubImage2D(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glTexImage1Dub", descriptor = "(IIIIIII[BI)V")
	public static native void glTexImage1Dub(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[] arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glTexParameterf", descriptor = "(IIF)V")
	private static native void glTexParameterf(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glUniform3fARB", descriptor = "(IFFF)V")
	public static native void glUniform3fARB(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glVertex2f", descriptor = "(FF)V")
	public static native void glVertex2f(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glFogf", descriptor = "(IF)V")
	public static native void glFogf(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glProgramRawARB", descriptor = "(II[B)V")
	public static native void glProgramRawARB(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glLightfv", descriptor = "(II[FI)V")
	public static native void glLightfv(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glFogi", descriptor = "(II)V")
	public static native void glFogi(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glPopAttrib", descriptor = "()V")
	public static native void glPopAttrib();

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glVertex2i", descriptor = "(II)V")
	public static native void glVertex2i(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glCreateShaderObjectARB", descriptor = "(I)J")
	public static native long glCreateShaderObjectARB(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glTexEnvf", descriptor = "(IIF)V")
	public static native void glTexEnvf(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glNormalPointer", descriptor = "(IIJ)V")
	public static native void glNormalPointer(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glBlitFramebufferEXT", descriptor = "(IIIIIIIIII)V")
	public static native void glBlitFramebufferEXT(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glColor3f", descriptor = "(FFF)V")
	public static native void glColor3f(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glDeleteRenderbuffersEXT", descriptor = "(I[II)V")
	public static native void glDeleteRenderbuffersEXT(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glRenderbufferStorageMultisampleEXT", descriptor = "(IIIII)V")
	public static native void glRenderbufferStorageMultisampleEXT(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glFogfv", descriptor = "(I[FI)V")
	public static native void glFogfv(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glTexGeni", descriptor = "(III)V")
	public static native void glTexGeni(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glMultiTexCoord2f", descriptor = "(IFF)V")
	public static native void glMultiTexCoord2f(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glBindProgramARB", descriptor = "(II)V")
	public static native void glBindProgramARB(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glPolygonMode", descriptor = "(II)V")
	public static native void glPolygonMode(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glTexEnvi", descriptor = "(III)V")
	public static native void glTexEnvi(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glColor3ub", descriptor = "(BBB)V")
	private static native void glColor3ub(@OriginalArg(0) byte arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glTexSubImage2Dub", descriptor = "(IIIIIIII[BI)V")
	public static native void glTexSubImage2Dub(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) byte[] arg8, @OriginalArg(9) int arg9);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glTexImage2Dub", descriptor = "(IIIIIIII[BI)V")
	public static native void glTexImage2Dub(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) byte[] arg8, @OriginalArg(9) int arg9);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glTexCoordPointer", descriptor = "(IIIJ)V")
	public static native void glTexCoordPointer(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glFinish", descriptor = "()V")
	public static native void glFinish();

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glDrawPixelsi", descriptor = "(IIII[II)V")
	private static native void glDrawPixelsi(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glTexImage2Df", descriptor = "(IIIIIIII[FI)V")
	public static native void glTexImage2Df(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) float[] arg8, @OriginalArg(9) int arg9);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glTexImage3Dub", descriptor = "(IIIIIIIII[BI)V")
	public static native void glTexImage3Dub(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) byte[] arg9, @OriginalArg(10) int arg10);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glMatrixMode", descriptor = "(I)V")
	public static native void glMatrixMode(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glClear", descriptor = "(I)V")
	public static native void glClear(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glVertex3f", descriptor = "(FFF)V")
	private static native void glVertex3f(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glTexCoord2i", descriptor = "(II)V")
	private static native void glTexCoord2i(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glColorMaterial", descriptor = "(II)V")
	public static native void glColorMaterial(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glLoadIdentity", descriptor = "()V")
	public static native void glLoadIdentity();

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glRenderbufferStorageEXT", descriptor = "(IIII)V")
	public static native void glRenderbufferStorageEXT(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glActiveTexture", descriptor = "(I)V")
	public static native void glActiveTexture(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glFramebufferRenderbufferEXT", descriptor = "(IIII)V")
	public static native void glFramebufferRenderbufferEXT(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glReadPixelsi", descriptor = "(IIIIII[II)V")
	public static native void glReadPixelsi(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glNewList", descriptor = "(II)V")
	public static native void glNewList(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glGenTextures", descriptor = "(I[II)V")
	public static native void glGenTextures(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glBufferSubDataARBa", descriptor = "(IIIJ)V")
	public static native void glBufferSubDataARBa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glProgramLocalParameter4fARB", descriptor = "(IIFFFF)V")
	public static native void glProgramLocalParameter4fARB(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glMaterialfv", descriptor = "(II[FI)V")
	private static native void glMaterialfv(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glDrawElements", descriptor = "(IIIJ)V")
	public static native void glDrawElements(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glReadBuffer", descriptor = "(I)V")
	public static native void glReadBuffer(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glEnableClientState", descriptor = "(I)V")
	public static native void glEnableClientState(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glGetFloatv", descriptor = "(I[FI)V")
	public static native void glGetFloatv(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glDrawPixelsub", descriptor = "(IIII[BI)V")
	private static native void glDrawPixelsub(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glCopyTexSubImage3D", descriptor = "(IIIIIIIII)V")
	public static native void glCopyTexSubImage3D(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glGenerateMipmapEXT", descriptor = "(I)V")
	public static native void glGenerateMipmapEXT(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glShadeModel", descriptor = "(I)V")
	public static native void glShadeModel(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glGenRenderbuffersEXT", descriptor = "(I[II)V")
	public static native void glGenRenderbuffersEXT(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glGenLists", descriptor = "(I)I")
	public static native int glGenLists(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glDrawBuffer", descriptor = "(I)V")
	public static native void glDrawBuffer(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glGetUniformLocationARB", descriptor = "(JLjava/lang/String;)I")
	public static native int glGetUniformLocationARB(@OriginalArg(0) long arg0, @OriginalArg(1) String arg1);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glLineWidth", descriptor = "(F)V")
	public static native void glLineWidth(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glCopyPixels", descriptor = "(IIIII)V")
	public static native void glCopyPixels(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glBegin", descriptor = "(I)V")
	public static native void glBegin(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glEndList", descriptor = "()V")
	public static native void glEndList();

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glUnmapBufferARB", descriptor = "(I)Z")
	public static native boolean glUnmapBufferARB(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glDetachObjectARB", descriptor = "(JJ)V")
	public static native void glDetachObjectARB(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glFramebufferTexture3DEXT", descriptor = "(IIIIII)V")
	public static native void glFramebufferTexture3DEXT(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glTexImage2Di", descriptor = "(IIIIIIII[II)V")
	public static native void glTexImage2Di(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int arg9);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glGetObjectParameterivARB", descriptor = "(JI[II)V")
	public static native void glGetObjectParameterivARB(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glBindTexture", descriptor = "(II)V")
	public static native void glBindTexture(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glProgramStringARB", descriptor = "(IILjava/lang/String;)V")
	public static native void glProgramStringARB(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glUniform2fARB", descriptor = "(IFF)V")
	public static native void glUniform2fARB(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glShaderSourceARB", descriptor = "(JLjava/lang/String;)V")
	public static native void glShaderSourceARB(@OriginalArg(0) long arg0, @OriginalArg(1) String arg1);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glPushMatrix", descriptor = "()V")
	public static native void glPushMatrix();

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glRotatef", descriptor = "(FFFF)V")
	public static native void glRotatef(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glDepthMask", descriptor = "(Z)V")
	public static native void glDepthMask(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glGetInfoLogARB", descriptor = "(JI[II[BI)V")
	public static native void glGetInfoLogARB(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glAlphaFunc", descriptor = "(IF)V")
	public static native void glAlphaFunc(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glCullFace", descriptor = "(I)V")
	public static native void glCullFace(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glScissor", descriptor = "(IIII)V")
	public static native void glScissor(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glColorPointer", descriptor = "(IIIJ)V")
	public static native void glColorPointer(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "glBindBufferARB", descriptor = "(II)V")
	public static native void glBindBufferARB(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "swapBuffers", descriptor = "()V")
	public native void swapBuffers();

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "init", descriptor = "(Ljava/awt/Canvas;IIIIII)J")
	public native long init(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "setPbuffer", descriptor = "(J)V")
	private native void setPbuffer(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "arePbuffersAvailable", descriptor = "()Z")
	public native boolean arePbuffersAvailable();

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "releasePbuffer", descriptor = "(J)V")
	private native void releasePbuffer(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "release", descriptor = "()V")
	public native void release();

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "detachPeer", descriptor = "()V")
	private native void detachPeer();

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "a", descriptor = "()Z")
	public synchronized boolean a() {
		@Pc(1) Thread local1 = Thread.currentThread();
		if (!this.attachPeer()) {
			return false;
		}
		@Pc(10) OpenGL local10 = (OpenGL) b.put(local1, this);
		if (local10 != null) {
			local10.a = null;
		}
		this.a = local1;
		return true;
	}

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "surfaceResized", descriptor = "(J)V")
	public native void surfaceResized(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "releaseSurface", descriptor = "(Ljava/awt/Canvas;J)V")
	public native void releaseSurface(@OriginalArg(0) Canvas arg0, @OriginalArg(1) long arg1);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "attachPeer", descriptor = "()Z")
	private native boolean attachPeer();

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "createPbuffer", descriptor = "(II)J")
	private native long createPbuffer(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "a", descriptor = "(Ljava/lang/String;)Z")
	public boolean a(@OriginalArg(0) String arg0) {
		if (this.c == null) {
			this.c = new Hashtable();
			@Pc(10) String local10 = glGetString(7939);
			@Pc(12) int local12 = 0;
			while (true) {
				@Pc(17) int local17 = local10.indexOf(32, local12);
				if (local17 == -1) {
					@Pc(48) String local48 = local10.substring(local12).trim();
					if (local48.length() != 0) {
						this.c.put(local48, local48);
					}
					break;
				}
				@Pc(26) String local26 = local10.substring(local12, local17).trim();
				local12 = local17 + 1;
				if (local26.length() != 0) {
					this.c.put(local26, local26);
				}
			}
		}
		return this.c.containsKey(arg0);
	}

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "b", descriptor = "()Z")
	public synchronized boolean b() {
		if (this.a == Thread.currentThread()) {
			this.detachPeer();
			b.remove(this.a);
			this.a = null;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "setSwapInterval", descriptor = "(I)V")
	public native void setSwapInterval(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "prepareSurface", descriptor = "(Ljava/awt/Canvas;)J")
	public native long prepareSurface(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!jaggl/OpenGL", name = "setSurface", descriptor = "(J)Z")
	public native boolean setSurface(@OriginalArg(0) long arg0);
}
