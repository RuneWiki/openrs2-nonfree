package javax.media.opengl;

import java.nio.Buffer;
import java.nio.FloatBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gl!javax/media/opengl/GL")
public interface GL {

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glActiveTexture", descriptor = "(I)V")
	void glActiveTexture(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glAlphaFunc", descriptor = "(IF)V")
	void glAlphaFunc(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glAttachObjectARB", descriptor = "(II)V")
	void glAttachObjectARB(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glBegin", descriptor = "(I)V")
	void glBegin(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glBindBufferARB", descriptor = "(II)V")
	void glBindBufferARB(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glBindFramebufferEXT", descriptor = "(II)V")
	void glBindFramebufferEXT(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glBindProgramARB", descriptor = "(II)V")
	void glBindProgramARB(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glBindRenderbufferEXT", descriptor = "(II)V")
	void glBindRenderbufferEXT(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glBindTexture", descriptor = "(II)V")
	void glBindTexture(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glBlendFunc", descriptor = "(II)V")
	void glBlendFunc(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glBufferDataARB", descriptor = "(IILjava/nio/Buffer;I)V")
	void glBufferDataARB(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glBufferSubDataARB", descriptor = "(IIILjava/nio/Buffer;)V")
	void glBufferSubDataARB(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Buffer arg3);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glCallList", descriptor = "(I)V")
	void glCallList(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glCheckFramebufferStatusEXT", descriptor = "(I)I")
	int glCheckFramebufferStatusEXT(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glClear", descriptor = "(I)V")
	void glClear(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glClearColor", descriptor = "(FFFF)V")
	void glClearColor(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glClearDepth", descriptor = "(D)V")
	void glClearDepth(@OriginalArg(0) double arg0);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glClientActiveTexture", descriptor = "(I)V")
	void glClientActiveTexture(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glColor3ub", descriptor = "(BBB)V")
	void glColor3ub(@OriginalArg(0) byte arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glColor4f", descriptor = "(FFFF)V")
	void glColor4f(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glColor4fv", descriptor = "([FI)V")
	void glColor4fv(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glColor4ub", descriptor = "(BBBB)V")
	void glColor4ub(@OriginalArg(0) byte arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) byte arg3);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glColorMask", descriptor = "(ZZZZ)V")
	void glColorMask(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glColorMaterial", descriptor = "(II)V")
	void glColorMaterial(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glColorPointer", descriptor = "(IIILjava/nio/Buffer;)V")
	void glColorPointer(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Buffer arg3);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glColorPointer", descriptor = "(IIIJ)V")
	void glColorPointer(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glCompileShaderARB", descriptor = "(I)V")
	void glCompileShaderARB(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glCopyPixels", descriptor = "(IIIII)V")
	void glCopyPixels(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glCopyTexImage2D", descriptor = "(IIIIIIII)V")
	void glCopyTexImage2D(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glCreateProgramObjectARB", descriptor = "()I")
	int glCreateProgramObjectARB();

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glCreateShaderObjectARB", descriptor = "(I)I")
	int glCreateShaderObjectARB(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glCullFace", descriptor = "(I)V")
	void glCullFace(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glDeleteBuffersARB", descriptor = "(I[II)V")
	void glDeleteBuffersARB(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glDeleteFramebuffersEXT", descriptor = "(I[II)V")
	void glDeleteFramebuffersEXT(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glDeleteLists", descriptor = "(II)V")
	void glDeleteLists(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glDeleteObjectARB", descriptor = "(I)V")
	void glDeleteObjectARB(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glDeleteRenderbuffersEXT", descriptor = "(I[II)V")
	void glDeleteRenderbuffersEXT(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glDeleteTextures", descriptor = "(I[II)V")
	void glDeleteTextures(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glDepthFunc", descriptor = "(I)V")
	void glDepthFunc(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glDepthMask", descriptor = "(Z)V")
	void glDepthMask(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glDetachObjectARB", descriptor = "(II)V")
	void glDetachObjectARB(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glDisable", descriptor = "(I)V")
	void glDisable(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glDisableClientState", descriptor = "(I)V")
	void glDisableClientState(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glDrawBuffer", descriptor = "(I)V")
	void glDrawBuffer(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glDrawElements", descriptor = "(IIILjava/nio/Buffer;)V")
	void glDrawElements(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Buffer arg3);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glDrawElements", descriptor = "(IIIJ)V")
	void glDrawElements(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glDrawPixels", descriptor = "(IIIILjava/nio/Buffer;)V")
	void glDrawPixels(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Buffer arg4);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glEnable", descriptor = "(I)V")
	void glEnable(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glEnableClientState", descriptor = "(I)V")
	void glEnableClientState(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glEnd", descriptor = "()V")
	void glEnd();

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glEndList", descriptor = "()V")
	void glEndList();

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glFogf", descriptor = "(IF)V")
	void glFogf(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glFogfv", descriptor = "(I[FI)V")
	void glFogfv(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glFogi", descriptor = "(II)V")
	void glFogi(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glFramebufferRenderbufferEXT", descriptor = "(IIII)V")
	void glFramebufferRenderbufferEXT(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glFramebufferTexture2DEXT", descriptor = "(IIIII)V")
	void glFramebufferTexture2DEXT(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glGenBuffersARB", descriptor = "(I[II)V")
	void glGenBuffersARB(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glGenFramebuffersEXT", descriptor = "(I[II)V")
	void glGenFramebuffersEXT(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glGenLists", descriptor = "(I)I")
	int glGenLists(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glGenProgramsARB", descriptor = "(I[II)V")
	void glGenProgramsARB(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glGenRenderbuffersEXT", descriptor = "(I[II)V")
	void glGenRenderbuffersEXT(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glGenTextures", descriptor = "(I[II)V")
	void glGenTextures(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glGetFloatv", descriptor = "(ILjava/nio/FloatBuffer;)V")
	void glGetFloatv(@OriginalArg(0) int arg0, @OriginalArg(1) FloatBuffer arg1);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glGetFloatv", descriptor = "(I[FI)V")
	void glGetFloatv(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glGetInfoLogARB", descriptor = "(II[II[BI)V")
	void glGetInfoLogARB(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glGetIntegerv", descriptor = "(I[II)V")
	void glGetIntegerv(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glGetObjectParameterivARB", descriptor = "(II[II)V")
	void glGetObjectParameterivARB(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glGetString", descriptor = "(I)Ljava/lang/String;")
	String glGetString(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glGetUniformLocation", descriptor = "(ILjava/lang/String;)I")
	int glGetUniformLocation(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glHint", descriptor = "(II)V")
	void glHint(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glInterleavedArrays", descriptor = "(IILjava/nio/Buffer;)V")
	void glInterleavedArrays(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glInterleavedArrays", descriptor = "(IIJ)V")
	void glInterleavedArrays(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glLightModelfv", descriptor = "(I[FI)V")
	void glLightModelfv(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glLightf", descriptor = "(IIF)V")
	void glLightf(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glLightfv", descriptor = "(II[FI)V")
	void glLightfv(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glLineWidth", descriptor = "(F)V")
	void glLineWidth(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glLinkProgramARB", descriptor = "(I)V")
	void glLinkProgramARB(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glLoadIdentity", descriptor = "()V")
	void glLoadIdentity();

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glLoadMatrixf", descriptor = "([FI)V")
	void glLoadMatrixf(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glMatrixMode", descriptor = "(I)V")
	void glMatrixMode(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glMultiTexCoord2f", descriptor = "(IFF)V")
	void glMultiTexCoord2f(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glMultiTexCoord2i", descriptor = "(III)V")
	void glMultiTexCoord2i(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glNewList", descriptor = "(II)V")
	void glNewList(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glNormalPointer", descriptor = "(IILjava/nio/Buffer;)V")
	void glNormalPointer(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glNormalPointer", descriptor = "(IIJ)V")
	void glNormalPointer(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glOrtho", descriptor = "(DDDDDD)V")
	void glOrtho(@OriginalArg(0) double arg0, @OriginalArg(1) double arg1, @OriginalArg(2) double arg2, @OriginalArg(3) double arg3, @OriginalArg(4) double arg4, @OriginalArg(5) double arg5);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glPointParameterfARB", descriptor = "(IF)V")
	void glPointParameterfARB(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glPointParameterfvARB", descriptor = "(I[FI)V")
	void glPointParameterfvARB(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glPolygonMode", descriptor = "(II)V")
	void glPolygonMode(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glPopAttrib", descriptor = "()V")
	void glPopAttrib();

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glPopMatrix", descriptor = "()V")
	void glPopMatrix();

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glProgramLocalParameter4fARB", descriptor = "(IIFFFF)V")
	void glProgramLocalParameter4fARB(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glProgramLocalParameter4fvARB", descriptor = "(IILjava/nio/FloatBuffer;)V")
	void glProgramLocalParameter4fvARB(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) FloatBuffer arg2);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glProgramLocalParameter4fvARB", descriptor = "(II[FI)V")
	void glProgramLocalParameter4fvARB(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glProgramStringARB", descriptor = "(IIILjava/lang/String;)V")
	void glProgramStringARB(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glPushAttrib", descriptor = "(I)V")
	void glPushAttrib(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glPushMatrix", descriptor = "()V")
	void glPushMatrix();

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glRasterPos2i", descriptor = "(II)V")
	void glRasterPos2i(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glReadBuffer", descriptor = "(I)V")
	void glReadBuffer(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glRenderbufferStorageEXT", descriptor = "(IIII)V")
	void glRenderbufferStorageEXT(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glRotatef", descriptor = "(FFFF)V")
	void glRotatef(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glScalef", descriptor = "(FFF)V")
	void glScalef(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glScissor", descriptor = "(IIII)V")
	void glScissor(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glShadeModel", descriptor = "(I)V")
	void glShadeModel(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glShaderSourceARB", descriptor = "(II[Ljava/lang/String;[II)V")
	void glShaderSourceARB(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glTexCoord2f", descriptor = "(FF)V")
	void glTexCoord2f(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glTexCoord2i", descriptor = "(II)V")
	void glTexCoord2i(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glTexCoordPointer", descriptor = "(IIILjava/nio/Buffer;)V")
	void glTexCoordPointer(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Buffer arg3);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glTexCoordPointer", descriptor = "(IIIJ)V")
	void glTexCoordPointer(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glTexEnvf", descriptor = "(IIF)V")
	void glTexEnvf(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glTexEnvfv", descriptor = "(II[FI)V")
	void glTexEnvfv(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glTexEnvi", descriptor = "(III)V")
	void glTexEnvi(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glTexGenfv", descriptor = "(II[FI)V")
	void glTexGenfv(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glTexGeni", descriptor = "(III)V")
	void glTexGeni(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glTexImage1D", descriptor = "(IIIIIIILjava/nio/Buffer;)V")
	void glTexImage1D(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Buffer arg7);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glTexImage2D", descriptor = "(IIIIIIIILjava/nio/Buffer;)V")
	void glTexImage2D(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Buffer arg8);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glTexImage3D", descriptor = "(IIIIIIIIILjava/nio/Buffer;)V")
	void glTexImage3D(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Buffer arg9);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glTexParameteri", descriptor = "(III)V")
	void glTexParameteri(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glTranslatef", descriptor = "(FFF)V")
	void glTranslatef(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glUniform1iARB", descriptor = "(II)V")
	void glUniform1iARB(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glUniform3fARB", descriptor = "(IFFF)V")
	void glUniform3fARB(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glUseProgramObjectARB", descriptor = "(I)V")
	void glUseProgramObjectARB(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glVertex2f", descriptor = "(FF)V")
	void glVertex2f(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glVertex2i", descriptor = "(II)V")
	void glVertex2i(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glVertexPointer", descriptor = "(IIILjava/nio/Buffer;)V")
	void glVertexPointer(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Buffer arg3);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glVertexPointer", descriptor = "(IIIJ)V")
	void glVertexPointer(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "glViewport", descriptor = "(IIII)V")
	void glViewport(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "isExtensionAvailable", descriptor = "(Ljava/lang/String;)Z")
	boolean isExtensionAvailable(@OriginalArg(0) String arg0);

	@OriginalMember(owner = "gl!javax/media/opengl/GL", name = "setSwapInterval", descriptor = "(I)V")
	void setSwapInterval(@OriginalArg(0) int arg0);
}
